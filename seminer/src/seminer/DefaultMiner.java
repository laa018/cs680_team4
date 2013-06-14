package seminer;

import java.util.List;

public class DefaultMiner implements Miner {
	
	private ActionReader actionReader;
	private FileReader fileReader;
	private IssueReader issueReader;
	private PeopleReader peopleReader;
	private ReleaseOverviewReader releaseOverviewReader;
	private Writer writer;
	
	@Override
	public void setActionReader(ActionReader r) {
		this.actionReader = r;
	}

	@Override
	public void setFileReader(FileReader r) {
		this.fileReader = r;
	}

	@Override
	public void setIssueReader(IssueReader r) {
		this.issueReader = r;
	}

	@Override
	public void setMailingListReader(MailingListReader r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPeopleReader(PeopleReader r) {
		this.peopleReader = r;
	}

	@Override
	public void setReleaseOverviewReader(ReleaseOverviewReader r) {
		this.releaseOverviewReader = r;
	}
	
	@Override
	public void setWriter(Writer w) {
		this.writer = w;
	}

	@Override
	public void mine(Project[] projects) {
		
		for (Project project : projects) {
			System.out.println("Mining " + project.getProjectName());
			writer.writeProject(project);
			
			if(releaseOverviewReader != null) {
				System.out.println("Mining releases for " + project.getProjectName());
				List<ReleaseOverview> releaseOverviewList = releaseOverviewReader.read(project.getProjectName());
				for (ReleaseOverview releaseOverview : releaseOverviewList) {
					writer.writeReleaseOverview(releaseOverview);
				}
			}

			if(actionReader != null) {
				System.out.println("Mining actions for " + project.getProjectName());
				List<Action> actionList = actionReader.parseFile(project.getProjectName());
				for (Action action : actionList) {
					writer.writeAction(action);
				}
			}
			
			if(issueReader != null) {
				System.out.println("Mining issues for " + project.getProjectName());
				List<Issues> issueList = issueReader.parseFile(project.getProjectName());
				for (Issues issues : issueList) {
					writer.writeIssues(issues);
				}
			}
			
			if(fileReader != null) {
				System.out.println("Mining files for " + project.getProjectName());
				List<File> fileList = fileReader.parseFile(project.getProjectName());
				for (File file : fileList) {
					writer.writeFile(file);
				}
			}
			
			if(peopleReader != null) {
				System.out.println("Mining people for " + project.getProjectName());
				List<People> peopleList = peopleReader.parseFile(project.getProjectName());
				for (People people : peopleList) {
					writer.writePeople(people);
				}
			}
			
		}
		
	}

}
