<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>booking form</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/booking/save" method="post" modelAttribute="booking">
<table border="1" cellsspacing="0" cellpadding="10">



<tr>
<td>start Location :</td><td><form:input path="startLocation"/>
<!-- create a hiiden field to store the id -->
<form:hidden path="bookingId"/>
</td>
</tr>

<tr>
<td>end Location :</td><td><form:input path="endLocation" />
</td>
</tr>


<tr>
<td>booking Fare :</td><td><form:input path="bookingFare" />
</td>
</tr>



<tr>
<td>start Time :</td><td><form:input path="startTime" />
</td>
</tr>

<tr>
<td>end Time :</td><td><form:input path="endTime" />
</td>
</tr>

<tr>
<td>Cab Id :</td><td><form:input path="CabId" />
</td>
</tr>

<tr>
<td>driver id :</td><td><form:input path="driverid" />
</td>
</tr>

<tr>
<td colspan="2"><input type="Submit" value="Submit"></td>
</table>
 
</form:form>

  <a href="http://localhost:8081/cba/">Home</a>
</body>
</html>