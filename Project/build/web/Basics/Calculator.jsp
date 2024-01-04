<%-- 
    Document   : Calculator
    Created on : Oct 26, 2023, 10:59:18 AM
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
            int num1=0,num2=0,result=0;
            if(request.getParameter("sum")!=null)
            {
                num1=Integer.parseInt(request.getParameter("num1"));
                num2=Integer.parseInt(request.getParameter("num2"));
                result=num1+num2;
            }
            if(request.getParameter("subtract")!=null)
            {
                num1=Integer.parseInt(request.getParameter("num1"));
                num2=Integer.parseInt(request.getParameter("num2"));
                result=num1-num2;
            }
            if(request.getParameter("multiply")!=null)
            {
                num1=Integer.parseInt(request.getParameter("num1"));
                num2=Integer.parseInt(request.getParameter("num2"));
                result=num1*num2;
            }           
            if(request.getParameter("divide")!=null)
            {
                num1=Integer.parseInt(request.getParameter("num1"));
                num2=Integer.parseInt(request.getParameter("num2"));
                result=num1/num2;
            }
        %>
        <form method = post>
            <table border = "4">
                <tr>
                    <td>Enter Number 1</td>
                    <td>
                        <input  type = "text" name = "num1" placeholder="Enter a number" value = "<%=num1%>">
                    </td>
                </tr>
                <tr>
                    <td>Enter Number 2</td>
                    <td>
                        <input type = "text" name = "num2" placeholder="Enter a number" value = "<%=num2%>">
                    </td>
                </tr>
                <tr>
                    <td colspan = "2" align = "center">
                        <input type = "submit" name = "sum" value = "+">
                        <input type = "submit" name = "subtsract" value = "-">
                        <input type = "submit" name = "multiply" value = "*">
                        <input type = "submit" name = "divide" value = "/">
                    </td>
                </tr>
                <tr>
                    <td>Result</td>
                    <td><%=result%></td>
                </tr>
            </table>
        </form>    
    </body>
</html>
