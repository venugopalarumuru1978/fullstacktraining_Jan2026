<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">
Welcome to : ${emp.ename }
&nbsp;&nbsp;|&nbsp;&nbsp;<a href="../login">Logout</a>
</h1>
<hr />
<table width="100%"  border="1">
<tr>
<th>Emp No</th>
<th>Emp Name</th>
<th>Emp Job</th>
<th>Emp Salary</th>
<th>Emp Email</th>
<th>Emp Password</th>
</tr>
<tr>
<td>${emp.eid }  </td>
<td>${emp.ename }  </td>
<td>${emp.job }  </td>
<td>${emp.salary }  </td>
<td>${emp.email }  </td>
<td>${emp.pswd }  </td>
</tr>
</table>
</body>
</html>