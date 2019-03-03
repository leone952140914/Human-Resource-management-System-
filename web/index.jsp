<%-- 
    Document   : index.html
    Created on : Nov 15, 2017, 12:01:15 AM
    Author     : Ruwan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Template by freewebsitetemplates.com -->
<html>
    <head>
        <meta charset="utf-8" />
        <title>Business Solutions</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="all" />
    </head>
    <body>
        <div id="header">
            <div id="logo">
                <a href="index.html"><img src="images/logo.jpg" alt="" /></a>		
            </div>		
            <ul>
                <li class="selected"><a href="index.jsp"><span>home</span></a></li>
                <li><a href="leave.html"><span>Leave Accept</span></a></li>
                <li><a href="services.html"><span>Employee</span></a></li>
                <li><a href="products.html"><span>products</span></a></li>
                <% if(session.getAttribute("uid") != null){%>
                <li><a href="logout.jsp"><span>LogOut</span></a></li>	
                <%}else{%>
                <li><a href="contact.html"><span>LogIn</span></a></li>	
                <%}%>
            </ul>
        </div>
        <div id="body">
            <div class="header">
                <div>
                    <ul>
                        <li><img src="images/discuss.jpg" alt="" /></li>	
                        <li><img src="images/flags.jpg" alt="" /></li>
                        <li><img src="images/graph.jpg" alt="" /></li>		
                    </ul>		
                    <div>
                        <% if(session.getAttribute("uid") != null){%>
                        <h1>Hi <%out.println(request.getParameter("user"));%>!</h1> 
                        <%} else {%>
                        <h1>Hello <a hrf="contact.html">Login </a>!</h1> 
                        <%}%>	

                    </div>
                </div>
            </div>
            <div class="body">
                <div class="section">
                    <a href="services.html">
                        <img src="images/gears.jpg" alt="" />				
                        services
                    </a>			
                </div>	
                <div class="article">
                    <img src="images/graph2.jpg" alt="" />		
                    <h4>This website template has been designed by <a href="http://www.freewebsitetemplates.com/">Free Website Templates</a></h4>	
                    <p>for you, for free. You can replace all this text with your own text. You can remove any link to our website from this website template, you're free to use this website template without linking back to us.</p>
                </div>
                <div class="section">
                    <a href="about.html"><img src="images/globe.jpg" alt="" />about</a>			
                </div>		
            </div>
            <div class="footer">
                <div class="section">
                    <h3><a href="blog.html">blog</a></h3>	
                    <ul>
                        <li>
                            <p>This website template has been designed</p>	
                            <span>Sept 21, by Nullam | 99 Views | 69 Comments</span>		
                        </li>		
                        <li>
                            <p>by <a href="http://www.freewebsitetemplates.com/">Free Website Templates</a> for you, for free. You can replace all this text with your own text.</p>
                            <span>Sept 21, by Nullam | 99 Views | 69 Comments</span>				
                        </li>	
                        <li>
                            <p>Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</p>				
                            <span>Sept 21, by Nullam | 99 Views | 69 Comments</span>
                        </li>		
                    </ul>	
                </div>
                <div class="featured">
                    <ul>
                        <li>
                            <h3>If you're having problems editing this website template, then don't hesitate to ask for help on the <a href="http://www.freewebsitetemplates.com/forum">Forum</a>.</h3>		
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc eu augue vel dui cursus porta. Nulla sit amet tellus urna</p>		
                            <span>Sept 21, by Nullam | 99 Views | 69 Comments</span>
                        </li>		
                        <li>
                            <h3>Vestibulum tristique, dui a vestibulum blandit, mi elit laoreet nulla consequat nec quam</h3>
                            <img src="images/discussing.jpg" alt="" />
                            <p>Morbi non leo augue, et hendrerit lectus. Pellentesque ultricies sapien ornare ipsum tempor lobortis ullamcorper urna</p>
                            <span>Sept 21, by Nullam | 99 Views | 69 Comments</span>
                        </li>	
                    </ul>		
                </div>
                <div class="section">
                    <h3>suspendisse aliquam</h3>	
                    <ul class="news">
                        <li>
                            <p>You can remove any link to our</p>			
                        </li>		
                        <li>
                            <p>website from this website template, you're free to use</p>				
                        </li>	
                        <li>
                            <p>this website template without linking back to us.</p>							
                        </li>		
                        <li>
                            <p>lorem ipsum dolor sit amet</p>
                        </li>
                        <li>
                            <p>consectetur adipiscing nunc eu augue vel dui cursus</p>				
                        </li>
                    </ul>	
                </div>
            </div>
        </div>
        <div id="footer">
            <div>
                <div>
                    <h3>america</h3>
                    <ul>
                        <li>457-380-1654 main</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>		
                <div>
                    <h3>europe</h3>
                    <ul>
                        <li>457-380-1654 main</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>	
                <div>
                    <h3>canada</h3>
                    <ul>
                        <li>457-380-1654 main</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>	
                <div>
                    <h3>middle east</h3>
                    <ul>
                        <li>457-380-1654 main</li>				
                        <li>257-301-9417 toll free</li>
                    </ul>			
                </div>	
                <div>
                    <h3>follow us:</h3>
                    <a class="facebook" href="http://facebook.com/freewebsitetemplates" target="_blank">facebook</a>		
                    <a class="twitter" href="http://twitter.com/fwtemplates" target="_blank">twitter</a>
                </div>	
            </div>
            <div>
                <p>&copy Copyright 2012. All rights reserved</p>
            </div>
        </div>
    </body>
</html>