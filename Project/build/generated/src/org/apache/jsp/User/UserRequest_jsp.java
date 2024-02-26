package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class UserRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>User Request</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String req = "";
            int Wamount = 0;
            int Samount = 0;
            String clr[] = request.getParameterValues("ddlwst");
            if (request.getParameter("txtsave") != null) {
                String insqry = "insert into tbl_request(user_id,request_date)values('" + session.getAttribute("uid") + "',curdate())";
                con.executeCommand(insqry);
                String sel = "select max(request_id) as id from tbl_request";
                ResultSet rs1 = con.selectCommand(sel);
                rs1.next();
                req = rs1.getString("id");
                for (int i = 0; i < clr.length; i++) {
                    String upq = "select*from tbl_wastetype where wastetype_id = '" + clr[i] + "'";
                    ResultSet r = con.selectCommand(upq);
                    r.next();
                    Wamount = r.getInt("wastetype_rate");
                    Samount = Samount + Wamount;
                    String iq = "insert into tbl_requesttype(request_id,wastetype_id)values('" + req + "','" + clr[i] + "')";
                    con.executeCommand(iq);
                }
                String uq = "update tbl_request set request_minimumamount = '" + Samount + "' where user_id = '" + session.getAttribute("uid") + "'";
                con.executeCommand(uq);
                response.sendRedirect("Payment1.jsp?reqid="+ req +"&Samt=" +Samount);

            }
            if (request.getParameter("did") != null) {
                int count = 0;
                String rqstid = request.getParameter("rid");//request id is placed into a variable
                String delqry = "delete from tbl_requesttype where requesttype_id='" + request.getParameter("did") + "'";//code for deletting wastetype
                if (con.executeCommand(delqry)) {//delete query execute aya if
                    String selCount = "select count(*) as cout from tbl_requesttype where request_id='" + rqstid + "'";//counting data in tbl_requesttype
                    ResultSet rs = con.selectCommand(selCount);
                    if (rs.next()) {
                        count = rs.getInt("cout");//tbl_requesttype ill olla no of data eduth count ill vech
                        if (count > 0) {//1 ill kuduthal data ondakki onnum sambavikkilla
                            response.sendRedirect("UserRequest.jsp");
                        } else {//tbl_requesttype ill data illakki tbl_request ille data delete avum
                            String delQry = "delete from tbl_request where request_id='" + request.getParameter("rid") + "'";
                            if (con.executeCommand(delQry)) {
                                response.sendRedirect("UserRequest.jsp");
                            }
                        }

                    }
                }
            }
            
        
      out.write("\n");
      out.write("        <form method=\"post\">\n");
      out.write("            <table border=2 align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>WasteType</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"ddlwst\" multiple>\n");
      out.write("                            ");
  String selq = "select*from tbl_wastetype";
                                ResultSet rs = con.selectCommand(selq);

                                while (rs.next()) {
                            
      out.write("\n");
      out.write("                            <option value = \"");
      out.print(rs.getString("wastetype_id"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("wastetype_name"));
      out.write("</option>\n");
      out.write("                            ");

                                }

                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" align=\"center\">\n");
      out.write("                        <input type=\"submit\" name=\"txtsave\" value=\"Submit\">\n");
      out.write("                        <input type=\"reset\" name=\"txtcancel\" value=\"Cancel\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <table border=\"2\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>SL NO</td>\n");
      out.write("                    <td>Waste type</td>\n");
      out.write("                    <td>Request Date</td>\n");
      out.write("                    <td>Action</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
                    String in = "select*from tbl_request w inner join tbl_requesttype l on l.request_id=w.request_id inner join tbl_wastetype t on l.wastetype_id = t.wastetype_id where user_id ='" + session.getAttribute("uid") + "'";
                    ResultSet rs2 = con.selectCommand(in);
                    int i = 0;

                    while (rs2.next()) {
                        i++;
                
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs2.getString("wastetype_name"));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs2.getString("request_date"));
      out.write("</td>\n");
      out.write("                    <td><a href=\"UserRequest.jsp?did=");
      out.print(rs2.getString("requesttype_id"));
      out.write("&rid=");
      out.print(rs2.getString("request_id"));
      out.write("\">delete</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
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
