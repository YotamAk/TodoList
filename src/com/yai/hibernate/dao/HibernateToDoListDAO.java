package com.yai.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;

import com.yai.hibernate.object.ToDoItem;


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
		if(transaction.wasCommitted())
			transaction = session.beginTransaction();
		ToDoItem item = new ToDoItem(userId, data);
		System.out.println(item.toString());
		session.save(item);
		if(!transaction.wasCommitted()){
			transaction.commit();
		}
			
	}

	@Override
	public void removeItem(int itemId) {
		try {
			//get user details
			String hql = "DELETE FROM ToDoItem WHERE id= :itemId";
			Query query = session.createQuery(hql);
			query.setParameter("itemId", itemId);
		} catch(HibernateException e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void removeItem(int userId, String data) {
		try {
			//delete user item by data name
			String hql = "DELETE FROM ToDoItem WHERE DATA= :data AND USERID= :userid";
			Query query = session.createQuery(hql);
			query.setParameter("data", data);
			query.setParameter("userid", userId);
			query.executeUpdate();
			//transaction.commit();
		} catch(HibernateException e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
		}
		
	}

	@Override
	public ToDoItem getItemByID(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List getAllItems(int userid) {
		List results = null;
		try {
			//get user details
			String hql = "FROM ToDoItem WHERE USERID = :userid";
			Query query = session.createQuery(hql);
			query.setParameter("userid", userid);
			results = query.list();
		} catch(HibernateException e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
		}
		return results;
	}

	@Override
	public void removeAllItems(int userId) {
		try {
			//delete all items by user id
			String hql = "DELETE FROM ToDoItem WHERE USERID= :userid";
			Query query = session.createQuery(hql);
			query.setParameter("userid", userId);
			query.executeUpdate();
			//transaction.commit();
		} catch(HibernateException e) {
            System.out.print("error: ");
            System.out.println(e.getMessage());
		}
		
	}
}
