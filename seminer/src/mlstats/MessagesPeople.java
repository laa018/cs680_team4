public class MessagesPeople implements java.io.Serializable {

   private String type_of_recipient;
   private String message_id;
   private String email_address;
   
   MessagesPeople()
   {
      
   }
   
   MessagesPeople(String type_of_recipient, String message_id, String email_address)
   {
      this.type_of_recipient = type_of_recipient;
      this.message_id = message_id;
      this.email_address = email_address;
   }

   public String getType_of_recipient()
   {
      return type_of_recipient;
   }

   public void setType_of_recipient(String type_of_recipient)
   {
      this.type_of_recipient = type_of_recipient;
   }

   public String getMessage_id()
   {
      return message_id;
   }

   public void setMessage_id(String message_id)
   {
      this.message_id = message_id;
   }

   public String getEmail_address()
   {
      return email_address;
   }

   public void setEmail_address(String email_address)
   {
      this.email_address = email_address;
   }
   
}
