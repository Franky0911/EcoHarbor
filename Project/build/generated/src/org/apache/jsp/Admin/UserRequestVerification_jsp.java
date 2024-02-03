package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class UserRequestVerification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>User Request Verification</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

          if(request.getParameter("aid")!=null)
          {
              String uq = "update tbl_request set request_status ='1' where user_id = '"+request.getParameter("aid")+"'";
              con.executeCommand(uq);
          }
          if(request.getParameter("rid")!=null)
          {
              String uq1 = "update tbl_request set request_status = '2' where user_id = '"+request.getParameter("rid")+"'";
              con.executeCommand(uq1);
          }
        
      out.write("        \n");
      out.write("    <form method=\"post\">    \n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("                <th>SI.No</th>\n");
      out.write("                <th>User Id</th>\n");
      out.write("                <th>User Request Date</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                String sel="select*from tbl_request";
                ResultSet rs = con.selectCommand(sel);
                int i=0;
                while(rs.next())
                {
                    i++;
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("user_id"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("request_date"));
      out.write("</td>\n");
      out.write("                <td><a href = \"UserRequestVerification.jsp?aid=");
      out.print(rs.getString("user_id"));
      out.write("\">Accept</a>|<a href = \"UserRequestVerification.jsp?rid=");
      out.print(rs.getString("user_id"));
      out.write("\">Reject</a></td>\n");
      out.write("                <td>\n");
      out.write("                    ");

                    if(rs.getString("request_status").equals("0"))
                    {
                        out.println("User has requested");
                    }
                    if(rs.getString("request_status").equals("1"))
                    {
                        out.println("User Request is Accepted");
                    }
                    if(rs.getString("request_status").equals("2"))
                    {
                        out.println("User Request is Rejected");
                    }
                    
      out.write("\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
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
