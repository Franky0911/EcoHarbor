<%-- 
    Document   : Largesmall
    Created on : Oct 26, 2023, 11:53:30 AM
    Author     : frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int n1=0,n2=0,n3=0,l=0,s=0;
            if(request.getParameter("r")!=null)
            {
                n1=Integer.parseInt(request.getParameter("num1"));
                n2=Integer.parseInt(request.getParameter("num2"));
                n3=Integer.parseInt(request.getParameter("num3"));
                if(n1>n2&&n1>n3)
                {
                    l=n1;
                }
                else if(n2>n1&&n2>n3)
                {
                    l=n2;
                }    
                else
                {
                    l=n3;
                }
                if(n1<n2&&n1<n3)
                {
                    s=n1;
                }
                else if(n2<n1&&n2<n3)
                {
                    s=n2;
                }    
                else
                {
                    s=n3;
                }
            }
        %>
          <form method ="post">
            <table border = "3">
                <tr>
                    <td>
                        Enter Number 1
                    </td>
                    <td>
                        <input type = "text" name="num1" value="<%=n1%>">
                    </td>
                </tr>
                <tr>
                    <td>
                        Enter Number 2
                    </td>
                    <td>
                        <input type="text" name="num2" value="<%=n2%>">
                    </td>
                </tr>
                <tr>
                    <td>
                        Enter Number 3
                    </td>
                    <td>
                        <input type="text" name="num3" value="<%=n3%>">
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="r" value="Result">
                    </td>
                </tr>
                <tr>
                    <td>Largest</td>
                    <td><%=l%></td>
                </tr>
                <tr>
                    <td>Smallest</td>
                    <td><%=s%></td>
                </tr>
            </table>
        </form>
    </body>
</html>
