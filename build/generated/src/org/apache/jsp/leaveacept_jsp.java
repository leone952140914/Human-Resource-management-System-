package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class leaveacept_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("              <li class=\"selected\"><a href=\"leave.html\"><span>Leave</span></a></li>\n");
      out.write("                 <li><a href=\"about.html\"><span>About us</span></a></li>\n");
      out.write("                <li><a href=\"products.html\"><span>Complain</span></a></li>\n");
      out.write("                \t<li><a href=\"leaveViwer.jsp\"><span>Leave Viwer</span></a></li>\t\t\n");
      out.write("           \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"body\">\n");
      out.write("            <div class=\"about\">\n");
      out.write("                <h1>Leave Accepet</h1>\n");
      out.write("                <div>\n");
      out.write("   <h1 style=\"margin-left:247px; \"> Leave Accepet form</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <div   style=\"padding:2px; width:867px;  height:400px;background-color: cadetblue; margin-left : -14px; font-size: 21px \"> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            
            
           
            
                String ac = "";
                String nic2="";
                String admin = "";
         
             
       Class.forName("com.mysql.jdbc.Driver");
       Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
      
      Statement stmt = con.createStatement();
      String query = "select firstname,lastname,nic,section,rection,stleve,enleve,date,acept,empid from leavereq where acept = 'pending'   limit 1  ";
         ResultSet rs = stmt.executeQuery(query);
        
//if(!(rs.first())){
 // out.println("Today No leave");
//}
           
      out.write("\n");
      out.write("        \n");
      out.write("           \n");
      out.write("           <table  border=\"0\" >\n");
      out.write("           \n");
      out.write("                <form name=\"form1\" action=\"leaveacept.jsp\" method=\"POST\">\n");
      out.write("                \n");
      out.write("               </tr>\n");
      out.write("               ");
while(rs.next()){
      out.write("\n");
      out.write("                  \n");
      out.write("               <tr>\n");
      out.write("                   <td>Employee ID</td><td><input  type=\"text\" name=\"fname\" value=\"");
      out.print(rs.getString(10));
      out.write("\" size=\"100\" disabled=\"\" /></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td>First Name</td><td><input  type=\"text\" name=\"fname\" value=\"");
      out.print(rs.getString(1));
      out.write("\" size=\"100\" disabled=\"\" /></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("                   <td>Last Name</td><td><input  type=\"text\" name=\"lname\" value=\"");
      out.print(rs.getString(2));
      out.write("\" size=\"100\" disabled=\"\" /></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("                   <td>NIC No</td><td><input  type=\"text\" name=\"nic\" value=\"");
      out.print(rs.getString(3));
      out.write("\" size=\"100\" disabled=\"\" /></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("                   <td>Section</td><td><input  type=\"text\" name=\"sec\" value=\"");
      out.print(rs.getString(4));
      out.write("\" size=\"100\" disabled=\"\" /></td>\n");
      out.write("           </tr>\n");
      out.write("            <tr>\n");
      out.write("                   <td>Start Date Of Leave </td><td><input  type=\"text\" name=\"start\" value=\"");
      out.print(rs.getString(6));
      out.write("\" size=\"100\" disabled=\"\" /></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("            <tr>\n");
      out.write("               <td>End Date Of Leave</td><td><input  type=\"text\" name=\"end\" value=\"");
      out.print(rs.getString(7));
      out.write("\" size=\"100\" disabled=\"\" /></td>\n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("                \n");
      out.write("              <td>Request Date</td><td><input  type=\"text\" name=\"date\" value=\"");
      out.print(rs.getString(8));
      out.write("\" size=\"100\" disabled=\"\" /></td>\n");
      out.write("         \n");
      out.write("           </tr>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("                   <td>Reason</td><td><textarea name=\"recent\" value=\"");
      out.print(rs.getString(5));
      out.write("\" rows=\"4\" cols=\"20\" disabled=\"\"> </textarea></td>\n");
      out.write("           </tr>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("                      \n");
      out.write("               <td></td><td>  <tr><td>Admin Accept</td><td>\n");
      out.write("               \n");
      out.write("                   <select name=\"acc\">\n");
      out.write("                    \n");
      out.write("                      <option value =\"accept\" >Accept</option>\n");
      out.write("                      <option value =\"reject\">Reject</option>\n");
      out.write("        \n");
      out.write("           </select><br></td></tr></td>\n");
      out.write("        <td><input type=\"submit\" value=\"Save\" name=\"save\" /></td>\n");
      out.write("           </tr>\n");
      out.write("          \n");
      out.write("\n");
      out.write("         \n");
      out.write("           \n");
      out.write("                                                                              \n");
      out.write("         \n");
      out.write("           \n");
      out.write("           ");

               
               
           nic2 = rs.getString(3);
      admin = request.getParameter("acc");
                 


      
      
      out.write("\n");
      out.write("           \n");
      out.write("             ");
 }
      out.write("\n");
      out.write("         \n");
      out.write("           \n");
      out.write("             ");

             
            
           
              if(admin!=null){
              response.sendRedirect("leaveacept.jsp");
              String query2 = "UPDATE leavereq  SET  acept  =   '"+admin+"'  WHERE  nic = '"+nic2+"' "; 

         
             try{
               Statement st = con.createStatement();
           st.executeUpdate(query2);
               
              
             }catch(Exception e){
                 out.print(""+e.getMessage());
               
                 
             }
                          
              } else{
        
              
              
              
              }
           
          
             
          
             
      out.write("\n");
      out.write("             \n");
      out.write("               </div>  \n");
      out.write("                \n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("               </form>\n");
      out.write("           </table>\n");
      out.write("             <div>\n");
      out.write("                    <p>&copy Copyright 2012. All rights reserved</p>\n");
      out.write("                </div>\n");
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
