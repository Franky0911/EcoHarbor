<%-- 
    Document   : Wastetype
    Created on : Oct 26, 2023, 12:39:52 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Wastetype</title>
    </head>
    <body>
       <%
           if(request.getParameter("txtsave")!=null)
           {
               if(request.getParameter("txtid").equals(""))
               {
               String insqry="insert into tbl_wastetype(wastetype_name,wastetype_rate)values('"+request.getParameter("txtwastetype")+"','"+request.getParameter("txtrate")+"')";
               con.executeCommand(insqry);
               }
               else
               {
                   String uq = "update tbl_wastetype set wastetype_name='"+request.getParameter("txtwastetype")+"',wastetype_rate='"+request.getParameter("txtrate")+"'where wastetype_id = '"+request.getParameter("txtid")+"'";
                   con.executeCommand(uq);
                   response.sendRedirect("WasteType.jsp");
               }
           }
           if(request.getParameter("did")!=null)
           {
               String dq="delete from tbl_wastetype where wastetype_id ='"+request.getParameter("did")+"'";
               con.executeCommand(dq);
               response.sendRedirect("WasteType.jsp");
           }
           String editid="";
           String editname="";
           String editrate="";
           if(request.getParameter("eid")!=null)
           {
               String sq1="select*from tbl_wastetype where wastetype_id='"+request.getParameter("eid")+"'";
               ResultSet rs1=con.selectCommand(sq1);
               rs1.next();
               editid=rs1.getString("wastetype_id");
               editname=rs1.getString("wastetype_name");
               editrate=rs1.getString("wastetype_rate");
           }
       %>
        <form method="post">
            <table border="3"align="center">
                <tr>
                    <td>WasteType Name</td>
                    <td>
                        <input type="text" name="txtwastetype" placeholder="Enter Waste Type" value="<%=editname%>" required>
                        <input type="hidden" name="txtid" value="<%=editid%>">
                    </td>
                </tr>
                <tr>
                    <td>Rate</td>
                    <td>
                        <input type="text" name="txtrate" placeholder="Enter Rate" value="<%=editrate%>" required>
                        <input type="hidden" name="txtid" value="<%=editid%>">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="txtsave" value="Save">
                        <input type="reset"  name="txtcancel" value="cancel">
                    </td>
                </tr>
            </table>
            <table border="3" align="center">
                <tr>
                    <th>SI.No</th>
                    <th>WasteType</th>
                    <th>Rate</th>
                    <th>Action</th>
                </tr>
                <%
           String sq="select*from tbl_wastetype";
           ResultSet rs=con.selectCommand(sq);
           int i=0;
           while(rs.next())
           {
               i++;
               %>
               <tr>
                   <td><%=i%></td>
                   <td><%=rs.getString("wastetype_name")%></td>
                   <td><%=rs.getString("wastetype_rate")%></td>
                   <td><a href="WasteType.jsp?did=<%=rs.getString("wastetype_id")%>">Delete</a>|<a href="WasteType.jsp?eid=<%=rs.getString("wastetype_id")%>">Edit</a></td>
               </tr>
               <%
           }    
                %>
            </table>
        </form>
    </body>
</html>
