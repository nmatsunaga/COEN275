package hotelguis;


import java.awt.*;
import javax.swing.JOptionPane;
import java.lang.String;


public class hotelsystemMAIN {
	
    //DATA
    public static User user;
    public static reservationProcess systemReservationList;
    public static Users systemUserList; 
    public static Hotel_room_manager hotelRoomList;
    
    //CONSTRUCTOR
    public hotelsystemMAIN(){
    	user = new User();
    	systemUserList = new Users();
    	systemReservationList = new reservationProcess();
    	hotelRoomList = new Hotel_room_manager();
    }
    
    //SYSTEM HELPER FUNCTIONS
    //Function for error reporting
    public static void reportError(String message){
    	Component frame = null;
    	JOptionPane.showMessageDialog(frame, message);
    }
    
    //Function for validating first/last name user input
    //Regex is [A-Za-z]+
    public static boolean isValidName(String name){
    	for(int i = 0; i < name.length(); i++){
        	char c = name.charAt(i);
        	if(!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')){       		
        		return false;
        	}
        }
    	
    	return (name.length() > 0);
    }
    
    //Function for validating username user input
    //Regex is [A-Za-z0-9]+
    public static boolean isValidUserName(String userName){
    	for(int i = 0; i < userName.length(); i++){
        	char c = userName.charAt(i);
        	if(!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && !(c >= '0' && c <= '9')){
        		return false;
        	}
        }
    	
    	return (userName.length() > 0);
    }
    
    //Function for validating password user input
    //Regex is [!-\[\]-_a-}]+
    public static boolean isValidPassWord(String passWord){
    	for(int i = 0; i < passWord.length(); i++){
        	char c = passWord.charAt(i);
        	if(!(c >= '!' && c <= '}') || (c == '\\') || (c == '`')){
        		return false;
        	}
        }
    	
    	return (passWord.length() > 0);
    }
    
    //Function for validating email user input
    //Regex is [A-Za-z0-9\.]+@[A-Za-z0-9\.]+
    public static boolean isValidEmail(String email){
    	int i = 0;
    	int l = email.length();
    	boolean valid1 = false;
    	boolean valid2 = false;
    	
    	while((i < l) && (email.charAt(i) != '@')){
    		char c = email.charAt(i);
    		if(!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && !(c >= '0' && c <= '9') && c != '.'){
    			return false;
    		}
    		
    		i++;
    		valid1 = true;
    	}
    	
    	if(i < l){
    		i++;
    	}
    	else{
    		return false;
    	}
    	
    	while(i < l){
    		char c = email.charAt(i);
    		if(!(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z') && !(c >= '0' && c <= '9') && c != '.'){
    			return false;
    		}
    		
    		i++;
    		valid2 = true;;
    	}
    	
    	return (valid1 && valid2);
    }
    
    //Function for validating phone number user input
    //Regex is [0-9]^3-[0-9]^3-[0-9]^4 (the ^ represents superscript notation)
    public static boolean isValidPhoneNumber(String phoneNumber){
    	for(int i = 0; i < 3; i++){
    		char c = phoneNumber.charAt(i);
    		if(!(c >= '0' && c <= '9')){
    			return false;
    		}
    	}
    	
    	for(int i = 4; i < 7; i++){
    		char c = phoneNumber.charAt(i);
    		if(!(c >= '0' && c <= '9')){
    			return false;
    		}
    	}
    	
    	for(int i = 8; i < 12; i++){
    		char c = phoneNumber.charAt(i);
    		if(!(c >= '0' && c <= '9')){
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    //RUN
    public void run(){
    	//System set up
    	systemUserList.readFromFile();
    	hotelRoomList.configure_hotel_room(0); 
    	
    	//Open Start Window
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
        
        //System save
        systemUserList.writeToFile();
    }
}
