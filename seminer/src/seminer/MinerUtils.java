package seminer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MinerUtils {

	public static Session openSession(String hibernateCfg) {
		Configuration configuration = new Configuration();
		configuration.configure(hibernateCfg);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory.openSession();
	}
	
	public static void commitAndCloseSession(Session session) {
		if(session.getTransaction().isActive()) {
			session.getTransaction().commit();
		}
		if(session.isOpen()) {
			session.close();
		}
	}

}
