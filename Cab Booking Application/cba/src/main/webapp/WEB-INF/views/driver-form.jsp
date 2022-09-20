<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver form</title>
  <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 .error{color:red}
 </style> 
</head>
<body style="background-color:Linen;">
<h1>Insert Driver Details</h1>
<form:form action="${pageContext.request.contextPath}/driver/save" modelAttribute="driver">
<table border="1" cellpadding="10" cellspacing="0">
<tr>
<td>Name * :</td><td><form:input path="drivername" />
<!-- create a hiiden field to store the id -->

<form:hidden path="driverid"/>
</td>
</tr>
<tr>
<td>Mobile no :</td><td><form:input path="drivermobile" />

</td>
</tr>

<tr>
<td>License no :</td><td><form:input path="driverlicense" />

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