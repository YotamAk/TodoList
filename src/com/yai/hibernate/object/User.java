package com.yai.hibernate.object;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public User() {}
	
	public User(int _id, String _firstName, String _lastName, String _email, String _password){
		id = _id;
		firstName = _firstName;
		lastName = _lastName;
		email = _email;
		password = _password;
	}
	
	public User(String _firstName, String _lastName, String _email, String _password){
		firstName = _firstName;
		lastName = _lastName;
		email = _email;
		password = _password;
	}
	
	public User (User _user) {
		if (_user != null){
			id = _user.getId();
			firstName = _user.getFirstName();
			lastName = _user.getLastName();
			email = _user.getEmail();
			password = _user.getPassword();	
		}
		else id = -1;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
