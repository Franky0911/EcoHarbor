package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>User Dashboard</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        int balance = 0;
        String sel1 = "select*from tbl_user where user_id='"+session.getAttribute("uid")+"'";  
        ResultSet rsu = con.selectCommand(sel1);
        if(rsu.next())
        {
            balance = rsu.getInt("user_wallet");
            if(balance == 0)
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
      out.write("        <h1>Hello ");
      out.print(session.getAttribute("uname"));
      out.write("</h1>\n");
      out.write("        <a href=\"MyProfile.jsp\">PROFILE</a><br>\n");
      out.write("        <a href=\"Edit Profile.jsp\">EDIT PROFILE</a><br>\n");
      out.write("        <a href=\"Change Password.jsp\">CHANGE PASSWORD</a><br>\n");
      out.write("        <a href=\"UserRequest.jsp\">REQUEST</a>\n");
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
