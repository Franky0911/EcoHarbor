<%-- 
    Document   : Login
    Created on : Jan 5, 2024, 4:00:55 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
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
    <body>
        <form method="post">
            <table border="3" align="center">
                <tr>
                    <td>Email</td>
                    <td><input type="email" name="txt_email" placeholder="Enter email_id" required></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="txt_password" placeholder="Enter Password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required></td>
                </tr>    
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" name="btn_login" value="Login">
                        <input type="reset" name="txtcancel" value="Cancel">
                    </td>
                </tr>   
            </table>
        </form>    
    </body>
</html>
