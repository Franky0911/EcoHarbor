package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class UserRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!-- Favicons -->\n");
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
      out.write("        <link href=\"../Assets/Templates/Form.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Assets/CSS/shopreg.css\">\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("        <title>Collection Request</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url('../Assets/Templates/Main/img/facts-bg.jpg') no-repeat center center/cover;\n");
      out.write("                font-family: Arial, sans-serif;\n");
      out.write("                color: white;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .table-container {\n");
      out.write("                width: 100%;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-top: 100px;\n");
      out.write("                margin-bottom: 125px;\n");
      out.write("                min-height: 60vh;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                width: 80%;\n");
      out.write("                margin: 0 auto;\n");
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
      out.write("\n");
      out.write("            .choose-file-button:hover, .formbold-btn:hover {\n");
      out.write("                background-color: #45a049;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button-container {\n");
      out.write("                text-align: center;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .formbold-form-wrapper {\n");
      out.write("                max-width: 600px;\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                background-color: rgba(249, 249, 249, 0.1);\n");
      out.write("                margin-top: 220px;\n");
      out.write("                margin-bottom: 315px;\n");
      out.write("                width: 600px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gender-radio {\n");
      out.write("                display: inline-block;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gender-radio input[type=\"radio\"] {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gender-radio input[type=\"radio\"] + label {\n");
      out.write("                background-color: #e7e7e7;\n");
      out.write("                color: black;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                transition: background-color 0.3s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .gender-radio input[type=\"radio\"]:checked + label {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .formbold-checkbox-wrapper input[type=\"checkbox\"]:checked + .formbold-checkbox-inner {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                border-color: #4CAF50;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .formbold-form-title h2 {\n");
      out.write("                font-weight: 400;\n");
      out.write("                font-size: 33px;\n");
      out.write("                line-height: 34px;\n");
      out.write("                color: #fff;\n");
      out.write("            }    \n");
      out.write("            \n");
      out.write("            .formbold-form-label {\n");
      out.write("                color: white;\n");
      out.write("                font-size: 16px;\n");
      out.write("                line-height: 24px;\n");
      out.write("                display: block;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
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
      out.write("\n");
      out.write("            .formbold-form-input::placeholder, select option, textarea::placeholder {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            span {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Styles for custom multi-select */\n");
      out.write("            .multi-select {\n");
      out.write("                position: relative;\n");
      out.write("                display: inline-block;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .multi-select-dropdown {\n");
      out.write("                 display: none;\n");
      out.write("                 position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 100%;\n");
      out.write("    max-height: 200px; /* Set the maximum height */\n");
      out.write("    overflow-y: auto; /* Enable vertical scrolling */\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("            .multi-select-dropdown.show {\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .multi-select-item {\n");
      out.write("                color: black;\n");
      out.write("                padding: 12px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: block;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .multi-select-item:hover {\n");
      out.write("                background-color: #f1f1f1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .multi-select-item.selected {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("        <header id=\"header\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div id=\"logo\" class=\"pull-left\">\n");
      out.write("                    <h1><a href=\"../index.html\" class=\"scrollto\">EcoHarbor</a></h1>\n");
      out.write("                </div>\n");
      out.write("                <nav id=\"nav-menu-container\">\n");
      out.write("                    <ul class=\"nav-menu\">\n");
      out.write("                        <li class=\"menu-active\"><a href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"#contacts\">Contact</a></li>\n");
      out.write("                        <li><a href=\"../index.html\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        ");

            if (request.getParameter("did") != null) {
                int count = 0;
                String rqstid = request.getParameter("rid");
                String delqry = "delete from tbl_requesttype where requesttype_id='" + request.getParameter("did") + "'";
                if (con.executeCommand(delqry)) {
                    String selCount = "select count(*) as cout from tbl_requesttype where request_id='" + rqstid + "'";
                    ResultSet rs = con.selectCommand(selCount);
                    if (rs.next()) {
                        count = rs.getInt("cout");
                        if (count > 0) {
                            response.sendRedirect("UserRequest.jsp");
                        } else {
                            String delQry = "delete from tbl_request where request_id='" + request.getParameter("rid") + "'";
                            if (con.executeCommand(delQry)) {
                                response.sendRedirect("UserRequest.jsp");
                            }
                        }
                    }
                }
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"formbold-main-wrapper\">\n");
      out.write("            <div class=\"formbold-form-wrapper\">\n");
      out.write("                <form method=\"post\">\n");
      out.write("                    <div class=\"formbold-form-title\">\n");
      out.write("                        <h2 align=\"center\">USER REQUEST</h2>\n");
      out.write("                    </div> \n");
      out.write("                    <label class=\"formbold-form-label\">Select Waste Type</label>\n");
      out.write("                    <div class=\"multi-select\">\n");
      out.write("                        <div class=\"multi-select-input formbold-form-input\" id=\"multiSelectInput\">Select Waste Types</div>\n");
      out.write("                        <div class=\"multi-select-dropdown\" id=\"multiSelectDropdown\">\n");
      out.write("                            ");
 
                                String selq = "select * from tbl_wastetype";
                                ResultSet rs = con.selectCommand(selq);
                                while (rs.next()) {
                            
      out.write(" \n");
      out.write("                            <div class=\"multi-select-item\" data-value=\"");
      out.print(rs.getString("wastetype_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("wastetype_name"));
      out.write("</div>\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button-container\">   \n");
      out.write("                        <button type=\"button\" id=\"add\" class=\"formbold-btn\">Submit</button>\n");
      out.write("                        <button type=\"reset\" id=\"add\" name=\"txtcancel\" class=\"formbold-btn\">Cancel</button>\n");
      out.write("                    </div>       \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>       \n");
      out.write("\n");
      out.write("        <script src=\"../Assets/JQuery/jQuery.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            document.addEventListener('DOMContentLoaded', (event) => {\n");
      out.write("                const multiSelectInput = document.getElementById('multiSelectInput');\n");
      out.write("                const multiSelectDropdown = document.getElementById('multiSelectDropdown');\n");
      out.write("                const multiSelectItems = multiSelectDropdown.getElementsByClassName('multi-select-item');\n");
      out.write("\n");
      out.write("                multiSelectInput.addEventListener('click', function() {\n");
      out.write("                    multiSelectDropdown.classList.toggle('show');\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                document.addEventListener('click', function(event) {\n");
      out.write("                    if (!multiSelectInput.contains(event.target) && !multiSelectDropdown.contains(event.target)) {\n");
      out.write("                        multiSelectDropdown.classList.remove('show');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                for (let item of multiSelectItems) {\n");
      out.write("                    item.addEventListener('click', function() {\n");
      out.write("                        item.classList.toggle('selected');\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                const logButton = document.getElementById('add');\n");
      out.write("                logButton.addEventListener('click', function() {\n");
      out.write("                    if(confirm(\"Confirm Your Payment\")) {\n");
      out.write("                        const selectedValues = [];\n");
      out.write("                        for (let item of multiSelectItems) {\n");
      out.write("                            if (item.classList.contains('selected')) {\n");
      out.write("                                selectedValues.push(item.getAttribute('data-value'));\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                        console.log('Selected values:', selectedValues);\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: \"../Assets/AjaxPages/AjaxUr.jsp\",\n");
      out.write("                            type: \"GET\",\n");
      out.write("                            data: {\n");
      out.write("                                ids: selectedValues // Pass the array here\n");
      out.write("                            },\n");
      out.write("                            traditional: true, // This ensures the array is serialized correctly\n");
      out.write("                            dataType: \"html\",\n");
      out.write("                            success: function(result) { \n");
      out.write("                                alert(result);\n");
      out.write("                                window.location = \"UserRequest.jsp\";\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    } else {\n");
      out.write("                        alert(\"Request Cancelled\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
