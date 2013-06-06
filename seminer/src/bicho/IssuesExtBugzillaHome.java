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
 * Home object for domain model class IssuesExtBugzilla.
 * @see bicho.IssuesExtBugzilla
 * @author Hibernate Tools
 */
public class IssuesExtBugzillaHome {

	private static final Log log = LogFactory
			.getLog(IssuesExtBugzillaHome.class);

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

	public void persist(IssuesExtBugzilla transientInstance) {
		log.debug("persisting IssuesExtBugzilla instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(IssuesExtBugzilla instance) {
		log.debug("attaching dirty IssuesExtBugzilla instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(IssuesExtBugzilla instance) {
		log.debug("attaching clean IssuesExtBugzilla instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(IssuesExtBugzilla persistentInstance) {
		log.debug("deleting IssuesExtBugzilla instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public IssuesExtBugzilla merge(IssuesExtBugzilla detachedInstance) {
		log.debug("merging IssuesExtBugzilla instance");
		try {
			IssuesExtBugzilla result = (IssuesExtBugzilla) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public IssuesExtBugzilla findById(java.lang.Integer id) {
		log.debug("getting IssuesExtBugzilla instance with id: " + id);
		try {
			IssuesExtBugzilla instance = (IssuesExtBugzilla) sessionFactory
					.getCurrentSession().get("bicho.IssuesExtBugzilla", id);
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

	public List findByExample(IssuesExtBugzilla instance) {
		log.debug("finding IssuesExtBugzilla instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("bicho.IssuesExtBugzilla")
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
