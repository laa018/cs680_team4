package seminer;

import java.util.List;

public interface ReleaseOverviewReader {

	List<ReleaseOverview> read(String project);
	
}
