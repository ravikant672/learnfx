<%!
	int pageCount=400;
	void addCount(){
		pageCount++;
		int temp = pageCount;
	}
%>
<% addCount(); %>
<div class="" id="footer">
	<div id=footer_text><p>© Copyright 2015. All Rights Reserved.</p>
	
	</div>
	<div id="page_count"><p>Visited: <%= pageCount %></p></div>	
</div>



</body>
</html>