package hotelguis;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Calendar;

public class editreservations extends javax.swing.JDialog {

    private DefaultTableModel model;

    public editreservations(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        reservationTableList.setEnabled(false);
        model = (DefaultTableModel) reservationTableList.getModel();
        setTableContent();
    }

    public String reservationID;
    User user = new User();
    
    private String getDateString(Calendar date){
    	return (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.YEAR);
    }
    
    private void setTableContent(){
        for (int i = 0; i < hotelsystemMAIN.systemReservationList.reservationCount(); i++) {
            reservationProcess.Entry e = hotelsystemMAIN.systemReservationList.entries.get(i); //NEED TO set to ONLY one user's reservations.
            
            if(e.getUserId() == hotelsystemMAIN.user.getUserID()){
            	Vector<String> resv = new Vector<>();
            
            	resv.add(Integer.toString(e.getReservId()));
            	resv.add(getDateString(e.getStartDate()));
            	resv.add(getDateString(e.getEndDate()));
            	resv.add(Integer.toString(e.getRoomId()));
              
            	model.addRow(resv);
            }
        }
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTableList = new javax.swing.JTable();
        reservationlist = new javax.swing.JLabel();
        checkindate = new javax.swing.JLabel();
        startmonthchoice = new java.awt.Choice();
        startdaychoice1 = new java.awt.Choice();
        startyearchoice1 = new java.awt.Choice();
        roomtypelabel = new javax.swing.JLabel();
        roomtypechoice = new java.awt.Choice();
        checkoutdate = new javax.swing.JLabel();
        endmonthchoice = new java.awt.Choice();
        enddaychoice = new java.awt.Choice();
        endyearchoice = new java.awt.Choice();
        reservationIDtextfield = new javax.swing.JTextField();
        homebutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        confirmchangesbutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        editreservationtitle = new javax.swing.JLabel();
        editreservationsbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        reservationTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Start Date", "End Date", "Room Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reservationTableList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 420, 650, 170);

        reservationlist.setFont(new java.awt.Font("Oriya MN", 0, 18)); // NOI18N
        reservationlist.setForeground(new java.awt.Color(255, 255, 255));
        reservationlist.setText("Enter the Reservation ID of the reservation you'd like to edit:");
        getContentPane().add(reservationlist);
        reservationlist.setBounds(20, 80, 500, 22);

        checkindate.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkindate.setForeground(new java.awt.Color(255, 255, 255));
        checkindate.setText("New Check-In Date");
        getContentPane().add(checkindate);
        checkindate.setBounds(110, 160, 180, 22);

        startmonthchoice.add("January");
        startmonthchoice.add("February");
        startmonthchoice.add("March");
        startmonthchoice.add("April");
        startmonthchoice.add("May");
        startmonthchoice.add("June");
        startmonthchoice.add("July");
        startmonthchoice.add("August");
        startmonthchoice.add("September");
        startmonthchoice.add("October");
        startmonthchoice.add("November");
        startmonthchoice.add("December");
        getContentPane().add(startmonthchoice);
        startmonthchoice.setBounds(310, 160, 179, 20);

        startdaychoice1.add("1");
        startdaychoice1.add("2");
        startdaychoice1.add("3");
        startdaychoice1.add("4");
        startdaychoice1.add("5");
        startdaychoice1.add("6");
        startdaychoice1.add("7");
        startdaychoice1.add("8");
        startdaychoice1.add("9");
        startdaychoice1.add("10");
        startdaychoice1.add("11");
        startdaychoice1.add("12");
        startdaychoice1.add("13");
        startdaychoice1.add("14");
        startdaychoice1.add("15");
        startdaychoice1.add("16");
        startdaychoice1.add("17");
        startdaychoice1.add("18");
        startdaychoice1.add("19");
        startdaychoice1.add("20");
        startdaychoice1.add("21");
        startdaychoice1.add("22");
        startdaychoice1.add("23");
        startdaychoice1.add("24");
        startdaychoice1.add("25");
        startdaychoice1.add("26");
        startdaychoice1.add("27");
        startdaychoice1.add("28");
        startdaychoice1.add("29");
        startdaychoice1.add("30");
        startdaychoice1.add("31");
        enddaychoice.add("1");
        enddaychoice.add("1");
        getContentPane().add(startdaychoice1);
        startdaychoice1.setBounds(500, 160, 70, 20);

