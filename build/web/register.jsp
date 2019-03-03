<%-- 
    Document   : register
    Created on : Nov 14, 2017, 9:02:33 AM
    Author     : Ruwan
--%>

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
        <div id="body">
            <%
              String fname=request.getParameter("fname");
                 String lname=request.getParameter("lname");
                    String nic=request.getParameter("nic");
                       String gender=request.getParameter("gender");
                          String uname=request.getParameter("uname");
                             String password=request.getParameter("password");
                                String cpassword=request.getParameter("cpassword");
                                   String email=request.getParameter("email");
                                      String address=request.getParameter("address");
                                       String role = "admin";
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                 
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
                    Statement stmt = con.createStatement();
                     
                    String query = "INSERT INTO user_details(firstname,lastname,gender,nic,address,username,password,cpassword,email) VALUES('" + fname + "','" + lname + "','" + gender + "','" + nic + "','" + address + "','" + uname + "','" +password+ "','"+cpassword+"','"+email+"')";
                    String query1 = "ïnsert into login(username,password,role)values('"+uname+"','"+password+"','"+role+"')";
                    
                    
                    int a = stmt.executeUpdate(query);
                    if (a > 0) {
                       
                        
                        
                        out.println("<p> Successfully registered with the system. You can now <a href='login.html'> Login to Pets @ Home</a></p>");
                   int b = stmt.executeUpdate(query1);
                   
                   if( b > 0){
                   
                   
                   out.print("Account create successfuly");
          
                   
                   }
                    
                    
                    
                    }else{
                    
                    
                    out.print("Account create interrupt");
                    
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
            </div>
    </body>
</html>
