<%-- 
    Document   : HomePage
    Created on : Jan 12, 2024, 2:24:18 PM
    Author     : frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>USer Dashboard</title>
    </head>
    <body>
        <h1>Hello <%=session.getAttribute("uname")%></h1>
        <a href="MyProfile.jsp">PROFILE</a><br>
        <a href="Edit Profile.jsp">EDIT PROFILE</a>
        <a href="Change Password.jsp">CHANGE PASSWORD</a>
    </body>
</html>
