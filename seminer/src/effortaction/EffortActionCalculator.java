package effortaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import cvsanaly.FileLinks;
import cvsanaly.Scmlog;

import seminer.File;
import seminer.Action;
import seminer.MinerUtils;

public class EffortActionCalculator implements ActionCalculator
{

   Session cvsanalySession = MinerUtils.openSession("cvsanaly/cvsanaly_hibernate.cfg.xml");
   
   public void calculate(List<File> fileList)
   {
      //List<File> updatedFileList = new ArrayList<File>();
      int count = 0;
      
      for (int i = 0; i < fileList.size(); i++)
      {
         File file = fileList.get(i);
         int id = file.getFile_id();
         
         List<Object[]> resultList = cvsanalySession
               .createSQLQuery(
                     "SELECT * FROM actions WHERE file_id = " + id + " and (type = 'A' or 'M' or 'D')")
               .addEntity("actions", Action.class).list();
         
         count = resultList.size();
         
         fileList.get(i).setEffort_action(count);
         
         //file.setEffort_action( count );
         
         //updatedFileList.add(file);
      }
      MinerUtils.commitAndCloseSession(cvsanalySession);
      
      //return updatedFileList;
   }
   
//   public int main()
//   {
//      List<File> test = new ArrayList<File>();
//      File file = new File();
//      file.setFile_id(53438);
//      test.add(file);
//      return 0;
//   }
}
