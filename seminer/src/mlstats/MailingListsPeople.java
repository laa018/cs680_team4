package mlstats;

public class MailingListsPeople implements java.io.Serializable {

   private String email_address;
   private String mailing_list_url;
   public MailingListsPeople(String email_address, String mailing_list_url)
   {
      this.email_address = email_address;
      this.mailing_list_url = mailing_list_url;
   }
   
   public String getEmail_address()
   {
      return email_address;
   }
   public void setEmail_address(String email_address)
   {
      this.email_address = email_address;
   }
   public String getMailing_list_url()
   {
      return mailing_list_url;
   }
   public void setMailing_list_url(String mailing_list_url)
   {
      this.mailing_list_url = mailing_list_url;
   }
}
