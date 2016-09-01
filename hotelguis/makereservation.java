package hotelguis;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class makereservation extends javax.swing.JDialog {

    String roomSelection;
    int roomType;
    int userID;
    int reservationReturn;
    
    private DefaultTableModel model;
    public Calendar startDate = Calendar.getInstance();
    public Calendar endDate = Calendar.getInstance();

     private void setTableContent(){
        for (int i = 0; i < 1000; i++) { //arbitrary iteration max
        ArrayList<Integer> room_List = hotelsystemMAIN.hotelRoomList.check_availability(GetRoomType(roomtypechoice.getSelectedItem()), startDate, endDate);
            	if (hotelsystemMAIN.hotelRoomList.Are_Valid_Dates(startDate, endDate)== true){
                    Vector<String> roomNums = new Vector<>();
                    roomNums.add(Integer.toString(room_List.get(i)));
                    model.addRow(roomNums);
            }
                else {
                    hotelsystemMAIN.reportError("No rooms found with your desired dates!");
                }
        }
    }
    //User user = new User();
    //Users users = new Users();
    
    public makereservation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    
    roomNumTableEdit.setEnabled(false);
    model = (DefaultTableModel) roomNumTableEdit.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        monthlabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
        roomChoiceInstructionLabel = new javax.swing.JLabel();
        roomChoiceInstructionLabel1 = new javax.swing.JLabel();
        roomNumTable = new javax.swing.JScrollPane();
        roomNumTableEdit = new javax.swing.JTable();
        Month = new javax.swing.JComboBox<>();
        backbutton = new javax.swing.JButton();
        Month2 = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        day2 = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        year2 = new javax.swing.JComboBox<>();
        roomtype = new javax.swing.JComboBox<>();
        checkinlabel = new javax.swing.JLabel();
        checkoutdatelabel = new javax.swing.JLabel();
        makereservationlabel = new javax.swing.JLabel();
        roomrequestedlabel = new javax.swing.JLabel();
        homebutton = new javax.swing.JButton();
        confirmbutton = new javax.swing.JButton();
        reservationbackground = new javax.swing.JLabel();
        checkoutdatelabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(110, 570, 100, 0);
        usernameLabel.setText(String.valueOf(user._userID));

        monthlabel.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        monthlabel.setForeground(new java.awt.Color(255, 255, 255));
        monthlabel.setText("Month");
        getContentPane().add(monthlabel);
        monthlabel.setBounds(340, 180, 45, 16);

        dayLabel.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(255, 255, 255));
        dayLabel.setText("Day");
        getContentPane().add(dayLabel);
        dayLabel.setBounds(480, 180, 45, 16);

        yearLabel.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        yearLabel.setForeground(new java.awt.Color(255, 255, 255));
        yearLabel.setText("Year");
        getContentPane().add(yearLabel);
        yearLabel.setBounds(600, 180, 31, 17);

        roomChoiceInstructionLabel.setFont(new java.awt.Font("Oriya MN", 1, 14)); // NOI18N
        roomChoiceInstructionLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomChoiceInstructionLabel.setText("Here are the rooms that match your search:");
        getContentPane().add(roomChoiceInstructionLabel);
        roomChoiceInstructionLabel.setBounds(140, 500, 320, 20);

        roomChoiceInstructionLabel1.setFont(new java.awt.Font("Oriya MN", 1, 14)); // NOI18N
        roomChoiceInstructionLabel1.setForeground(new java.awt.Color(255, 255, 255));
        roomChoiceInstructionLabel1.setText("Please select the room that you would like to reserve.");
        getContentPane().add(roomChoiceInstructionLabel1);
        roomChoiceInstructionLabel1.setBounds(70, 520, 390, 30);

        roomNumTableEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Room Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        roomNumTable.setViewportView(roomNumTableEdit);

        getContentPane().add(roomNumTable);
        roomNumTable.setBounds(460, 320, 90, 270);

        Month.setMaximumRowCount(12);
        Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });
        getContentPane().add(Month);
        Month.setBounds(300, 200, 120, 30);

        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton);
        backbutton.setBounds(720, 30, 80, 29);

        Month2.setMaximumRowCount(12);
        Month2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        Month2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Month2ActionPerformed(evt);
            }
        });
        getContentPane().add(Month2);
        Month2.setBounds(300, 240, 120, 27);

        day.setMaximumRowCount(31);
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });
        getContentPane().add(day);
        day.setBounds(450, 200, 100, 27);

        day2.setMaximumRowCount(31);
        day2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                day2ActionPerformed(evt);
            }
        });
        getContentPane().add(day2);
        day2.setBounds(450, 240, 100, 27);

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018" }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(580, 200, 88, 27);

        year2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2017", "2018" }));
        year2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year2ActionPerformed(evt);
            }
        });
        getContentPane().add(year2);
        year2.setBounds(580, 240, 90, 27);

        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Two King Beds", "One King Bed & One Queen Bed", "Two Queen Beds", "One King Bed", "One Queen Bed" }));
        roomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomtypeActionPerformed(evt);
            }
        });
        getContentPane().add(roomtype);
        roomtype.setBounds(300, 280, 250, 27);

        checkinlabel.setFont(new java.awt.Font("Oriya MN", 0, 18)); // NOI18N
        checkinlabel.setForeground(new java.awt.Color(255, 255, 255));
        checkinlabel.setText("Check In Date");
        getContentPane().add(checkinlabel);
        checkinlabel.setBounds(160, 200, 140, 22);

        checkoutdatelabel.setFont(new java.awt.Font("Oriya MN", 0, 18)); // NOI18N
        checkoutdatelabel.setForeground(new java.awt.Color(255, 255, 255));
        checkoutdatelabel.setText("Check Out Date");
        getContentPane().add(checkoutdatelabel);
        checkoutdatelabel.setBounds(140, 240, 140, 20);

        makereservationlabel.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        makereservationlabel.setForeground(new java.awt.Color(255, 255, 255));
        makereservationlabel.setText("Make a New Reservation");
        getContentPane().add(makereservationlabel);
        makereservationlabel.setBounds(30, 20, 310, 30);

        roomrequestedlabel.setFont(new java.awt.Font("Oriya MN", 0, 18)); // NOI18N
        roomrequestedlabel.setForeground(new java.awt.Color(255, 255, 255));
        roomrequestedlabel.setText("Room Type");
        getContentPane().add(roomrequestedlabel);
        roomrequestedlabel.setBounds(180, 280, 100, 22);

        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(720, 0, 82, 29);

        confirmbutton.setText("Confirm Reservation");
        confirmbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmbutton);
        confirmbutton.setBounds(560, 520, 190, 29);

        reservationbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/resizedfrontdesk.jpg"))); // NOI18N
        getContentPane().add(reservationbackground);
        reservationbackground.setBounds(0, 0, 800, 600);

        checkoutdatelabel1.setFont(new java.awt.Font("Oriya MN", 0, 18)); // NOI18N
        checkoutdatelabel1.setForeground(new java.awt.Color(255, 255, 255));
        checkoutdatelabel1.setText("Check Out Date");
        getContentPane().add(checkoutdatelabel1);
        checkoutdatelabel1.setBounds(90, 230, 140, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        this.dispose();
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    private void confirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbuttonActionPerformed
        ArrayList<Integer> roomNum;
    	userID = hotelsystemMAIN.user.getUserID();
        
    	int startDay;
    	int startMonth;
    	int startYear;
    	
    	int endDay;
    	int endMonth;
    	int endYear;
    	
    	Calendar startDate = Calendar.getInstance();
    	Calendar endDate = Calendar.getInstance();
    	
        startMonth = Integer.valueOf((String)Month.getSelectedItem());
        startDay = Integer.valueOf((String)day.getSelectedItem());
        startYear = Integer.valueOf((String)year.getSelectedItem());
        
        startDate.set(Calendar.MONTH, (startMonth - 1));
        startDate.set(Calendar.DAY_OF_MONTH, startDay);
        startDate.set(Calendar.YEAR, startYear);
        
        endMonth = Integer.valueOf((String)Month2.getSelectedItem());
        endDay = Integer.valueOf((String)day2.getSelectedItem());
        endYear = Integer.valueOf((String)year2.getSelectedItem());
        
        endDate.set(Calendar.MONTH, (endMonth - 1));
        endDate.set(Calendar.DAY_OF_MONTH, endDay);
        endDate.set(Calendar.YEAR, endYear);
        
        roomSelection = (String) roomtype.getSelectedItem();
        
        if ("Two King Beds".equals(roomSelection)){
            roomType = 0;
            //roomNum = 0;
        }
        if ("One King & One Queen Bed".equals(roomSelection)){
            roomType = 1;
            //roomNum = 1;
        }
        if ("Two Queen Beds".equals(roomSelection)){
            roomType = 2;
            //roomNum = 2;
        }
        if ("One King Bed".equals(roomSelection)){
            roomType = 3;
            //roomNum = 3;
        }
        if ("One Queen Bed".equals(roomSelection)){
            roomType = 4;
            //roomNum = 4;
        }
        
        if(!hotelsystemMAIN.hotelRoomList.Are_Valid_Dates(startDate, endDate)){
    		hotelsystemMAIN.reportError("Dates given are invalid");
    		
    		return;
    	}
        
        roomNum = hotelsystemMAIN.hotelRoomList.check_availability(roomType, startDate, endDate);
        
        System.out.println("room num" + roomNum.get(0) + "startdate" + startDate + "enddate" + endDate + "userID" + userID);//testing
        
        if (roomNum.isEmpty())
        {
        	hotelsystemMAIN.reportError(roomSelection + " room is not available in the dates specified.");	
        }
        else
        {
        	reservationReturn = hotelsystemMAIN.systemReservationList.createReservation(roomNum.get(0), startDate, endDate, userID);
        
	        if (reservationReturn < 0 ){
	            Component frame = null;
	            String errorMessage = "Reservation unsuccessful!";
	            if (reservationReturn == -2)
	            	errorMessage+= "  Invalid dates.";
	            else if (reservationReturn == -1)
	            	errorMessage+= "  The user ID is not valid.";
	            
	            JOptionPane.showMessageDialog(frame, errorMessage);
	        }
	        if (reservationReturn >= 0){
	            Component frame = null;
	            JOptionPane.showMessageDialog(frame, "Successfully made reservation.  Your reservation ID # is" + reservationReturn);
	        }
        }
    }//GEN-LAST:event_confirmbuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        this.dispose();
        useroptionswindow optwin = new useroptionswindow(new javax.swing.JFrame(), true);
        optwin.setSize(800,620);
        optwin.setVisible(true);
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
            java.util.logging.Logger.getLogger(makereservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(makereservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(makereservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(makereservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                makereservation dialog = new makereservation(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> Month;
    private javax.swing.JComboBox<String> Month2;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel checkinlabel;
    private javax.swing.JLabel checkoutdatelabel;
    private javax.swing.JLabel checkoutdatelabel1;
    private javax.swing.JButton confirmbutton;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JComboBox<String> day2;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel makereservationlabel;
    private javax.swing.JLabel monthlabel;
    private javax.swing.JLabel reservationbackground;
    private javax.swing.JLabel roomChoiceInstructionLabel;
    private javax.swing.JLabel roomChoiceInstructionLabel1;
    private javax.swing.JScrollPane roomNumTable;
    private javax.swing.JTable roomNumTableEdit;
    private javax.swing.JLabel roomrequestedlabel;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JComboBox<String> year;
    private javax.swing.JComboBox<String> year2;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
