package org.apache.jsp.Agency;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class AssignRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"POST\">\n");
      out.write("               <table  border=\"2\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>Sl no</th>\n");
      out.write("                    <th>Name</th>\n");
      out.write("                    <th>Contact</th>\n");
      out.write("                    <th>Property No</th>\n");
      out.write("                     <th>Ward No</th>\n");
      out.write("                    <th>Location</th>\n");
      out.write("                    <th>Waste type</th>\n");
      out.write("                     ");

                    String sel = "select*from tbl_request  w inner join tbl_user l on l.user_id=w.user_id  inner join tbl_ward d on l.ward_id=d.ward_id inner join tbl_location e on d.location_id=e.location_id where request_status =1";
                    ResultSet rs = con.selectCommand(sel);
                    int i = 0;
                    while(rs.next()) {
                    String selQ = "select * from tbl_requesttype b inner join tbl_wastetype c on b.wastetype_id=c.wastetype_id where request_id='"+rs.getString("request_id")+"'";
                    ResultSet rs1 = con.selectCommand(selQ);
                        
                        i++;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("user_name"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("user_contact"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("user_propno"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("ward_no"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("location_name"));
      out.write("</td>\n");
      out.write("                   \n");
      out.write("                    <td>");

                    while(rs1.next())
                    {
                        out.println(rs1.getString("wastetype_name")+"<br>");
                    }
                    
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
