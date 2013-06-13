package seminer;

import java.util.List;

public interface MailingListReader {

   List<Communication> parseFile( String projectName );
}
