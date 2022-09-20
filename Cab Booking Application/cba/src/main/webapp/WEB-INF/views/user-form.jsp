<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>	User form</title>
   <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 </style> 
<style>
.error{color:red}
</style>
</head>
<body style="background-color:Linen;">
<h1>Add User</h1>
<form:form action="save" method="post" modelAttribute="user">
<table cellspacing="0"  cellpadding="10"> 
<tr>
<th>Name :</th><td><form:input path="name" />
<form:errors path="name" cssClass="error"/>
</td>
</tr>
<tr>
<th>Gender :</th><td><form:radiobutton value="Male" path="gender"/>Male <form:radiobutton value="Female" path="gender"/>Female </td>
</tr>
<tr>
<th>Email * :</th><td><form:input  path="Email"/>
<form:errors path="Email" cssClass="error">

</form:errors>
</td>
</tr>
<tr>
<tr>
<th>Password :</th><td><form:password  path="pwd"/>
<form:errors path="pwd" cssClass="error">

</form:errors>
</td>
</tr>
<tr>
<th>Role :</th><td><form:select  path="role.roleid">
<form:option value="-1">Select Role</form:option>
<c:forEach var="role" items="${rolelist}">

<form:option value="${role.roleid}">${role.role}</form:option>
</c:forEach>
</form:select>
</td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Submit"></td>
</tr>
</table>
</form:form>
<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/';">   Home  </button> 
</body>
</html>