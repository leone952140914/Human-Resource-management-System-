package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class leaveViwer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>HR Mnagement</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"index.html\"><img src=\"images/logo.jpg\" alt=\"\" /></a>\t\t\n");
      out.write("            </div>\t\t\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index2.jsp\"><span>Home</span></a></li>\n");
      out.write("              <li ><a href=\"leave.html\"><span>Leave</span></a></li>\n");
      out.write("                 <li><a href=\"about.html\"><span>About us</span></a></li>\n");
      out.write("                <li><a href=\"products.html\"><span>Complain</span></a></li>\n");
      out.write("                <li  class=\"selected\"><a href=\"leaveViwer.jsp\"><span>Leave Viwer</span></a></li>\t\t\t\n");
      out.write("           \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("         <div id=\"body\">\n");
      out.write("            <div class=\"about\">\n");
      out.write("                <h1>Leave</h1>\n");
      out.write("                <div>\n");
      out.write("   <h1 style=\"margin-left:344px; \"> Leave  Viewer </h1>\n");
      out.write("         <div   style=\"padding:2px; width:1020px;  height:452px;background-color: #aeaeae; margin-left : -50px; font-size: 21px \"> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("       ");

        String id  =  session.getAttribute("uid").toString();
       try{
       
        Class.forName("com.mysql.jdbc.Driver");
       Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
      
      Statement stmt = con.createStatement();
      String query = "select  * from leavereq where empid = '"+id+"' ";
         ResultSet rs = stmt.executeQuery(query);
    
      out.write("\n");
      out.write("       \n");
      out.write("      \n");
      out.write("      \n");
      out.write("       <table  border=\"1\" style=\"border-style: ridge;\">\n");
      out.write("           \n");
      out.write("           \n");
      out.write("                <th> Employee ID</th>\n");
      out.write("               <th> First Name</th>\n");
      out.write("                <th> Last Name</th>\n");
      out.write("                <th> Nic No</th>\n");
      out.write("                <th>Section</th>\n");
      out.write("                <th>Rrequest Date</th>\n");
      out.write("                <th>Start Of leave </th>\n");
      out.write("                <th> End of leave</th>\n");
      out.write("                 <th> Number of Leave date</th>\n");
      out.write("                 <th>Reson</th>\n");
      out.write("                  <th>Admin Acept</th>\n");
      out.write("               \n");
      out.write("            ");
 while(rs.next()){
      out.write("\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("                    <td>");
      out.print( rs.getString(11));
      out.write("</td>\n");
      out.write("               <td>");
      out.print( rs.getString(1));
      out.write("</td>\n");
      out.write("               <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                <td>");
      out.print( rs.getString(6));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("            `     <td>");
      out.print( rs.getString(8));
      out.write("</td>\n");
      out.write("                  <td>");
      out.print( rs.getString(9));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print( rs.getString(7));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( rs.getString(10));
      out.write("</td>\n");
      out.write("               </tr>\n");
      out.write("   ");
 }
      out.write("\n");
      out.write("     \n");
      out.write("       \n");
      out.write("                      \n");
      out.write("\n");
      out.write("            \n");
      out.write("     \n");
      out.write("       \n");
      out.write("      ");
 }catch(Exception e){
       
       
       
       out.print(""+e.getMessage());
       
       
       
       }
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
      out.write("     \n");
      out.write("         </table>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <p>&copy Copyright 2012. All rights reserved</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
