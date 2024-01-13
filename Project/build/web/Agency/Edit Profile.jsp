<%-- 
    Document   : Edit Profile
    Created on : Jan 5, 2024, 4:15:39 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page  import = "java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
    </head>
    <body>
        <%
            if(request.getParameter("txtupdate")!=null)
            {
                    String uq = "update tbl_agency set agency_name = '"+request.getParameter("txtname")+"',agency_contact = '"+request.getParameter("txtcontact")+"',agency_email = '"+request.getParameter("txtemail")+"',agency_address = '"+request.getParameter("txtaddress")+"'where agency_id = '"+session.getAttribute("agid")+"'";
                    con.executeCommand(uq);
                    response.sendRedirect("Edit Profile.jsp");    
            } 
            String editname="";
            String editcontact="";
            String editemail="";
            String editaddress="";
            String sq2 = "select*from tbl_agency where agency_id ='"+session.getAttribute("agid")+"'";
            ResultSet rs2 = con.selectCommand(sq2);
            rs2.next();
            editname = rs2.getString("agency_name");
            editcontact = rs2.getString("agency_contact");
            editemail = rs2.getString("agency_email");
            editaddress = rs2.getString("agency_address");
                        
        %>
        <form method="post">
            <table border="3" align="center">
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" value="<%=editname%>" name="txtname" placeholder="Enter name" title="Name Allows Only Alphabets,Spaces and First Letter Must Be Capital Letter" pattern="^[A-Z]+[a-zA-Z ]*$" required>
                    </td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td>
                        <input type="text" value="<%=editcontact%>" name="txtcontact" placeholder="Enter Contact No" title="Phone number with 7-9 and remaing 9 digit with 0-9" pattern="[7-9]{1}[0-9]{9}" required>
                    </td>
                </tr>    
                <tr>
                    <td>Email</td>
                    <td>
                        <input type="email" value="<%=editemail%>" name="txtemail" placeholder="Enter Email-Id" required>
                    </td>
                </tr>   
                <tr>
                    <td>Address</td>
                    <td>
                        <textarea name="txtaddress" placeholder="Enter Address" required><%=editaddress%></textarea>
                    </td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" name="txtupdate" value="Update">
                        <input type="reset" name="txtreset" value="Cancel">
                    </td>
                </tr>   
            </table>
        </form>   
    </body>
</html>
