<%@page import="com.yai.hibernate.object.ToDoItem"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>
<style type="text/css"><%@include file="css/todo.css" %></style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Todo App</title>
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-md-6">
	            <div class="todolist not-done">
	            <% com.yai.hibernate.object.User currentUser = (com.yai.hibernate.object.User) (session.getAttribute("currentSessionUser"));%> 
	             <h1><%=currentUser.getFirstName()%>s Todos</h1>             
	             		<input type="hidden" class="user-id" value="<%=currentUser.getId()%>" name="userid">
	             	    <input type="text" class="form-control add-todo" name="newItem"><br>
	                	<button class="additem btn btn-info" value="item" >Add</button><br>
				 <button id="checkAll" class="btn btn-success">Mark all as done</button> 
	                    <hr>
	                    <ul id="sortable" class="list-unstyled">
	                    	<%Iterator itr = null; %>
	                    	<%List data = (List) session.getAttribute("currentSessionTasks");
	                    	for (itr = data.iterator(); itr.hasNext();) {
	                    		%>
	                  			<% ToDoItem s = (ToDoItem) itr.next(); %>
	                    		<li class="ui-state-default">
			                        <div class="checkbox">
			                            <label><input type="checkbox" name="<%=s.getData()%>" value="" /><%=s.getData()%></label>
			                        </div>
			                    </li>
	                    	<%}%>
	                </ul>
	                <div class="todo-footer">
	                    <strong><span class="count-todos"></span></strong> Items Left
	                </div>
	            </div>
	        </div>
	        <div class="col-md-6">
	            <div class="todolist">
	             <h1>Already Done</h1>
	                <ul id="done-items" class="list-unstyled"></ul>
	            </div>
	        </div>
	    </div>
	</div>
	<script type="text/javascript"><%@include file="js/script.js"%></script>
</body>
</html>