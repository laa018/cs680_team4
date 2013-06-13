package mlstats;

import java.sql.Timestamp;

public class MailingLists implements java.io.Serializable {

   private String mailing_list_url;
   private String mailing_list_name;
   private String project_name;
   private Timestamp last_analysis;
   
   public MailingLists(String mailing_list_url, String mailing_list_name, String project_name,
         Timestamp last_analysis)
   {
      this.mailing_list_url = mailing_list_url;
      this.mailing_list_name = mailing_list_name;
      this.project_name = project_name;
      this.last_analysis = last_analysis;
   }

   public String getMailing_list_url()
   {
      return mailing_list_url;
   }

   public void setMailing_list_url(String mailing_list_url)
   {
      this.mailing_list_url = mailing_list_url;
   }

   public String getMailing_list_name()
   {
      return mailing_list_name;
   }

   public void setMailing_list_name(String mailing_list_name)
   {
      this.mailing_list_name = mailing_list_name;
   }

   public String getProject_name()
   {
      return project_name;
   }

   public void setProject_name(String project_name)
   {
      this.project_name = project_name;
   }

   public Timestamp getLast_analysis()
   {
      return last_analysis;
   }

   public void setLast_analysis(Timestamp last_analysis)
   {
      this.last_analysis = last_analysis;
   }
   
   
}
