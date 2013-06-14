package effortchurn;

public class ChurnData
{
   private int add = 0;
   private int remove = 0;
   
   public ChurnData()
   {
      
   }
   public ChurnData(int add, int remove)
   {
      this.add = add;
      this.remove = remove;
   }
   public int getAdd()
   {
      return add;
   }
   public void setAdd(int add)
   {
      this.add = add;
   }
   public int getRemove()
   {
      return remove;
   }
   public void setRemove(int remove)
   {
      this.remove = remove;
   }
   
   
}