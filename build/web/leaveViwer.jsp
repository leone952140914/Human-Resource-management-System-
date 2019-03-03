<%-- 
    Document   : leaveViwer
    Created on : Nov 18, 2017, 6:54:35 AM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>HR Mnagement</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="all" />
    </head>
    <body>
        <div id="header">
            <div id="logo">
                <a href="index.html"><img src="images/logo.jpg" alt="" /></a>		
            </div>		
            <ul>
                <li><a href="index2.jsp"><span>Home</span></a></li>
              <li ><a href="leave.html"><span>Leave</span></a></li>
                 <li><a href="about.html"><span>About us</span></a></li>
                <li><a href="products.html"><span>Complain</span></a></li>
                <li  class="selected"><a href="leaveViwer.jsp"><span>Leave Viwer</span></a></li>			
           
            </ul>
        </div>
         <div id="body">
            <div class="about">
                <h1>Leave</h1>
                <div>
   <h1 style="margin-left:344px; "> Leave  Viewer </h1>
         <div   style="padding:2px; width:1020px;  height:452px;background-color: #aeaeae; margin-left : -50px; font-size: 21px "> 
        
        
        
       
       <%
        String id  =  session.getAttribute("uid").toString();
       try{
       
        Class.forName("com.mysql.jdbc.Driver");
       Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","");
      
      Statement stmt = con.createStatement();
      String query = "select  * from leavereq where empid = '"+id+"' ";
         ResultSet rs = stmt.executeQuery(query);
    %>
       
      
      
       <table  border="1" style="border-style: ridge;">
           
           
                <th> Employee ID</th>
               <th> First Name</th>
                <th> Last Name</th>
                <th> Nic No</th>
                <th>Section</th>
                <th>Rrequest Date</th>
                <th>Start Of leave </th>
                <th> End of leave</th>
                 <th> Number of Leave date</th>
                 <th>Reson</th>
                  <th>Admin Acept</th>
               
            <% while(rs.next()){%>
           
           <tr>
                    <td><%= rs.getString(11)%></td>
               <td><%= rs.getString(1)%></td>
               <td><%= rs.getString(2)%></td>
                <td><%= rs.getString(3)%></td>
                <td><%= rs.getString(6)%></td>
                 <td><%= rs.getString(4)%></td>
            `     <td><%= rs.getString(8)%></td>
                  <td><%= rs.getString(9)%></td>
                   <td><%= rs.getString(5)%></td>
                   <td><%= rs.getString(7)%></td>
                    <td><%= rs.getString(10)%></td>
               </tr>
   <% }%>
     
       
                      

            
     
       
      <% }catch(Exception e){
       
       
       
       out.print(""+e.getMessage());
       
       
       
       }%>
       
       
       
       
       
     
         </table>
        
        
       </div>   


                <div>
                    <p>&copy Copyright 2012. All rights reserved</p>
                </div>
            </div>
    </body>
</html>