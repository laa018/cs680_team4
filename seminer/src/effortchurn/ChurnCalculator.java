package effortchurn;

import java.util.List;

import seminer.File;
import seminer.Action;

public interface ChurnCalculator {
   void calculate(List<Action> actionList, List<File> fileList);
}
