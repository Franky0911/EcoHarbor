<%-- 
    Document   : AjaxWard.jsp
    Created on : Dec 7, 2023, 10:52:21 AM
    Author     : frank
--%>
<!--This Ajax File is used to pass ward no of the  corresponding location name -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>
<%
    String selq="select *from tbl_ward where location_id = '"+request.getParameter("wid")+"'"; /*According to the location id the ward id is fetched*/
    ResultSet rs = con.selectCommand(selq);
    while(rs.next())
    {
        %>
        <option value = "<%=rs.getString("ward_id")%>"><%=rs.getString("ward_no")%></option> <!--According to the ward id the ward no is provided into the Ward Drop Down List-->
        <%
    }
%>

