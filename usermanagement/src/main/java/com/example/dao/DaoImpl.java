package com.example.dao;

/**
 * @author Yogesh Potdar
 */
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.example.daoModel.UserManagementModel;
import com.example.exceptionHandlerUtility.ExceptionHandler;

public class DaoImpl implements IDao {
	// intializing SessionFactory
	SessionFactory sessionFactory;

	/**
	 * SetSessionFactory
	 * 
	 * @param sessionFactory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@SuppressWarnings("unchecked")
	public List<UserManagementModel> getUserList(UserManagementModel sa) {
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(UserManagementModel.class);
		Criterion a = Restrictions.and(Restrictions.eq("firstName", sa.getFirstName()),
				Restrictions.eq("lastName", sa.getLastName()));
		Criterion b = Restrictions.and(Restrictions.eq("email", sa.getEmail()),
				Restrictions.eq("password", sa.getPassword()));
		cr.add(Restrictions.and(a, b));
		
		List<UserManagementModel> li = (List<UserManagementModel>) cr.list();
		return li;
	}

	public void save(UserManagementModel sa) throws Exception {
		if (getUserList(sa).size() > 0) {
			throw new ExceptionHandler("Already user present.");
		}
		Session session = sessionFactory.openSession();
		session.save(sa);
	}
}