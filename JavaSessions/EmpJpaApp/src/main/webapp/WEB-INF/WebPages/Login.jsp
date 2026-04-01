<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h1 style="text-align:center">Login Page</h1>
<hr />
<form name="frmLogin"  method="POST"  action="loginProcess">
<p style="text-align:center">
	
	<input type="text"  name="txtUname"  placeholder="User Name" />
	<br /><br />
	<input type="password"  name="txtPwd"  placeholder="Password" />
	<br /><br />
	<input type="submit"  value="Login" />
</p>
</form>
<h2 style="text-align:center">${msg }</h2>
</body>
</html>