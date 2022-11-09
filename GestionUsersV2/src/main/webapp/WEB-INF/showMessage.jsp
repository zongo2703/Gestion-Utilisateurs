<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Message</title>
</head>
<body>
    <h3> Saluations </h3>
    <% String message = (String) request.getAttribute("message"); %>
    <p> <%= message %></p>
</body>
</html>