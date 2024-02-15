<%-- 
    Document   : HomePage
    Created on : Jan 12, 2024, 2:24:18 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page  import = "java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Dashboard</title>
    </head>
    <%
        
        int balance = 0;
        String sel1 = "select*from tbl_user where user_id='"+session.getAttribute("uid")+"'";  
        ResultSet rsu = con.selectCommand(sel1);
        if(rsu.next())
        {
            balance = rsu.getInt("user_wallet");
            if(balance <= 0)
            {
                %>
                <script>
                    alert("Payment Required");
                    window.location="Payment.jsp";
                </script>
                <%
            }
        }
    %>
    <body>
        <h1>Hello <%=session.getAttribute("uname")%></h1>
        <a href="MyProfile.jsp">PROFILE</a><br>
        <a href="Edit Profile.jsp">EDIT PROFILE</a><br>
        <a href="Change Password.jsp">CHANGE PASSWORD</a><br>
        <a href="UserRequest.jsp">REQUEST</a>
    </body>
</html>
