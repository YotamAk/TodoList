<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css"><%@include file="css/style.css" %></style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
	<div class="login-page">
	  <div class="form">
	    <form class="login-form" action="register" method="GET">
	      <h3 class="text-success page-header">Welcome</h3>
	      <input type="text" placeholder="email" name="email"/>
	      <input type="password" placeholder="password" name="password"/>
	      <button class="btn btn-success" value="Register">login</button>
	      <p class="text-success">Not registered? <a class="text-danger" href="/register">Register here</a></p>
	    </form>
	  </div>
	</div>
</body>
</html>