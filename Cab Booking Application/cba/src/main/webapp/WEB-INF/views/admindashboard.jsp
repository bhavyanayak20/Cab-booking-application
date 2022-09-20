<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin dashboard</title>
  <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 </style> 
</head>
<body>

<h1 style="color:RosyBrown">Admin Dashboard</h1>


<h4 style="color:RosyBrown">${messages}</h4>

<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/driver/showform';">   Add Driver  </button> 
    
    
<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/driver/list';">   Driver List  </button> 
    
    
<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/Cab/showform';">   Add Cab Details  </button> 
    
    
<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/Cab/list';">   Cab List  </button> 
    

<br>
<button class="GFG" 
    onclick="window.location.href = '${page.Context.request.contextPath}role/list';">  Add Role  </button> 
    <button class="GFG" 
    onclick="window.location.href = '${page.Context.request.contextPath}user/list';">   View Users  </button> 
          
    	
    	<br>

<button class="GFG" 
    onclick="window.location.href = 'http://localhost:8081/cba/';">   Home  </button> 
</body>
</html>