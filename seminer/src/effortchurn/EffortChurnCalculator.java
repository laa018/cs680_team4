package effortchurn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import cvsanaly.FileLinks;
import cvsanaly.Scmlog;

import seminer.File;
import seminer.Action;
import seminer.MinerUtils;

public class EffortChurnCalculator implements ChurnCalculator
{

   Session cvsanalySession = MinerUtils.openSession("cvsanaly/cvsanaly_hibernate.cfg.xml");

   //List<File> updatedFileList = new ArrayList<File>();
   
   public void calculate(List<Action> actionList, List<File> fileList)
   {
      int count = 0;
      String fileName = "";
      String revision = "";
      int file_id = 0;
      
      for( int i = 0; i < fileList.size(); i++ )
      {
         File file = fileList.get(i);
         file_id = file.getFile_id();
         
         cvsanaly.Files fileObj = (cvsanaly.Files) cvsanalySession
         .createSQLQuery(
               "SELECT * FROM files WHERE file_id = " + file_id ).addEntity("actions", Action.class);
         fileName = fileObj.getFileName();
         ChurnData data = getChurn( fileName, file.getRelease_number());
         int churn_value = data.getAdd() + data.getRemove();
         fileList.get(i).setEffort_churn(churn_value);
         updateAction( actionList, data, file_id, file.getBranch_name() );
      }
      MinerUtils.commitAndCloseSession(cvsanalySession);
   }
   
   public void updateAction( List<Action> actionList, ChurnData data, int file_id, String branch )
   {
      for (int i = 0; i < actionList.size(); i++)
      {
         Action action = actionList.get(i);
         
         if( file_id == action.getAction_id() && branch.equalsIgnoreCase(action.getBranch_name()))
         {
            actionList.get(i).setLines_added(data.getAdd());
            actionList.get(i).setLines_removed(data.getRemove());
         }
      }
   }
   
   public ChurnData getChurn(String file, String revision)
   {
      String s = null;
      int add = 0;
      int remove = 0;
      String command = "svn diff -c " + revision + " " + file;
      ChurnData data = new ChurnData();

      try
      {
         Process p = Runtime.getRuntime().exec(command);
         BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

         BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

         while ((s = stdInput.readLine()) != null)
         {
            if (s.startsWith("+") && !s.startsWith("+++"))
               add++;
            if (s.startsWith("-") && !s.startsWith("---"))
               remove++;
         }

         while ((s = stdError.readLine()) != null)
         {
            add = -1;
            remove = -1;
         }
         data.setAdd( add );
         data.setRemove(remove);

      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      return data;
   }
}
