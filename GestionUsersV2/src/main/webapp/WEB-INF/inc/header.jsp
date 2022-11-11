<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%  
    final String APP_ROOT = request.getContextPath(); 
 %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
<link rel="stylesheet" href="<%=APP_ROOT%>/design/style.css"></head>
<body>
    
  <div class ="mainTitle">
        <h3 class = "title"> Gestion des utilisateurs </h3>
  </div>
    
  <div class = "navbar"> 
    <ul>
     <li><a class="active menuLink" href="<%= APP_ROOT %>"> Accueil </a></li>
     <li><a class="menuLink" href="<%= APP_ROOT + "/list" %>"> Liste </a></li>
     <li><a class="menuLink" href="<%= APP_ROOT + "/add" %>"> Ajout</a></li>
    </ul>
  </div>
</body>
</html>