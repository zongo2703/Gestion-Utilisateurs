<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="beans.User" %>
<%@ page import ="dao.UserDao" %>
<%@ page import ="java.util.ArrayList" %>
<%@ include file="inc/header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste</title>
<link rel ="stylesheet" href="../design/style.css">
</head>
<body>
    <h3> Liste des utilisateurs </h3>
    
    <%
          ArrayList<User> users = new ArrayList<User> (); 
          users = (ArrayList<User>) request.getAttribute("user");
          int index = 0;  
          
			if(users.isEmpty())
			{%>
				<p>La liste des utilisateurs est vide !</p><%
			} else { %>
			
    <table border ="1">
        <tr> 
             <th> ID </th>
             <th> Nom </th>
             <th> Prénom</th>
             <th> Login </th>
             <th> Mot de passe </th>
             <th colspan="2"> Action  </th>
        </tr>
        
        <% 
            for (User user : users) {
            	 request.setAttribute("user", user);
            	%>
            	<tr> 
            	   <td> ${ user.id }</td>
            	   <td> ${ user.nom } </td>
            	   <td> <%= users.get(index).getPrenom() %></td>
            	   <td> <%= users.get(index).getLogin() %></td>
            	   <td> <%= users.get(index).getPassword() %></td>
            	   <td> 
            	        <a href=" <%= APP_ROOT %>/update?id=<%= user.getId() %> "> Modifier </a> | 
            	        <a href="<%= APP_ROOT %>/delete?id=<%= user.getId() %> "> Supprimer </a> 
            	   </td>
            	</tr>
           <%  
              index++;
           }
	   }
        %>
        
    </table>
    <%-- 
    ArrayList<User> users = new ArrayList<User> (); 
    users = (ArrayList<User>) request.getAttribute("user");
    String nom = users.get(0).getNom();
    --%>
   
</body>
</html>