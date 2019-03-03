<%-- 
    Document   : leveviwer
    Created on : Nov 15, 2017, 11:16:34 PM
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
              <li class="selected"><a href="leave.html"><span>Leave</span></a></li>
                 <li><a href="about.html"><span>About us</span></a></li>
                <li><a href="products.html"><span>Complain</span></a></li>
                	<li><a href="leaveViwer.jsp"><span>Leave Viwer</span></a></li>		
           
            </ul>
        </div>
        <div id="body">
            <div class="about">
                <h1>Leave Accepet</h1>
                <div>
   <h1 style="margin-left:247px; "> Leave Accepet form</h1>
        
        
        
        
        
          <div   style="padding:2px; width:867px;  height:400px;background-color: cadetblue; margin-left : -14px; font-size: 21px "> 
        
        
        
        
        <%
            
            
           
            
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
           %>
        
           
           <table  border="0" >
           
                <form name="form1" action="leaveacept.jsp" method="POST">
                
               </tr>
               <%while(rs.next()){%>
                  
               <tr>
                   <td>Employee ID</td><td><input  type="text" name="fname" value="<%=rs.getString(10)%>" size="100" disabled="" /></td>
           </tr>
           

               <tr>
                   <td>First Name</td><td><input  type="text" name="fname" value="<%=rs.getString(1)%>" size="100" disabled="" /></td>
           </tr>
           <tr>
                   <td>Last Name</td><td><input  type="text" name="lname" value="<%=rs.getString(2)%>" size="100" disabled="" /></td>
           </tr>
           <tr>
                   <td>NIC No</td><td><input  type="text" name="nic" value="<%=rs.getString(3)%>" size="100" disabled="" /></td>
           </tr>
           <tr>
                   <td>Section</td><td><input  type="text" name="sec" value="<%=rs.getString(4)%>" size="100" disabled="" /></td>
           </tr>
            <tr>
                   <td>Start Date Of Leave </td><td><input  type="text" name="start" value="<%=rs.getString(6)%>" size="100" disabled="" /></td>
           </tr>
           
            <tr>
               <td>End Date Of Leave</td><td><input  type="text" name="end" value="<%=rs.getString(7)%>" size="100" disabled="" /></td>
           </tr>
           
           <tr>
                
              <td>Request Date</td><td><input  type="text" name="date" value="<%=rs.getString(8)%>" size="100" disabled="" /></td>
         
           </tr>
           
           
           
           <tr>
                   <td>Reason</td><td><textarea name="recent" value="<%=rs.getString(5)%>" rows="4" cols="20" disabled=""> </textarea></td>
           </tr>
          
          
           
           <tr>
                      
               <td></td><td>  <tr><td>Admin Accept</td><td>
               
                   <select name="acc">
                    
                      <option value ="accept" >Accept</option>
                      <option value ="reject">Reject</option>
        
           </select><br></td></tr></td>
        <td><input type="submit" value="Save" name="save" /></td>
           </tr>
          

         
           
                                                                              
         
           
           <%
               
               
           nic2 = rs.getString(3);
      admin = request.getParameter("acc");
                 


      
      %>
           
             <% }%>
         
           
             <%
             
            
           
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
           
          
             
          
             %>
             
               </div>  
                
            
            </div>
            
               </form>
           </table>
             <div>
                    <p>&copy Copyright 2012. All rights reserved</p>
                </div>
    </body>
</html>
