package hotelguis;

public class useroptionswindow extends javax.swing.JDialog {

    public useroptionswindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        makereservationbutton = new javax.swing.JButton();
        homebutton = new javax.swing.JButton();
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

        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(710, 10, 82, 29);

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

        updateaccountbutton.setText("Update Account Info.");
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

    private void editreservationsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editreservationsbuttonActionPerformed
        this.dispose();
        editreservations editingwindow = new editreservations(new javax.swing.JFrame(), true);
        editingwindow.setSize(800,620);
        editingwindow.setVisible(true);
    }//GEN-LAST:event_editreservationsbuttonActionPerformed

    private void makereservationbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makereservationbuttonActionPerformed
        this.dispose();
        makereservation reservationwindow = new makereservation(new javax.swing.JFrame(), true);
        reservationwindow.setSize(800,620);
        reservationwindow.setVisible(true);
    }//GEN-LAST:event_makereservationbuttonActionPerformed

    private void updateaccountbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateaccountbuttonActionPerformed
        this.dispose();
        editaccountinfo usereditwindow = new editaccountinfo(new javax.swing.JFrame(), true);
        usereditwindow.setSize(800,620);
        usereditwindow.setVisible(true);
    }//GEN-LAST:event_updateaccountbuttonActionPerformed

    private void signoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbuttonActionPerformed
        this.dispose();
        String currentUserName = hotelsystemMAIN.user.getUserName();
        hotelsystemMAIN.systemUserList.logout(currentUserName);
        signedoutpage signoutwindow = new signedoutpage(new javax.swing.JFrame(), true);
        signoutwindow.setSize(800,620);
        signoutwindow.setVisible(true);
    }//GEN-LAST:event_signoutbuttonActionPerformed

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        this.dispose();
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

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
    private javax.swing.JButton homebutton;
    private javax.swing.JButton makereservationbutton;
    private javax.swing.JButton signoutbutton;
    private javax.swing.JButton updateaccountbutton;
    private javax.swing.JLabel useroptionsbackground;
    private javax.swing.JLabel welcometitle;
    // End of variables declaration//GEN-END:variables
}
