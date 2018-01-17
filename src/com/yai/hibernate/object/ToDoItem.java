package com.yai.hibernate.object;

public class ToDoItem {
	private	int id;
	private int userId;
	private String data;
	
	public ToDoItem() {}
	
	public ToDoItem(int _id, int _userId ,String _data) {
		id = _id;
		userId = _userId;
		data = _data;
	}
	
	public ToDoItem(int _userId, String _data) {
		userId = _userId;
		data = _data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "ToDoItem [id=" + id + ", data=" + data + "]";
	}

	
}
