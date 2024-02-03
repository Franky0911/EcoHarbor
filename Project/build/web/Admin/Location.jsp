<%-- 
    Document   : Location
    Created on : Oct 26, 2023, 12:34:48 PM
    Author     : frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
    <jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Location</title>
    </head>
    <body>
        <%
            if(request.getParameter("txtsave")!=null)
            {
                if(request.getParameter("txtid")==null)
                {
                String insqry="insert into tbl_location(location_name)values('"+request.getParameter("txtloc")+"')";
                con.executeCommand(insqry);
                }
                else
                {
                    String uq="update tbl_location set location_name='"+request.getParameter("txtloc")+"'where location_id='"+request.getParameter("txtid")+"'";
                    con.executeCommand(uq);
                    response.sendRedirect("Location.jsp");
                }
            }
            if(request.getParameter("did")!=null)
            {
                String del="delete from tbl_location where location_id='"+request.getParameter("did")+"'";
                con.executeCommand(del);
                response.sendRedirect("Location.jsp");
            }
            String editid = "";
            String editname = "";
            if(request.getParameter("eid")!=null)
            {
                String sq1 = "select * from tbl_location where location_id='"+request.getParameter("eid")+"'";
                ResultSet rs1=con.selectCommand(sq1);
                rs1.next();
                editid = rs1.getString("location_id");
                editname = rs1.getString("location_name");
            }
        %>
        <form method="post">
            <table border="3" align="center">
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="txtloc" placeholder="Enter Location Name" value="<%=editname%>" title="Name Allows Only Alphabets,Spaces and First Letter Must Be Capital Letter" pattern="^[A-Z]+[a-zA-Z ]*$" required>
                        <input type="hidden" name="txtid" value="<%=editid%>">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="txtsave" value="Save">
                        <input type="reset" name="txtcancel" value="Cancel">
                    </td>
                </tr>
            </table>
            <table border="3" align="center">
                <tr>
                    <th>SI.No</th>
                    <th>Location</th>
                    <th>Action</th>
                </tr>
            <%
            String sq="select * from tbl_location";
            ResultSet rs=con.selectCommand(sq);
            int i=0;
            while(rs.next())
            {
                i++;
                %>
                <tr>
                    <td><%=i%></td>
                    <td><%=rs.getString("location_name")%></td>
                    <td><a href="Location.jsp?did=<%=rs.getString("location_id")%>">Delete</a>|<a href="Location.jsp?eid=<%=rs.getString("location_id")%>">Edit</a></td>
                </tr>
                <%
            }
                %>
            </table>
        </form>
    </body>
</html>
