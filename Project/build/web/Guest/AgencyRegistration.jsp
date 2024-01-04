<%-- 
    Document   : AgencyRegistration
    Created on : Oct 27, 2023, 7:41:34 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page import="java.sql.ResultSet" %>    
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agency Registration</title>
    </head>
    <body>
        <form method="post">
            <table border="3" align="center">
                <tr>
                    <td>Name</td>
                    <td>
                        <input type="text" name="txtagname" placeholder="Enter Agency Name">
                    </td>
                </tr>
                <tr>
                    <td>Logo</td>
                    <td align="center">
                        <input type="file" name="txtlfile">
                    </td>
                </tr>
                <tr>
                    <td>Contact</td>
                    <td>
                        <input type="text" name="txtcontact" placeholder="Enter Contact No">
                    </td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>
                        <input type="email" name="txtemail" placeholder="Enter Email-Id">
                    </td>
                </tr>
                <tr>
                    <td>Proof</td>
                    <td align="center">
                        <input type="file" name="txtpfile">
                    </td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>
                        <textarea placeholder="Enter Address"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input type="password" name="txtpsswd" placeholder="Enter Password">
                    </td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td>
                        <input type="password" name="txtpsswd" placeholder="ReEnter Password">
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
