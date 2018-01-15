package com.yai.hibernate.dao;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.yai.hibernate.object.*;

public class UserDAO {
	public void addUser(String email, String password, String firstName, String lastName) {
		try {
			//config hibernate
			Configuration configuration = new Configuration().configure();
			//sessionFactory
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			//open a session object
			Session session = sessionFactory.openSession();
			//start the transaction
			Transaction transaction = session.beginTransaction();
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
}
