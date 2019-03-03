<%-- 
    Document   : register
    Created on : Nov 14, 2017, 9:02:33 AM
    Author     : Ruwan
--%>

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
        <div id="body" >
            <%
                   
        
            
            
             String username=  request.getParameter("username");
             String password = request.getParameter("password");
             
       try{
          
       Class.forName("com.mysql.jdbc.Driver");
       Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
      
      Statement stmt = con.createStatement();
       
       String query = "select * from user_details where username ='"+username+"' and password = '"+password+"' ";
       
       ResultSet rs = stmt.executeQuery(query);
       
        if(rs.next()){
                //session.set if(rs.next()){
               // session.set if(rs.next()){
                session.setAttribute("uid", rs.getString("id"));
                response.sendRedirect("index.jsp?user="+rs.getString("username")); 
                }
        
                else{
                out.println("<p> Invalid Login, Try with Correct Username and Password </p>");
                }
       
       
     
       }catch(Exception e){
       
            out.println(e.getMessage());

       
       
       
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
