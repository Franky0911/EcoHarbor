package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Edit_0020Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(request.getParameter("txtupdate")!=null)
            {
                    String uq = "update tbl_user set user_name = '"+request.getParameter("txtname")+"',user_contact = '"+request.getParameter("txtcontact")+"',user_email = '"+request.getParameter("txtemail")+"',user_address = '"+request.getParameter("txtaddress")+"'where user_id = '"+session.getAttribute("uid")+"'";
                    con.executeCommand(uq);
                    response.sendRedirect("Edit Profile.jsp");    
            } 
            String editname="";
            String editcontact="";
            String editemail="";
            String editaddress="";
            String sq2 = "select*from tbl_user where user_id ='"+session.getAttribute("uid")+"'";
            ResultSet rs2 = con.selectCommand(sq2);
            rs2.next();
            editname = rs2.getString("user_name");
            editcontact = rs2.getString("user_contact");
            editemail = rs2.getString("user_email");
            editaddress = rs2.getString("user_address");
                        
        
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table border=\"3\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.print(editname);
      out.write("\" name=\"txtname\" placeholder=\"Enter name\" title=\"Name Allows Only Alphabets,Spaces and First Letter Must Be Capital Letter\" pattern=\"^[A-Z]+[a-zA-Z ]*$\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" value=\"");
      out.print(editcontact);
      out.write("\" name=\"txtcontact\" placeholder=\"Enter Contact No\" title=\"Phone number with 7-9 and remaing 9 digit with 0-9\" pattern=\"[7-9]{1}[0-9]{9}\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>    \n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"email\" value=\"");
      out.print(editemail);
      out.write("\" name=\"txtemail\" placeholder=\"Enter Email-Id\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>   \n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td>\n");
      out.write("                        <textarea name=\"txtaddress\" placeholder=\"Enter Address\" required>");
      out.print(editaddress);
      out.write("</textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" name=\"txtupdate\" value=\"Update\">\n");
      out.write("                        <input type=\"reset\" name=\"txtreset\" value=\"Cancel\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>   \n");
      out.write("            </table>\n");
      out.write("        </form>   \n");
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
