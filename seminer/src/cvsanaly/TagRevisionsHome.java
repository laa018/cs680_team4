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
 * Home object for domain model class TagRevisions.
 * @see cvsanaly.TagRevisions
 * @author Hibernate Tools
 */
public class TagRevisionsHome {

	private static final Log log = LogFactory.getLog(TagRevisionsHome.class);

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

	public void persist(TagRevisions transientInstance) {
		log.debug("persisting TagRevisions instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TagRevisions instance) {
		log.debug("attaching dirty TagRevisions instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TagRevisions instance) {
		log.debug("attaching clean TagRevisions instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(TagRevisions persistentInstance) {
		log.debug("deleting TagRevisions instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TagRevisions merge(TagRevisions detachedInstance) {
		log.debug("merging TagRevisions instance");
		try {
			TagRevisions result = (TagRevisions) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TagRevisions findById(int id) {
		log.debug("getting TagRevisions instance with id: " + id);
		try {
			TagRevisions instance = (TagRevisions) sessionFactory
					.getCurrentSession().get("cvsanaly.TagRevisions", id);
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

	public List findByExample(TagRevisions instance) {
		log.debug("finding TagRevisions instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("cvsanaly.TagRevisions")
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
