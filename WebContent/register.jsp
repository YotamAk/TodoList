<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
<style type="text/css"><%@include file="css/style.css" %></style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
	<div class="register-page">
	    <div class="form">
		    <form action="login" method="post">
		    	<h2 class="text-primary page-header">Registration</h2>
		        <table cellpadding="3pt">
		            <tr>
		             <tr>
		                <td>First name:</td>
		                <td><input type="text" name="firstName" size="30" /></td>
		            </tr>
		            <tr>
		                <td>Last name:</td>
		                <td><input type="text" name="lastName" size="30" /></td>
		            </tr>
		                <td>Email :</td>
		                <td><input type="text" name="email" size="30"/></td>
		            </tr>	
		            <tr>
		                <td>Password :</td>
		                <td><input type="password" name="password" size="30" /></td>
		            </tr>
		            <tr>
		                <td>Confirm Password :</td>
		                <td><input type="password" name="password2" size="30" /></td>
		            </tr>
		        </table>
		        <button class= "btn btn-primary" type="submit" value="login" >Register</button>
		    </form>
	    </div>
    </div>
</body>
</html>