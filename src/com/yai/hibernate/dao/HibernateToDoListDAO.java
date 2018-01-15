package com.yai.hibernate.dao;

import com.yai.hibernate.object.ToDoItem;

public class HibernateToDoListDAO implements IToDoListDAO {
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

}
