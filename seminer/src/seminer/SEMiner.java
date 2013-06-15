package seminer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;

import bicho.BichoReader;
import cvsanaly.CvsAnalyActionReader;
import cvsanaly.CvsAnalyFileReader;
import cvsanaly.CvsAnalyReleaseOverviewReader;
import effortmetrics.EffortmetricsWriter;

public class SEMiner {

	public static void main(String[] args) throws IOException, ParseException{      
		Session cvsanalySession = MinerUtils.openSession("cvsanaly/cvsanaly_hibernate.cfg.xml");
		Session bichoSession = MinerUtils.openSession("bicho/bicho_hibernate.cfg.xml");
		Session effortMetricsSession = MinerUtils.openSession("effortmetrics/effortmetrics_hibernate.cfg.xml");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter in the number of projects to be processed (i.e. 2, 3): ");
        int number_of_projects = Integer.parseInt(br.readLine());
		Project[] projectList = new Project[number_of_projects];
        
        for (int i = 0; i < number_of_projects; i++){
        	System.out.println("Enter the project name: ");
	        String projectName = br.readLine();
	        System.out.println("Enter the prject's owner: ");
	        String owner = br.readLine();
	        System.out.println("Enter the project start date (mm/dd/yyyy): ");
	        String start_date_str = br.readLine();
	        System.out.println("Enter the project's bug tracking system (i.e. jira, bugzilla, etc.): ");
	        String bug_tracking_sys = br.readLine();
	        System.out.println("Enter the project's repostiry (i.e. svn, git, etc.): ");
	        String repository = br.readLine();
	        System.out.println("Enter the project's mailing list url: ");
	        String mailing_list = br.readLine();
	        System.out.println("Enter the project's IRC url: ");
	        String irc = br.readLine();
	        System.out.println("Enter the project's wiki url: ");
	        String wiki = br.readLine();
	        System.out.println("Enter the project's end date (mm/dd/yyyy or hit return if still in development): ");
	        String end_date_str = br.readLine();
	        
	        
	        Project project = new Project();
	        project.setProjectName(projectName);
	        project.setOwner(owner);
	        Date start_date = new SimpleDateFormat("MM/dd/yyyy").parse(start_date_str);
	        project.setStartTimestamp(start_date);
	        project.setBugTrackingSystem(bug_tracking_sys);
	        project.setRepository(repository);
	        project.setMailingList(mailing_list);
	        project.setIrc(irc);
	        project.setWiki(wiki);
	        if (!end_date_str.equals("")){
	        	Date end_date = new SimpleDateFormat("MM/dd/yyyy").parse(end_date_str);
		        project.setEndTimestamp(end_date);	
	        }
	        
	        projectList[i] = project;
        }
        
		boolean write = true;
		DeMiner deMiner = new DeMiner();
		deMiner.setWrite(write);
		for(int i = 0; i < projectList.length; i++) {
			System.out.println("Removing " + projectList[i].getProjectName());
			deMiner.mine(i, projectList[i].getProjectName());
		}
        
		Miner miner = new DefaultMiner();
		miner.setActionReader(new CvsAnalyActionReader(cvsanalySession, effortMetricsSession));
		miner.setFileReader(new CvsAnalyFileReader(cvsanalySession));
		miner.setIssueReader(new BichoReader(bichoSession));
		miner.setMailingListReader(null);
		miner.setPeopleReader(null);
		miner.setReleaseOverviewReader(new CvsAnalyReleaseOverviewReader(cvsanalySession));
		//miner.setWriter(new ConsoleWriter());
		miner.setWriter(new EffortmetricsWriter(effortMetricsSession));
		miner.mine(projectList);
		
		MinerUtils.commitAndCloseSession(effortMetricsSession);

		System.out.println("Done!");
	}

}
