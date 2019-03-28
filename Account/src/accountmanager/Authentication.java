package accountmanager;

public class Authentication {
	String username;
	String password;
	Authentication(String username,String password){
		this.username=username;
		this.password=password;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}

}



