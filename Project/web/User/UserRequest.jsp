<%-- 
    Document   : UserRequest
    Created on : Oct 27, 2023, 8:59:00 PM
    Author     : frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Request</title>
    </head>
    <body>
        <form method="post">
            <table border="3" align="center">
                <tr>
                    <td>Content</td>
                    <td>
                        <textarea placeholder="Enter User Request Content"></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" name="txtsave" value="Save">
                        <input type="reset" name="txtcancel" value="Cancel">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
