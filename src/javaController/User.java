package javaController;

public class User {
	
	String fname,lname,dob,mobile,address,city,state,country,emailId,password;

	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String fname,String lname,String dob,String mobile,String address,String city,String state,String country,String emailId) {
		// TODO Auto-generated constructor stub
	
	this.fname=fname;
	this.lname=lname;
	this.dob=dob;
	this.mobile=mobile;
	this.address=address;
	this.city=city;
	this.state=state;
	this.country=country;
	this.emailId=emailId;

	
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return emailId+fname;
	}
	
	public String getemailId() {
		return emailId;
	}

	public void setemailId(String emailId) {
		this.emailId =emailId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getlname() {
		return lname;
	}

	public void setlname(String lname) {
		this.lname = lname;
	}

	

	public String getdob() {
		return dob;
	}

	public void setdob(String dob) {
		this.dob = dob;
	}

	public String getmobile() {
		return mobile;
	}

	public void setmobile(String mobile) {
		this.mobile = mobile;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}
	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}
	public String getState(){
		return state;
	}
	public void setState(String state){
		this.state=state;
	}
	public String getCountry(){
		return country;
	}
	public void setCountry(String country){
		this.country=country;
	}
	
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}

}
