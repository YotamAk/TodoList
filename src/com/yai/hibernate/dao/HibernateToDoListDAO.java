package com.yai.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.yai.hibernate.object.ToDoItem;
import com.yai.hibernate.object.User;

public class HibernateToDoListDAO implements IToDoListDAO {
	//singleton instance
	private static final HibernateToDoListDAO instance = new HibernateToDoListDAO();
	//other variables
	private Configuration configuration;
	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	//private constructor for singleton pattern
	private HibernateToDoListDAO() {
		//config hibernate
		configuration = new Configuration().configure();
		//sessionFactory
		sessionFactory = configuration.buildSessionFactory();
		//open a session object
		session = sessionFactory.openSession();
		//start the transaction
		transaction = session.beginTransaction();
	}
	
	//getInstance method
	public static HibernateToDoListDAO getInstance() {
		return instance;
	}

	@Override
	public void addItem(int userId,String data) {
		ToDoItem item = new ToDoItem(userId, data);
		session.save(item);
		if(!transaction.wasCommitted())
			transaction.commit();
	}

	@Override
	public void removeItem(int itemId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ToDoItem getItemByID(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItem(ToDoItem item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List getAllItems(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
