package com.yai.hibernate.dao;
import java.util.List;
import com.yai.hibernate.object.ToDoItem;

public interface IToDoListDAO {
	public void removeItem(int itemId);
	public void removeItem(int userId, String data);
	public void removeAllItems(int userId);
	public ToDoItem getItemByID(int itemId);
	public List getAllItems(int user_id);
	public void addItem(int userId, String item);
}
