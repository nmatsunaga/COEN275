package hotelguis;

import static hotelguis.reservationProcess.entries;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
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
        pagetitle.setText("Admin: Edit Reservations");
        getContentPane().add(pagetitle);
        pagetitle.setBounds(10, 10, 320, 50);

        listResLabel.setText("List all reservations currently in the system:");
        getContentPane().add(listResLabel);
        listResLabel.setBounds(40, 180, 280, 16);

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
        searchResButton.setBounds(520, 130, 170, 29);

        editResDates.setText("Edit Reservation Dates");
        editResDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editResDatesActionPerformed(evt);
            }
        });
        getContentPane().add(editResDates);
        editResDates.setBounds(160, 550, 200, 29);

        deleteResButton.setText("Delete Reservation");
        deleteResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteResButton);
        deleteResButton.setBounds(410, 550, 180, 29);

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
        jScrollPane1.setBounds(60, 240, 690, 280);

        listAllReservations.setText("List All Reservations");
        listAllReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllReservationsActionPerformed(evt);
            }
        });
        getContentPane().add(listAllReservations);
        listAllReservations.setBounds(330, 180, 180, 29);

        reservationIDtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservationIDtextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(reservationIDtextfield);
        reservationIDtextfield.setBounds(340, 130, 160, 26);

        searchforreservation.setText("Enter the Reservation ID # you'd like to edit:");
        getContentPane().add(searchforreservation);
        searchforreservation.setBounds(40, 130, 290, 16);
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
        reservationID = reservationDisplayTable.getSelectedRow();
        System.out.println(reservationID);//testing to ensure correct userID is selected
        
    }//GEN-LAST:event_editResDatesActionPerformed

    private void deleteResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResButtonActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JButton deleteResButton;
    private javax.swing.JButton editResDates;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listAllReservations;
    private javax.swing.JLabel listResLabel;
    private javax.swing.JLabel pagetitle;
    private javax.swing.JTable reservationDisplayTable;
    private javax.swing.JTextField reservationIDtextfield;
    private javax.swing.JButton searchResButton;
    private javax.swing.JLabel searchforreservation;
    // End of variables declaration//GEN-END:variables
}
