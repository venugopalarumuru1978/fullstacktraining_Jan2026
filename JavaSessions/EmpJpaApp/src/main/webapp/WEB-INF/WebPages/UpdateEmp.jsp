<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Employee Update Form</h1>
<hr />
<h2 style="text-align:center">
<a href="../viewall">Back</a>
</h2>
<hr />
<frm:form method="POST"  action="../modemp_upt"  modelAttribute="empObj">
<p style="text-align:center">
<label>Employee Id </label><br />
<frm:input type="text"  path="eid"  placeholder ="Employee Name" />
<br /><br />
<label>Employee Name </label><br />
<frm:input type="text"  path="ename"  placeholder ="Employee Name" />
<br /><br /><label>Employee Job </label><br />
<frm:select path="job">
<frm:option value="HR-Manager" />
<frm:option value="Tester" />
<frm:option value="Developer" />
<frm:option value="Team Lead" />
<frm:option value="Project Manager" />
</frm:select>
<br /><br /><label>Employee Salary </label><br />
<frm:input type="text"  path="salary"  placeholder ="Employee Salary" />
<br /><br /><label>Employee Email </label><br />
<frm:input type="email"  path="email"  placeholder ="Employee Email" />
<br /><br /><label>Email Password </label><br />
<frm:input type="text"  path="pswd"  placeholder ="Password" />
<br /><br />
<input type="submit"  value="Update Emp" />
</p>
</frm:form>
</body>
</html>