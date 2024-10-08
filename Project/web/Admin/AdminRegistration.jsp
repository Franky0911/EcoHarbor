<%-- 
    Document   : admin
    Created on : Oct 27, 2023, 7:13:08 PM
    Author     : frank
--%>
<jsp:useBean class="DB.ConnectionClass" id="con"></jsp:useBean>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
  <!-- Favicons -->
  <link href="../Assets/Templates/Main/img/favicon.jpg" rel="icon">
  <link href="../Assets/Templates/Main/img/apple-touch-icon.jpg" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700" rel="stylesheet">

  <!-- Bootstrap CSS File -->
  <link href="../Assets/Templates/Main/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Libraries CSS Files -->
  <link href="../Assets/Templates/Main/lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
  <link href="../Assets/Templates/Main/lib/animate/animate.min.css" rel="stylesheet">
  <link href="../Assets/Templates/Main/lib/ionicons/css/ionicons.min.css" rel="stylesheet">
  <link href="../Assets/Templates/Main/lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="../Assets/Templates/Main/lib/lightbox/css/lightbox.min.css" rel="stylesheet">

  <!-- Main Stylesheet File -->
  <link href="../Assets/Templates/Main/css/style.css" rel="stylesheet">

  <link href="../Assets/Templates/Form.css" rel="stylesheet">
    <link rel="stylesheet" href="../Assets/CSS/shopreg.css">
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Admin Registration</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url('../Assets/Templates/Main/img/facts-bg.jpg') no-repeat center center/cover;
        }
        .choose-file-button, .formbold-btn {
            background-color: #4CAF50;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 4px;
            transition: background-color 0.3s ease;
        }
        .choose-file-button:hover, .formbold-btn:hover {
            background-color: #45a049;
        }
        .button-container {
            text-align: center;
            margin-top: 20px;
        }
        .formbold-form-wrapper {
    max-width: 600px;
    margin: auto;
    padding: 20px;
    border-radius: 5px;
    background-color: rgba(249, 249, 249, 0.1);
    margin-top: 100px;
    margin-bottom: 100px;
        }
        .gender-radio {
            display: inline-block;
            margin-right: 10px;
        }
        .gender-radio input[type="radio"] {
            display: none;
        }
        .gender-radio input[type="radio"] + label {
            background-color: #e7e7e7;
            color: black;
            padding: 5px 10px;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        .gender-radio input[type="radio"]:checked + label {
            background-color: #4CAF50;
            color: white;
        }
        .formbold-checkbox-wrapper input[type="checkbox"]:checked + .formbold-checkbox-inner {
            background-color: #4CAF50;
            border-color: #4CAF50;
        }
        .formbold-form-title h2 {
            font-weight: 400;
            font-size: 33px;
            line-height: 34px;
            color: #fff;
        }    
        .formbold-form-label {
            color: white;
            font-size: 16px;
            line-height: 24px;
            display: block;
            margin-bottom: 10px;
        }
        .formbold-form-input, select, textarea {
            background: transparent;
            color: white;
            border: 1px solid white;
            border-radius: 4px;
            padding: 10px;
            width: 100%;
            box-sizing: border-box;
            margin-bottom: 15px;
        }
        .formbold-form-input::placeholder, select option, textarea::placeholder {
            color: white;
        }
        span{
            color:white;
        }
    </style>
  </head>
    <body>
  <header id="header" >
    <div class="container-fluid">

      <div id="logo" class="pull-left">
        <h1><a href="../index.html" class="scrollto">EcoHarbor</a></h1>
        <!-- Uncomment below if you prefer to use an image logo -->
        <!-- <a href="#intro"><img src="img/logo.png" alt="" title="" /></a>-->
      </div>

      <nav id="nav-menu-container">
        <ul class="nav-menu">
            <li class="menu-active"><a href="../index.html">Home</a></li>
            <li><a href="../Guest/Login1.jsp">Login</a></li>
          <li><a href="#contacts">Contact</a></li>
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
  </header><!-- #header -->          
        <%
            if(request.getParameter("txtsave")!=null)
            {
                if(request.getParameter("txtpsswd").equals(request.getParameter("txtcpsswd")))
                {
                 String insqry="insert into tbl_admin(admin_name,admin_email,admin_password)values('"+request.getParameter("txtaname")+"','"+request.getParameter("txtaemail")+"','"+request.getParameter("txtpsswd")+"')";
                 con.executeCommand(insqry);    
        %>
                <script type="text/javascript" >
                    alert("Upload Successfully..");
                    setTimeout(function() {
                    window.location.href = '../Guest/Login1.jsp'
                    }, 100);
                </script>
        <%
                }
                else
                {
                    %>
                    <script type="text/javascript" >
                        alert("Password Mismatched..");
                        setTimeout(function() {
                        window.location.href = 'AdminRegistration.jsp'
                        }, 100);
                    </script>
                    <%
                }    
            }
        %>
    <div class="formbold-main-wrapper">
      <div class="formbold-form-wrapper">
        <form method="POST" enctype="multipart/form-data" action="../Assets/ActionPages/AgencyUploadAction.jsp">    
          <div class="formbold-form-title">
            <h2 align="center">ADMIN REGISTRATION</h2>
          </div>  
          <div class="formbold-mb-3">
            <label class="formbold-form-label">Full Name</label>
            <input type="text" class="formbold-form-input" name="txtaname" placeholder="Enter full name" title="Name Allows Only Alphabets,Spaces and First Letter Must Be Capital Letter" pattern="^[A-Z]+[a-zA-Z ]*$" required />
          </div>
          <div class="formbold-mb-3">
            <label class="formbold-form-label">Email Address</label>
            <input type="text" class="formbold-form-input" name="txtaemail" placeholder="Enter email address" required />
          </div>
          <div class="formbold-mb-3">
            <input type="password" placeholder="Password" class="formbold-form-input" name="txtpsswd" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" required/>
          </div> 
          <div class="formbold-mb-3">
            <input type="password" class="formbold-form-input" placeholder="Confirm Password" name="txtcpsswd" required/>
          </div>   
          <div class="formbold-checkbox-wrapper">
            <label for="supportCheckbox" class="formbold-checkbox-label">
              <div class="formbold-relative">
                <input type="checkbox" id="supportCheckbox" class="formbold-input-checkbox" required>
                <div class="formbold-checkbox-inner">
                  <span class="formbold-opacity-0">
                    <svg width="11" height="8" viewBox="0 0 11 8" fill="none" class="formbold-stroke-current">
                      <path d="M10.0915 0.951972L10.0867 0.946075L10.0813 0.940568C9.90076 0.753564 9.61034 0.753146 9.42927 0.939309L4.16201 6.22962L1.58507 3.63469C1.40401 3.44841 1.11351 3.44879 0.932892 3.63584C0.755703 3.81933 0.755703 4.10875 0.932892 4.29224L0.932878 4.29225L0.934851 4.29424L3.58046 6.95832C3.73676 7.11955 3.94983 7.2 4.1473 7.2C4.36196 7.2 4.55963 7.11773 4.71406 6.9584L10.0468 1.60234C10.2436 1.4199 10.2421 1.1339 10.0915 0.951972ZM4.2327 6.30081L4.2317 6.2998C4.23206 6.30015 4.23237 6.30049 4.23269 6.30082L4.2327 6.30081Z" stroke-width="0.4"></path>
                    </svg>
                  </span>
                </div>
              </div>
              <span>I agree to the defined</span> <a href="#"> terms, conditions, and policies</a>
            </label>
          </div>   
          <div class="button-container">   
            <input type="submit" class="formbold-btn" name="txtsave" value="Register">
            <input type="reset" class="formbold-btn" name="txtreset" value="Reset"> 
          </div>
        </form>
      </div>
    </div>        
      <%@include file="../Guest/Foot.jsp" %>
    </body>
</html>
