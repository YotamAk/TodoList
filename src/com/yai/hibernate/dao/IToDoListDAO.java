package com.yai.hibernate.dao;
import org.hibernate.mapping.List;

import com.yai.hibernate.object.ToDoItem;

public interface IToDoListDAO {
	public void removeItem(int itemId);
	public ToDoItem getItemByID(int itemId);
	public void updateItem(ToDoItem item);
	public List getAllItems(int user_id);
	public void addItem(int userId, String item);
}
