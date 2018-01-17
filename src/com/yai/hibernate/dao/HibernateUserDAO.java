package com.yai.hibernate.dao;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.yai.hibernate.object.*;

public class HibernateUserDAO implements IUserDAO {
	
	//singleton instance
	private static final HibernateUserDAO instance = new HibernateUserDAO();
	
	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	public HibernateUserDAO() {
		//config hibernate
		configuration = new Configuration().configure();
		//sessionFactory
		sessionFactory = configuration.buildSessionFactory();
		//open a session object
		session = sessionFactory.openSession();
		//start the transaction
		transaction = session.beginTransaction();
	}
	
	public void addUser(String email, String password, String firstName, String lastName) {
		try {
			//create user object
			User user = new User(firstName, lastName, email, password);
			//save and commit transaction
			session.save(user);
			transaction.commit();
		} catch(HibernateException e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
		}
	}
	
	public User getUser(String email, String password) {
		User user = null;
		try {
			//get user details
			String hql = "FROM User WHERE EMAIL = :email";
			Query query = session.createQuery(hql);
			query.setParameter("email", email);
			List results = query.list();
			user = (User) results.get(0);
		} catch(HibernateException e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
		}
		if (user.getPassword().equals(password)){
			return user;
		}	
		return null;
		
	}
}
