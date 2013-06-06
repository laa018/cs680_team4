package bicho;

// Generated Apr 27, 2013 2:06:40 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class IssuesWatchers.
 * @see bicho.IssuesWatchers
 * @author Hibernate Tools
 */
public class IssuesWatchersHome {

	private static final Log log = LogFactory.getLog(IssuesWatchersHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(IssuesWatchers transientInstance) {
		log.debug("persisting IssuesWatchers instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(IssuesWatchers instance) {
		log.debug("attaching dirty IssuesWatchers instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IssuesWatchers instance) {
		log.debug("attaching clean IssuesWatchers instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(IssuesWatchers persistentInstance) {
		log.debug("deleting IssuesWatchers instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IssuesWatchers merge(IssuesWatchers detachedInstance) {
		log.debug("merging IssuesWatchers instance");
		try {
			IssuesWatchers result = (IssuesWatchers) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssuesWatchers findById(java.lang.Integer id) {
		log.debug("getting IssuesWatchers instance with id: " + id);
		try {
			IssuesWatchers instance = (IssuesWatchers) sessionFactory
					.getCurrentSession().get("bicho.IssuesWatchers", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(IssuesWatchers instance) {
		log.debug("finding IssuesWatchers instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("bicho.IssuesWatchers")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
