package seminer;

import java.util.List;

public interface ActionReader {
	
	public boolean isWrite();
	
	public void setWrite(boolean write);
	
	public List<Action> parseFile(int repositoryId, String projectName);

}
