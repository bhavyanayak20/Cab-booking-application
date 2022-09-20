<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer dashboard</title>

     <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 </style> 
 
 
</head>
<body style="background-color:Linen;">
<h1 style="color:RosyBrown"> Customer dashboard</h1>
<h1 style="color:RosyBrown">${messages}</h1>
<h2 style="color:RosyBrown"> Book your cab here</h2>
<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/';">   Home  </button> 


</body>
</html>