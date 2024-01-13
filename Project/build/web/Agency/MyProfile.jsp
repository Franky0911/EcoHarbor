<%-- 
    Document   : MyPofile
    Created on : Jan 5, 2024, 4:35:24 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Profile</title>
    </head>
    <body>
        <%
          String sel1 = "select*from tbl_agency where agency_id='"+session.getAttribute("agid")+"'";  
          ResultSet rsag = con.selectCommand(sel1);
          if(rsag.next())
          {
        %>
        <form method="post">
            <table border="1" align="center">
                <tr>
                    <td colspan="2" align="right"><img src="../Assets/Files/AgencyLogo/<%=rsag.getString("agency_logo")%>" height="120" width="120"></td>
                </tr>
                <tr>
                    <td>Proof</td>
                    <td><a href="../Assets/Files/AgencyProof/<%=rsag.getString("agency_proof")%>"download>Download</a></td>
                </tr>                
                <tr>
                    <td>Name</td>
                    <td><%=rsag.getString("agency_name")%></td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td><%=rsag.getString("agency_contact")%></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><%=rsag.getString("agency_email")%></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><%=rsag.getString("agency_address")%></td>
                </tr>
        <%
          }
        %>        
            </table>
        </form>
    </body>
</html>
