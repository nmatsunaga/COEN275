package hotelguis;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.lang.String;

public class makereservation extends javax.swing.JDialog {

    int startMonth;
    int startDay;
    int startYear;
    Calendar startDate = Calendar.getInstance();
    int endMonth;
    int endDay;
    int endYear;
    Calendar endDate = Calendar.getInstance();
    String roomSelection;
    int roomType;
    int roomNum;
    int userID;
    int reservationReturn;
    
    //User user = new User();
    //Users users = new Users();
    
    public makereservation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameLabel = new javax.swing.JLabel();
        monthlabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        yearLabel = new javax.swing.JLabel();
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
        username = new javax.swing.JLabel();
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
        usernameLabel.setText(String.valueOf(hotelsystemMAIN.user._userID));

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

        roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Two Double Beds", "1 Queen Bed", "1 King Bed", "2 Queen Beds", "2 King Beds" }));
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

        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Logged In As:");
        getContentPane().add(username);
        username.setBounds(10, 570, 90, 16);

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

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        startMonth = Integer.valueOf((String)Month.getSelectedItem());
    }//GEN-LAST:event_MonthActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        startDay = Integer.valueOf((String)day.getSelectedItem());
    }//GEN-LAST:event_dayActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        startYear = Integer.valueOf((String)year.getSelectedItem());
    }//GEN-LAST:event_yearActionPerformed

    private void Month2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Month2ActionPerformed
        endMonth = Integer.valueOf((String)Month2.getSelectedItem());
    }//GEN-LAST:event_Month2ActionPerformed

    private void day2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_day2ActionPerformed
        endDay = Integer.valueOf((String)day2.getSelectedItem());
    }//GEN-LAST:event_day2ActionPerformed

    private void year2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year2ActionPerformed
        endYear = Integer.valueOf((String)year2.getSelectedItem());
    }//GEN-LAST:event_year2ActionPerformed

    private void roomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomtypeActionPerformed
        roomSelection = (String) roomtype.getSelectedItem();
    }//GEN-LAST:event_roomtypeActionPerformed

    private void confirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmbuttonActionPerformed
        userID = hotelsystemMAIN.user.getUserID(); 
        
        startMonth = Integer.valueOf((String)Month.getSelectedItem());
        startDay = Integer.valueOf((String)day.getSelectedItem());
        startYear = Integer.valueOf((String)year.getSelectedItem());
        
        startDate.set(Calendar.MONTH, (startMonth - 1));
        startDate.set(Calendar.DAY_OF_MONTH, startDay);
        startDate.set(Calendar.YEAR, startYear);
        startDate.set(Calendar.HOUR_OF_DAY, 15);
        startDate.set(Calendar.MINUTE, 0);
        startDate.set(Calendar.SECOND, 0);
        
        Date sD = startDate.getTime();
        
        endMonth = Integer.valueOf((String)Month2.getSelectedItem());
        endDay = Integer.valueOf((String)day2.getSelectedItem());
        endYear = Integer.valueOf((String)year2.getSelectedItem());
        
        endDate.set(Calendar.MONTH, (endMonth - 1));
        endDate.set(Calendar.DAY_OF_MONTH, endDay);
        endDate.set(Calendar.YEAR, endYear);
        endDate.set(Calendar.HOUR_OF_DAY, 11);
        endDate.set(Calendar.MINUTE, 0);
        endDate.set(Calendar.SECOND, 0);
        
        Date eD = endDate.getTime();
        
        roomSelection = (String) roomtype.getSelectedItem();
        
        if (roomSelection == "2 King Beds"){
            roomType = 0;
            roomNum = 0;
        }
        if (roomSelection == "2 Queen Beds"){
            roomType = 1;
            roomNum = 1;
        }
        if (roomSelection == "2 Double Beds"){
            roomType = 2;
            roomNum = 2;
        }
        if (roomSelection == "1 Queen Bed"){
            roomType = 3;
            roomNum = 3;
        }
        if (roomSelection == "1 King Bed"){
            roomType = 4;
            roomNum = 4;
        }
        System.out.println("room num" + roomNum + "startdate" + sD + "enddate" + eD + "userID" + userID);//testing
        
        reservationReturn = hotelsystemMAIN.systemReservationList.createReservation(roomNum, sD, eD, userID);
        
        if (reservationReturn < 0 ){
            Component frame = null;
            String errorMessage = "Reservation unsuccessful!";
            if (reservationReturn == -2)
            	errorMessage+= "  Invalid dates.";
            else if (reservationReturn == -3)
            	errorMessage+= "  The specified room is not available.";
            else if (reservationReturn == -1)
            	errorMessage+= "  The user ID is not valid.";
            
            JOptionPane.showMessageDialog(frame, errorMessage);
        }
        if (reservationReturn >= 0){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Successfully made reservation.  Your reservation ID # is" + reservationReturn);
        }
    }//GEN-LAST:event_confirmbuttonActionPerformed

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
    private javax.swing.JLabel roomrequestedlabel;
    private javax.swing.JComboBox<String> roomtype;
    private javax.swing.JLabel username;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JComboBox<String> year;
    private javax.swing.JComboBox<String> year2;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
