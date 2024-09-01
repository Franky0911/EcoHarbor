package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class UserRegistration1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Guest/Head.jsp");
    _jspx_dependants.add("/Guest/Foot.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <title>EcoHarbor</title>\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"../Assets/Templates/Main/img/favicon.jpg\" rel=\"icon\">\n");
      out.write("  <link href=\"../Assets/Templates/Main/img/apple-touch-icon.jpg\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Bootstrap CSS File -->\n");
      out.write("  <link href=\"../Assets/Templates/Main/lib/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Libraries CSS Files -->\n");
      out.write("  <link href=\"../Assets/Templates/Main/lib/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"../Assets/Templates/Main/lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"../Assets/Templates/Main/lib/ionicons/css/ionicons.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"../Assets/Templates/Main/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"../Assets/Templates/Main/lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Main Stylesheet File -->\n");
      out.write("  <link href=\"../Assets/Templates/Main/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <link href=\"../Assets/Templates/Form.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- =======================================================\n");
      out.write("    Theme Name: BizPage\n");
      out.write("    Theme URL: https://bootstrapmade.com/bizpage-bootstrap-business-template/\n");
      out.write("    Author: BootstrapMade.com\n");
      out.write("    License: https://bootstrapmade.com/license/\n");
      out.write("  ======================================================= -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!--==========================\n");
      out.write("    Header\n");
      out.write("  ============================-->\n");
      out.write("  <header id=\"header\" >\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("      <div id=\"logo\" class=\"pull-left\">\n");
      out.write("        <h1><a href=\"../index.html\" class=\"scrollto\">EcoHarbor</a></h1>\n");
      out.write("        <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("        <!-- <a href=\"#intro\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>-->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <nav id=\"nav-menu-container\">\n");
      out.write("        <ul class=\"nav-menu\">\n");
      out.write("            <li class=\"menu-active\"><a href=\"../index.html\">Home</a></li>\n");
      out.write("            <li><a href=\"Login1.jsp\">Login</a></li>\n");
      out.write("          <li><a href=\"../index.html#about\">About Us</a></li>\n");
      out.write("          <li><a href=\"../index.html#services\">Services</a></li>\n");
      out.write("          <li><a href=\"#contacts\">Contact</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav><!-- #nav-menu-container -->\n");
      out.write("    </div>\n");
      out.write("  </header><!-- #header -->\n");
      out.write("\n");
      out.write("  <!--<div id=\"tab\" align=\"center\">-->\n");
      out.write("      <!--==========================\n");
      out.write("    Intro Section\n");
      out.write("  ============================-->");
      out.write("  \n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/CSS/shopreg.css\">\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("        <title> User Registration Form</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url('../Assets/Templates/Main/img/facts-bg.jpg') no-repeat center center/cover;\n");
      out.write("            }\n");
      out.write("            .choose-file-button, .formbold-btn {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("            .choose-file-button:hover, .formbold-btn:hover {\n");
      out.write("                background-color: #45a049;\n");
      out.write("            }\n");
      out.write("            .button-container {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .formbold-form-wrapper {\n");
      out.write("                max-width: 600px;\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background-color: rgba(249, 249, 249, 0.1);\n");
      out.write("                margin-top: 100px;\n");
      out.write("            }\n");
      out.write("            .gender-radio {\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .gender-radio input[type=\"radio\"] {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            .gender-radio input[type=\"radio\"] + label {\n");
      out.write("                background-color: #e7e7e7;\n");
      out.write("                color: black;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("            .gender-radio input[type=\"radio\"]:checked + label {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .formbold-checkbox-wrapper input[type=\"checkbox\"]:checked + .formbold-checkbox-inner {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                border-color: #4CAF50;\n");
      out.write("            }\n");
      out.write("            .formbold-form-title h2 {\n");
      out.write("                font-weight: 400;\n");
      out.write("                font-size: 33px;\n");
      out.write("                line-height: 34px;\n");
      out.write("                color: #fff;\n");
      out.write("            }    \n");
      out.write("            .formbold-form-label {\n");
      out.write("                color: white;\n");
      out.write("                font-size: 16px;\n");
      out.write("                line-height: 24px;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .formbold-form-input, select, textarea {\n");
      out.write("                background: transparent;\n");
      out.write("                color: white;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                padding: 10px;\n");
      out.write("                width: 100%;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("            }\n");
      out.write("            .formbold-form-input::placeholder, select option, textarea::placeholder {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            span{\n");
      out.write("                color:white;\n");
      out.write("            }\n");
      out.write("            .modal {\n");
      out.write("                display: none;\n");
      out.write("                position: fixed;\n");
      out.write("                z-index: 1;\n");
      out.write("                left: 0;\n");
      out.write("                top: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                overflow: auto;\n");
      out.write("                background-color: rgb(0,0,0);\n");
      out.write("                background-color: rgba(0,0,0,0.4);\n");
      out.write("            }\n");
      out.write("            .modal-content {\n");
      out.write("                background-color: #fefefe;\n");
      out.write("                margin: 15% auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                border: 1px solid #888;\n");
      out.write("                width: 80%;\n");
      out.write("                max-width: 500px;\n");
      out.write("            }\n");
      out.write("            .close {\n");
      out.write("                color: #aaa;\n");
      out.write("                float: right;\n");
      out.write("                font-size: 28px;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("            .close:hover,\n");
      out.write("            .close:focus {\n");
      out.write("                color: black;\n");
      out.write("                text-decoration: none;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            .modal-btn {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                border: none;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("            .modal-btn:hover {\n");
      out.write("                background-color: #45a049;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"formbold-main-wrapper\">\n");
      out.write("            <div class=\"formbold-form-wrapper\">\n");
      out.write("                <form method=\"POST\" enctype=\"multipart/form-data\" action=\"../Assets/ActionPages/UserUploadAction.jsp\">    \n");
      out.write("                    <div class=\"formbold-form-title\">\n");
      out.write("                        <h2 align=\"center\">USER REGISTRATION</h2>\n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <label class=\"formbold-form-label\">Full Name</label>\n");
      out.write("                        <input type=\"text\" class=\"formbold-form-input\" name=\"txtname\" placeholder=\"Enter full name\" title=\"Name Allows Only Alphabets,Spaces and First Letter Must Be Capital Letter\" pattern=\"^[A-Z]+[a-zA-Z ]*$\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <label class=\"formbold-form-label\">Phone Number</label>\n");
      out.write("                        <input type=\"text\" class=\"formbold-form-input\" placeholder=\"Enter phone number\" name=\"txtcontact\" pattern=\"[7-9}{1}[0-9]{9}\" title=\"Phone number with 7-9 and remaining 9 digits with 0-9\"  required />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <label class=\"formbold-form-label\">Email Address</label>\n");
      out.write("                        <input type=\"text\" class=\"formbold-form-input\" name=\"txtemail\" placeholder=\"Enter email address\" required />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <label class=\"formbold-form-label\">Gender</label>\n");
      out.write("                        <div class=\"gender-radio\">\n");
      out.write("                            <input type=\"radio\" id=\"male\" name=\"gender\" value=\"Male\" />\n");
      out.write("                            <label for=\"male\">Male</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"gender-radio\">\n");
      out.write("                            <input type=\"radio\" id=\"female\" name=\"gender\" value=\"Female\" />\n");
      out.write("                            <label for=\"female\">Female</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"gender-radio\">\n");
      out.write("                            <input type=\"radio\" id=\"others\" name=\"gender\" value=\"Others\" />\n");
      out.write("                            <label for=\"others\">Others</label>\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"column\">\n");
      out.write("                        <div class=\"formbold-mb-3\">\n");
      out.write("                            <label for=\"file1\" class=\"formbold-form-label\">Profile Photo</label>\n");
      out.write("                            <input type=\"file\" id=\"file1\" name=\"file_photo\" style=\"display: none;\" required onchange=\"displayFileName('file1', 'file1-label')\">\n");
      out.write("                            <button type=\"button\" class=\"choose-file-button\" required onclick=\"document.getElementById('file1').click()\">Choose File</button>\n");
      out.write("                            <span id=\"file1-label\">No file chosen</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"formbold-mb-3\">\n");
      out.write("                            <label for=\"file2\" class=\"formbold-form-label\">Aadhaar Proof</label>\n");
      out.write("                            <input type=\"file\" id=\"file2\" name=\"file_proof\" style=\"display: none;\" required onchange=\"displayFileName('file2', 'file2-label')\">\n");
      out.write("                            <button type=\"button\" class=\"choose-file-button\" required onclick=\"document.getElementById('file2').click()\">Choose File</button>\n");
      out.write("                            <span id=\"file2-label\">No file chosen</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <label class=\"formbold-form-label\">Address</label>\n");
      out.write("                        <input type=\"text\" class=\"formbold-form-input\" placeholder=\"Enter Property No\" name=\"txtpropno\" required />\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"formbold-input-flex\">\n");
      out.write("                        <div>\n");
      out.write("                            <select name=\"ddlLoc\" class=\"formbold-form-input\" onchange=\"getWard(this.value)\" required>\n");
      out.write("                                <option value=\"\" hidden>Select Location</option>\n");
      out.write("                                ");

                                    String sel = "select * from tbl_location";
                                    ResultSet rs = con.selectCommand(sel);
                                    while (rs.next()) {
                                
      out.write("\n");
      out.write("                                <option style=\"color:black;\" value=\"");
      out.print(rs.getString("location_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("location_name"));
      out.write("</option>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>   \n");
      out.write("                        <div>\n");
      out.write("                            <select name=\"ddlWard\" id=\"selward\" class=\"formbold-form-input\" required>\n");
      out.write("                                <option value=\"\" hidden>Ward No</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <textarea name=\"address\" placeholder=\"Enter street address\" class=\"formbold-form-input\" required></textarea>\n");
      out.write("                    </div>   \n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <input type=\"password\" placeholder=\"Password\" class=\"formbold-form-input\" name=\"txtpsswd\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" required/>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <input type=\"password\" class=\"formbold-form-input\" placeholder=\"Confirm Password\" name=\"txtcpsswd\" required/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"formbold-checkbox-wrapper\">\n");
      out.write("                        <label for=\"supportCheckbox\" class=\"formbold-checkbox-label\">\n");
      out.write("                            <div class=\"formbold-relative\">\n");
      out.write("                                <input type=\"checkbox\" id=\"supportCheckbox\" class=\"formbold-input-checkbox\" required>\n");
      out.write("                                <div class=\"formbold-checkbox-inner\">\n");
      out.write("                                    <span class=\"formbold-opacity-0\">\n");
      out.write("                                        <svg width=\"11\" height=\"8\" viewBox=\"0 0 11 8\" fill=\"none\" class=\"formbold-stroke-current\">\n");
      out.write("                                        <path d=\"M10.0915 0.951972L10.0867 0.946075L10.0813 0.940568C9.90076 0.753564 9.61034 0.753146 9.42927 0.939309L4.16201 6.22962L1.58507 3.63469C1.40401 3.44841 1.11351 3.44879 0.932892 3.63584C0.755703 3.81933 0.755703 4.10875 0.932892 4.29224L0.932878 4.29225L0.934851 4.29424L3.58046 6.95832C3.73676 7.11955 3.94983 7.2 4.1473 7.2C4.36196 7.2 4.55963 7.11773 4.71406 6.9584L10.0468 1.60234C10.2436 1.4199 10.2421 1.1339 10.0915 0.951972ZM4.2327 6.30081L4.2317 6.2998C4.23206 6.30015 4.23237 6.30049 4.23269 6.30082L4.2327 6.30081Z\" stroke-width=\"0.4\"></path>\n");
      out.write("                                        </svg>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <span>I agree to the defined</span> <a href=\"#\" id=\"terms-link\"> terms, conditions, and policies</a>\n");
      out.write("                        </label>\n");
      out.write("                    </div>     \n");
      out.write("                    <div class=\"button-container\">   \n");
      out.write("                        <input type=\"submit\" class=\"formbold-btn\" name=\"btn_save\" value=\"Register\">\n");
      out.write("                        <input type=\"reset\" class=\"formbold-btn\" name=\"btn_reset\" value=\"Reset\"> \n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"termsModal\" class=\"modal\">\n");
      out.write("                        <div class=\"modal-content\">\n");
      out.write("                            <span class=\"close\">&times;</span>\n");
      out.write("                            <h2>Terms and Conditions</h2>\n");
      out.write("                            <p>\n");
      out.write("                                Welcome to EcoHarbor! By accessing or using our services, you agree to be bound by the terms and conditions set forth below. Please read them carefully. If you do not agree to these terms and conditions, you may not use our services.\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                These terms and conditions govern your use of our website, including all content, features, and functionality available through our site. We reserve the right to make changes to these terms and conditions at any time. Your continued use of our services following the posting of changes will mean that you accept and agree to the changes.\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                You agree to use our website and services in a lawful manner and for their intended purposes only. You must not use our services for any fraudulent or illegal activities, including but not limited to spamming, hacking, or distributing malware.\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                All content on our website, including text, graphics, logos, and images, is the property of EcoHarbor and is protected by applicable copyright and trademark laws. You may not reproduce, distribute, or use any content from our website without our prior written consent.\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                We do not guarantee the accuracy, completeness, or reliability of any information provided on our website. Your use of the information provided on our website is at your own risk. We are not liable for any damages or losses resulting from your use of our website or services.\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                If you have any questions about these terms and conditions, please contact us at support@ecoharbor.com.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"../Assets/JQuery/jQuery.js\"></script> <!--The jQuery (Javascript Library) file in the specified directory is being processed here-->         \n");
      out.write("        <script>\n");
      out.write("                                function getWard(wid) {\n");
      out.write("                                    $.ajax({\n");
      out.write("                                        url: \"../Assets/AjaxPages/AjaxWard.jsp?wid=\" + wid,\n");
      out.write("                                        success: function(result) {\n");
      out.write("                                            $(\"#selward\").html(result);\n");
      out.write("                                        }\n");
      out.write("                                    })\n");
      out.write("                                }\n");
      out.write("                                function displayFileName(inputId, labelId) {\n");
      out.write("                                    var input = document.getElementById(inputId);\n");
      out.write("                                    var label = document.getElementById(labelId);\n");
      out.write("                                    if (input.files.length > 0) {\n");
      out.write("                                        label.textContent = input.files[0].name;\n");
      out.write("                                    } else {\n");
      out.write("                                        label.textContent = \"No file chosen\";\n");
      out.write("                                    }\n");
      out.write("                                }\n");
      out.write("                                $(document).ready(function() {\n");
      out.write("                                    var modal = $(\"#termsModal\");\n");
      out.write("                                    var btn = $(\"#terms-link\");\n");
      out.write("                                    var span = $(\".close\");\n");
      out.write("                                    var agreeBtn = $(\"#agree-btn\");\n");
      out.write("                                    var cancelBtn = $(\"#cancel-btn\");\n");
      out.write("                                    var checkbox = $(\"#supportCheckbox\");\n");
      out.write("\n");
      out.write("                                    btn.click(function(event) {\n");
      out.write("                                        event.preventDefault();\n");
      out.write("                                        modal.show();\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("                                    span.click(function() {\n");
      out.write("                                        modal.hide();\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("                                    agreeBtn.click(function() {\n");
      out.write("                                        checkbox.prop(\"checked\", true);\n");
      out.write("                                        modal.hide();\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("                                    cancelBtn.click(function() {\n");
      out.write("                                        checkbox.prop(\"checked\", false);\n");
      out.write("                                        modal.hide();\n");
      out.write("                                    });\n");
      out.write("\n");
      out.write("                                    $(window).click(function(event) {\n");
      out.write("                                        if (event.target == modal[0]) {\n");
      out.write("                                            modal.hide();\n");
      out.write("                                        }\n");
      out.write("                                    });\n");
      out.write("                                });\n");
      out.write("        </script>\n");
      out.write("        ");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section><!-- #intro -->\n");
      out.write("\n");
      out.write("<!--==========================<br>\n");
      out.write("    Footer\n");
      out.write("  ============================-->\n");
      out.write("  <footer id=\"footer\">\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-info\" style=\"margin-left: 50px\">\n");
      out.write("            <h3>EcoHarbor</h3>\n");
      out.write("            <p>EcoHarbor pioneers sustainable waste management solutions tailored for coastal communities, combining advanced technology and community engagement for a cleaner, greener future. Join us in shaping a sustainable tomorrow.</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("         <div class=\"col-lg-3 col-md-6 footer-links\" style=\"margin-left: 100px\">\n");
      out.write("            <h4>Useful Links</h4>\n");
      out.write("            <ul>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#intro\">Home</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"../index.html#about\">About us</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"../index.html#services\">Services</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"../index.html#call-to-action\">Call to action</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"../index.html#facts\">Facts</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-3 col-md-6 footer-contact\" style=\"margin-left: 100px\" id=\"contacts\">\n");
      out.write("            <h4>Contact Us</h4>\n");
      out.write("            <p>\n");
      out.write("              Avoly Panchayath<br>\n");
      out.write("              Muvattupuzha, Pin:686670<br>\n");
      out.write("              Kerala, India <br>\n");
      out.write("              <strong>Phone:</strong> 0485 226 0243<br>\n");
      out.write("              <strong>Email:</strong> avoly.gp.mvpa@gmail.com<br>\n");
      out.write("            </p>\n");
      out.write("\n");
      out.write("            <div class=\"social-links\">\n");
      out.write("              <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"copyright\">\n");
      out.write("        &copy; Copyright <strong>EcoHarbor</strong>. All Rights Reserved\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer><!-- #footer -->\n");
      out.write("\n");
      out.write("  <a href=\"#\" class=\"back-to-top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("\n");
      out.write("  <!-- JavaScript Libraries -->\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/jquery/jquery-migrate.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/easing/easing.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/superfish/hoverIntent.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/superfish/superfish.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/wow/wow.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/counterup/counterup.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/isotope/isotope.pkgd.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/lightbox/js/lightbox.min.js\"></script>\n");
      out.write("  <script src=\"../Assets/Templates/Main/lib/touchSwipe/jquery.touchSwipe.min.js\"></script>\n");
      out.write("  <!-- Contact Form JavaScript File -->\n");
      out.write("  <script src=\"contactform/contactform.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main Javascript File -->\n");
      out.write("  <script src=\"../Assets/Templates/Main/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
