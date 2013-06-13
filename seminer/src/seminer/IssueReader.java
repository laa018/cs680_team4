package seminer;

import java.util.List;

public interface IssueReader {
   List<Issues> parseFile(String projectName);

}