        startyearchoice1.add("2016");
        startyearchoice1.add("2017");
        startyearchoice1.add("2018");
        getContentPane().add(startyearchoice1);
        startyearchoice1.setBounds(580, 160, 98, 20);

        roomtypelabel.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        roomtypelabel.setForeground(new java.awt.Color(255, 255, 255));
        roomtypelabel.setText("Room Type");
        getContentPane().add(roomtypelabel);
        roomtypelabel.setBounds(180, 220, 120, 20);

        roomtypechoice.add("Two King Beds");
        roomtypechoice.add("Two Queen Beds");
        roomtypechoice.add("One King Bed, One Queen Bed");
        roomtypechoice.add("One King Bed");
        roomtypechoice.add("One Queen Bed");
        getContentPane().add(roomtypechoice);
        roomtypechoice.setBounds(310, 220, 280, 20);

        checkoutdate.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkoutdate.setForeground(new java.awt.Color(255, 255, 255));
        checkoutdate.setText("New Check-Out Date");
        getContentPane().add(checkoutdate);
        checkoutdate.setBounds(100, 190, 210, 22);

        endmonthchoice.add("January");
        endmonthchoice.add("February");
        endmonthchoice.add("March");
        endmonthchoice.add("April");
        endmonthchoice.add("May");
        endmonthchoice.add("June");
        endmonthchoice.add("July");
        endmonthchoice.add("August");
        endmonthchoice.add("September");
        endmonthchoice.add("October");
        endmonthchoice.add("November");
        endmonthchoice.add("December");
        getContentPane().add(endmonthchoice);
        endmonthchoice.setBounds(310, 190, 179, 20);

        enddaychoice.add("1");
        enddaychoice.add("2");
        enddaychoice.add("3");
        enddaychoice.add("4");
        enddaychoice.add("5");
        enddaychoice.add("6");
        enddaychoice.add("7");
        enddaychoice.add("8");
        enddaychoice.add("9");
        enddaychoice.add("10");
        enddaychoice.add("11");
        enddaychoice.add("12");
        enddaychoice.add("13");
        enddaychoice.add("14");
        enddaychoice.add("15");
        enddaychoice.add("16");
        enddaychoice.add("17");
        enddaychoice.add("18");
        enddaychoice.add("19");
        enddaychoice.add("20");
        enddaychoice.add("21");
        enddaychoice.add("22");
        enddaychoice.add("23");
        enddaychoice.add("24");
        enddaychoice.add("25");
        enddaychoice.add("26");
        enddaychoice.add("27");
        enddaychoice.add("28");
        enddaychoice.add("29");
        enddaychoice.add("30");
        enddaychoice.add("31");
        enddaychoice.add("1");
        enddaychoice.add("1");
        getContentPane().add(enddaychoice);
        enddaychoice.setBounds(500, 190, 70, 20);

        endyearchoice.add("2016");
        endyearchoice.add("2017");
        endyearchoice.add("2018");
        getContentPane().add(endyearchoice);
        endyearchoice.setBounds(580, 190, 98, 20);

