package cvsanaly;

// Generated Apr 27, 2013 2:07:58 PM by Hibernate Tools 4.0.0

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class CommitsLines.
 * @see cvsanaly.CommitsLines
 * @author Hibernate Tools
 */
public class CommitsLinesHome {

	private static final Log log = LogFactory.getLog(CommitsLinesHome.class);

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

	public void persist(CommitsLines transientInstance) {
		log.debug("persisting CommitsLines instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(CommitsLines instance) {
		log.debug("attaching dirty CommitsLines instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(CommitsLines instance) {
		log.debug("attaching clean CommitsLines instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(CommitsLines persistentInstance) {
		log.debug("deleting CommitsLines instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public CommitsLines merge(CommitsLines detachedInstance) {
		log.debug("merging CommitsLines instance");
		try {
			CommitsLines result = (CommitsLines) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CommitsLines findById(int id) {
		log.debug("getting CommitsLines instance with id: " + id);
		try {
			CommitsLines instance = (CommitsLines) sessionFactory
					.getCurrentSession().get("cvsanaly.CommitsLines", id);
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

	public List findByExample(CommitsLines instance) {
		log.debug("finding CommitsLines instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cvsanaly.CommitsLines")
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
