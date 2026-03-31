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
<h1 style="text-align:center">Search Employee</h1>
<hr />
<jsp:include page="Links.jsp"/>
<hr />
<form name="frmSearch"  method="POST"  action="search_emp">
<p style="text-align:center">
	<label>Emp ID</label>
	<input type="text"  name="txtEid"  placeholder="Employee ID" />
	<input type="submit"  value="Search" />
</p>
</form>
<c:if test="${emp!=null }">

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
</c:if>
<c:if test="${emp==null }">
<h2 style="text-align:center;color:red">${msg }</h2>
</c:if>
</body>
</html>