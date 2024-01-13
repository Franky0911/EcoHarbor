package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Ward_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Ward</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(request.getParameter("txtsave")!=null)
            {
                if(request.getParameter("txtid").equals(""))
                {
                    String iq = "insert into tbl_ward(location_id,ward_no)values('"+request.getParameter("ddlWard")+"','"+request.getParameter("txtwardno")+"')";
                    con.executeCommand(iq);
                }
                else 
                {
                    String uq = "update tbl_ward set location_id = '"+request.getParameter("ddlWard")+"',ward_no = '"+request.getParameter("txtwardno")+"'where ward_id = '"+request.getParameter("txtid")+"'";
                    con.executeCommand(uq);
                    response.sendRedirect("Ward.jsp");                    
                }   
            }
            if(request.getParameter("did")!=null)
            {
                String dq = "delete from tbl_ward where ward_id = '"+request.getParameter("did")+"'";
                con.executeCommand(dq);
                response.sendRedirect("Ward.jsp");
            }
            String editlid="";
            String editid="";
            String editwno="";
            if(request.getParameter("eid")!=null)
            {
                String sq2 = "select*from tbl_ward where ward_id ='"+request.getParameter("eid")+"'";
                ResultSet rs2 = con.selectCommand(sq2);
                rs2.next();
                editlid = rs2.getString("location_id");
                editid = rs2.getString("ward_id");
                editwno = rs2.getString("ward_no");
            }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table border=\"3\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Location Name</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"ddlWard\">\n");
      out.write("                            <option>--select location--</option>\n");
      out.write("                    ");

                       String sq = "select*from tbl_location";
                       ResultSet rs = con.selectCommand(sq);
                       while(rs.next())
                       {
                    
      out.write("\n");
      out.write("                    <option value = \"");
      out.print(rs.getString("location_id"));
      out.write('"');
      out.write(' ');
 if(rs.getString("location_id").equals(editlid)) { out.print("selected"); } 
      out.write('>');
      out.print(rs.getString("location_name"));
      out.write("</option>\n");
      out.write("                    ");

                       }
                    
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ward Number</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtwardno\" placeholder=\"Enter Ward No\" value=\"");
      out.print(editwno);
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name = \"txtid\" value=\"");
      out.print(editid);
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" name=\"txtsave\" value=\"Save\">\n");
      out.write("                        <input type=\"reset\" name=\"txtcancel\" value=\"Cancel\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table border=\"3\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>SI.No</th>\n");
      out.write("                    <th>Location Name</th>\n");
      out.write("                    <th>Ward No</th>\n");
      out.write("                    <th>Actions</th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                       String sq1 = "select * from tbl_ward w inner join tbl_location l on w.location_id = l.location_id";
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
      out.print(rs1.getString("location_name"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs1.getString("ward_no"));
      out.write("</td>\n");
      out.write("                    <td><a href = \"Ward.jsp?did=");
      out.print(rs1.getString("ward_id"));
      out.write("\">Delete</a>|<a href = \"Ward.jsp?eid=");
      out.print(rs1.getString("ward_id"));
      out.write("\">Edit</a></td>\n");
      out.write("                </tr>   \n");
      out.write("                ");

                       }
                
      out.write("\n");
      out.write("            </table>    \n");
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
