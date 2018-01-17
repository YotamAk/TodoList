package com.yai.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yai.hibernate.dao.HibernateToDoListDAO;
import com.yai.hibernate.dao.HibernateUserDAO;
import com.yai.hibernate.object.User;

public class UserControllerServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
							ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		HttpSession session = request.getSession(true);
		try {
			HibernateUserDAO userDAO = new HibernateUserDAO();
			userDAO.addUser(email, password, firstName, lastName);
			response.sendRedirect("Login");
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
		ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		HttpSession session = request.getSession(true);
		try {
			//create a userDAO object to get user data by email and check by password
			HibernateUserDAO userDAO = new HibernateUserDAO();
			User user = new User(userDAO.getUser(email, password));
			session.setAttribute("firstName", user.getFirstName());
			session.setAttribute("currentSessionUser", user);
			response.sendRedirect("todo");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
