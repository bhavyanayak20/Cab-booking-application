<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cab-List</title>
  <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 </style> 
</head>
<body style="background-color:Linen;">
<h2>Cab List</h2>
<table border="1" cellspacing="0" cellpadding="10">
<tr>
<th>ID</th><th>Cab Model Name</th><th>Car Number</th><th>Car Type</th><th>Seats</th>

</tr>
<!--  data row -->
<c:forEach var="Cab" items="${Cabs}">
<tr>
<td>${Cab.cabId}</td>
<td>${Cab.cabModelName}</td>
<td>${Cab.cabNumber}</td>
<td>${Cab.cabType}</td>
<td>${Cab.seats}</td>


<td>
<a href="editCab/${Cab.cabId}"> Edit</a> || 
<a href="deleteCab/${Cab.cabId}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/';">   Home  </button> 
</body>
</html>