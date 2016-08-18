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
    public static User user = new User();
    //String currentUser;
    
    //System Level
    public static String systemUser;
    public static int systemUserID;
    public static reservationProcess systemReservationList = new reservationProcess();
    public static Users systemUserList = new Users(); 
    
    //Constructors
    private loginpage loginpageInstance;
    public hotelsystemMAIN(loginpage lp){
        loginpageInstance = lp;
    }
    
    private User usermanagerInstance;
    public hotelsystemMAIN(User UM){
        usermanagerInstance = UM;
    }
    
    private Users usersInstance;
    public hotelsystemMAIN(Users US){
        usersInstance = US;
    }
    
    private createaccount createaccountInstance;
    public hotelsystemMAIN(createaccount ca){
        createaccountInstance = ca;
    }
    
    
    public static void main(String[] args) {
        
        //Open Start Window
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }
}
