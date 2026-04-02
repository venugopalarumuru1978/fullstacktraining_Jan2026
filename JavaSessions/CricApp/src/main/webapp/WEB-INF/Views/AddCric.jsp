<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="text-align:center">
<a href="showcric">Add New Cricketer</a>
&nbsp;&nbsp;
<a href="getcricinfo">Show All Cricketers</a>
</h2>
<hr />
<f:form method="POST"  modelAttribute="cricketer" action="savecricketer" enctype="multipart/form-data">
<table border=1>
<tr>
<td>Cricketer Name</td>
<td><f:input type="text" path="cricname"/></td>
</tr>

<tr>
<td>Browse Cricketer Image</td>
<td><input type="file" name="upimage" ></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="Add Details"/></td>
</tr>
</table>
</f:form>
<h1>${msg}</h1>

</body>
</html>