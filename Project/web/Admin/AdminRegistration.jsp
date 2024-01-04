<%-- 
    Document   : admin
    Created on : Oct 27, 2023, 7:13:08 PM
    Author     : frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Registration</title>
    </head>
    <body>
        <form method="post">
            <table border="3" align="center">
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="txtaname" placeholder="Enter Name">
                    </td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>
                        <input type="email" name="txtaemail" placeholder="Enter Email-Id">
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input type="password" name="txtapsswd" placeholder="Enter Password">
                    </td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td>
                        <input type="password" name="txtapsswd" placeholder="ReEnter Password">
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
