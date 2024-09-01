package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class ne_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <title>EcoHarbor</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"\" name=\"keywords\">\n");
      out.write("        <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicons -->\n");
      out.write("        <link href=\"../Assets/Templates/Main/img/favicon.png\" rel=\"icon\">\n");
      out.write("        <link href=\"../Assets/Templates/Main/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Montserrat:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS File -->\n");
      out.write("        <link href=\"../Assets/Templates/Main/lib/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Libraries CSS Files -->\n");
      out.write("        <link href=\"../Assets/Templates/Main/lib/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Assets/Templates/Main/lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Assets/Templates/Main/lib/ionicons/css/ionicons.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Assets/Templates/Main/lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Assets/Templates/Main/lib/lightbox/css/lightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Main Stylesheet File -->\n");
      out.write("        <link href=\"../Assets/Templates/Main/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link href=\"../Assets/Templates/Form.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- =======================================================\n");
      out.write("          Theme Name: BizPage\n");
      out.write("          Theme URL: https://bootstrapmade.com/bizpage-bootstrap-business-template/\n");
      out.write("          Author: BootstrapMade.com\n");
      out.write("          License: https://bootstrapmade.com/license/\n");
      out.write("        ======================================================= -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Assets/Form.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>EcoHarbor</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .login-box {\n");
      out.write("                position: relative;\n");
      out.write("                width: 400px;\n");
      out.write("            }\n");
      out.write("            .login-box form {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 0 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .input-box {\n");
      out.write("                position: relative;\n");
      out.write("                margin: 9px 0;\n");
      out.write("            }\n");
      out.write("            .input-box input {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 50px;\n");
      out.write("                background: transparent;\n");
      out.write("                border: 2px solid #00b605;\n");
      out.write("                outline: none;\n");
      out.write("                border-radius: 40px;\n");
      out.write("                font-size: 1em;\n");
      out.write("                color: white;\n");
      out.write("                padding: 0 20px;\n");
      out.write("                transition: .5s ease;\n");
      out.write("            }\n");
      out.write("            .input-box input:focus,\n");
      out.write("            .input-box input:valid {\n");
      out.write("                border-color:white;\n");
      out.write("            }\n");
      out.write("            .input-box label {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 20px;\n");
      out.write("                transform: translateY(-50%);\n");
      out.write("                font-size: 1em;\n");
      out.write("                color: #fff;\n");
      out.write("                pointer-events: none;\n");
      out.write("                transition: .5s ease;\n");
      out.write("            }\n");
      out.write("            .input-box input:focus~label,\n");
      out.write("            .input-box input:valid~label {\n");
      out.write("                top: 1px;\n");
      out.write("                font-size: 15px;\n");
      out.write("                padding: 0 6px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .input-box-submit { \n");
      out.write("                width: 100%; \n");
      out.write("                height: 50px;\n");
      out.write("                background: transparent;\n");
      out.write("                border: 2px solid #00b605; \n");
      out.write("                outline: none; \n");
      out.write("                border-radius: 5px; /* Adjust this value to make the corners less or more rounded */\n");
      out.write("                font-size: 1em;\n");
      out.write("                color: white;\n");
      out.write("                padding: 0 20px; \n");
      out.write("                transition: .5s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input-box-submit:hover, \n");
      out.write("            .input-box-submit:focus { \n");
      out.write("                border-color: white; \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input-box-submit:focus { \n");
      out.write("                background-color: #00b605; \n");
      out.write("                color: white; \n");
      out.write("            }\n");
      out.write("            button, input, optgroup, select, textarea {\n");
      out.write("                margin: 8px;\n");
      out.write("                font-family: inherit;\n");
      out.write("                font-size: inherit;\n");
      out.write("                line-height: inherit;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--==========================\n");
      out.write("          Header\n");
      out.write("        ============================-->\n");
      out.write("        <header id=\"header\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                <div id=\"logo\" class=\"pull-left\">\n");
      out.write("                    <h1><a href=\"../index.html\" class=\"scrollto\">EcoHarbor</a></h1>\n");
      out.write("                    <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("                    <!-- <a href=\"#intro\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>-->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <nav id=\"nav-menu-container\">\n");
      out.write("                    <ul class=\"nav-menu\">\n");
      out.write("                        <li><a href=\"../index.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"UserRegistration.jsp\">Sign Up</a></li>\n");
      out.write("                        <li><a href=\"../index.html#about\">About Us</a></li>\n");
      out.write("                        <li><a href=\"../index.html#services\">Services</a></li>\n");
      out.write("                        <li><a href=\"#contacts\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav><!-- #nav-menu-container -->\n");
      out.write("            </div>\n");
      out.write("        </header><!-- #header -->\n");
      out.write("\n");
      out.write("        <div id=\"tab\" align=\"center\">\n");
      out.write("            <!--==========================\n");
      out.write("          Intro Section\n");
      out.write("        ============================-->\n");
      out.write("\n");
      out.write("            <section id=\"intro\">\n");
      out.write("                <div class=\"intro-container\">\n");
      out.write("                    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                        <div class=\"carousel-item active\" style=\"background-image: url('../Assets/Templates/Main/img/intro-carousel/12.jpg');\">\n");
      out.write("                            <div class=\"carousel-container\">\n");
      out.write("                                <div class=\"carousel-content\">\n");
      out.write("    ");

        
        if(request.getParameter("btn_login")!=null)
        {
            String email = request.getParameter("txt_email");
            String password = request.getParameter("txt_password");
            int sts=0;
            String seladmin = "select * from tbl_admin where admin_email='"+email+"' and admin_password='"+password+"'";
            String selagency = "select * from tbl_agency where agency_email='"+email+"' and agency_password='"+password+"'";
            String selUser = "select * from tbl_user where user_email='"+email+"' and user_password='"+password+"'";
            ResultSet rsU = con.selectCommand(selUser);
            ResultSet rsAd = con.selectCommand(seladmin);
            ResultSet rsAg = con.selectCommand(selagency);
            if(rsU.next())
            {   
                sts = rsU.getInt("user_status");
                if(sts == 0)
                {
                    
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        alert(\"Pending Verification\");\n");
      out.write("                        window.location=\"Login1.jsp\";\n");
      out.write("                    </script>\n");
      out.write("                    ");

                }
                else if(sts == 1)
                {
                    
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        alert(\"Pending Verification\");\n");
      out.write("                        window.location=\"Login1.jsp\";\n");
      out.write("                    </script>\n");
      out.write("                    ");

                }
                else if(sts  == 3)
                {
                    
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        alert(\"Registration Rejected\")\n");
      out.write("                        window.location=\"Login1.jsp\";\n");
      out.write("                    </script>\n");
      out.write("                    ");

                }
                else 
                {
                    session.setAttribute("uid", rsU.getString("user_id"));
                    session.setAttribute("uname", rsU.getString("user_name"));
                    response.sendRedirect("../User/HomePage.jsp");
                }
                
            }
            else if(rsAd.next())
            {
                session.setAttribute("adid", rsAd.getString("admin_id"));
                session.setAttribute("adname", rsAd.getString("admin_name"));
                response.sendRedirect("../Admin/HomePage.jsp");
            }
            else if(rsAg.next())
            {
                session.setAttribute("agid", rsAg.getString("agency_id"));
                session.setAttribute("agname", rsAg.getString("agency_name"));
                response.sendRedirect("../Agency/HomePage.jsp");
            }
            else
            {
                
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        alert(\"Invalid Credentials\");\n");
      out.write("                        window.location=\"Login1.jsp\";\n");
      out.write("                    </script>\n");
      out.write("                ");

            }            
              
        }
    
    
      out.write("\n");
      out.write("\n");
      out.write("                                    <body>\n");
      out.write("                                        <div class=\"login-box\">\n");
      out.write("                                            <h2 style=\"color: #black; margin-bottom: 7px; font-size: 60px;  font-weight: 700;\">Login</h2>\n");
      out.write("                                            <form method=\"action\">\n");
      out.write("                                                <div class=\"input-box\">\n");
      out.write("                                                    <input type=\"email\" name=\"txtmail\"  required>\n");
      out.write("                                                    <label>Email</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"input-box\">\n");
      out.write("                                                    <input type=\"password\" name=\"txt_password\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\" required/>\n");
      out.write("                                                    <label>Password</label>\n");
      out.write("                                                </div>\n");
      out.write("                                                <input type=\"submit\" value=\"Login\" name=\"btn_login\" style=\"width: 100%; height: 50px; border-radius: 28px; background: transparent; border: 2px solid #00b605; color: white; padding: 10px 20px; transition: border-color 0.3s ease; float: left;\">\n");
      out.write("                                                <div>\n");
      out.write("                                                    <label  style=\"color: white; font-size: 15px; \">not a member?<a href=\"../Guest/UserRegistration.jsp\" style=\"color: limegreen;\">Sign up</a></label>\n");
      out.write("                                                </div>\n");
      out.write("                                            </form>\n");
      out.write("                                        </div>\n");
      out.write("                                    </body>\n");
      out.write("                                    ");
      out.write("</div>\n");
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
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#about\">About us</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#services\">Services</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#call-to-action\">Call to action</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#facts\">Facts</a></li>\n");
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
      out.write("                                    </html>\n");
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
