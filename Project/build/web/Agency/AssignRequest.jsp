<%-- 
    Document   : AssignRequest
    Created on : Oct 27, 2023, 9:26:53 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Assign Request</title>
    </head>
    <body>
        <form method="post">
            <table border="3" align="center">
                <tr>
                    <td>WasteType</td>
                    <td>
                        <select name="ddlWaste">
                            <option>--select Waste Type--</option>
                            <%
                                String sq = "select * from tbl_wastetype";
                                ResultSet rs = con.selectCommand(sq);
                                while(rs.next())
                                {
                            %>
                                <option value="<%=rs.getString("wastetype_id")%>"><%=rs.getString("wastetype_name")%></option>
                            <%
                                }
                            %>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Quantity</td>
                    <td>
                        <input type="text" name="txtqnty" placeholder="Enter Quantity">
                    </td>
                </tr>
                <tr>
                    <td align="center" colspan="2">
                        <input type="submit" name="txtsave" value="Save">
                        <input type="reset" name="txtcancel" value="Cancel">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
