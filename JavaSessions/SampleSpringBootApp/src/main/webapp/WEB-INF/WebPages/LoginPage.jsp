<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="SiteLinks.jsp"/>
<hr />
<h1 style="text-align:center">Login Form</h1>
<hr />
<form  name="frmReg" method="POST" action="loginProcess">
<p style="text-align:center">
	<label>Username</label><br />
	<input type="text"  name="txtUname" placeholder ="user name" />
	<br />
	<label>Password</label><br />
	<input type="password"  name="txtPass" placeholder ="Password" />
	<br />
	<input type="submit"  value="Click Me" />
</p>
</form>
<p style="text-align:center">${info }</p>
</body>
</html>