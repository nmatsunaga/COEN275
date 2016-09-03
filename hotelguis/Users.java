package hotelguis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*	User management class:
 * 
 * 	Holds an array list of User objects which define the
 * 	current users (both admin and regular) that exist in
 * 	the system.
 * 
 * 	Allows for the creation, logging in, logging out, and
 * 	editing of users.
 * 
 * 	Has the ability to retrieve a user list from a file
 * 	upon start up and/or save a user list to a file upon
 * 	completion.
 */
public class Users {
	
	//DATA
	private ArrayList<User> _users; //List of users in the system
	private int _listID; //Unique ID given to each user of the system
	
	//ITERATORS
	class Iterator {
		int _index;
		ArrayList<User> _users;
		
		public Iterator(ArrayList<User> users)
		{
			_users = users;
			rewind();
		}
		
		public void rewind()
		{
			_index = 0;
		}
		
		public void next()
		{
			_index++;
		}
		
		public boolean isValid()
		{
			return _index < _users.size();
		}
		
		public User getValue()
		{
			return _users.get(_index);
		}
	}
	
	//CONSTRUCTORS
	public Users()
	{
            _users = new ArrayList<User>();
            _users.add(new User(0));
            _listID = 1;
	}
	
	//ACCESSORS
	//None
	
	//METHODS
	//Return an iterator for the User objects in the system
	public Iterator getUserIter(){
		return new Iterator(_users);
	}
	
	//Create a new User object and add it to the system
	public boolean createNewUser(String firstName,
            String lastName,
            String userName,
            String passWord,
            String email,
            String phoneNumber)
	{	
		int i;
		System.out.println("check"+ firstName + lastName + userName + passWord + email + phoneNumber);
		for(i = 0; i < _users.size(); i++){
			System.out.println(_users.get(i).getUserName() + " " + userName);
			if(_users.get(i).getUserName().equals(userName)){
				return false;
			}
		}
		
		_users.add(new User(firstName, lastName, userName, passWord, email, phoneNumber, _listID));
		_listID += 1;
                
		return true;
	}
	
	//Create a new User object from saved file
	private boolean createUserFromFile(String firstName,
            String lastName,
            String userName,
            String passWord,
            String email,
            String phoneNumber,
            int userID)
	{	
		int i;
		System.out.println("check"+ firstName + lastName + userName + passWord + email + phoneNumber);
		for(i = 0; i < _users.size(); i++){
			System.out.println(_users.get(i).getUserName() + " " + userName);
			if(_users.get(i).getUserName().equals(userName)){
				return false;
			}
		}
		
		_users.add(new User(firstName, lastName, userName, passWord, email, phoneNumber, userID));
		_listID = userID;
                
		return true;
	}
	
	//Return reference to current user.
	public User login(String userName, String passWord){
		
		int i;
        
		System.out.println("login "+ _users);//testingline

		for(i = 0; i < _users.size(); i++){
			User user = _users.get(i);
			if(userName.equals(user.getUserName())){
				if(passWord.equals(user.getPassWord())){
					if(!user.getLoggedIn()){
						user.setLoggedIn(true);
					}
					else{
						System.out.println("Error: User already logged in!");
					}
                    
					return user;
				}
				else{
					System.out.println("Error: Incorrect password!");
					return null;
				}
			}
		}
		
		System.out.println("Error: Username not found!");
		return null;
	}
	
