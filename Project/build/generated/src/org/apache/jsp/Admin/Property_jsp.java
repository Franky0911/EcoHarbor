package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class Property_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Property</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if(request.getParameter("txtsave")!=null)
            {
                if(request.getParameter("txtid").equals(""))
                {
                    String iq = "insert into tbl_property(ward_id,property_no,property_oname)values('"+request.getParameter("ddlWard")+"','"+request.getParameter("txtprop")+"','"+request.getParameter("txtown")+"')";
                    con.executeCommand(iq);
                }
                else 
                {
                    String uq = "update tbl_property set ward_id = '"+request.getParameter("ddlWard")+"',property_no = '"+request.getParameter("txtprop")+"'where property_id = '"+request.getParameter("txtid")+"',property_oname = '"+request.getParameter("txtown")+"'where property_id = '"+request.getParameter("txtid")+"'";
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
            
        
      out.write("        \n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table align=\"center\" border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Property No</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtprop\" required value=\"");
      out.print(editpno);
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name = \"txtid\" value=\"");
      out.print(editid);
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Ward No</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"ddlWard\" required> \n");
      out.write("                            <option>--select ward--</option>\n");
      out.write("                            ");

                                String sel = "select*from tbl_ward";  

                                ResultSet rs = con.selectCommand(sel); 

                                while (rs.next()) 
                                {
                            
      out.write("\n");
      out.write("                            <option value = \"");
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
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Property Ownername</td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"txtown\" required value=\"");
      out.print(editown);
      out.write("\">\n");
      out.write("                        <input type=\"hidden\" name = \"txtid\" value=\"");
      out.print(editid);
      out.write("\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\" colspan=\"2\">\n");
      out.write("                        <input type=\"submit\" name=\"txtsave\" value=\"Submit\">\n");
      out.write("                        <input type=\"reset\" name=\"txtcancel\" value=\"Cancel\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table border=\"1\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>SI.No</th>\n");
      out.write("                    <th>Property No</th>\n");
      out.write("                    <th>Ward No</th>\n");
      out.write("                    <th>Owner Name</th>\n");
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
      out.write("                    <td><a href = \"Property.jsp?did=");
      out.print(rs1.getString("property_id"));
      out.write("\">Delete</a>|<a href = \"Property.jsp?eid=");
      out.print(rs1.getString("property_id"));
      out.write("\">Edit</a></td>\n");
      out.write("                </tr>   \n");
      out.write("                ");

                       }
                
      out.write("\n");
      out.write("            </table>                        \n");
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
