package com.yai.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.yai.hibernate.dao.HibernateToDoListDAO;
import com.yai.hibernate.dao.HibernateUserDAO;

public class InsertItemServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String userId = request.getParameter("userid");
		String data = request.getParameter("newItem");
		HttpSession session = request.getSession(false);
		try {
			if (userId!=null && data!=null ){
				HibernateToDoListDAO.getInstance().addItem(Integer.valueOf(userId), data);
				response.getWriter().write("TEST");
				response.sendRedirect("todo");
			}
			else
				System.out.println("Error in insertItemServlet, trying to insert - id: " + userId + " " + "data: " + data.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
