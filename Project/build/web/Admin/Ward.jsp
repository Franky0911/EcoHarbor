<%-- 
    Document   : Ward
    Created on : Oct 27, 2023, 7:30:03 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id = "con"></jsp:useBean>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import = "java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ward</title>
    </head>
    <body>
        <%
            if(request.getParameter("txtsave")!=null)
            {
                if(request.getParameter("txtid").equals(""))
                {
                    String iq = "insert into tbl_ward(location_id,ward_no)values('"+request.getParameter("ddlWard")+"','"+request.getParameter("txtwardno")+"')";
                    con.executeCommand(iq);
                }
                else 
                {
                    String uq = "update tbl_ward set location_id = '"+request.getParameter("ddlWard")+"',ward_no = '"+request.getParameter("txtwardno")+"'where ward_id = '"+request.getParameter("txtid")+"'";
                    con.executeCommand(uq);
                    response.sendRedirect("Ward.jsp");                    
                }   
            }
            if(request.getParameter("did")!=null)
            {
                String dq = "delete from tbl_ward where ward_id = '"+request.getParameter("did")+"'";
                con.executeCommand(dq);
                response.sendRedirect("Ward.jsp");
            }
            String editlid="";
            String editid="";
            String editwno="";
            if(request.getParameter("eid")!=null)
            {
                String sq2 = "select*from tbl_ward where ward_id ='"+request.getParameter("eid")+"'";
                ResultSet rs2 = con.selectCommand(sq2);
                rs2.next();
                editlid = rs2.getString("location_id");
                editid = rs2.getString("ward_id");
                editwno = rs2.getString("ward_no");
            }
            
        %>
        
        <form method="post">
            <table border="3" align="center">
                <tr>
                    <td>Location Name</td>
                    <td>
                        <select name="ddlWard">
                            <option>--select location--</option>
                    <%
                       String sq = "select*from tbl_location";
                       ResultSet rs = con.selectCommand(sq);
                       while(rs.next())
                       {
                    %>
                    <option value = "<%=rs.getString("location_id")%>" <% if(rs.getString("location_id").equals(editlid)) { out.print("selected"); } %>><%=rs.getString("location_name")%></option>
                    <%
                       }
                    %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Ward Number</td>
                    <td>
                        <input type="text" name="txtwardno" placeholder="Enter Ward No" value="<%=editwno%>">
                        <input type="hidden" name = "txtid" value="<%=editid%>">
                    </td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" name="txtsave" value="Save">
                        <input type="reset" name="txtcancel" value="Cancel">
                    </td>
                </tr>
            </table>
            <table border="3" align="center">
                <tr>
                    <th>SI.No</th>
                    <th>Location Name</th>
                    <th>Ward No</th>
                    <th>Actions</th>
                </tr>
                <%
                       String sq1 = "select * from tbl_ward w inner join tbl_location l on w.location_id = l.location_id";
                       ResultSet rs1 = con.selectCommand(sq1);
                       int i=0;
                       while(rs1.next())
                       {
                           i++;
                %>
                <tr>
                    <td><%=i%></td>
                    <td><%=rs1.getString("location_name")%></td>
                    <td><%=rs1.getString("ward_no")%></td>
                    <td><a href = "Ward.jsp?did=<%=rs1.getString("ward_id")%>">Delete</a>|<a href = "Ward.jsp?eid=<%=rs1.getString("ward_id")%>">Edit</a></td>
                </tr>   
                <%
                       }
                %>
            </table>    
        </form>
    </body>
</html>
