<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver-List</title>
  <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 </style> 
</head>
<body style="background-color:Linen;">
<h2>Driver List</h2>
<table border="1" cellspacing="0" cellpadding="10">
<tr>
<th>ID</th><th>Name</th><th>Mobile</th><th>License</th>

</tr>
<!--  data row -->
<c:forEach var="driver" items="${drivers}">
<tr>
<td>${driver.driverid}</td>
<td>${driver.drivername}</td>
<td>${driver.driverlicense}</td>


<td>
<a href="editdriver/${driver.driverid}"> Edit</a> || 
<a href="deletedriver/${driver.driverid}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/';">   Home  </button> 
</body>
</html>