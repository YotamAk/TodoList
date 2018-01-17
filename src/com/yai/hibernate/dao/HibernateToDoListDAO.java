package com.yai.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yai.hibernate.object.ToDoItem;
import com.yai.hibernate.object.User;

public class HibernateToDoListDAO implements IToDoListDAO {
	private SessionFactory sessionFactory;
	private Session session;
	//singleton instance
	private static final HibernateToDoListDAO instance = new HibernateToDoListDAO();
	
	//private constructor for singleton pattern
	private HibernateToDoListDAO() {}
	
	//getInstance method
	public static HibernateToDoListDAO getInstance() {
		return instance;
	}

	@Override
	public int addItem(ToDoItem item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeItem(int itemId) {
		try {
			//get user details
			String hql = "DELETE FROM todoitem WHERE id= :itemId";
			Query query = session.createQuery(hql);
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
	public void updateItem(ToDoItem item) {
		// TODO Auto-generated method stub
		
	}

}
