<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.User" %>
<%@ include file="inc/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=APP_ROOT%>/design/style.css">
</head>
<body>

   <% User user = (User) request.getAttribute("user"); %>
<div class = "container" style=" margin-top : 5%">
    <form  method="post" style="width : 900px; padding : 10px">
  <fieldset>
    <legend> Modifier </legend> 
    <label for="lastName">Nom</label> <br>
    <input type="text" name="lastName" value =" ${user.nom }"> <br>
    <span>  </span>
    
    <label for="firstName">Prénom</label><br>
    <input type="text" name="firstName" value ="${ user.prenom }">  <br>
    <span>  </span>
    
    <label for="login">Login</label> <br>
    <input type="text" name="login" value =" ${ user.login }"> <br>
    <span>  </span>
    
    <label for="password"> Password</label> <br>
    <input type="password" name="password" ">  <br>
    <span>  </span>
    
    <label for="password"> Ressaisir le password</label> <br>
    <span>  </span>
    
    <input type="password" name="passwordBis" ">  <br>
    <span>  </span> 
    
    <input class="submitItem" type="submit" value="Valider">
  </fieldset>
 </form>
</div>
</body>
</html>