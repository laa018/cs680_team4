package seminer;

import bicho.BichoReader;
import cvsanaly.CvsAnalyReader;

public class SEMiner {

	public static void main(String[] args) {
		Miner miner = new DefaultMiner();
		miner.setActionReader(new CvsAnalyReader());
		miner.setFileReader(null);
		miner.setIssueReader(new BichoReader());
		miner.setMailingListReader(null);
		miner.setPeopleReader(null);
		miner.setWriter(new ConsoleWriter());
		miner.mine("dummy");

		System.out.println("Done!");
	}

}
