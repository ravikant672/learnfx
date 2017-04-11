package javaController;

public class UserLogin {
	String emailId,password;
	public UserLogin() {
		// TODO Auto-generated constructor stub
		
	}
	public UserLogin(String emailId,String password){
		this.emailId =emailId;
		this.password =password;
	}
	
	public String getemailId() {
		return emailId;
	}

	public void setemailId(String emailId) {
		this.emailId =emailId;
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}

}
