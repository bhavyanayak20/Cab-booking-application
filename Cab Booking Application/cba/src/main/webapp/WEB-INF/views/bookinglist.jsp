<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>booking-List</title>
</head>
<body>
<h2>booking List</h2>
<table border="1" cellspacing="0" cellpadding="10">
<tr>
<th>booking id</th><th>date</th><th>start Location</th><th>end Location</th><th>booking Fare</th><th>start Time</th><th>end Time</th><th>Cab Id</th><th>driver id</th>

</tr>
<!--  data row -->
<c:forEach var="booking" items="${bookings}">
<tr>
<td>${booking.bookingId}</td>
<td>${booking.startLocation}</td>
<td>${booking.endLocation}</td>
<td>${booking.bookingFare}</td>
<td>${booking.startTime}</td>
<td>${booking.endTime}</td>
<td>${booking.cabId}</td>
<td>${booking.driverid}</td>


<td>
<a href="editbooking/${booking.bookingId}"> Edit</a> || 
<a href="editbooking/${booking.bookingId}">Delete</a>
</td>
</tr>
</c:forEach>
</table>
<a href="http://localhost:8081/cba/">Home</a>
</body>
</html>