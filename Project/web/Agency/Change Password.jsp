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
        
       String currentpsswd=request.getParameter("txtpsswd");
       String newpsswd = request.getParameter("txtnpsswd");
       String repsswd = request.getParameter("txtrpsswd");
       String pass ="";
       String sq = "select*from tbl_agency where agency_id ='"+session.getAttribute("agid")+"'";
       ResultSet rs = con.selectCommand(sq);
       rs.next();
       pass = rs.getString("agency_password");
       if(request.getParameter("txtupdate")!=null)
       {      
        if(pass.equals(currentpsswd))
        {
            if(newpsswd.equals(repsswd))
            {
                String uq = "update tbl_agency set agency_password = '"+request.getParameter("txtnpsswd")+"'where agency_id = '"+session.getAttribute("agid")+"'";
                con.executeCommand(uq);
    %>
                <script>
                        alert("Password Changed");
                        window.location="../Guest/Login.jsp";
                </script>
    <%
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
            </script>
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
