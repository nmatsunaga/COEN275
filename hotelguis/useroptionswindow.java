package hotelguis;


public class useroptionswindow extends javax.swing.JDialog {
//Initialize GUI components.
    public useroptionswindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        makereservationbutton = new javax.swing.JButton();
        signoutbutton = new javax.swing.JButton();
        welcometitle = new javax.swing.JLabel();
        updateaccountbutton = new javax.swing.JButton();
        editreservationsbutton = new javax.swing.JButton();
        useroptionsbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        makereservationbutton.setText("Make a New Reservation");
        makereservationbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makereservationbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(makereservationbutton);
        makereservationbutton.setBounds(30, 540, 190, 29);

        signoutbutton.setText("Sign Out");
        signoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(signoutbutton);
        signoutbutton.setBounds(660, 540, 97, 29);

        welcometitle.setFont(new java.awt.Font("Oriya MN", 1, 36)); // NOI18N
        welcometitle.setForeground(new java.awt.Color(255, 255, 255));
        welcometitle.setText("Welcome Back!");
        getContentPane().add(welcometitle);
        welcometitle.setBounds(30, 10, 310, 60);

        updateaccountbutton.setText("Update Account Info");
        updateaccountbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateaccountbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(updateaccountbutton);
        updateaccountbutton.setBounds(450, 540, 190, 29);

        editreservationsbutton.setText("Edit Existing Reservation");
        editreservationsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editreservationsbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(editreservationsbutton);
        editreservationsbutton.setBounds(240, 540, 190, 29);

        useroptionsbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/lobby.jpg"))); // NOI18N
        getContentPane().add(useroptionsbackground);
        useroptionsbackground.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Takes user to edit reservations page when clicked.
    private void editreservationsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editreservationsbuttonActionPerformed
        this.dispose();
        editreservations editingwindow = new editreservations(new javax.swing.JFrame(), true);
        editingwindow.setSize(800,620);
        editingwindow.setVisible(true);
    }//GEN-LAST:event_editreservationsbuttonActionPerformed
//Takes user to make reservation page when clicked.
    private void makereservationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makereservationbuttonActionPerformed
        this.dispose();
        makereservation reservationwindow = new makereservation(new javax.swing.JFrame(), true);
        reservationwindow.setSize(800,620);
        reservationwindow.setVisible(true);
    }//GEN-LAST:event_makereservationbuttonActionPerformed
//Takes user to update account information page when clicked.
    private void updateaccountbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateaccountbuttonActionPerformed
        this.dispose();
        editaccountinfo usereditwindow = new editaccountinfo(new javax.swing.JFrame(), true);
        usereditwindow.setSize(800,620);
        usereditwindow.setVisible(true);
    }//GEN-LAST:event_updateaccountbuttonActionPerformed
//Signs out user from system if clicked and takes them to the signedout page.
    private void signoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbuttonActionPerformed
        this.dispose();
        String currentUserName = hotelsystemMAIN.user.getUserName();
        hotelsystemMAIN.systemUserList.logout(currentUserName);
        signedoutpage signoutwindow = new signedoutpage(new javax.swing.JFrame(), true);
        signoutwindow.setSize(800,620);
        signoutwindow.setVisible(true);
    }//GEN-LAST:event_signoutbuttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                useroptionswindow dialog = new useroptionswindow(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton editreservationsbutton;
    private javax.swing.JButton makereservationbutton;
    private javax.swing.JButton signoutbutton;
    private javax.swing.JButton updateaccountbutton;
    private javax.swing.JLabel useroptionsbackground;
    private javax.swing.JLabel welcometitle;
    // End of variables declaration//GEN-END:variables
}
