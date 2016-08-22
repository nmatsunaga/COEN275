package hotelguis;

import static hotelguis.reservationProcess.entries;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class adminEditReservations extends javax.swing.JDialog {

    private DefaultTableModel model;
    public String reservationIDinput;
    public int userID;
    public int reservationID;
    public int roomNum = 3;//testing only
    public Date startDate;
    public Date endDate;
    public User usernum;
    public int selectedReservationID;
    //public reservationEntryPublic entry = new reservationEntryPublic();
    
    User user = new User();
    
    
    public adminEditReservations(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        reservationDisplayTable.setRowSelectionAllowed(true);
        //reservationDisplayTable.getRowSelectionAllowed();
        //reservationDisplayTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        model = (DefaultTableModel) reservationDisplayTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagetitle = new javax.swing.JLabel();
        listResLabel = new javax.swing.JLabel();
        checkindate = new javax.swing.JLabel();
        checkoutdate = new javax.swing.JLabel();
        roomtypelabel = new javax.swing.JLabel();
        roomtypechoice = new java.awt.Choice();
        endmonthchoice = new java.awt.Choice();
        startmonthchoice = new java.awt.Choice();
        startdaychoice1 = new java.awt.Choice();
        enddaychoice = new java.awt.Choice();
        startyearchoice1 = new java.awt.Choice();
        endyearchoice = new java.awt.Choice();
        adminPageButton = new javax.swing.JButton();
        searchResButton = new javax.swing.JButton();
        editResDates = new javax.swing.JButton();
        deleteResButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationDisplayTable = new javax.swing.JTable();
        listAllReservations = new javax.swing.JButton();
        reservationIDtextfield = new javax.swing.JTextField();
        searchforreservation = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        pagetitle.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        pagetitle.setForeground(new java.awt.Color(255, 255, 255));
        pagetitle.setText("Admin: Edit Reservations");
        getContentPane().add(pagetitle);
        pagetitle.setBounds(10, 10, 320, 50);

        listResLabel.setForeground(new java.awt.Color(255, 255, 255));
        listResLabel.setText("List all reservations currently in the system:");
        getContentPane().add(listResLabel);
        listResLabel.setBounds(50, 320, 280, 16);

        checkindate.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkindate.setForeground(new java.awt.Color(255, 255, 255));
        checkindate.setText("New Check-In Date");
        getContentPane().add(checkindate);
        checkindate.setBounds(100, 140, 180, 22);

        checkoutdate.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkoutdate.setForeground(new java.awt.Color(255, 255, 255));
        checkoutdate.setText("New Check-Out Date");
        getContentPane().add(checkoutdate);
        checkoutdate.setBounds(90, 170, 210, 22);

        roomtypelabel.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        roomtypelabel.setForeground(new java.awt.Color(255, 255, 255));
        roomtypelabel.setText("Room Type");
        getContentPane().add(roomtypelabel);
        roomtypelabel.setBounds(170, 200, 120, 20);

        roomtypechoice.add("Two Double Beds");
        roomtypechoice.add("Two Queen Beds");
        getContentPane().add(roomtypechoice);
        roomtypechoice.setBounds(300, 200, 370, 20);

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
        endmonthchoice.setBounds(300, 170, 179, 20);

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
        startmonthchoice.setBounds(300, 140, 179, 20);

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
        startdaychoice1.setBounds(490, 140, 70, 20);

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
        enddaychoice.setBounds(490, 170, 70, 20);

        startyearchoice1.add("2016");
        startyearchoice1.add("2017");
        startyearchoice1.add("2018");
        getContentPane().add(startyearchoice1);
        startyearchoice1.setBounds(570, 140, 98, 20);

        endyearchoice.add("2016");
        endyearchoice.add("2017");
        endyearchoice.add("2018");
        getContentPane().add(endyearchoice);
        endyearchoice.setBounds(570, 170, 98, 20);

        adminPageButton.setText("Back to ADMIN Page");
        adminPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adminPageButton);
        adminPageButton.setBounds(600, 0, 200, 29);

        searchResButton.setText("Search for Reservation");
        searchResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchResButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchResButton);
        searchResButton.setBounds(580, 70, 170, 29);

        editResDates.setText("Edit Reservation");
        editResDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editResDatesActionPerformed(evt);
            }
        });
        getContentPane().add(editResDates);
        editResDates.setBounds(470, 230, 200, 29);

        deleteResButton.setText("Delete Reservation");
        deleteResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteResButton);
        deleteResButton.setBounds(470, 260, 200, 29);

        reservationDisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "User ID", "Start Date", "End Date"
            }
        ));
        reservationDisplayTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(reservationDisplayTable);
        reservationDisplayTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 350, 690, 230);

        listAllReservations.setText("List All Reservations");
        listAllReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllReservationsActionPerformed(evt);
            }
        });
        getContentPane().add(listAllReservations);
        listAllReservations.setBounds(330, 320, 180, 29);

        reservationIDtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationIDtextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(reservationIDtextfield);
        reservationIDtextfield.setBounds(410, 70, 160, 26);

        searchforreservation.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        searchforreservation.setForeground(new java.awt.Color(255, 255, 255));
        searchforreservation.setText("Enter the Reservation ID # you'd like to edit:");
        getContentPane().add(searchforreservation);
        searchforreservation.setBounds(20, 70, 430, 22);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/resizedblackbackground.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listAllReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllReservationsActionPerformed
        System.out.println(hotelsystemMAIN.systemReservationList.createReservation(5, new Date(), new Date(), 6)); //testing
        System.out.println(hotelsystemMAIN.systemReservationList.createReservation(2, new Date(), new Date(), 2));  //testing
        int size = hotelsystemMAIN.systemReservationList.adminReservationCount();
        
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        
        for (int i = 0; i < size; i++) {
            reservationProcess.Entry e = hotelsystemMAIN.systemReservationList.entries.get(i);
            Vector<String> resv = new Vector<>();
            
            resv.add(Integer.toString(e.getReservId()));
            resv.add(Integer.toString(e.getUserId()));
            resv.add(df.format(e.getStartDate()));
            resv.add(df.format(e.getEndDate()));
              
            model.addRow(resv);            
        }
    }//GEN-LAST:event_listAllReservationsActionPerformed

    private void reservationIDtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservationIDtextfieldActionPerformed
        reservationIDinput = reservationIDtextfield.getText();
    }//GEN-LAST:event_reservationIDtextfieldActionPerformed

    private void adminPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPageButtonActionPerformed
        this.dispose();
        administratoroptions adminwindow = new administratoroptions(new javax.swing.JFrame(), true);
        adminwindow.setSize(800,620);
        adminwindow.setVisible(true);
    }//GEN-LAST:event_adminPageButtonActionPerformed

    private void searchResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchResButtonActionPerformed
        reservationIDinput = reservationIDtextfield.getText();
        reservationID = Integer.parseInt(reservationIDinput);
        userID = hotelsystemMAIN.systemReservationList.getReservationUserId(reservationID);
        startDate = hotelsystemMAIN.systemReservationList.getReservationStartDate(reservationID);
        endDate = hotelsystemMAIN.systemReservationList.getReservationEndDate(reservationID);

        //hotelsystemMAIN.systemReservationList.checkReservationByRid(reservationID);
        //Populate jTable with result.
        model.addRow(new Object[]{reservationID, userID, startDate, endDate});
    }//GEN-LAST:event_searchResButtonActionPerformed

    private void editResDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editResDatesActionPerformed
        selectedReservationID = reservationDisplayTable.getSelectedRow();
        System.out.println(reservationID);//testing to ensure correct reservationID is selected
        
        
    }//GEN-LAST:event_editResDatesActionPerformed

    private void deleteResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResButtonActionPerformed
       //NEED TO FINISH, INCOMPLETE
        
        int selectedRowIndex = reservationDisplayTable.getSelectedRow();
        int selectedColumnIndex = reservationDisplayTable.getSelectedColumn();
        Object selectedObject = reservationDisplayTable.getValueAt(selectedRowIndex, 0);

        int confirmCancel = Integer.parseInt((String) selectedObject);

        confirmCancel = hotelsystemMAIN.systemReservationList.adminCancelReservationByRid(reservationID);
        if (confirmCancel == 1){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Successfully cancelled reservationID# " + reservationID);
        }
        if (confirmCancel == 0){
            Component frame = null;
            JOptionPane.showMessageDialog(frame, "Reservation not found.");
        }        
    }//GEN-LAST:event_deleteResButtonActionPerformed

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
            java.util.logging.Logger.getLogger(adminEditReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminEditReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminEditReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminEditReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                adminEditReservations dialog = new adminEditReservations(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton adminPageButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel checkindate;
    private javax.swing.JLabel checkoutdate;
    private javax.swing.JButton deleteResButton;
    private javax.swing.JButton editResDates;
    public java.awt.Choice enddaychoice;
    public java.awt.Choice endmonthchoice;
    public java.awt.Choice endyearchoice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listAllReservations;
    private javax.swing.JLabel listResLabel;
    private javax.swing.JLabel pagetitle;
    private javax.swing.JTable reservationDisplayTable;
    private javax.swing.JTextField reservationIDtextfield;
    private java.awt.Choice roomtypechoice;
    private javax.swing.JLabel roomtypelabel;
    private javax.swing.JButton searchResButton;
    private javax.swing.JLabel searchforreservation;
    public java.awt.Choice startdaychoice1;
    public java.awt.Choice startmonthchoice;
    public java.awt.Choice startyearchoice1;
    // End of variables declaration//GEN-END:variables
}
