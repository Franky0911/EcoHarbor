package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Uregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Guest/Head.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- Designined by CodingLab - youtube.com/codinglabyt -->\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>User Registration</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/stle.css\">\n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   </head>\n");
      out.write("   ");
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
      out.write("<body>\n");
      out.write("  <div class=\"container1\">\n");
      out.write("    <div class=\"title\">User Registration</div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("      <form action=\"POST\">\n");
      out.write("        <div class=\"user-details\">\n");
      out.write("          <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Full Name</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your name\" required>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Email</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your email\" required>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Phone Number</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your number\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Property Number</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your property number\" required>\n");
      out.write("            </div>  \n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Photo:</span>\n");
      out.write("                <input type=\"file\" id=\"filePhoto\" name=\"filePhoto\" onchange=\"updateFileName(this)\">\n");
      out.write("                <label for=\"filePhoto\" class=\"upload-label\">\n");
      out.write("                    <span class=\"custom-file-upload\">Choose File</span>\n");
      out.write("                </label>\n");
      out.write("                <span class=\"file-name\" id=\"fileName\">No file chosen</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Aadhar Proof:</span>\n");
      out.write("                <input type=\"file\" id=\"fileProof\" name=\"fileProof\" onchange=\"updateFileName(this)\">\n");
      out.write("                <label for=\"fileProof\" class=\"upload-label\">\n");
      out.write("                    <span class=\"custom-file-upload\">Choose File</span>\n");
      out.write("                </label>\n");
      out.write("                <span class=\"file-name\" id=\"fileName\">No file chosen</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Password</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Enter your password\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"input-box\">\n");
      out.write("                <span class=\"details\">Confirm Password</span>\n");
      out.write("                <input type=\"text\" placeholder=\"Confirm your password\" required>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"gender-details\">\n");
      out.write("          <input type=\"radio\" name=\"gender\" id=\"dot-1\">\n");
      out.write("          <input type=\"radio\" name=\"gender\" id=\"dot-2\">\n");
      out.write("          <input type=\"radio\" name=\"gender\" id=\"dot-3\">\n");
      out.write("          <span class=\"gender-title\">Gender</span>\n");
      out.write("          <div class=\"category\">\n");
      out.write("            <label for=\"dot-1\">\n");
      out.write("                <span class=\"dot one\"></span>\n");
      out.write("                <span class=\"gender\">Male</span>\n");
      out.write("            </label>\n");
      out.write("            <label for=\"dot-2\">\n");
      out.write("                <span class=\"dot two\"></span>\n");
      out.write("                <span class=\"gender\">Female</span>\n");
      out.write("            </label>\n");
      out.write("            <label for=\"dot-3\">\n");
      out.write("                <span class=\"dot three\"></span>\n");
      out.write("                <span class=\"gender\">Prefer not to say</span>\n");
      out.write("            </label>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"button\">\n");
      out.write("          <input type=\"submit\" value=\"Register\">\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>   \n");
      out.write("</body>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"copyright\">\n");
      out.write("        &copy; Copyright <strong>EcoHarbor</strong>. All Rights Reserved\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("</html>\n");
      out.write("\n");
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
