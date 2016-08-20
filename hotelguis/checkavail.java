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
import java.util.Date;
import java.util.Calendar;

public class checkavail extends javax.swing.JDialog {

    public checkavail(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    checkavail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkavailabilitypanel = new javax.swing.JPanel();
        pagetitle = new javax.swing.JLabel();
        homebutton = new javax.swing.JButton();
        checkindate = new javax.swing.JLabel();
        checkoutdate = new javax.swing.JLabel();
        roomtypelabel = new javax.swing.JLabel();
        monthchoice = new java.awt.Choice();
        monthchoice1 = new java.awt.Choice();
        daychoice = new java.awt.Choice();
        daychoice1 = new java.awt.Choice();
        roomtypechoice = new java.awt.Choice();
        yearchoice = new java.awt.Choice();
        yearchoice1 = new java.awt.Choice();
        submitbutton = new javax.swing.JButton();
        checkavailbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        checkavailabilitypanel.setBackground(new java.awt.Color(253, 210, 164));
        checkavailabilitypanel.setLayout(null);

        pagetitle.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        pagetitle.setText("Check Availability");
        checkavailabilitypanel.add(pagetitle);
        pagetitle.setBounds(20, 0, 240, 60);

        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        checkavailabilitypanel.add(homebutton);
        homebutton.setBounds(690, 10, 82, 29);

        checkindate.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkindate.setForeground(new java.awt.Color(255, 255, 255));
        checkindate.setText("Check-In Date");
        checkavailabilitypanel.add(checkindate);
        checkindate.setBounds(220, 430, 140, 22);

        checkoutdate.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkoutdate.setForeground(new java.awt.Color(255, 255, 255));
        checkoutdate.setText("Check-Out Date");
        checkavailabilitypanel.add(checkoutdate);
        checkoutdate.setBounds(200, 480, 148, 22);

        roomtypelabel.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        roomtypelabel.setForeground(new java.awt.Color(255, 255, 255));
        roomtypelabel.setText("Room Type");
        checkavailabilitypanel.add(roomtypelabel);
        roomtypelabel.setBounds(240, 520, 120, 30);

        monthchoice.add("January");
        monthchoice.add("February");
        monthchoice.add("March");
        monthchoice.add("April");
        monthchoice.add("May");
        monthchoice.add("June");
        monthchoice.add("July");
        monthchoice.add("August");
        monthchoice.add("September");
        monthchoice.add("October");
        monthchoice.add("November");
        monthchoice.add("December");
        checkavailabilitypanel.add(monthchoice);
        monthchoice.setBounds(370, 480, 179, 20);

        monthchoice1.add("January");
        monthchoice1.add("February");
        monthchoice1.add("March");
        monthchoice1.add("April");
        monthchoice1.add("May");
        monthchoice1.add("June");
        monthchoice1.add("July");
        monthchoice1.add("August");
        monthchoice1.add("September");
        monthchoice1.add("October");
        monthchoice1.add("November");
        monthchoice1.add("December");
        checkavailabilitypanel.add(monthchoice1);
        monthchoice1.setBounds(370, 430, 179, 20);

        daychoice.add("1");
        daychoice.add("2");
        daychoice.add("3");
        daychoice.add("4");
        daychoice.add("5");
        daychoice.add("6");
        daychoice.add("7");
        daychoice.add("8");
        daychoice.add("9");
        daychoice.add("10");
        daychoice.add("11");
        daychoice.add("12");
        daychoice.add("13");
        daychoice.add("14");
        daychoice.add("15");
        daychoice.add("16");
        daychoice.add("17");
        daychoice.add("18");
        daychoice.add("19");
        daychoice.add("20");
        daychoice.add("21");
        daychoice.add("22");
        daychoice.add("23");
        daychoice.add("24");
        daychoice.add("25");
        daychoice.add("26");
        daychoice.add("27");
        daychoice.add("28");
        daychoice.add("29");
        daychoice.add("30");
        daychoice.add("31");
        daychoice.add("1");
        daychoice.add("1");
        checkavailabilitypanel.add(daychoice);
        daychoice.setBounds(590, 480, 57, 20);

        daychoice1.add("1");
        daychoice1.add("2");
        daychoice1.add("3");
        daychoice1.add("4");
        daychoice1.add("5");
        daychoice1.add("6");
        daychoice1.add("7");
        daychoice1.add("8");
        daychoice1.add("9");
        daychoice1.add("10");
        daychoice1.add("11");
        daychoice1.add("12");
        daychoice1.add("13");
        daychoice1.add("14");
        daychoice1.add("15");
        daychoice1.add("16");
        daychoice1.add("17");
        daychoice1.add("18");
        daychoice1.add("19");
        daychoice1.add("20");
        daychoice1.add("21");
        daychoice1.add("22");
        daychoice1.add("23");
        daychoice1.add("24");
        daychoice1.add("25");
        daychoice1.add("26");
        daychoice1.add("27");
        daychoice1.add("28");
        daychoice1.add("29");
        daychoice1.add("30");
        daychoice1.add("31");
        daychoice.add("1");
        daychoice.add("1");
        checkavailabilitypanel.add(daychoice1);
        daychoice1.setBounds(590, 430, 57, 20);

        roomtypechoice.add("Two King Beds");
        roomtypechoice.add("Two Queen Beds");
        roomtypechoice.add("One King Bed");
        roomtypechoice.add("One Queen Bed");
        roomtypechoice.add("One King Bed and One Queen Bed");
        checkavailabilitypanel.add(roomtypechoice);
        roomtypechoice.setBounds(370, 530, 280, 20);

        yearchoice.add("2016");
        yearchoice.add("2017");
        yearchoice.add("2018");
        checkavailabilitypanel.add(yearchoice);
        yearchoice.setBounds(670, 480, 98, 20);

        yearchoice1.add("2016");
        yearchoice1.add("2017");
        yearchoice1.add("2018");
        checkavailabilitypanel.add(yearchoice1);
        yearchoice1.setBounds(670, 430, 98, 20);

        submitbutton.setFont(new java.awt.Font("Oriya MN", 0, 14)); // NOI18N
        submitbutton.setText("Submit");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        checkavailabilitypanel.add(submitbutton);
        submitbutton.setBounds(670, 560, 89, 29);

        checkavailbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/resizedhotelroom.jpeg"))); // NOI18N
        checkavailabilitypanel.add(checkavailbackground);
        checkavailbackground.setBounds(0, 0, 790, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkavailabilitypanel, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkavailabilitypanel, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    /*utility for converting read in month from user to int format*/
	public int SwitchMonth(String monthString)
	{
		int month;
	    switch (monthString) {
	        case "January":  month = 1;
	                 break;
	        case "February":  month = 2;
	                 break;
	        case "March": month = 3;
	                 break;
	        case "April": month = 4;
	                 break;
	        case "May": month = 5;
	                 break;
	        case "June": month = 6;
	                 break;
	        case "July": month = 7;
	                 break;
	        case "August": month = 8;
	                 break;
	        case "September": month = 9;
	                 break;
	        case "October": month = 10;
	                 break;
	        case "November": month = 11;
	                 break;
	        case "December": month = 12;
	                 break;
	        default: month = -1;
	                 break;
	    }
	    return month;
	}    
    
	/* The function below is utility to convert room type input from user to integer matching the hotel room def*/    
	public int GetRoomType(String roomTypeFromUser)
	{	
		int roomType;
	    switch (roomTypeFromUser) {
	    	case "Two King Beds":  roomType = 0;
	    		break;
	    	case "One King Bed and One Queen Bed":  roomType = 1;
	    		break;
	        case "Two Queen Beds":  roomType = 2;
	        	break;
	        case "One King Bed":  roomType = 3;
        		break;
	        case "One Queen Bed": roomType = 4;
	        	break;
	        default: roomType = -1;
	        	break;
	    }
	    return roomType;
	}
    
    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        /*get the user's date input*/
    	String dayStart = daychoice.getSelectedItem();
    	String dayEnd = daychoice1.getSelectedItem();
    	String monthStart = monthchoice.getSelectedItem();
    	String monthEnd = monthchoice1.getSelectedItem();
    	String yearStart = yearchoice.getSelectedItem();
    	String yearEnd = yearchoice1.getSelectedItem();
    	String roomTypeSelected = roomtypechoice.getSelectedItem();
    	
        int startMonth = SwitchMonth(monthStart);
        int startDay = Integer.valueOf((String)daychoice.getSelectedItem());
        int startYear = Integer.valueOf((String)yearchoice.getSelectedItem());
        
        Calendar startDate = Calendar.getInstance();
        startDate.set(Calendar.MONTH, startMonth);
        startDate.set(Calendar.DAY_OF_MONTH, startDay);
        startDate.set(Calendar.YEAR, (startYear+1900));//The calendar.year gets the year-1900, so I added 1900 back for hotel_room_manager
        //if input year is only 116, it would cause the hotel room to be unavailable
        
        Date sD = startDate.getTime();
        
        int endMonth = SwitchMonth(monthEnd);
        int endDay = Integer.valueOf((String)daychoice1.getSelectedItem());
        int endYear = Integer.valueOf((String)yearchoice1.getSelectedItem());
        System.out.println("startYear = " + startYear + ", and endYear =  "+ endYear);
        Calendar endDate = Calendar.getInstance();
        endDate.set(Calendar.MONTH, endMonth);
        endDate.set(Calendar.DAY_OF_MONTH, endDay);
        endDate.set(Calendar.YEAR, (endYear + 1900));
        
        Date eD = endDate.getTime();
    	
    	int roomType = GetRoomType(roomTypeSelected);
    	
    	int roomNumber = hotelsystemMAIN.hotelRoomList.check_availability(roomType, sD, eD);
    	
    	/*the following boolean value is to indicate if an available room is found in the date specified*/
    	boolean roomFound = false;
    	if (roomNumber < 999)
    		roomFound = true;
    	
    	if (roomFound == true)
    	{
    		JFrame frame = new JFrame();
			
			/*message is for displaying to user when a room is available, if the user wants to make a reservation*/
		    String message = "The room is available.  Would you like to make a reservation?";
		    int answer = JOptionPane.showConfirmDialog(frame, message);
		    if (answer == JOptionPane.YES_OPTION) {
		      // User clicked YES.
		    	boolean loggedInStatus = hotelsystemMAIN.user.getLoggedIn();
				if (loggedInStatus) //if user already logged in
				{
					makereservation mrwindow = new makereservation(new javax.swing.JFrame(), true);
					mrwindow.setSize(800,630);
					mrwindow.setVisible(true);
				}
				else
				{
		            loginpage loginwindow = new loginpage(new javax.swing.JFrame(), true);
			        loginwindow.setSize(800,620);
			        loginwindow.setVisible(true);
				}
		    }
    	}
    	else 
    	{
    		Component frame = null;
            JOptionPane.showMessageDialog(frame, "Sorry, " + roomTypeSelected + " room is not available in the date range specified!");
    	}
    
    }//GEN-LAST:event_submitbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(checkavail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkavail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkavail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkavail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                checkavail dialog = new checkavail(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setSize(800,620);
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel checkavailabilitypanel;
    private javax.swing.JLabel checkavailbackground;
    private javax.swing.JLabel checkindate;
    private javax.swing.JLabel checkoutdate;
    public java.awt.Choice daychoice;
    public java.awt.Choice daychoice1;
    private javax.swing.JButton homebutton;
    public java.awt.Choice monthchoice;
    public java.awt.Choice monthchoice1;
    private javax.swing.JLabel pagetitle;
    private java.awt.Choice roomtypechoice;
    private javax.swing.JLabel roomtypelabel;
    private javax.swing.JButton submitbutton;
    public java.awt.Choice yearchoice;
    public java.awt.Choice yearchoice1;
    // End of variables declaration//GEN-END:variables
}