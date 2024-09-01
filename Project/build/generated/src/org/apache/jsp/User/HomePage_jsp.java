package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/User/../Guest/Foot.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Dashboard</title>\n");
      out.write("        <style> \n");
      out.write("            h4{text-align: right;} \n");
      out.write("            .row.counters .col-lg-3 span,\n");
      out.write("            .row.counters .col-lg-3 h6 {\n");
      out.write("           margin-right: -850px;\n");
      out.write("        }\n");
      out.write("            .title {\n");
      out.write("         text-align: left;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("  .icon {\n");
      out.write("    text-align: center;\n");
      out.write("    font-size: 2em;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("        </style> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("        <!-------------------------------------------header---------------------------------------------------------->\n");
      out.write("        <meta charset=\"utf-8\">\n");
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
      out.write("  <!------------------------------------------------------------header end------------------------------------------------------>\n");
      out.write("    </head>\n");
      out.write("    ");

        
        int balance = 0;
        String sel1 = "select*from tbl_user where user_id='"+session.getAttribute("uid")+"'";  
        ResultSet rsu = con.selectCommand(sel1);
        if(rsu.next())
        {
            balance = rsu.getInt("user_wallet");
            if(balance <= 0)
            {
                
      out.write("\n");
      out.write("                <script>\n");
      out.write("                    alert(\"Payment Required\");\n");
      out.write("                    window.location=\"Payment.jsp\";\n");
      out.write("                </script>\n");
      out.write("                ");

            }
        }
    
      out.write("\n");
      out.write("    <body>\n");
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
      out.write("            <li><a href=\"#portfolio\">Menu</a></li>\n");
      out.write("          <li><a href=\"#services\">Rules</a></li>\n");
      out.write("          <li><a href=\"Rate.jsp\">Base Rate</a></li>\n");
      out.write("          <li><a style=\"color:white;\">wallet : ₹");
      out.print(rsu.getInt("user_wallet"));
      out.write("</a></li>\n");
      out.write("          <li><a href=\"../index.html\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav><!-- #nav-menu-container -->\n");
      out.write("    </div>\n");
      out.write("  </header><!-- #header -->        \n");
      out.write("  <!--==========================\n");
      out.write("    Intro Section\n");
      out.write("  ============================-->\n");
      out.write("  <section id=\"intro\">\n");
      out.write("    <div class=\"intro-container\">\n");
      out.write("      <div id=\"introCarousel\" class=\"carousel  slide carousel-fade\" data-ride=\"carousel\">\n");
      out.write("        <ol class=\"carousel-indicators\"></ol>\n");
      out.write("        <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("          <div class=\"carousel-item active\" style=\"background-image: url('../Assets/Templates/Main/img/intro-carousel/e2.jpg');\"\">\n");
      out.write("            <div class=\"carousel-container\">\n");
      out.write("              <div class=\"carousel-content\">\n");
      out.write("                <h2>Hello ");
      out.print(session.getAttribute("uname"));
      out.write("</h2>\n");
      out.write("                <p>Welcome to EcoHarbor Waste Management, where we transform waste into a greener future for Avoly. Together, we can make a significant impact on our environment and inspire change in communities worldwide.</p>\n");
      out.write("                <a href=\"#portfolio\" class=\"btn-get-started scrollto\">Get Started</a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section><!-- #intro -->\n");
      out.write("    <!--==========================\n");
      out.write("      Portfolio Section\n");
      out.write("    ============================-->\n");
      out.write("    <section id=\"portfolio\"  class=\"section-bg\" >\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row portfolio-container\">\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app wow fadeInUp\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/Myprofile.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                <a href=\"MyProfile1.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"MyProfile1.jsp\">MY PROFILE</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/Editprofile.jpg\" class=\"img-fluid\" alt=\"\"> \n");
      out.write("                <a href=\"Edit Profile.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"Edit Profile.jsp\">EDIT PROFILE</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app wow fadeInUp\" data-wow-delay=\"0.2s\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/Changepsd.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                <a href=\"Change Password.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"Change Password.jsp\">CHANGE PASSWORD</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card wow fadeInUp\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/Collect.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                <a href=\"UserRequest.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"UserRequest.jsp\">COLLECTION REQUEST</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/Request.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                <a href=\"RequestView.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"RequestView.jsp\">REQUEST VIEW</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-app wow fadeInUp\" data-wow-delay=\"0.2s\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/Transact.jpg\"  class=\"img-fluid\" alt=\"\">\n");
      out.write("                <a href=\"Transaction.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"Transaction.jsp\">TRANSACTION HISTORY</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card wow fadeInUp\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/feedback.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                <a href=\"UserFeedback.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"UserFeedback.jsp\">FEEDBACK</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-card wow fadeInUp\" data-wow-delay=\"0.1s\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/complaint.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                <a href=\"UserComplaint.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"UserComplaint.jsp\">COMPLAINT</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4 col-md-6 portfolio-item filter-web wow fadeInUp\" data-wow-delay=\"0.2s\">\n");
      out.write("            <div class=\"portfolio-wrap\">\n");
      out.write("              <figure>\n");
      out.write("                <img src=\"../Assets/Templates/Main/img/status.jpg\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                <a href=\"UserComplaintStatus.jsp\" class=\"link-details\" title=\"More Details\"><i class=\"ion ion-android-open\"></i></a>\n");
      out.write("              </figure>\n");
      out.write("              <div class=\"portfolio-info\">\n");
      out.write("                <h4><a href=\"UserComplaintStatus.jsp\">COMPLAINT STATUS</a></h4>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section><!-- #portfolio -->\n");
      out.write("      <!------ service------->\n");
      out.write("      <section id=\"services\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <header class=\"section-header wow fadeInUp\">\n");
      out.write("          <h3>Rules</h3>\n");
      out.write("          <p>Please note that waste will be collected during the first week of every month.</p>\n");
      out.write("        </header>\n");
      out.write("          <div class=\"row\">\n");
      out.write("    <div class=\"col-lg-4 col-md-6 box wow bounceInUp\" data-wow-duration=\"1.4s\">\n");
      out.write("      <div class=\"icon\"><i class=\"fas fa-recycle\"></i></div>\n");
      out.write("      <h4 class=\"title\"><a href=\"\">Segregation at Source</a></h4>\n");
      out.write("      <p class=\"description\">Waste must be separated into organic, inorganic, and hazardous categories at the source, such as homes, institutions, and businesses</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-6 box wow bounceInUp\" data-wow-duration=\"1.4s\">\n");
      out.write("      <div class=\"icon\"><i class=\"fas fa-calendar-alt\"></i></div>\n");
      out.write("      <h4 class=\"title\"><a href=\"\">Collection Schedule</a></h4>\n");
      out.write("      <p class=\"description\">Waste is collected according to a regular schedule, with specific days allocated for different types of waste to ensure systematic and efficient management</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-6 box wow bounceInUp\" data-wow-duration=\"1.4s\">\n");
      out.write("      <div class=\"icon\"><i class=\"fas fa-seedling\"></i></div>\n");
      out.write("      <h4 class=\"title\"><a href=\"\">Biodegradable Waste Management</a></h4>\n");
      out.write("      <p class=\"description\">Organic waste is collected more frequently (daily or on alternate days) to prevent decomposition-related issues and odors</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-6 box wow bounceInUp\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.4s\">\n");
      out.write("      <div class=\"icon\"><i class=\"fas fa-trash-alt\"></i></div>\n");
      out.write("      <h4 class=\"title\"><a href=\"\">Non-Biodegradable Waste Management</a></h4>\n");
      out.write("      <p class=\"description\">Inorganic waste is collected separately and less frequently than organic waste to ensure proper recycling and disposal</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-6 box wow bounceInUp\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.4s\">\n");
      out.write("      <div class=\"icon\"><i class=\"fas fa-exclamation-triangle\"></i></div>\n");
      out.write("      <h4 class=\"title\"><a href=\"\">Hazardous Waste Handling</a></h4>\n");
      out.write("      <p class=\"description\">Special care is taken for hazardous waste (e.g., batteries, medical waste), requiring safe handling and disposal protocols to prevent environmental contamination and health hazards</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-4 col-md-6 box wow bounceInUp\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.4s\">\n");
      out.write("      <div class=\"icon\"><i class=\"fas fa-users\"></i></div>\n");
      out.write("      <h4 class=\"title\"><a href=\"\">Community Involvement</a></h4>\n");
      out.write("      <p class=\"description\">Emphasis on active community participation in waste management practices, including awareness campaigns and local training sessions</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("    </section><!-- #services -->\n");
      out.write("    ");
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
