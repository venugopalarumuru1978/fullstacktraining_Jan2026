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
<jsp:include page="SiteLinks.jsp"/>
<hr />

<h1 style="text-align:center">Person Register Form</h1>
<hr />
<frm:form method="POST"  action="pinfoProcess"  modelAttribute="perObj">
<p style="text-align:center">
<label>Person Name </label><br />
<frm:input type="text"  path="pname"  placeholder ="Person Name" />
<br /><label>Gender </label><br />
<frm:radiobutton path="gender" value="Male" label="Male" />
&nbsp;&nbsp;&nbsp;
<frm:radiobutton path="gender" value="Female" label="Female" />
<br /><label>Location </label><br />
<frm:select path="location">
<frm:option value="Hyderabad" />
<frm:option value="Amaravathi" />
<frm:option value="Bangalore" />
</frm:select>
<br /><br />
<input type="submit"  value="Register" />
</p>
</frm:form>
</body>
</html>