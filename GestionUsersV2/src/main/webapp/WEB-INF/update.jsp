<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <% User user = (User) request.getAttribute("user"); %>
    <form  method="post" style="width : 900px; padding : 10px">
  <fieldset>
    <legend> Modifier </legend> 
    <label for="lastName">Nom</label>
    <input type="text" name="lastName" value =" ${user.id }">
    <label for="firstName">Prénom</label>
    <input type="text" name="firstName" value =" <%= user.getPrenom() %>"> 
    <label for="login">Login</label>
    <input type="text" name="login" value =" <%= user.getLogin() %>">
    <label for="password"> Password</label>
    <input type="password" name="password" "> 
    <input type="submit" value="Valider">
  </fieldset>
 </form>
</body>
</html>