package hotelguis;

public class signedoutpage extends javax.swing.JDialog {
//Initialization of GUI components.
    public signedoutpage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homebutton = new javax.swing.JButton();
        signedoutbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        homebutton.setText("Return to Home");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(651, 6, 143, 29);

        signedoutbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/146931675277809.png"))); // NOI18N
        getContentPane().add(signedoutbackground);
        signedoutbackground.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Action listener to return user to the home page if clicked.
    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        this.dispose();
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    public static void main(String args[]) {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                signedoutpage dialog = new signedoutpage(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel signedoutbackground;
    // End of variables declaration//GEN-END:variables
}
