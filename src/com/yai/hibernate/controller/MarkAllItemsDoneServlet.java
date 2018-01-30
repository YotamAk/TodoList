package com.yai.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yai.hibernate.dao.HibernateToDoListDAO;

public class MarkAllItemsDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String userId = request.getParameter("userid");
		HttpSession session = request.getSession(false);
		try {
			if (userId!=null){
				HibernateToDoListDAO.getInstance().removeAllItems(Integer.valueOf(userId));
				response.sendRedirect("todo");
			}
			else
				System.out.println("Error in mark all items as done, trying to remove items of - id: " + userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
