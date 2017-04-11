<%@include file="header.jsp" %>
<div id="container">
<div class="form_container">
		<%
	String m=(String)request.getAttribute("msg");
	if(m!=null)
	{
		
	%>
	<%=m %>
	<%} %>
	<h2>Login</h2>
	<form action="loginServlet" method="post">
	<input type="text" name="emailId" placeholder="Enter your email id"><br>
	<input type="password" name="password" placeholder="enter your password"><br>
	<input type="submit" value="login"><br>
	</form>

</div>


</div>

<%@include file="footer.jsp" %>