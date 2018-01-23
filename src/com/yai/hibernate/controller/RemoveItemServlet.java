package com.yai.hibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yai.hibernate.dao.HibernateToDoListDAO;

public class RemoveItemServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String userId = request.getParameter("userid");
		String data = request.getParameter("removeItem");
		HttpSession session = request.getSession(false);
		try {
			if (userId!=null && data!=null ){
				HibernateToDoListDAO.getInstance().removeItem(Integer.valueOf(userId), data);
				response.sendRedirect("todo");
			}
			else
				System.out.println("Error in RemoveItemServlet, trying to delete - id: " + userId + " " + "data: " + data.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
