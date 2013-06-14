package mlstats;

import java.sql.Timestamp;

public class Messages implements java.io.Serializable {

   private String message_ID;
   private String mailing_list_url;
   private String mailing_list;
   private Timestamp first_date;
   private int first_date_tz;
   private Timestamp arrival_date;
   private int arrival_date_tz;
   private String subject;
   private String message_body;
   private String is_response_of;
   private String mail_path;
   
   public Messages(String message_ID, String mailing_list_url, String mailing_list,
         Timestamp first_date, int first_date_tz, Timestamp arrival_date, int arrival_date_tz,
         String subject, String message_body, String is_response_of, String mail_path)
   {
      this.message_ID = message_ID;
      this.mailing_list_url = mailing_list_url;
      this.mailing_list = mailing_list;
      this.first_date = first_date;
      this.first_date_tz = first_date_tz;
      this.arrival_date = arrival_date;
      this.arrival_date_tz = arrival_date_tz;
      this.subject = subject;
      this.message_body = message_body;
      this.is_response_of = is_response_of;
      this.mail_path = mail_path;
   }

   public String getMessage_ID()
   {
      return message_ID;
   }

   public void setMessage_ID(String message_ID)
   {
      this.message_ID = message_ID;
   }

   public String getMailing_list_url()
   {
      return mailing_list_url;
   }

   public void setMailing_list_url(String mailing_list_url)
   {
      this.mailing_list_url = mailing_list_url;
   }

   public String getMailing_list()
   {
      return mailing_list;
   }

   public void setMailing_list(String mailing_list)
   {
      this.mailing_list = mailing_list;
   }

   public Timestamp getFirst_date()
   {
      return first_date;
   }

   public void setFirst_date(Timestamp first_date)
   {
      this.first_date = first_date;
   }

   public int getFirst_date_tz()
   {
      return first_date_tz;
   }

   public void setFirst_date_tz(int first_date_tz)
   {
      this.first_date_tz = first_date_tz;
   }

   public Timestamp getArrival_date()
   {
      return arrival_date;
   }

   public void setArrival_date(Timestamp arrival_date)
   {
      this.arrival_date = arrival_date;
   }

   public int getArrival_date_tz()
   {
      return arrival_date_tz;
   }

   public void setArrival_date_tz(int arrival_date_tz)
   {
      this.arrival_date_tz = arrival_date_tz;
   }

   public String getSubject()
   {
      return subject;
   }

   public void setSubject(String subject)
   {
      this.subject = subject;
   }

   public String getMessage_body()
   {
      return message_body;
   }

   public void setMessage_body(String message_body)
   {
      this.message_body = message_body;
   }

   public String getIs_response_of()
   {
      return is_response_of;
   }

   public void setIs_response_of(String is_response_of)
   {
      this.is_response_of = is_response_of;
   }

   public String getMail_path()
   {
      return mail_path;
   }

   public void setMail_path(String mail_path)
   {
      this.mail_path = mail_path;
   }
   
   
}