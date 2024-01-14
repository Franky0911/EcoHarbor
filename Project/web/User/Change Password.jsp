<%-- 
    Document   : Change Password
    Created on : Jan 5, 2024, 4:24:54 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page  import = "java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password</title>
    </head>
    <%  
       if(request.getParameter("txtupdate")!=null)
       {      
        String sq = "select*from tbl_user where user_id ='"+session.getAttribute("uid")+"'";
        ResultSet rs = con.selectCommand(sq);
        rs.next();
        if(request.getParameter("txtpsswd")==rs.getString("user_password"))
        {
            if(request.getParameter("txtnpsswd")==request.getParameter("txtrpsswd"))
            {
                String uq = "update tbl_user set user_password = '"+request.getParameter("txtnpasswd")+"'where user_id = '"+session.getAttribute("uid")+"'";
                con.executeCommand(uq);
            }
            else
            {
                %>
                    <script>
                        alert("New password Mismatched");
                        window.location="Change Password.jsp";
                    </script>
                <%
            }
        }
        else
        {
            %>
            <script>
                alert("Current Password Mismatched");
                window.location="Change Password.jsp";
            </script>>
            <%
        }
       }
    %>
    <body>
        <form method="post">    
    <table border="3" align="center">   
    <tr>
        <td>Current Password</td>
        <td><input type="password" name="txtpsswd" placeholder="Enter Current Password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required></td>
    </tr>
    <tr>
        <td>New Password</td>
        <td><input type="password" name="txtnpsswd" placeholder="Enter New Password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required></td>
    </tr>
    <tr>
        <td>Re-Password</td>
        <td><input type="password" name="txtrpsswd" placeholder="ReEnter Password" required></td>
    </tr>
    <tr>
        <td align="center" colspan="2">
         <input type="submit" name="txtupdate" value="Update">
        </td>
    </tr>
    </table>
        </form>
    </body>
</html>
