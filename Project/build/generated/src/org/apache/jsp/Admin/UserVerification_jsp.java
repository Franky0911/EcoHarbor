package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class UserVerification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>EcoHarbor:User Verification</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

          if(request.getParameter("aid")!=null)
          {
              String uq = "update tbl_user set user_status ='2' where user_id = '"+request.getParameter("aid")+"'";
              con.executeCommand(uq);
          }
          if(request.getParameter("rid")!=null)
          {
              String uq1 = "update tbl_user set user_status = '3' where user_id = '"+request.getParameter("rid")+"'";
              con.executeCommand(uq1);
          }
        
      out.write("\n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th>SI.No</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Contact</th>\n");
      out.write("                <th>Photo</th>\n");
      out.write("                <th>Adhar Proof</th>\n");
      out.write("                <th>Property No</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                       String sq = "select * from tbl_user";
                       ResultSet rs = con.selectCommand(sq);
                       int i=0;
                       while(rs.next())
                       {
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
      out.print(rs.getString("user_photo"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("user_proof"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString("user_propno"));
      out.write("</td>\n");
      out.write("                    <td><a href = \"UserVerification.jsp?aid=");
      out.print(rs.getString("user_id"));
      out.write("\">Accept</a>|<a href = \"UserVerification.jsp?rid=");
      out.print(rs.getString("user_id"));
      out.write("\">Reject</a></td>\n");
      out.write("                    <td>");

                    if(rs.getString("user_status").equals("0"))
                    {
                        out.println("User Profile is not listed");
                    }
                    if(rs.getString("user_status").equals("1"))
                    {
                        out.println("User Profile is Listed");
                    }
                    if(rs.getString("user_status").equals("2"))
                    {
                        out.println("User Profile is Accepted");
                    }
                    if(rs.getString("user_status").equals("3"))
                    {
                        out.println("User Profile is Rejected");
                    }
                    
      out.write("</td>\n");
      out.write("                </tr>   \n");
      out.write("                ");

                       }
                
      out.write("\n");
      out.write("        </table>\n");
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
