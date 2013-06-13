import java.sql.Timestamp;

public class CompressedFiles implements java.io.Serializable {

   private String url;
   private String mailing_list_url;
   private String status;
   private Timestamp last_analysis;
   
   public CompressedFiles(String url, String mailing_list_url, String status,
         Timestamp last_analysis)
   {
      this.url = url;
      this.mailing_list_url = mailing_list_url;
      this.status = status;
      this.last_analysis = last_analysis;
   }

   public String getUrl()
   {
      return url;
   }

   public void setUrl(String url)
   {
      this.url = url;
   }

   public String getMailing_list_url()
   {
      return mailing_list_url;
   }

   public void setMailing_list_url(String mailing_list_url)
   {
      this.mailing_list_url = mailing_list_url;
   }

   public String getStatus()
   {
      return status;
   }

   public void setStatus(String status)
   {
      this.status = status;
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

