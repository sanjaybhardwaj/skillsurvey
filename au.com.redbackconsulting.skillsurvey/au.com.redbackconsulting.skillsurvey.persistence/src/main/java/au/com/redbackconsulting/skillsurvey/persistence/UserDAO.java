package au.com.redbackconsulting.skillsurvey.persistence;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.com.redbackconsulting.skillsurvey.persistence.manager.PersistenceManager;
import au.com.redbackconsulting.skillsurvey.persistence.model.DBQueries;
import au.com.redbackconsulting.skillsurvey.persistence.model.User;


public class UserDAO extends BasicDAO<User> {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public UserDAO() {
		super(PersistenceManager.getInstance().getEntityManagerProvider());
	}

	public User getByUserId(String userId) {
		final EntityManager em = emProvider.get();
		try {
			final TypedQuery<User> query = em.createNamedQuery(DBQueries.GET_USER_BY_USER_ID, User.class);
			query.setParameter("userId", userId);
			User user = query.getSingleResult();
			return user;
		} catch (NoResultException x) {
			logger.error("Could not retrieve entity for userId {} from table {}.", userId, "User");
		} catch (NonUniqueResultException e) {
			logger.error("More than one entity for userId {} from table {}.", userId, "User");
		}

		return null;
	}
	
	public Collection<User>getManagedUser(){
		final EntityManager em = emProvider.get();
		try {
			final TypedQuery<User> query = em.createNamedQuery(DBQueries.GET_ALL_MANAGED_USER, User.class);
			//query.setParameter("userId", userId);
			Collection<User> user = query.getResultList();
			return user;
		} catch (NoResultException x) {
			logger.error("Could not retrieve entity for userId {} from table {}.", "userId", "User");
		} catch (NonUniqueResultException e) {
			logger.error("More than one entity for userId {} from table {}.", "userId", "User");
		}
		
		return null;
		
		
	}

	public User getOrCreateUser(String userId) {
		User user = getByUserId(userId);
		if (user == null) {
			user = new User();
			user.setUserId(userId);
			saveNew(user);
		}
		return user;
	}

	
	public void delete(String userId) {
        final EntityManager em = emProvider.get();
     final User user = getByUserId(userId);
        em.getTransaction().begin();
        if (user != null) {
            em.remove(user);
        }
        em.getTransaction().commit();
    }


}
