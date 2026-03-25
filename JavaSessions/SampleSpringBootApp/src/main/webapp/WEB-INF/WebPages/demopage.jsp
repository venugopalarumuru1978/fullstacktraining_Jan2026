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
<h1 style="text-align:center">HTML Form</h1>
<hr />
<form  name="frmReg" method="POST" action="demopost">
<p style="text-align:center">
	<label>Ur Name</label><br />
	<input type="text"  name="txtName" placeholder ="ur name" />
	<br />
	<input type="submit"  value="Click Me" />
</p>
</form>

<h1>Given Name is : ${msg }</h1>
</body>
</html>