package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class emp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <title>register</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" media=\"all\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"index.html\"><img src=\"images/logo.jpg\" alt=\"\" /></a>\t\t\t\n");
      out.write("            </div>\t\t\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"index.html\"><span>home</span></a></li>\n");
      out.write("                <li><a href=\"about.html\"><span>about us</span></a></li>\n");
      out.write("                <li><a href=\"services.html\"><span>services</span></a></li>\n");
      out.write("                <li><a href=\"products.html\"><span>products</span></a></li>\n");
      out.write("                <li  class=\"selected\"><a href=\"contact.html\"><span>Login</span></a></li>\t\t\t\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("            ");

                 if (request.getParameter("empno") != null) {
                String empno = request.getParameter("empno");
                String fname = request.getParameter("fname");
                String lname = request.getParameter("lastname");
                String nic = request.getParameter("nic");
                String gender = request.getParameter("gender");
                String tel = request.getParameter("telephone");
                String section = request.getParameter("section");
                String address = request.getParameter("address");
                String dob = request.getParameter("dob");
                
                String age = request.getParameter("age");
                String email = request.getParameter("email");
                String pic = request.getParameter("pic");
                String degree=request.getParameter("degree");
                
                
                char c = 'M';

            if (gender.equals("male")) {
                c = 'M';
            } else {
                c = 'F';
            }
                

                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "");
                    Statement stmt = con.createStatement();
                    String query = "INSERT INTO emp_details (EmpID,First_name,Last_name,NIC,Gender,Telephone,Section,Address,DOB,Age,Email,PIC,Degree) VALUES('" + empno + "','" + fname + "','" + lname + "','" + nic + "','" + gender + "','" + tel + "','" + section + "','" + address + "','" + dob+ "','"+age+"','"+email+"','"+pic+"','"+degree+"')";
                    int a = stmt.executeUpdate(query);
                    if (a > 0) {
                        out.println("<p> Successfully registered </p>");
                    }else{
                        out.println("<p>unSuccessfull</p>");
                    }

                } catch (Exception e) {
                     out.print("" + e.getMessage());
                e.printStackTrace();
                }

                 }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <div>\n");
      out.write("\n");
      out.write("                <p>\n");
      out.write("                    © Copyright 2016. All rights reserved.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
