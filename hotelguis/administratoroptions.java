package hotelguis;


public class administratoroptions extends javax.swing.JDialog {
    
	//CONSTRUCTOR
    public administratoroptions(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        edituserslabel = new javax.swing.JLabel();
        editreservationslabel = new javax.swing.JLabel();
        homebutton = new javax.swing.JButton();
        signoutbutton = new javax.swing.JButton();
        changereservations = new javax.swing.JButton();
        editaccounts = new javax.swing.JButton();
        adminoptiontitle = new javax.swing.JLabel();
        administratoroptionsbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        edituserslabel.setFont(new java.awt.Font("Oriya MN", 0, 14)); // NOI18N
        edituserslabel.setForeground(new java.awt.Color(255, 255, 255));
        edituserslabel.setText("Change user account information, and delete users.");
        getContentPane().add(edituserslabel);
        edituserslabel.setBounds(250, 510, 370, 18);

        editreservationslabel.setFont(new java.awt.Font("Oriya MN", 0, 14)); // NOI18N
        editreservationslabel.setForeground(new java.awt.Color(255, 255, 255));
        editreservationslabel.setText("Edit or delete user reservations from the system.");
        getContentPane().add(editreservationslabel);
        editreservationslabel.setBounds(250, 560, 360, 18);

        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(690, 10, 82, 29);

        signoutbutton.setText("SIGN OUT");
        signoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(signoutbutton);
        signoutbutton.setBounds(690, 560, 97, 29);

        changereservations.setText("Edit Reservations");
        changereservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changereservationsActionPerformed(evt);
            }
        });
        getContentPane().add(changereservations);
        changereservations.setBounds(40, 550, 190, 29);

        editaccounts.setText("Edit User Accounts");
        editaccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaccountsActionPerformed(evt);
            }
        });
        getContentPane().add(editaccounts);
        editaccounts.setBounds(40, 500, 190, 29);

        adminoptiontitle.setFont(new java.awt.Font("Oriya MN", 0, 36)); // NOI18N
        adminoptiontitle.setForeground(new java.awt.Color(255, 255, 255));
        adminoptiontitle.setText("Administrator Options");
        getContentPane().add(adminoptiontitle);
        adminoptiontitle.setBounds(40, 10, 400, 90);

        administratoroptionsbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/resizedblackbackground.jpg"))); // NOI18N
        getContentPane().add(administratoroptionsbackground);
        administratoroptionsbackground.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Action listener for user to be sent to the 'editAccounts' GUI.
    private void editaccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaccountsActionPerformed
        this.dispose();
        adminEditUsers editAccounts = new adminEditUsers(new javax.swing.JFrame(), true);
        editAccounts.setSize(800,620);
        editAccounts.setVisible(true);
    }//GEN-LAST:event_editaccountsActionPerformed
    
    //Action listener for user to be sent to the 'adminEditReservations' GUI.
    private void changereservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changereservationsActionPerformed
        this.dispose();
        adminEditReservations editRes = new adminEditReservations(new javax.swing.JFrame(),true);
        editRes.setSize(800,620);
        editRes.setVisible(true);
    }//GEN-LAST:event_changereservationsActionPerformed
    
    //Action listener for user to signout via button.
    private void signoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbuttonActionPerformed
        this.dispose();
        String currentUserName = hotelsystemMAIN.user.getUserName();
        hotelsystemMAIN.systemUserList.logout(currentUserName);
        signedoutpage signout = new signedoutpage(new javax.swing.JFrame(),true);
        signout.setSize(800,620);
        signout.setVisible(true);
    }//GEN-LAST:event_signoutbuttonActionPerformed
    
    //Action listener for user to return to the welcome page of the system.
    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        this.dispose();
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    //Local main to test page specific GUI attributes
    /*
    public static void main(String args[]) {
       //Setting look and feel.
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(administratoroptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administratoroptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administratoroptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administratoroptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                administratoroptions dialog = new administratoroptions(new javax.swing.JFrame(), true);
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
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel administratoroptionsbackground;
    private javax.swing.JLabel adminoptiontitle;
    private javax.swing.JButton changereservations;
    private javax.swing.JButton editaccounts;
    private javax.swing.JLabel editreservationslabel;
    private javax.swing.JLabel edituserslabel;
    private javax.swing.JButton homebutton;
    private javax.swing.JButton signoutbutton;
    // End of variables declaration//GEN-END:variables
}
