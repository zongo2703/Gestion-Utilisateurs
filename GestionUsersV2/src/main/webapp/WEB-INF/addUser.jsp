<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajout</title>
<link rel="stylesheet" href="<%=APP_ROOT%>/design/style.css">
</head>

</head>
<body>
<div class = "container" style=" margin-top : 5%">
<p class ="${ status? 'success': 'error' }"> ${ statusMessage} </p>
 <form  method="post" style="width : 500px; padding : 10px">
  
    <label for="lastName">Nom</label> <br>
    <input type="text" name="nom" value=" ${user.nom }"> 
    <span > ${ erreurs.nom }</span> <br>
    
    <label for="firstName">Prénom</label><br>
    <input type="text" name="prenom" value=" ${user.prenom }">
    <span> ${ erreurs.prenom } </span> <br>
    
    <label for="login">Login</label> <br>
    <input type="text" name="login" value=" ${user.login }">
    <span> ${ erreurs.login } </span> <br>
    
    <label for="password">Password</label> <br>
    <input type="password" name="password">  
    <span> ${ erreurs.password } </span> <br>
    
    <label for="password">Confirmer Password</label> <br>
    <input type="password" name="passwordBis"> 
    <span> ${ erreurs.passwordBis } </span> <br> 
    
    <input class ="submitItem" type="submit" value="Valider">
 
 </form></div>
</body>
</html>