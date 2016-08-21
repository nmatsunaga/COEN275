package hotelguis;


/*	User object class:
 * 
 * 	Represents a single user in the system. Users may
 * 	be either admin or regular. Currently only one
 * 	generic admin user exists. Each object tracks user
 * 	specific information and whether or not the user is
 * 	logged in.
 */

public class User {
	
	//DATA (removed all 'private')
	String _firstName, _lastName;
	String _userName, _passWord;
	String _email, _phoneNumber;
	boolean _admin;
	boolean _loggedIn;
	int _userID;
	
	//CONSTRUCTORS
	public User(){
	
		_firstName = "John";
		_lastName = "Doe";
		_userName = "jDoe";
		_passWord = "password";
		_email = "jDoe@email.com";
		_phoneNumber = "123-456-7890";
		
		_admin = false;
		_loggedIn = false;
		
		_userID = -1;
	}
	
	public User(int userID){
		
		_firstName = "admin";
		_lastName = "admin";
		_userName = "admin";
		_passWord = "admin";
		_email = "admin";
		_phoneNumber = "admin";
		
		_admin = true;
		_loggedIn = false;
		
		_userID = userID;
	}
        
	public User(String firstName, String lastName, String userName, String passWord, String email, String phoneNumber, int userID){
		
		_firstName = firstName;
		_lastName = lastName;
		_userName = userName;
		_passWord = passWord;
		_email = email;
		_phoneNumber = phoneNumber;
		
		_admin = false;
		_loggedIn = false;
		
		_userID = userID;
	}
	
	//ACCESSORS
	String getFirstName(){
		
		return _firstName;
	}
	
	String getLastName(){
		
		return _lastName;
	}
	
	String getUserName(){
		
		return _userName;
	}
	
	String getPassWord(){
		
		return _passWord;
	}
	
	String getEmail(){
		
		return _email;
	}
	
	String getPhoneNumber(){
		
		return _phoneNumber;
	}
	
	boolean getLoggedIn(){
		
		return _loggedIn;
	}
	
	boolean getAdmin(){
		
		return _admin;
	}
	
	int getUserID(){
		
		return _userID;
	}
	
	//MUTATORS
	void setLoggedIn(boolean status){
		
		_loggedIn = status;
	}
	
	void setFirstName(String newValue){
		
		_firstName = newValue;
	}
	
	void setLastName(String newValue){
		
		_lastName = newValue;
	}

	void setUserName(String newValue){
	
		_userName = newValue;
	}

	void setPassWord(String newValue){
	
		_passWord = newValue;
	}

	void setEmail(String newValue){
	
		_email = newValue;
	}

	void setPhoneNumber(String newValue){
	
		_phoneNumber = newValue;
	}
	
	//METHODS	
	@Override
	public String toString(){
		String result = "";
		
		result += "First name: " + _firstName + "\n";
		result += "Last name: " + _lastName + "\n";
		result += "Username: " + _userName + "\n";
		result += "Password: " + _passWord + "\n";
		result += "E-mail: " + _email + "\n";
		result += "Phone Number: " + _phoneNumber + "\n";
		
		result += "Admin: " + _admin + "\n";
		result += "Logged in: " + _loggedIn + "\n";
		
		result += "User ID: " + _userID + "\n";
		
		return result;
	}
}