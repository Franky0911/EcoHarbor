<%-- 
    Document   : Login
    Created on : Jan 5, 2024, 4:00:55 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="../Assets/Form.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@page import="java.sql.ResultSet"%>
        <title>Login</title>
    </head>
    <%@include file="Head.jsp" %>
    <body>
    <%
        
        if(request.getParameter("btn_login")!=null)
        {
            String email = request.getParameter("txt_email");
            String password = request.getParameter("txt_password");
            int sts=0;
            String seladmin = "select * from tbl_admin where admin_email='"+email+"' and admin_password='"+password+"'";
            String selagency = "select * from tbl_agency where agency_email='"+email+"' and agency_password='"+password+"'";
            String selUser = "select * from tbl_user where user_email='"+email+"' and user_password='"+password+"'";
            ResultSet rsU = con.selectCommand(selUser);
            ResultSet rsAd = con.selectCommand(seladmin);
            ResultSet rsAg = con.selectCommand(selagency);
            if(rsU.next())
            {   
                sts = rsU.getInt("user_status");
                if(sts == 0)
                {
                    %>
                    <script>
                        alert("Pending Verification");
                        window.location="Login.jsp";
                    </script>
                    <%
                }
                else if(sts == 1)
                {
                    %>
                    <script>
                        alert("Pending Verification");
                        window.location="Login.jsp";
                    </script>
                    <%
                }
                else if(sts  == 3)
                {
                    %>
                    <script>
                        alert("Registration Rejected")
                        window.location="Login.jsp";
                    </script>
                    <%
                }
                else 
                {
                    session.setAttribute("uid", rsU.getString("user_id"));
                    session.setAttribute("uname", rsU.getString("user_name"));
                    response.sendRedirect("../User/HomePage.jsp");
                }
                
            }
            else if(rsAd.next())
            {
                session.setAttribute("adid", rsAd.getString("admin_id"));
                session.setAttribute("adname", rsAd.getString("admin_name"));
                response.sendRedirect("../Admin/HomePage.jsp");
            }
            else if(rsAg.next())
            {
                session.setAttribute("agid", rsAg.getString("agency_id"));
                session.setAttribute("agname", rsAg.getString("agency_name"));
                response.sendRedirect("../Agency/HomePage.jsp");
            }
            else
            {
                %>
                    <script>
                        alert("Invalid Credentials");
                        window.location="Login.jsp";
                    </script>
                <%
            }            
              
        }
    
    %>
        <form method="POST">
            <label align="left" style="color: white; font-size: 58px; font-family: serif ">LOGIN</label><br>
            <input type="email" name="txtmail" placeholder="Enter the email address" required style="width: 300px; height: 40px "><br>
            <input type="password" name="password" placeholder="Enter password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" style="width: 300px; height: 40px "><br>
            <input type="submit" value="Login" name="btnsave" style="width: 100px; height: 40px; padding: 10px 20px;">  &nbsp;
            <input type="reset" value="Cancel" name="btncan" style="width: 100px; height: 40px; padding: 10px 20px;">  
        </form>
    </body>
    <%@include file="Foot.jsp" %>
</html>
