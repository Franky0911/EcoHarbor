package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class ComplaintReply_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("    <link rel=\"stylesheet\" href=\"../Assets/CSS/shopreg.css\">\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>Transaction History</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            background: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url('../Assets/Templates/Main/img/facts-bg.jpg') no-repeat center center/cover;\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            color: white;\n");
      out.write("            flex-direction: column;\n");
      out.write("            align-items: center;\n");
      out.write("            justify-content: space-between;\n");
      out.write("        }\n");
      out.write("\n");
      out.write(".table-container {\n");
      out.write("    width: 100%;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("    margin-top: 100px;\n");
      out.write("    margin-bottom: 125px;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".table-container1 {\n");
      out.write("    width: 100%;\n");
      out.write("    display: flex;\n");
      out.write("    flex-direction: column;\n");
      out.write("    align-items: center;\n");
      out.write("    margin-top: 100px;\n");
      out.write("    margin-bottom: 125px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background-color: rgba(249, 249, 249, 0.1);\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);\n");
      out.write("            color: white;\n");
      out.write("            border: 1px solid transparent;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 12px;\n");
      out.write("            border: 1px solid transparent;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #4CAF50;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: rgba(255, 255, 255, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:hover {\n");
      out.write("            background-color: rgba(255, 255, 255, 0.2);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("            font-weight: 400;\n");
      out.write("            font-size: 33px;\n");
      out.write("            line-height: 34px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("            .choose-file-button {\n");
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
      out.write("            .formbold-main-wrapper {\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: center;\n");
      out.write("    padding: 48px;\n");
      out.write("    margin-bottom: 345px;\n");
      out.write("}\n");
      out.write(".formbold-form-wrapper {\n");
      out.write("    max-width: 600px;\n");
      out.write("    margin: auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: rgba(249, 249, 249, 0.1);\n");
      out.write("        margin-top: -25px;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
      out.write("  <header id=\"header\" >\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div id=\"logo\" class=\"pull-left\">\n");
      out.write("        <h1><a href=\"../index.html\" class=\"scrollto\">EcoHarbor</a></h1>\n");
      out.write("        <!-- Uncomment below if you prefer to use an image logo -->\n");
      out.write("        <!-- <a href=\"#intro\"><img src=\"img/logo.png\" alt=\"\" title=\"\" /></a>-->\n");
      out.write("      </div>\n");
      out.write("      <nav id=\"nav-menu-container\">\n");
      out.write("        <ul class=\"nav-menu\">\n");
      out.write("            <li class=\"menu-active\"><a href=\"HomePage.jsp\">Home</a></li>\n");
      out.write("          <li><a href=\"#contacts\">Contact</a></li>\n");
      out.write("          <li><a href=\"../index.html\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav><!-- #nav-menu-container -->\n");
      out.write("    </div>\n");
      out.write("  </header><!-- #header -->  \n");
      out.write("        ");

            String seleQry = "select * from tbl_complaint f inner join tbl_user u on f.user_id=u.user_id where f.complaint_id ='" + request.getParameter("cid") + "'";
            ResultSet ress = con.selectCommand(seleQry);
            if (ress.next()) 
            {
        
      out.write("\n");
      out.write("          <div class=\"table-container\">        \n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th>User Name</th> \n");
      out.write("                <th>Property NO</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>Complaint content</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(ress.getString("user_name"));
      out.write("</td>\n");
      out.write("                <td align=\"center\">");
      out.print(ress.getString("user_propno"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(ress.getString("complaint_date"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(ress.getString("complaint_content"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("          </div>  \n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

            String seQry = "select * from tbl_complaint f inner join tbl_agency u on f.agency_id=u.agency_id where f.complaint_id ='" + request.getParameter("cid") + "'";
            ResultSet r = con.selectCommand(seQry);
            if (r.next()) 
            {
                    
      out.write("      \n");
      out.write("            <div class=\"table-container\">  \n");
      out.write("            <table border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Agency Name</th> \n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>Complaint content</th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(r.getString("agency_name"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(r.getString("complaint_date"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(r.getString("complaint_content"));
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            </table>\n");
      out.write("                      </div>\n");
      out.write("            ");

            if(request.getParameter("btn_submit")!=null)
            {
                String uq = "update tbl_complaint set complaint_reply='"+request.getParameter("reply_content")+"', complaint_status='"+1+"' where complaint_id = '"+request.getParameter("cid")+"'";
                if(con.executeCommand(uq)){ 
      out.write("\n");
      out.write("                <script type=\"text/javascript\" >\n");
      out.write("                    alert(\"Complaint Reply Submitted\");\n");
      out.write("                    setTimeout(function() {\n");
      out.write("                    window.location.href = 'ViewComplaints.jsp'\n");
      out.write("                    }, 1000);\n");
      out.write("                </script>\n");
      out.write("            ");

                                           }
            }   
            
      out.write("   \n");
      out.write("     <div class=\"formbold-main-wrapper\">\n");
      out.write("      <div class=\"formbold-form-wrapper\">      \n");
      out.write("        <form method=\"post\" >\n");
      out.write("<div class=\"formbold-form-title\">\n");
      out.write("              <h2 align=\"center\">COMPLAINT REPLY</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"formbold-mb-3\">\n");
      out.write("            <label class=\"formbold-form-label\"> Reply</label>\n");
      out.write("            <textarea name=\"reply_content\" class=\"formbold-form-input\" rows=\"6\" cols=\"20\"></textarea>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"button-container\">   \n");
      out.write("                        <input type=\"submit\" class=\"formbold-btn\" name=\"btn_submit\" value=\"Register\">\n");
      out.write("                        <input type=\"reset\" class=\"formbold-btn\" name=\"btn_reset\" value=\"Reset\"> \n");
      out.write("                    </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("     </div>\n");
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
