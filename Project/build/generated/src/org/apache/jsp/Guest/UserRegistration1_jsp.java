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
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <title> User Registration Form</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/userreg.css\" />\n");
      out.write("  </head>\n");
      out.write("  ");
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
      out.write("  <link href=\"../Assets/Templates/Main/img/favicon.png\" rel=\"icon\">\n");
      out.write("  <link href=\"../Assets/Templates/Main/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
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
      out.write("        <h1><a href=\"#intro\" class=\"scrollto\">EcoHarbor</a></h1>\n");
      out.write("        <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("        <!-- <a href=\"#intro\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>-->\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <nav id=\"nav-menu-container\">\n");
      out.write("        <ul class=\"nav-menu\">\n");
      out.write("            <li class=\"menu-active\"><a href=\"../index.html\">Home</a></li>\n");
      out.write("            <li><a href=\"Login.jsp\">Login</a></li>\n");
      out.write("          <li><a href=\"../index.html#about\">About Us</a></li>\n");
      out.write("          <li><a href=\"../index.html#services\">Services</a></li>\n");
      out.write("          <li><a href=\"../index.html#contacts\">Contact</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav><!-- #nav-menu-container -->\n");
      out.write("    </div>\n");
      out.write("  </header><!-- #header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      <!--==========================\n");
      out.write("    Intro Section\n");
      out.write("  ============================-->\n");
      out.write("  <section id=\"intro\">\n");
      out.write("    <div class=\"intro-container\">\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("          <div class=\"carousel-item active\" style=\"background-image: url('../Assets/Templates/Main/img/intro-carousel/e1.jpg');\">\n");
      out.write("            <div class=\"carousel-container\">\n");
      out.write("              <div class=\"carousel-content\">");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <section class=\"container1\">\n");
      out.write("      <header>User Registration</header>\n");
      out.write("      <form action=\"#\" class=\"form\">\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("          <label>Full Name</label>\n");
      out.write("          <input type=\"text\" name=\"txtname\" placeholder=\"Enter full name\" title=\"Name Allows Only Alphabets,Spaces and First Letter Must Be Capital Letter\" pattern=\"^[A-Z]+[a-zA-Z ]*$\" required />\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("          <label>Email Address</label>\n");
      out.write("          <input type=\"text\" name=\"txtemail\" placeholder=\"Enter email address\" required />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <label>Phone Number</label>\n");
      out.write("            <input type=\"number\" placeholder=\"Enter phone number\" name=\"txtcontact\" title=\"Phone number with 7-9 and remaing 9 digit with 0-9\" pattern=\"[7-9]{1}[0-9]{9}\" required />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gender-box\">\n");
      out.write("          <label>Gender</label>\n");
      out.write("          <div class=\"gender-option\">\n");
      out.write("            <div class=\"gender\">\n");
      out.write("              <input type=\"radio\" id=\"check-male\" name=\"gender\" checked required/>\n");
      out.write("              <label for=\"check-male\">male</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gender\">\n");
      out.write("              <input type=\"radio\" id=\"check-female\" name=\"gender\" />\n");
      out.write("              <label for=\"check-female\">Female</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"gender\">\n");
      out.write("              <input type=\"radio\" id=\"check-other\" name=\"gender\" />\n");
      out.write("              <label for=\"check-other\">prefer not to say</label>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box file-input\">\n");
      out.write("            <label for=\"file1\">Upload Photo</label>\n");
      out.write("            <input type=\"file\" id=\"file1\" name=\"file_photo\" style=\"display: none;\" required>\n");
      out.write("            <button type=\"button\" onclick=\"document.getElementById('file1').click()\">Choose File</button>\n");
      out.write("            <span id=\"file-name\">No file chosen</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box file-input\">\n");
      out.write("            <label for=\"file2\">Aadhar Proof</label>\n");
      out.write("            <input type=\"file\" id=\"file2\" name=\"file_proof\" style=\"display: none;\" required>\n");
      out.write("            <button type=\"button\" onclick=\"document.getElementById('file2').click()\">Choose File</button>\n");
      out.write("            <span id=\"file-name\">No file chosen</span>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box address\">\n");
      out.write("          <label>Address</label>\n");
      out.write("          <textarea name=\"address\" placeholder=\"Enter street address\" required></textarea>\n");
      out.write("          <div class=\"column\">\n");
      out.write("            <div class=\"select-box\">\n");
      out.write("                <select name=\"ddlLoc\" onchange = \"getWard(this.value)\" required> <!--Here onchange triggers the function getWard()-->\n");
      out.write("                            <option hidden>Location</option>\n");
      out.write("                            ");

                                String sel = "select*from tbl_location";  /*Here data from table location is fecthed*/

                                ResultSet rs = con.selectCommand(sel); /*Here there select query is exectued into ResultSet array*/

                                while (rs.next()) /*Using while loop we iterate every values in the array and pass the value into Drop down list*/ {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString("location_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("location_name"));
      out.write("</option> <!--Values from -->\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                </select>\n");
      out.write("          <div class=\"column\">\n");
      out.write("            <div class=\"select-box\">\n");
      out.write("              <select name=\"ddlWard\" id = \"selward\" required>\n");
      out.write("                <option hidden>Ward No</option>\n");
      out.write("              </select>\n");
      out.write("            </div>  \n");
      out.write("          <div class=\"column\">\n");
      out.write("            <input type=\"number\" placeholder=\"Enter your Property No\" name=\"txtpropno\" required />\n");
      out.write("          </div>  \n");
      out.write("        </div>\n");
      out.write("        <div class=\"input-box\">\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" name=\"txtpsswd\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" required/>\n");
      out.write("          </div> \n");
      out.write("          <div class=\"input-box\">\n");
      out.write("            <input type=\"password\" placeholder=\"Confirm Password\" name=\"txtcpsswd\" required/>\n");
      out.write("          </div>\n");
      out.write("        <button name=\"btn_save\">Submit</button>\n");
      out.write("      </form>\n");
      out.write("    </section>\n");
      out.write("  </body>\n");
      out.write("  <script src=\"../Assets/JQuery/jQuery.js\"></script> <!--The jQuery (Javascript Library) file in the specified directory is being processed here-->         \n");
      out.write("  <script>\n");
      out.write("                            function getWard(wid) /*Here the function is being defined were parameter is being passed*/\n");
      out.write("                            {\n");
      out.write("\n");
      out.write("                                //  alert(wid);  \n");
      out.write("                                $.ajax({url: \"../Assets/AjaxPages/AjaxWard.jsp?wid=\" + wid, /*Here we use the $.ajax for passing the parameter value into the ajaxward file*/\n");
      out.write("                                    success: function(result) { /*If the function is invoked successfully*/\n");
      out.write("                                        $(\"#selward\").html(result); /*We pass the value into the Ward drop down list using its drop down list id*/\n");
      out.write("                                    }\n");
      out.write("                                })\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("  ");
      out.write("    \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section><!-- #intro -->\n");
      out.write("\n");
      out.write("<!--==========================\n");
      out.write("    Footer\n");
      out.write("  ============================-->\n");
      out.write("  <footer id=\"footer\">\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-info\" style=\"margin-left: 50px\">\n");
      out.write("            <h3>EcoHarbor</h3>\n");
      out.write("            <p>EcoHarbor pioneers sustainable waste management solutions tailored for coastal communities, combining advanced technology and community engagement for a cleaner, greener future. Join us in shaping a sustainable tomorrow.</p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-links\" style=\"margin-left: 100px\">\n");
      out.write("            <h4>Useful Links</h4>\n");
      out.write("            <ul>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#intro\">Home</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#about\">About us</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#services\">Services</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#\">Terms of service</a></li>\n");
      out.write("              <li><i class=\"ion-ios-arrow-right\"></i> <a href=\"#\">Privacy policy</a></li>\n");
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
      out.write("            \n");
      out.write("            <div class=\"social-links\">\n");
      out.write("              <a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"google-plus\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"linkedin\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"copyright\">\n");
      out.write("        &copy; Copyright <strong>EcoHarbor</strong>. All Rights Reserved\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer><!-- #footer -->\n");
      out.write("\n");
      out.write("  <a href=\"#\" class=\"back-to-top\"><i class=\"fa fa-chevron-up\"></i></a>\n");
      out.write("  \n");
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
      out.write("</html>\n");
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
