package com.yai.hibernate.dao;

import com.yai.hibernate.object.User;

public interface IUserDAO {
	public void addUser(String email, String password, String firstName, String lastName);
	public User getUser(String email, String password);
}