        reservationIDtextfield.setToolTipText("");
        reservationIDtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationIDtextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(reservationIDtextfield);
        reservationIDtextfield.setBounds(540, 80, 170, 26);

        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(700, 10, 82, 29);

        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton);
        backbutton.setBounds(700, 40, 80, 29);

        confirmchangesbutton.setText("Make Changes");
        confirmchangesbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmchangesbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmchangesbutton);
        confirmchangesbutton.setBounds(530, 250, 160, 29);

        cancelbutton.setText("Cancel Reservation");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbutton);
        cancelbutton.setBounds(540, 110, 163, 29);

        editreservationtitle.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        editreservationtitle.setForeground(new java.awt.Color(255, 51, 51));
        editreservationtitle.setText("Change a Reservation");
        getContentPane().add(editreservationtitle);
        editreservationtitle.setBounds(20, 10, 420, 45);

        editreservationsbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/smallreservations.jpg"))); // NOI18N
        getContentPane().add(editreservationsbackground);
        editreservationsbackground.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        this.dispose();
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    private void reservationIDtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationIDtextfieldActionPerformed
        /*
    	reservationID = reservationIDtextfield.getText();
        boolean validReservation = hotelsystemMAIN.systemReservationList.checkReservationByRid(Integer.parseInt(reservationID));
        if (validReservation == false){
            hotelsystemMAIN.reportError("Cannot find reservation!");
        }
        else {
            hotelsystemMAIN.reportError("Reservation Found!"); 
        }
        */
    }//GEN-LAST:event_reservationIDtextfieldActionPerformed

    private void confirmchangesbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
    	int reserveID = Integer.parseInt(reservationIDtextfield.getText());
    	int roomType = roomtypechoice.getSelectedIndex();
    	int oldRoomNum = hotelsystemMAIN.systemReservationList.getReservationRoomNum(reserveID);
    	boolean valid = false;
        
        //For now assume that the ID is valid...
    	int newStartDay = Integer.parseInt(startdaychoice1.getSelectedItem());
    	int newStartMonth = startmonthchoice.getSelectedIndex();
    	int newStartYear = Integer.parseInt(startyearchoice1.getSelectedItem());
    	
    	int newEndDay = Integer.parseInt(enddaychoice.getSelectedItem());
    	int newEndMonth = endmonthchoice.getSelectedIndex();
    	int newEndYear = Integer.parseInt(endyearchoice.getSelectedItem());
    	
    	Calendar newStartDate = Calendar.getInstance();
    	newStartDate.set(newStartYear, newStartMonth, newStartDay);
    	Calendar newEndDate = Calendar.getInstance();
    	newEndDate.set(newEndYear, newEndMonth, newEndDay);
    	
    	Calendar oldStartDate = hotelsystemMAIN.systemReservationList.getReservationStartDate(reserveID);
    	Calendar oldEndDate = hotelsystemMAIN.systemReservationList.getReservationEndDate(reserveID);
    	
    	hotelsystemMAIN.hotelRoomList.cancel_room(oldStartDate, oldEndDate, oldRoomNum);
    	
    	ArrayList<Integer> newAvailableRooms = hotelsystemMAIN.hotelRoomList.check_availability(roomType, newStartDate, newEndDate);
    	
    	for(int i = 0; i < newAvailableRooms.size(); i++){
    		if(newAvailableRooms.get(i) == oldRoomNum){
    			valid = true;
    			break;
    		}
    	}
    	
    	if(!valid){
    		hotelsystemMAIN.hotelRoomList.Occupy_Hotel_room(oldStartDate, oldEndDate, oldRoomNum);
    		hotelsystemMAIN.reportError("Requested change is unavailable!");
    	}
    	else{
    		reservationProcess.Entry r = hotelsystemMAIN.systemReservationList.checkReservationByRid(reserveID);
    		
    		if(r != null){
    			DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    			int i;
    			
    			r.setRoomId(oldRoomNum);
    			r.setStartDate(newStartDate);
    			r.setEndDate(newEndDate);
    			hotelsystemMAIN.hotelRoomList.Occupy_Hotel_room(newStartDate, newEndDate, oldRoomNum);
    			
    			for(i = 0; i < model.getRowCount(); i++){
    				if(reserveID == Integer.parseInt((String) model.getValueAt(i, 0))){
    					break;
    				}
    			}
    			
    			model.setValueAt(getDateString(newStartDate), i, 1);
    			model.setValueAt(getDateString(newEndDate), i, 2);
    			model.setValueAt(oldRoomNum, i, 3);
    		}
    	}
    }                                                    

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
        reservationID = reservationIDtextfield.getText();
        hotelsystemMAIN.systemReservationList.cancelReservation(Integer.parseInt(reservationID));
        hotelsystemMAIN.reportError("Reservation has been cancelled!");
        //Should add sanity check to make sure that the reservation ID is found, and add logic.
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        this.dispose();
        useroptionswindow userpage = new useroptionswindow(new javax.swing.JFrame(), true);
        userpage.setSize(800,620);
        userpage.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(editreservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editreservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editreservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editreservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editreservations dialog = new editreservations(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton backbutton;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JLabel checkindate;
    private javax.swing.JLabel checkoutdate;
    private javax.swing.JButton confirmchangesbutton;
    private javax.swing.JLabel editreservationsbackground;
    private javax.swing.JLabel editreservationtitle;
    public java.awt.Choice enddaychoice;
    public java.awt.Choice endmonthchoice;
    public java.awt.Choice endyearchoice;
    private javax.swing.JButton homebutton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField reservationIDtextfield;
    private javax.swing.JTable reservationTableList;
    private javax.swing.JLabel reservationlist;
    private java.awt.Choice roomtypechoice;
    private javax.swing.JLabel roomtypelabel;
    public java.awt.Choice startdaychoice1;
    public java.awt.Choice startmonthchoice;
    public java.awt.Choice startyearchoice1;
    // End of variables declaration//GEN-END:variables
}
