package seminer;

import java.util.List;

public interface PeopleReader {
   List<People> parseFile(String projectName);
}
