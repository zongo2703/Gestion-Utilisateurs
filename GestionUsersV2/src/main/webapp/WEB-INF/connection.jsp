<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="beans.User" %>
<%@ page import ="dao.UserDao" %>
<%@ include file="inc/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel ="stylesheet" href="/design/style.css"> 
</head>

<body>

  <form  method="post">
    <fieldset>
       <legend> Connexion </legend> 
       <label for="login">Login</label> <br>
       <input type="text" name="login"><br>
       
       <label for="password"> Password</label> <br>
       <input type="password" name="password"> <br>
       
       <input class = " submitItem" type="submit" value="Connexion">
    </fieldset>
 </form>
 
  <p class = "error"> ${ errorMessage } </p>
</body>
</html>