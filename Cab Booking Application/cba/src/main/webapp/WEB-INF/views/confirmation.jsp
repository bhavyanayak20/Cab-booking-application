<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 </style> 
</head>
<body style="background-color:Linen;">
First Name :${student.firstName}
<br><br>
Last Name :${student.lastName}
<br><br>
Country :${student.country}
<br><br>
Gender :${student.gender}
<br><br>
<ul>
<c:forEach var="fav" items="${student.favlang}">
	<li>${fav}</li>
</c:forEach>
</ul>
Favorite Language :${student.gender}
<h1>Thank you for registration.</h1>
<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/';">   Home  </button> 
</body>
</html>