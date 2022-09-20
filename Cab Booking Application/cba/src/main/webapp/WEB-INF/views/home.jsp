<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
          <style> 
        .GFG {  background-color: Cornsilk;  border: 2px solid RosyBrown; color: RosyBrown;  padding: 5px 10px;  text-align: center; 
display: inline-block;  font-size: 20px; margin: 10px 30px;   cursor: pointer; 
 } 
 </style> 
    </head>
    <body style="background-color:Linen;">
      
        <h2 style="color:RosyBrown">Homepage!</h2>
        <h2 style="color:RosyBrown">Cab Booking Application</h2>
        
        <button class="GFG" 
    onclick="window.location.href = 'login';">   Login  </button> 
    
    <button class="GFG" 
    onclick="window.location.href = '${page.Context.request.contextPath}user/add';">   Sign Up  </button> 
    
            
       

    </body>
</html>
