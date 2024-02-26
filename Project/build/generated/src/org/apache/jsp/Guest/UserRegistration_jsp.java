package org.apache.jsp.Guest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class UserRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>User Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" enctype=\"multipart/form-data\" action=\"../Assets/ActionPages/UserUploadAction.jsp\">\n");
      out.write("            <table border=\"3\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtname\" placeholder=\"Enter Name\" title=\"Name Allows Only Alphabets,Spaces and First Letter Must Be Capital Letter\" pattern=\"^[A-Z]+[a-zA-Z ]*$\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtcontact\" placeholder=\"Enter Contact No\" title=\"Phone number with 7-9 and remaing 9 digit with 0-9\" pattern=\"[7-9]{1}[0-9]{9}\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"email\" name=\"txtemail\" placeholder=\"Enter Email-Id\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender</td>\n");
      out.write("                    <td>\n");
      out.write("                        Male<input type=\"radio\" name=\"txtfe\" value=\"Male\" required>\n");
      out.write("                        Female<input type=\"radio\" name=\"txtfe\" value=\"Female\">\n");
      out.write("                        Others<input type=\"radio\" name=\"txtfe\" value=\"Others\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Photo</td>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        <input type=\"file\" name=\"file_photo\" required>\n");
      out.write("                    </td>   \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Adhar Proof</td>\n");
      out.write("                    <td align=\"center\">\n");
      out.write("                        <input type=\"file\" name=\"file_proof\" required>\n");
      out.write("                    </td>   \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Property No</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txthno\"placeholder=\"Enter Property No\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Location</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"ddlLoc\" onchange = \"getWard(this.value)\" required> <!--Here onchange triggers the function getWard()-->\n");
      out.write("                            <option>--select location--</option>\n");
      out.write("                            ");

                                String sel = "select*from tbl_location";  /*Here data from table location is fecthed*/

                                ResultSet rs = con.selectCommand(sel); /*Here there select query is exectued into ResultSet array*/

                                while (rs.next()) /*Using while loop we iterate every values in the array and pass the value into Drop down list*/ {
                            
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(rs.getString("location_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("location_name"));
      out.write("</option> <!--Values from -->\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ward</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"ddlWard\" id = \"selward\" required> <!--Here we create an id for the Ward Drop down List -->\n");
      out.write("                            <option>--select Ward--</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td>\n");
      out.write("                        <textarea name=\"address\" placeholder=\"Enter Address\" required></textarea>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"password\" name=\"txtpsswd\" placeholder=\"Enter Password\" title=\"Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters\" pattern=\"(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Confirm Password</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"password\" name=\"txtcpsswd\" placeholder=\"ReEnter Password\" required>\n");
      out.write("                    </td>\n");
      out.write("                </tr>         \n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"txtsave\" value=\"Save\">\n");
      out.write("                        <input type=\"reset\" name=\"txtcancel\" value=\"Cancel\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"../Assets/JQuery/jQuery.js\"></script> <!--The jQuery (Javascript Library) file in the specified directory is being processed here-->         \n");
      out.write("    <script>\n");
      out.write("                            function getWard(wid) /*Here the function is being defined were parameter is being passed*/\n");
      out.write("                            {\n");
      out.write("\n");
      out.write("                                //  alert(wid);  \n");
      out.write("                                $.ajax({url: \"../Assets/AjaxPages/AjaxWard.jsp?wid=\" + wid, /*Here we use the $.ajax for passing the parameter value into the ajaxward file*/\n");
      out.write("                                    success: function(result) { /*If the function is invoked successfully*/\n");
      out.write("                                        $(\"#selward\").html(result); /*We pass the value into the Ward drop down list using its drop down list id*/\n");
      out.write("                                    }\n");
      out.write("                                })\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("    </script>\n");
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
