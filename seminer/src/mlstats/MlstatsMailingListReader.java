package mlstats;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import seminer.Action;
import seminer.ActionReader;
import seminer.Communication;
import seminer.MinerUtils;

public class MlstatsMailingListReader implements ActionReader
{

   @Override
   public List<Communication> parseFile(String projectName)
   {
      List<Communication> comList = new ArrayList<Communication>();

      Session effortMetricsSession = MinerUtils
            .openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");

      Integer maxId = (Integer) effortMetricsSession.createQuery(
            "SELECT MAX(person_id) FROM people").uniqueResult();

      Session mlstatsSession = MinerUtils.openSession("mlstats/mlstats_hibernate.cfg.xml");
      List<Object[]> resultList = mlstatsSession
            .createSQLQuery(
                  "SELECT * FROM people LEFT OUTER JOIN mailing_lists_people ON people.email_address = mailing_lists_people.email_address LEFT OUTER JOIN mailing_lists ON mailing_lists_people.mailing_list_url = mailing_lists.mailing_list_url WHERE mailing_lists.project_name LIKE '%"
                        + projectName + "%'").addEntity("scmlog", Scmlog.class)
            .addEntity("actions", Actions.class).addEntity("commits_lines", CommitsLines.class)
            .addEntity("repositories", Repositories.class).list();

      for (Object[] result : resultList)
      {
         Scmlog scmlog = (Scmlog) result[0];
         Actions cvsanalyAction = (Actions) result[1];
         CommitsLines commitsLines = (CommitsLines) result[2];

         Action effortMetricsAction = new Action();
         effortMetricsAction.setProject_name(projectName);
         effortMetricsAction.setAction_id(++maxId);
         effortMetricsAction.setAction_timestamp(scmlog.getDate());
         effortMetricsAction.setAction_type("Version Control Commits");
         effortMetricsAction.setCommit_message(scmlog.getMessage());
         // effortMetricsAction.setIssue_id(issue_id);
         effortMetricsAction.setLines_added(commitsLines.getAdded());
         // effortMetricsAction.setLines_modified(lines_modified);
         effortMetricsAction.setLines_removed(commitsLines.getRemoved());
         // effortMetricsAction.setPatch_name(patch_name);
         effortMetricsAction.setPerson_id(scmlog.getCommitterId().toString()); // Overwrite
                                                                               // later
                                                                               // when
                                                                               // importing
                                                                               // people
         // effortMetricsAction.setAlias(alias);
         effortMetricsAction.setFile_id(cvsanalyAction.getFileId()); // Overwrite
                                                                     // later
                                                                     // when
                                                                     // importing
                                                                     // files
         // effortMetricsAction.setRelative_path(relative_path);
         // effortMetricsAction.setBranch_name(branch_name);
         effortMetricsAction.setRelease_number(release_number);
         String revisionNumber = scmlog.getRev();
         try
         {
            effortMetricsAction.setRevision(Integer.valueOf(revisionNumber));
         }
         catch (NumberFormatException e)
         {

         }

         comList.add(effortMetricsAction);
      }

      MinerUtils.commitAndCloseSession(effortMetricsSession);
      MinerUtils.commitAndCloseSession(mlstatsSession);

      return comList;
   }

   private boolean isTableDirty(Session s, String projectName)
   {
      List results = s.createQuery("FROM Action WHERE project_name = '" + projectName + "'").list();
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
