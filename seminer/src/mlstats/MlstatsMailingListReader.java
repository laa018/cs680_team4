package mlstats;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import cvsanaly.Repositories;

import seminer.Action;
import seminer.ActionReader;
import seminer.Communication;
import seminer.MailingListReader;
import seminer.MinerUtils;

public class MlstatsMailingListReader implements MailingListReader
{

   @Override
   public List<Communication> parseFile(String projectName)
   {
      List<Communication> comList = new ArrayList<Communication>();

      Session effortMetricsSession = MinerUtils
            .openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");

      Integer maxId = (Integer) effortMetricsSession.createQuery(
            "SELECT MAX(message_id) FROM communication").uniqueResult();

      Session mlstatsSession = MinerUtils.openSession("mlstats/mlstats_hibernate.cfg.xml");
      List<Object[]> resultList = mlstatsSession
            .createSQLQuery(
                  "SELECT * FROM messages LEFT OUTER JOIN messages_people ON messages.message_ID = messages_people.message_ID LEFT OUTTER JOIN people ON messages_people.email_address = people.email_address "
                        + " LEFT OUTER JOIN mailing_lists_people ON people.email_address = mailing_lists_people.email_address LEFT OUTER JOIN mailing_lists ON mailing_lists_people.mailing_list_url = mailing_lists.mailing_list_url WHERE mailing_lists.project_name LIKE '%"
                        + projectName + "%'").addEntity("Messages", Messages.class).addEntity("MessagesPeople", MessagesPeople.class)
                        .addEntity("People", People.class).addEntity("MailingListsPeople", MailingListsPeople.class)
            .addEntity("MailingLists", MailingLists.class).list();

      for (Object[] result : resultList)
      {
         Messages messages = (Messages) result[0];
         MessagesPeople messagesPeople = (MessagesPeople) result[1];
         People people = (People) result[2];
         MailingListsPeople mailingListsPeople = (MailingListsPeople) result[3];
         MailingLists mailingLists = (MailingLists) result[4];

         
         Communication effortMetricsCommunication = new Communication();
         effortMetricsCommunication.setMessage_id(++maxId);
         effortMetricsCommunication.setThread_id(0);
         effortMetricsCommunication.setProject_name(projectName);
         effortMetricsCommunication.setSubject(messages.getSubject());
         effortMetricsCommunication.setCreation_timestamp(messages.getArrival_date());
         effortMetricsCommunication.setMedia("email");
         effortMetricsCommunication.setArrive_timestamp(messages.getArrival_date());
         effortMetricsCommunication.setSub_subject("");
         effortMetricsCommunication.setMessage_body(messages.getMessage_body());
         effortMetricsCommunication.setIs_reply_to(messages.getIs_response_of());
         effortMetricsCommunication.setRecipient_type(messagesPeople.getType_of_recipient());

         seminer.People tempPeople = (seminer.People) effortMetricsSession.createQuery(
               "SELECT * FROM people WHERE author_name LIKE '%" + people.getName() + "%';" );
         
         effortMetricsCommunication.setPerson_id(tempPeople.getPersonId());
         effortMetricsCommunication.setAlias(tempPeople.getAliases());
         

         comList.add(effortMetricsCommunication);
      }

      MinerUtils.commitAndCloseSession(effortMetricsSession);
      MinerUtils.commitAndCloseSession(mlstatsSession);

      return comList;
   }

   private boolean isTableDirty(Session s, String projectName)
   {
      List results = s.createQuery("FROM Communication WHERE project_name = '" + projectName + "'").list();
      if (results.size() > 0)
      {
         return false;
      }
      else
      {
         return true;
      }
   }

}
