package com.yai.hibernate.dao;
import com.yai.hibernate.object.ToDoItem;

public interface IToDoListDAO {
	public int addItem(ToDoItem item);
	public void removeItem(int itemId);
	public ToDoItem getItemByID(int itemId);
	public void updateItem(ToDoItem item);
}
