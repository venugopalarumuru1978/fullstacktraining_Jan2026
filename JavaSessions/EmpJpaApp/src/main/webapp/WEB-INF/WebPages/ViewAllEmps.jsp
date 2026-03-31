<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">View All Employees Info</h1>
<hr />
<jsp:include page="Links.jsp"/>
<hr />
<table width="100%"  border="1">
<tr>
<th>Emp No</th>
<th>Emp Name</th>
<th>Emp Job</th>
<th>Emp Salary</th>
<th>Emp Email</th>
<th>Emp Password</th>
<th>Operations</th>
</tr>

<c:forEach var="emp"  items="${emplist }">
<tr>
<td>${emp.eid }  </td>
<td>${emp.ename }  </td>
<td>${emp.job }  </td>
<td>${emp.salary }  </td>
<td>${emp.email }  </td>
<td>${emp.pswd }  </td>
<td>
<a href="delemp/${emp.eid }">Delete Employee</a>
&nbsp;&nbsp;|&nbsp;&nbsp;
<a href="modemp/${emp.eid }">Modify Employee</a>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>