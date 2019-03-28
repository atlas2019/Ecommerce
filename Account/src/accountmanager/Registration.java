package accountmanager;

public class Registration {String Firstname;
String Lastname;
String Password;
String ConfirmPassword;
String Email;
Registration(String Firstname, String Lastname, String Password, String ConfirmPassword, String Email){
	this.Firstname=Firstname;
	this.Lastname=Lastname;
	this.Password=Password;
	this.ConfirmPassword=ConfirmPassword;
	this.Email=Email;
}
	
public String getFirstname() {
	return Firstname;
}
public void setFirstname(String firstname) {
	Firstname = firstname;
}
public String getLastname() {
	return Lastname;
}
public void setLastname(String lastname) {
	Lastname = lastname;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getConfirmPassword() {
	return ConfirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	ConfirmPassword = confirmPassword;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}

}
