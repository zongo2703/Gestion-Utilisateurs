<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
<link rel="stylesheet" href="../../design/style.css">
</head>
<body>
    <%  
        final String APP_ROOT = request.getContextPath(); 
    %>
    <h4>
        <a href ="<%= APP_ROOT + "/list" %>"> Liste | </a> 
        <a href ="<%= APP_ROOT + "/add" %>"> Ajout  |</a> 
    </h4>
</body>
</html>