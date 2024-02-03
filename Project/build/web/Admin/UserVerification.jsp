<%-- 
    Document   : UserVerification
    Created on : Jan 11, 2024, 2:07:49 PM
    Author     : frank
--%>

<jsp:useBean class="DB.ConnectionClass" id = "con"></jsp:useBean>
<%@page  import = "java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EcoHarbor:User Verification</title>
    </head>
    <body>
        <%
          if(request.getParameter("aid")!=null)
          {
              String uq = "update tbl_user set user_status ='2' where user_id = '"+request.getParameter("aid")+"'";
              con.executeCommand(uq);
          }
          if(request.getParameter("rid")!=null)
          {
              String uq1 = "update tbl_user set user_status = '3' where user_id = '"+request.getParameter("rid")+"'";
              con.executeCommand(uq1);
          }
        %>
        <table border="1" align="center">
            <tr>
                <th>SI.No</th>
                <th>Name</th>
                <th>Contact</th>
                <th>Photo</th>
                <th>Adhar Proof</th>
                <th>Property No</th>
                <th>Action</th>
                <th>Status</th>
            </tr>
            <%
                       String sq = "select * from tbl_user";
                       ResultSet rs = con.selectCommand(sq);
                       int i=0;
                       while(rs.next())
                       {
                           i++;
                %>
                <tr>
                    <td><%=i%></td>
                    <td><%=rs.getString("user_name")%></td>
                    <td><%=rs.getString("user_contact")%></td>
                    <td><%=rs.getString("user_photo")%></td>
                    <td><%=rs.getString("user_proof")%></td>
                    <td><%=rs.getString("user_propno")%></td>
                    <td><a href = "UserVerification.jsp?aid=<%=rs.getString("user_id")%>">Accept</a>|<a href = "UserVerification.jsp?rid=<%=rs.getString("user_id")%>">Reject</a></td>
                    <td><%
                    if(rs.getString("user_status").equals("0"))
                    {
                        out.println("User Profile is not listed");
                    }
                    if(rs.getString("user_status").equals("1"))
                    {
                        out.println("User Profile is Listed");
                    }
                    if(rs.getString("user_status").equals("2"))
                    {
                        out.println("User Profile is Accepted");
                    }
                    if(rs.getString("user_status").equals("3"))
                    {
                        out.println("User Profile is Rejected");
                    }
                    %></td>
                </tr>   
                <%
                       }
                %>
        </table>
    </body>
</html>
