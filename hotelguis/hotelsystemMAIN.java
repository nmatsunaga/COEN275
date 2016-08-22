package hotelguis;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.lang.String;
import java.util.ArrayList;

public class hotelsystemMAIN {
	
    //DATA
    public static User user;
   
    //System Level
    public static reservationProcess systemReservationList;
    public static Users systemUserList; 
    public static Hotel_room_manager hotelRoomList;
    
    public static void reportError(String message){
    	Component frame = null;
    	JOptionPane.showMessageDialog(frame, message);
    }
    
    public hotelsystemMAIN(){
    	user = new User();
    	systemUserList = new Users();
    	systemReservationList = new reservationProcess();
    	hotelRoomList = new Hotel_room_manager();
    }
    
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
     
    public static void main(String[] args) {
    	//Instantiation of New Hotel MGR Object and Configuration of Hotel Room
       
    	//hotelRoomList.configure_hotel_room(0); 
        //Open Start Window
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);   
    }
}
