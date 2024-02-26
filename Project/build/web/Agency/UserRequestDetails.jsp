<%-- 
    Document   : UserRequestDetails
    Created on : Feb 22, 2024, 2:19:33 PM
    Author     : frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page  import = "java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Request Details</title>
    </head>    
        <body>
        <table border="1" align="center">         
            <tr>
                <th>SI.No</th>
                <th>User Name</th>
                <th>Contact</th>
                <th>Address</th>
                <th>Request Id</th>
                <th>Request Date</th>
                <th>Property Number</th>
                <th>Requested WasteTypes</th>
                <th>Action</th>
            </tr>
            <tr>
    <%
                       String sq = "select*from tbl_request r inner join tbl_user u on r.user_id = u.user_id";
                       ResultSet rs = con.selectCommand(sq);
                       int i=0;
                       while(rs.next())
                       {
                           i++;
    %>       
                    <td><%=i%></td>
                    <td><%=rs.getString("user_name")%></td>
                    <td><%=rs.getString("user_contact")%></td>
                    <td><%=rs.getString("user_address")%></td>
                    <td><%=rs.getString("request_id")%></td>
                    <td><%=rs.getString("request_date")%></td>
                    <td><%=rs.getString("user_propno")%></td>
                    <td>
                    <%
                        String sq1 = "select*from tbl_requesttype l inner join tbl_wastetype t on l.wastetype_id = t.wastetype_id where request_id ='" + rs.getString("request_id") + "'";
                        ResultSet rs2 = con.selectCommand(sq1);
                        StringBuilder wn = new StringBuilder();
                        while(rs2.next())
                        {
                            if(wn.length() > 0)
                            {
                                wn.append(", ");
                                
                            }
                            wn.append(rs2.getString("wastetype_name"));
                        }    
                    %>
                    <%=wn%>
                    </td>
                    <td><a href="Collection.jsp?cid=<%=rs.getString("request_id")%>">Collect</a></td>
                   </tr>
    <%
                        }    
    %>                   
            
        </table>
        </body>
</html>
