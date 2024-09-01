package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Property_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Admin/../Guest/Foot.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      DB.ConnectionClass con = null;
      synchronized (_jspx_page_context) {
        con = (DB.ConnectionClass) _jspx_page_context.getAttribute("con", PageContext.PAGE_SCOPE);
        if (con == null){
          con = new DB.ConnectionClass();
          _jspx_page_context.setAttribute("con", con, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("                <!-- Favicons -->\n");
      out.write("        <link href=\"../Assets/Templates/Main/img/favicon.jpg\" rel=\"icon\">\n");
      out.write("        <link href=\"../Assets/Templates/Main/img/apple-touch-icon.jpg\" rel=\"apple-touch-icon\">\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/CSS/shopreg.css\">\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("        <title>Property Entry</title>\n");
      out.write("                <style>\n");
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
      out.write("                    max-width: 780px;\n");
      out.write("                    margin: auto;\n");
      out.write("                    padding: 20px;\n");
      out.write("                    border-radius: 5px;\n");
      out.write("                    background-color: rgba(249, 249, 249, 0.1);\n");
      out.write("                    margin-top: 100px;\n");
      out.write("                    margin-bottom: 100px;\n");
      out.write("                    width: 780px;\n");
      out.write("\n");
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
      out.write("            .formbold-main-wrapper {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                padding: 127px;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("            .table-container {\n");
      out.write("                width: 100%;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                    margin-bottom: 330px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 80%;\n");
      out.write("                margin: -158px auto; /* Center the table horizontally */\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                background-color: rgba(249, 249, 249, 0.1);\n");
      out.write("                box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);\n");
      out.write("                color: white;\n");
      out.write("                border: 1px solid transparent; /* Makes the outer border transparent */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th, td {\n");
      out.write("                padding: 12px;\n");
      out.write("                border: 1px solid transparent; /* Makes individual cell borders transparent */\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            th {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:nth-child(even) {\n");
      out.write("                background-color: rgba(255, 255, 255, 0.1);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tr:hover {\n");
      out.write("                background-color: rgba(255, 255, 255, 0.2);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h2 {\n");
      out.write("                text-align: center;\n");
      out.write("                font-weight: 400;\n");
      out.write("                font-size: 33px;\n");
      out.write("                line-height: 34px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("                        .choose-file-button {\n");
      out.write("                background-color: transparent;\n");
      out.write("                color: white;\n");
      out.write("                border: 2px solid white;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                transition: background-color 0.3s ease, color 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .choose-file-button:hover {\n");
      out.write("                background-color: white;\n");
      out.write("                color: #4CAF50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<!--==========================\n");
      out.write("Header\n");
      out.write("============================-->\n");
      out.write("        <header id=\"header\" >\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div id=\"logo\" class=\"pull-left\">\n");
      out.write("                    <h1><a href=\"../index.html\" class=\"scrollto\">EcoHarbor</a></h1>\n");
      out.write("                    <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("                    <!-- <a href=\"#intro\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>-->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <nav id=\"nav-menu-container\">\n");
      out.write("                    <ul class=\"nav-menu\">\n");
      out.write("                        <li><a href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("                        <li><a style=\"color:white;\">Entry Options</a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"Location.jsp\">Location Entry</a></li>\n");
      out.write("                                <li><a href=\"WasteType.jsp\">Waste Type Entry</a></li>\n");
      out.write("                                <li><a href=\"Ward.jsp\">Ward Entry</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"../Guest/Login1.jsp\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav><!-- #nav-menu-container -->\n");
      out.write("            </div>\n");
      out.write("        </header><!-- #######################################header############################################ -->        \n");
      out.write("        ");

            if(request.getParameter("txtreset")!=null)
            {
                response.sendRedirect("Property.jsp");
            }
            if(request.getParameter("txtsave")!=null)
            {
                if(request.getParameter("txtid").equals(""))
                {
                    String iq = "insert into tbl_property(ward_id,property_no,property_oname)values('"+request.getParameter("ddlWard")+"','"+request.getParameter("txtprop")+"','"+request.getParameter("txtown")+"')";
                    con.executeCommand(iq);
                }
                else 
                {
                    String uq = "update tbl_property set ward_id = '"+request.getParameter("ddlWard")+"',property_no = '"+request.getParameter("txtprop")+"',property_oname = '"+request.getParameter("txtown")+"'where property_id = '"+request.getParameter("txtid")+"'";
                    con.executeCommand(uq);
                    response.sendRedirect("Property.jsp");                    
                }   
            }
            if(request.getParameter("did")!=null)
            {
                String dq = "delete from tbl_property where property_id = '"+request.getParameter("did")+"'";
                con.executeCommand(dq);
                response.sendRedirect("Property.jsp");
            }
            String editwid="";
            String editid="";
            String editpno="";
            String editown ="";
            if(request.getParameter("eid")!=null)
            {
                String sq2 = "select*from tbl_property where property_id ='"+request.getParameter("eid")+"'";
                ResultSet rs2 = con.selectCommand(sq2);
                rs2.next();
                editwid = rs2.getString("ward_id");
                editid = rs2.getString("property_id");
                editpno = rs2.getString("property_no");
                editown = rs2.getString("property_oname");
            }
            
        
      out.write("   \n");
      out.write("        <div class=\"formbold-main-wrapper\">\n");
      out.write("        <div class=\"formbold-form-wrapper\">        \n");
      out.write("        <form method=\"post\">\n");
      out.write("                    <div class=\"formbold-form-title\">\n");
      out.write("                        <h2 align=\"center\">PROPERTY ENTRY</h2>\n");
      out.write("                    </div> \n");
      out.write("                    <label class=\"formbold-form-label\">Property No</label> \n");
      out.write("                    <div class=\"formbold-mb-3\">\n");
      out.write("                        <input type=\"text\" class=\"formbold-form-input\" placeholder=\"Enter Property Number\" name=\"txtprop\" required value=\"");
      out.print(editpno);
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name = \"txtid\" value=\"");
      out.print(editid);
      out.write("\">\n");
      out.write("                    </div>    \n");
      out.write("                    <label class=\"formbold-form-label\">Ward No</label> \n");
      out.write("                    <div class=\"formbold-input-flex\">\n");
      out.write("                        <select name=\"ddlWard\" class=\"formbold-form-input\" required> \n");
      out.write("                            <option style=\"color:black;\">Select Ward</option>\n");
      out.write("                            ");

                                String sel = "select*from tbl_ward";  

                                ResultSet rs = con.selectCommand(sel); 

                                while (rs.next()) 
                                {
                            
      out.write("\n");
      out.write("                            <option style=\"color:black;\" value = \"");
      out.print(rs.getString("ward_id"));
      out.write('"');
      out.write(' ');
 if(rs.getString("ward_id").equals(editwid)) { out.print("selected"); } 
      out.write('>');
      out.print(rs.getString("ward_no"));
      out.write("</option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </div>  \n");
      out.write("                    <label class=\"formbold-form-label\">Property Ownername</label> \n");
      out.write("                    <div class=\"formbold-mb-3\">    \n");
      out.write("                        <input type=\"text\" class=\"formbold-form-input\" name=\"txtown\" placeholder=\"Enter Owner Name\" required value=\"");
      out.print(editown);
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name = \"txtid\" value=\"");
      out.print(editid);
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button-container\">   \n");
      out.write("                        <input type=\"submit\" class=\"formbold-btn\" name=\"txtsave\" value=\"Register\">\n");
      out.write("                        <input type=\"submit\" class=\"formbold-btn\" name=\"txtreset\" value=\"Reset\"> \n");
      out.write("                    </div>\n");
      out.write("                    </form> \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("<div class=\"table-container\">            \n");
      out.write("            <table border=\"1\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>SI.No</th>\n");
      out.write("                    <th>Property No</th>\n");
      out.write("                    <th>Ward No</th>\n");
      out.write("                    <th>Owner Name</th>\n");
      out.write("                    <th>Action</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                       String sq1 = "select * from tbl_property w inner join tbl_ward l on w.ward_id = l.ward_id";
                       ResultSet rs1 = con.selectCommand(sq1);
                       int i=0;
                       while(rs1.next())
                       {
                           i++;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs1.getString("property_no"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs1.getString("ward_no"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs1.getString("property_oname"));
      out.write("</td>\n");
      out.write("                    <td><a class=\"choose-file-button\" href = \"Property.jsp?did=");
      out.print(rs1.getString("property_id"));
      out.write("\">Delete</a><a class=\"choose-file-button\" href = \"Property.jsp?eid=");
      out.print(rs1.getString("property_id"));
      out.write("\">Edit</a></td>\n");
      out.write("                </tr>   \n");
      out.write("                ");

                       }
                
      out.write("\n");
      out.write("            </table>     \n");
      out.write("    </div>\n");
      out.write("            ");
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
