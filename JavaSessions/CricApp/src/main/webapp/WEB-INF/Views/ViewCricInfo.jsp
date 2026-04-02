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
<h2 style="text-align:center">
<a href="showcric">Add New Cricketer</a>
&nbsp;&nbsp;
<a href="getcricinfo">Show All Cricketers</a>
</h2>
<hr />
<table border="1" width="100%">
	<tr>
		
		<th>Cricketer Name</th>
		<th>Cricketer Photo</th>	
	</tr>
	<c:forEach var="e" items="${cricAll}">   
   	<tr>  
   			<td>${e.cricname}</td> 
    		<td><img src="/getCricPhoto/${e.cno}" width="100" height="100" /></td>
    		
   </tr>  
	</c:forEach> 	      
	</table>
</body>
</html>