<%-- 
    Document   : logout
    Created on : Nov 14, 2017, 11:35:51 PM
    Author     : Ruwan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    session.invalidate();
    response.sendRedirect("index.jsp");
%>

