<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cab form</title>
  <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 </style> 
</head>
<body style="background-color:Linen;">
<form:form action="${pageContext.request.contextPath}/Cab/save" method="post" modelAttribute="Cab">
<table border="1" cellsspacing="0" cellpadding="10">
<tr>
<td>Car Model :</td><td><form:input path="CabModelName"/>
<!-- create a hiiden field to store the id -->
<form:hidden path="CabId"/>
</td>
</tr>
<tr>
<td>Car Number :</td><td><form:input path="CabNumber" />

</td>
</tr>



<tr>
<th>Car Type :</th><td><form:radiobutton value="AC" path="CabType"/>AC <form:radiobutton value="Non AC" path="CabType"/>Non AC </td>
</tr>

<tr>
<td>Seats :</td><td><form:input path="Seats" />

</td>
</tr>

<tr>
<td colspan="2"><input type="Submit" value="Submit"></td>
</table>
 
</form:form>

 <button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/';">   Home  </button> 
</body>
</html>