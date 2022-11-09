<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="inc/menu.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout</title>
</head>
<body>
 <form  method="post" style="width : 500px; padding : 10px">
  <fieldset>
    <legend> Ajout </legend> 
    <label for="lastName">Nom</label>
    <input type="text" name="lastName">
    <label for="firstName">Prénom</label>
    <input type="text" name="firstName">
    <label for="login">Login</label>
    <input type="text" name="login">
    <label for="password"> Password</label>
    <input type="password" name="password"> 
    <input type="submit" value="Valider">
  </fieldset>
 </form>
</body>
</html>