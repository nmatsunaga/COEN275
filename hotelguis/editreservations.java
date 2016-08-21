package hotelguis;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class editreservations extends javax.swing.JDialog {

    private final DefaultTableModel model;

    public editreservations(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        reservationTableList.setRowSelectionAllowed(true);
        model = (DefaultTableModel) reservationTableList.getModel();
    }

    public String reservationID;
    User user = new User();
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTableList = new javax.swing.JTable();
        reservationlist = new javax.swing.JLabel();
        listResrButton = new javax.swing.JButton();
        newEndDateLabel = new javax.swing.JLabel();
        newEndDateTXT = new javax.swing.JTextField();
        newStartDateLabel = new javax.swing.JLabel();
        newStartDateTXT = new javax.swing.JTextField();
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
                "Reservation ID", "Start Date", "End Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reservationTableList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 390, 650, 170);

        reservationlist.setFont(new java.awt.Font("Oriya MN", 0, 18)); // NOI18N
        reservationlist.setForeground(new java.awt.Color(255, 255, 255));
        reservationlist.setText("Enter the Reservation ID of the reservation you'd like to edit:");
        getContentPane().add(reservationlist);
        reservationlist.setBounds(20, 80, 500, 22);

        listResrButton.setText("List Your Reservations");
        listResrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listResrButtonActionPerformed(evt);
            }
        });
        getContentPane().add(listResrButton);
        listResrButton.setBounds(510, 350, 210, 29);

        newEndDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        newEndDateLabel.setText("Enter New End Date:");
        getContentPane().add(newEndDateLabel);
        newEndDateLabel.setBounds(400, 150, 130, 16);
        getContentPane().add(newEndDateTXT);
        newEndDateTXT.setBounds(540, 150, 170, 26);

        newStartDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        newStartDateLabel.setText("Enter New Start Date:");
        getContentPane().add(newStartDateLabel);
        newStartDateLabel.setBounds(390, 120, 140, 16);

        newStartDateTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStartDateTXTActionPerformed(evt);
            }
        });
        getContentPane().add(newStartDateTXT);
        newStartDateTXT.setBounds(540, 120, 170, 26);

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
        confirmchangesbutton.setBounds(550, 180, 160, 29);

        cancelbutton.setText("Cancel Reservation");
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelbutton);
        cancelbutton.setBounds(550, 210, 163, 29);

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
        reservationID = reservationIDtextfield.getText();
        boolean validReservation = hotelsystemMAIN.systemReservationList.checkReservationByRid(Integer.parseInt(reservationID));
        if (validReservation == false){
            hotelsystemMAIN.reportError("Cannot find reservation!");
        }
        else {
            hotelsystemMAIN.reportError("Reservation Found!"); 
        }
    }//GEN-LAST:event_reservationIDtextfieldActionPerformed

    private void confirmchangesbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmchangesbuttonActionPerformed
        reservationID = reservationIDtextfield.getText();
       // hotelsystemMAIN.systemReservationList.changeReservation(PROPERTIES, ERROR, startDate, endDate, ERROR);
       //need to only input reservation ID, not other parameters.
    }//GEN-LAST:event_confirmchangesbuttonActionPerformed

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

    private void listResrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listResrButtonActionPerformed
        int size = hotelsystemMAIN.systemReservationList.adminReservationCount();
        
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        for (int i = 0; i < size; i++) {
            reservationProcess.Entry e = hotelsystemMAIN.systemReservationList.entries.get(i); //NEED TO set to ONLY one user's reservations.
            Vector<String> resv = new Vector<>();
            
            resv.add(Integer.toString(e.getReservId()));
            resv.add(df.format(e.getStartDate()));
            resv.add(df.format(e.getEndDate()));
              
            model.addRow(resv);            
        }
    }//GEN-LAST:event_listResrButtonActionPerformed

    private void newStartDateTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStartDateTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newStartDateTXTActionPerformed

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
    private javax.swing.JButton confirmchangesbutton;
    private javax.swing.JLabel editreservationsbackground;
    private javax.swing.JLabel editreservationtitle;
    private javax.swing.JButton homebutton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listResrButton;
    private javax.swing.JLabel newEndDateLabel;
    private javax.swing.JTextField newEndDateTXT;
    private javax.swing.JLabel newStartDateLabel;
    private javax.swing.JTextField newStartDateTXT;
    private javax.swing.JTextField reservationIDtextfield;
    private javax.swing.JTable reservationTableList;
    private javax.swing.JLabel reservationlist;
    // End of variables declaration//GEN-END:variables
}
