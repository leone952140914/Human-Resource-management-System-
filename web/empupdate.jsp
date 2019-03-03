<%-- 
    Document   :empview.jsp
    Created on : Nov 14, 2017, 9:02:33 AM
    Author     : Ruwan
--%>

<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>register</title>

        <link rel="stylesheet" type="text/css" href="style.css" media="all" />
    </head>
    <body>
        <%
     String empno = request.getParameter("empno");
%>

        <div id="header">
            <div id="logo">
                <a href="index.html"><img src="images/logo.jpg" alt="" /></a>			
            </div>		
            <ul>
                <li><a href="index.html"><span>home</span></a></li>
                <li><a href="about.html"><span>about us</span></a></li>
                <li><a href="services.html"><span>services</span></a></li>
                <li><a href="products.html"><span>products</span></a></li>
                <li  class="selected"><a href="contact.html"><span>Login</span></a></li>			
            </ul>
        </div>
        <div id="body" align="center" style="background-color:skyblue">
            
            <form method="POST">
                <br><br><br><br><br>
            <h2>Enter Employee ID</h2>
            <input type="text" name="empno" value="" />
            <input type="submit" value="Submit" />
            
            </form>
            
            <%

           
                  
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

            

            %>


                               
               
                   
            <%while (rs.next()) { %>

            <form name="form5" action="empupdate.jsp" method="POST">
            
            <table  border="0" cellpadding="6">
              <tr>      <td>Employee ID</td>
                        <td><input type="text" name="empno" value="<%= rs.getString("EmpID")%>" /></td>
                       
                   
                    </tr>

                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="fname" value="<%= rs.getString("First_name")%>" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lastname" value="<%=rs.getString("Last_name")%>" /></td>
                    </tr>
                    <tr>
                        <td>NIC no</td>
                        <td><input type="text" name="nic" value="<%=rs.getString("NIC")%>" /></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td><input type="text" name="gender" value="<%=rs.getString("Gender")%>" /></td>
                    </tr>
                    <tr>
                        <td>Mobile No </td>
                        <td><input type="text" name="telephone" value="<%=rs.getString("Telephone")%>" /></td>
                    </tr>
                    <tr>
                        <td>Section </td>
                        <td><input type="text" name="section" value="<%=rs.getString("Section")%>" /></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text"  value="<%=rs.getString("Address")%>" name="address" >
                           </td>
                    </tr>


                    <tr>
                        <td>Date of Birth</td>
                        <td><input type="date" name="dob" value="<%=rs.getString("DOB")%>"  /></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><input type="text" name="age" value="<%=rs.getString("Age")%>"  /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="email" value="<%=rs.getString("Email")%>" /></td>
                    </tr>


                    <tr>
                        <td>Profile </td>
                        <td><input type="file" name="pic" value="<%=rs.getString("PIC")%>" /></td>
                    </tr>


                    <tr>
                        <td>Degree</td>
                        <td><input type="text" name="degree" value="<%=rs.getString("Degree")%>" />
                    </tr>
                    
                    <input type="submit" value="Update Data" name="update" />

                             


            </table> </form>       

                    <% }%>
                
             
              <%   
                
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


String query = "update emp_details set EmpID='"+empno+"',First_name='"+fname+"',Last_name='"+lname+"',NIC='"+nic+"',Gender='"+gender+"',Telephone='"+tel+"',Section='"+section+"',Address='"+address+"',DOB='"+dob+"',Email='"+email+"',Age='"+age+"',PIC='"+pic+"',Degree='"+degree+"' where EmpID='"+empno+"'";
int a= stmt.executeUpdate(query);
if(a>0){
       //response.sendRedirect("booklist.jsp");
       out.print("successfully Enter The Details");
            
}

 } catch (Exception e) {
                out.println("<p> ERROR: " + e.getMessage() + "</p>");
            }      
         

            

            
                    
                    
                  
               
           
%>
  
            
            
            
            
            
            

        </div>




        




                 
             <div id="footer">
               <div>

                <p>
                    © Copyright 2016. All rights reserved.
                </p>


</div>
</div>-->
    </body>
</html>
