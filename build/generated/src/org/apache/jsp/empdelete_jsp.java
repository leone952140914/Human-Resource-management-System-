package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class empdelete_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");

     String empno = request.getParameter("empno");

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
      out.write("        <div id=\"body\" align=\"center\" style=\"background-color:skyblue\">\n");
      out.write("            \n");
      out.write("            <form method=\"POST\">\n");
      out.write("                <br><br><br><br><br>\n");
      out.write("            <h2>Enter Employee ID</h2>\n");
      out.write("            <input type=\"text\" name=\"empno\" value=\"\" />\n");
      out.write("            <input type=\"submit\" value=\"Submit\" />\n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            ");


           
                  
                       try{  
                    
  
                    Class.forName("com.mysql.jdbc.Driver");

                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "");
                    Statement stmt = con.createStatement();
                    String query2= "select * from emp_details where EmpID='"+empno+"'";
                    
                    ResultSet rs = stmt.executeQuery(query2);
                    
                     //int a = stmt.executeUpdate(query);
               // if (a > 0) {
                   // response.sendRedirect("booklist.jsp");
               //     out.print("successfully Enter The Details");
              //  } else {

                //    out.print("wrong data You Entered");
                //}

            

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                               \n");
      out.write("               \n");
      out.write("                   \n");
      out.write("            ");
while (rs.next()) { 
      out.write("\n");
      out.write("\n");
      out.write("            <form name=\"form5\" action=\"empdelete.jsp\" method=\"POST\">\n");
      out.write("            \n");
      out.write("            <table  border=\"0\" cellpadding=\"6\">\n");
      out.write("              <tr>      <td>Employee ID</td>\n");
      out.write("                  <td><input type=\"text\" name=\"empno\" value=\"");
      out.print( rs.getString("EmpID"));
      out.write("\" disabled=\"\" /></td>\n");
      out.write("                       \n");
      out.write("                   \n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>First Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"fname\" value=\"");
      out.print( rs.getString("First_name"));
      out.write("\" disabled=\"\"  /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Last Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"lastname\" value=\"");
      out.print(rs.getString("Last_name"));
      out.write("\" disabled=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>NIC no</td>\n");
      out.write("                        <td><input type=\"text\" name=\"nic\" value=\"");
      out.print(rs.getString("NIC"));
      out.write("\" disabled=\"\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td><input type=\"text\" name=\"gender\" value=\"");
      out.print(rs.getString("Gender"));
      out.write("\" disabled=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Mobile No </td>\n");
      out.write("                        <td><input type=\"text\" name=\"telephone\" value=\"");
      out.print(rs.getString("Telephone"));
      out.write("\"disabled=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Section </td>\n");
      out.write("                        <td><input type=\"text\" name=\"section\" value=\"");
      out.print(rs.getString("Section"));
      out.write("\"disabled=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td><input type=\"text\"  value=\"");
      out.print(rs.getString("Address"));
      out.write("\" name=\"address\"disabled=\"\" >\n");
      out.write("                           </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Date of Birth</td>\n");
      out.write("                        <td><input type=\"date\" name=\"dob\" value=\"");
      out.print(rs.getString("DOB"));
      out.write("\" disabled=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Age</td>\n");
      out.write("                        <td><input type=\"text\" name=\"age\" value=\"");
      out.print(rs.getString("Age"));
      out.write("\"disabled=\"\"  /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" value=\"");
      out.print(rs.getString("Email"));
      out.write("\"disabled=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Profile </td>\n");
      out.write("                        <td><input type=\"file\" name=\"pic\" value=\"");
      out.print(rs.getString("PIC"));
      out.write("\"disabled=\"\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Degree</td>\n");
      out.write("                        <td><input type=\"text\" name=\"degree\" value=\"");
      out.print(rs.getString("Degree"));
      out.write("\" disabled=\"\"/>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <input type=\"submit\" value=\"Update Data\" name=\"update\" />\n");
      out.write("\n");
      out.write("                             \n");
      out.write("\n");
      out.write("\n");
      out.write("            </table> </form>       \n");
      out.write("\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                \n");
      out.write("             \n");
      out.write("              ");
   
                
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


String query = "delete  from emp_details where EmpID='"+empno+"'";
int a= stmt.executeUpdate(query);
if(a>0){
       //response.sendRedirect("booklist.jsp");
       out.print("successfully Enter The Details");
            
}

 } catch (Exception e) {
                out.println("<p> ERROR: " + e.getMessage() + "</p>");
            }      
         

            

            
                    
                    
                  
               
           

      out.write("\n");
      out.write("  \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                 \n");
      out.write("             <div id=\"footer\">\n");
      out.write("               <div>\n");
      out.write("\n");
      out.write("                <p>\n");
      out.write("                    © Copyright 2016. All rights reserved.\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>-->\n");
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
