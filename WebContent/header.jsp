<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link  rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/style_container.css">
</head>
<body onload="StartMove()">

<div class="" id="header">
		<div class="" id="logo"><img alt="logo" src="images/logo.JPG"></div>
		
		<div id="scroller">
			
				<div></div>
				<div id="header_text">
					<h1>Learn Currency Trading</h1>
					<h4>Learn currency trading online.</h4>
				</div>
				<div id="login">
				<div id="para1"><h3>Welcome: 
					<% if ((session.getAttribute("emailId") == null) || (session.getAttribute("emailId") == "")) {
					   %>Guest</h3>
				
				</div>
				<div id="para2"><a href="register.jsp"><button>Register</button></a>
				<a href="login.jsp"><button>Login</button></a>
				</div>
				<%}
					else {
						%>
						 <%=session.getAttribute("emailId")%>
						 </div>
						<div id="para2">
						<a href="logout.jsp"><button>logout</button></a>
						
						</div>
						<%
						    }
						%>
				
				
				</div>
		 </div>
		 
		 
		
		



<div class="menu_wrapper menu_bar" id="menu_div">
        
          <ul class="menu">
            <li><a href="index.jsp">Home</a></li>
            <li><a href="forex.jsp">Forex</a>
            	<ul>
            		<li><a href="forex-text-tutorial.jsp">Text Tutorial</a></li>
            		<li><a href="forex-video-tutorial.jsp">Video Tutorial</a></li>
            	</ul>
            	</li>
            <li><a href="binary.jsp">Binary</a>
            		<ul>
            		<li><a href="">Text Tutorial</a></li>
            		<li><a href="">Video Tutorial</a></li>
            	</ul>
            	</li>
           
            <li><a href="news-trading.jsp">News Trading</a></li>
            <li><a href="brokers.jsp">Brokers</a></li>
            <li><a href="dawnload.jsp">Download</a></li>
            
            <li><a href="faq.jsp">FAQ</a></li>
            <li><a href="quiz.jsp">Quiz</a></li>
            <li><a href="contact-us.jsp">Contact Us</a></li>
          </ul>
       
       
        <!-- <ul id="icon">
          <li class="ic"><a href="#"><marquee behavior="alternate" scrolldelay="250"><img src="images/icon1.jpg" alt=""></marquee></a></li>
          <li class="ic"><a href="#"><marquee behavior="alternate" scrolldelay="250"><img src="images/icon2.jpg" alt=""></marquee></a></li>
          <li class="ic"><a href="#"><marquee behavior="alternate" scrolldelay="250"><img src="images/icon3.jpg" alt=""></marquee></a></li>
        </ul>
        -->
        
     </div>
   







<script language="javascript">

function StartMove() {
var cssBGImage=new Image();
cssBGImage.src="images/header_img.JPG";

window.cssMaxWidth=cssBGImage.width;
window.cssXPos=324;
setInterval("MoveBackGround()",50);
}

function MoveBackGround () {
window.cssXPos=window.cssXPos-1;
if (window.cssXPos>=window.cssMaxWidth) {
window.cssXPos=0;
}
toMove=document.getElementById("scroller");
toMove.style.backgroundPosition=window.cssXPos+"px 0px";

}
</script>

