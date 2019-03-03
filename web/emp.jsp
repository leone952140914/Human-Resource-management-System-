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
                String uname = request.getParameter("uname");
                String email = request.getParameter("email");
                String pic = request.getParameter("pic");
                String degree=request.getParameter("degree");
                String role = "employee";
                String password = request.getParameter("password");
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
                    String query1 = "insert into login (username,password,role,id,)values('"+uname+"','"+password+"','"+role+"','"+empno+"')";
                    int a = stmt.executeUpdate(query);
                    if (a > 0) {
                       //
                       out.println("<p> Successfully registered </p>");
                       
                    }else{
                        out.println("<p>unSuccessfull</p>");
                    }

                } catch (Exception e) {
                     out.print("" + e.getMessage());
                e.printStackTrace();
                }

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
