package com.yai.hibernate.object;

public class ToDoItem {
	private	int id;
	private int userId;
	private	String title;
	private String data;
	
	public ToDoItem() {
		super();
	}
	
	public ToDoItem(int _id, int _userId,String _title,String _data) {
		id = _id;
		userId = _userId;
		title = _title;
		data = _data;
	}
	
	public ToDoItem(int _userId, String _title, String _data) {
		userId = _userId;
		title = _title;
		data = _data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
		return "ToDoItem [title=" + title + ", data=" + data + "]";
	}

	
}
