package hotelguis;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Users {
	
	//DATA
	public ArrayList<User> _users;
	private int _listID;
        User user = new User();
	
	//CONSTRUCTORS
	public Users()
	{
		_listID = 0;
		_users = new ArrayList<User>();
		_users.add(new User(_listID));
		_listID += 1;
	}
	
	//ACCESSORS
	
	//METHODS
	boolean createNewUser(String firstName, String lastName, String userName, String passWord, String email, String phoneNumber){
		
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
	
	//Return reference to current user.
	User login(String userName, String passWord){
		
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
					return new User();
				}
			}
		}
		
		System.out.println("Error: Username not found!");
		return new User();
	}
	
	boolean logout(String userName){
		
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName() == userName){
				
				_users.get(i).setLoggedIn(false);
				
				return true;
			}
		}
		
		System.out.println("Error: Username not found!");
		
		return false;
	}
	
	boolean isLoggedIn(String userName){
		
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName() == userName){
				
				return _users.get(i).getLoggedIn();
			}
		}
		
		return false;
	}
	
	boolean isAdmin(String userName){
		
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName() == userName){
				
				return _users.get(i).getAdmin();
			}
		}
		
		return false;
	}
	
	void editUserInfo(String userName, int field, String newValue){
		
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName() == userName){
				
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
	
	//boolean canEdit()
	//boolean setReservation(String userName, Reservation reservation)
	//Reservation list/Reservation data checkReservations() ?? How would this work best
	//boolean removeReservation(String userName, int ID)
	
	public String toString(){
		String result = "";
		int i;
		
		for(i = 0; i < _users.size(); i++){
			
			result += _users.get(i).toString();
		}
		
		return result;
	}
	
}