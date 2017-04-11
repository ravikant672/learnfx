<%@include file="header.jsp"%>
<div id="container">
	 <div class="form_container">
		<form action="registerServlet" method="post">
			<h2>Please Register Yourself</h2>
			<p>_______________________________</p>
			<h3>First Name</h3><input type="text" name="fname" placeholder="First Name"><br>
			<h3>Last Name</h3><input type="text" name="lname" placeholder="Last Name"><br>
			<h3>Date of Birth</h3><input type="date" name="dob" placeholder="dd/mm/yyyy"><br>
			<h3>Mobile No:</h3><input type="text" name="mobile" placeholder="Mobile No"><br>
			<h3>Address:</h3><input type="text" name="address" placeholder="Address"><br>
			<h3>City:</h3><input type="text" name="city" placeholder="City"><br>
			<h3>State:</h3><input type="text" name="state" placeholder="State"><br>
			<h3>Country:</h3><select name="country">
				<option>None</option>
				<option>India</option>
				<option>India</option>
				<option>India</option>
				<option>India</option>
				<option>India</option>
				<option>India</option>
				<option>India</option>
				<option>India</option>
				<option>India</option>
			</select>	
			<h3>EmailId</h3><input type="text" name="emailId" placeholder="Email"><br>
			<h3>Password:</h3><input type="password" name="password" placeholder="Password"><br>
			<h3>Re-Password:</h3><input type="password" name="password1" placeholder="Re enter Password"><br>
			<input type="submit" value="register" class="bb">
			<input type="reset" value="reset" class="bb">
			
		</form>
	 </div>
	
</div>

<%@include file="footer.jsp" %>