	//Logout current user
	public boolean logout(String userName){
		
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName().equals(userName)){
				
				_users.get(i).setLoggedIn(false);
				
				return true;
			}
		}
		
		System.out.println("Error: Username not found!");
		
		return false;
	}
	
	//Return if given user is logged in
	public boolean isLoggedIn(String userName){
		
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName().equals(userName)){
				
				return _users.get(i).getLoggedIn();
			}
		}
		
		return false;
	}
	
	//Return if given user is an admin
	public boolean isAdmin(String userName){
		
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName().equals(userName)){
				
				return _users.get(i).getAdmin();
			}
		}
		
		return false;
	}
	
	//Set the value of a given User attribute
	public void editUserInfo(String userName, int field, String newValue){
		
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName().equals(userName)){
				
				switch(field){
				
				case 0: _users.get(i).setFirstName(newValue); break;
				case 1: _users.get(i).setLastName(newValue); break;
				case 2: _users.get(i).setUserName(newValue); break;
				case 3: _users.get(i).setPassWord(newValue); break;
				case 4: _users.get(i).setEmail(newValue); break;
				case 5: _users.get(i).setPhoneNumber(newValue); break;
				default: break;
				}
			}
		}
	}
	
	//Write User info to file
	public void writeToFile(){
		Charset charset = Charset.forName("US-ASCII");
		Path p = Paths.get("list.txt");
		
		if(_users.size() == 1){
			System.out.println("Nothing to write");
			return;
		}
		
		try(BufferedWriter writer = Files.newBufferedWriter(p, charset)){
			for(int i = 1; i < _users.size(); i++){
				User user = _users.get(i);
				String line = user.getFirstName() + "," +
							user.getLastName() + "," +
							user.getUserName() + "," +
							user.getPassWord() + "," +
							user.getEmail() + "," +
							user.getPhoneNumber() + "," +
							user.getUserID() + "\n";
				writer.write(line, 0, line.length());
			} 
		} catch (IOException x) {
				System.err.format("IOException: %s%n", x);
		}
	}
	
	//Helper function to parse User info written in file
	private void parseAndAdd(String line){
		
		String firstName = "";
		String lastName = "";
		String userName = "";
		String passWord = "";
		String email = "";
		String phoneNumber = "";
		int userID = 0;
		
		int i = 0;
		
		while(line.charAt(i) != ','){
			firstName += line.charAt(i);
			i++;
		}
		
		i++;
		
		while(line.charAt(i) != ','){
			lastName += line.charAt(i);
			i++;
		}
		
		i++;
		
		while(line.charAt(i) != ','){
			userName += line.charAt(i);
			i++;
		}
		
		i++;
		
		while(line.charAt(i) != ','){
			passWord += line.charAt(i);
			i++;
		}
		
		i++;
		
		while(line.charAt(i) != ','){
			email += line.charAt(i);
			i++;
		}
		
		i++;
		
		while(line.charAt(i) != ','){
			phoneNumber += line.charAt(i);
			i++;
		}
		
		i++;
		
		while(i != line.length()){
			userID = (10 * userID) + (line.charAt(i) - '0');
			i++;
		}
		
		createUserFromFile(firstName, lastName, userName, passWord, email, phoneNumber, userID);
	}
	
	//Read User info from file
	public void readFromFile(){
		Charset charset = Charset.forName("US-ASCII");
		Path p = Paths.get("list.txt");
		
		try(BufferedReader reader = Files.newBufferedReader(p, charset)){
			String line = null;
			while((line = reader.readLine()) != null){
				parseAndAdd(line);
			}
		} catch (IOException x) {
			//Do nothing
			System.out.println("Nothing to read");
		}
	}
	
	//Remove a User from the system
	public boolean removeUser(int userID){
		int i;
		
		for(i = 0; i < _users.size(); i++){
			if(userID == _users.get(i).getUserID()){
				break;
			}
		}
		
		if(i == _users.size()){
			return false;
		}
		else{
			_users.remove(i);
			
			return true;
		}
	}
	
	//Return the User object associated with the given user ID
	public User getUserByID(int userID){
		int i;
		
		for(i = 0; i < _users.size(); i++){
			if(userID == _users.get(i).getUserID()){
				break;
			}
		}
		
		if(i == _users.size()){
			return new User();
		}
		else{
			return _users.get(i);
		}
	}
	
	@Override
	public String toString(){
		String result = "";
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			result += _users.get(i).toString();
		}
		
		return result;
	}
	
	/*
	public static void main(String[] args) {
		Users test = new Users();
		
		test.createNewUser("Donald",
	            			"Trump",
	            			"makeThisProjectGreatAgain",
	            			"america",
	            			"trump@trump.com",
	            			"666-666-6666");
		
		test.createNewUser("Nate",
    			"Matsunaga",
    			"nmat",
    			"n",
    			"n@gmail.com",
    			"503-000-1111");
		
		test.createNewUser("Elizabeth",
    			"Sweeny",
    			"esweeny",
    			"e",
    			"e@gmail.com",
    			"111-111-1111");
		
		System.out.println(test);
		
		test.removeUser(2);
		
		System.out.println(test);
		
		User user = test.getUserByID(1);
		
		System.out.println(user);
	}
	*/
}