<%-- 
    Document   : ne
    Created on : Jan 23, 2024, 10:35:13 AM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page  import = "java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserRequest</title>
</head>
<body>
<h4>Select the waste type</h4>
<form>
<select name="ddlwst" multiple>    
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
<p><input type="submit" value="submit"></p>
</form>

<% 
String clrs[] = request.getParameterValues("ddlwst");
if(clrs != null)
{
%>
<p><b>You have selected the following wastetypes</b></p>
<ul>
<%
for(int i=0; i<clrs.length; i++)
{
%>
<li><%=clrs[i]%></li>
<%
}
%>
</ul>
<%
}
%>
</body>
</html>