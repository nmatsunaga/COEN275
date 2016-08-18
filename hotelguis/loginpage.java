package hotelguis;

import java.awt.Component;
import javax.swing.JOptionPane;
import java.lang.String;

//This is a comment

public class loginpage extends javax.swing.JDialog {
    String username = "";
    String pwd = "";
    User user = new User();
    String checklogin = "";
    // removed "users" to use global hotelsystemMAIN.systemUserList
    //Users users = new Users();
    
    public loginpage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordtextfield = new javax.swing.JTextField();
        homebutton = new javax.swing.JButton();
        usernamelabel = new javax.swing.JLabel();
        usernametextfield = new javax.swing.JTextField();
        passwordlabel = new javax.swing.JLabel();
        submitbutton = new javax.swing.JButton();
        newuserbutton = new javax.swing.JButton();
        loginbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        passwordtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordtextfield);
        passwordtextfield.setBounds(560, 210, 190, 30);

        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(700, 10, 82, 29);

        usernamelabel.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        usernamelabel.setForeground(new java.awt.Color(255, 255, 255));
        usernamelabel.setText("Username");
        getContentPane().add(usernamelabel);
        usernamelabel.setBounds(430, 160, 100, 20);

        usernametextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametextfieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernametextfield);
        usernametextfield.setBounds(560, 160, 190, 30);

        passwordlabel.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        passwordlabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordlabel.setText("Password");
        getContentPane().add(passwordlabel);
        passwordlabel.setBounds(430, 210, 90, 20);

        submitbutton.setText("Log-In");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(submitbutton);
        submitbutton.setBounds(660, 260, 87, 29);

        newuserbutton.setBackground(new java.awt.Color(255, 255, 255));
        newuserbutton.setText("New User?  Create account here.");
        newuserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newuserbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(newuserbutton);
        newuserbutton.setBounds(560, 570, 240, 29);

        loginbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/resizedbell.jpg"))); // NOI18N
        getContentPane().add(loginbackground);
        loginbackground.setBounds(6, 6, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void usernametextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametextfieldActionPerformed
        username = usernametextfield.getText();  
    }//GEN-LAST:event_usernametextfieldActionPerformed

    private void newuserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newuserbuttonActionPerformed
        createaccount accwindow = new createaccount(new javax.swing.JFrame(), true);
        accwindow.setSize(800,620);
        accwindow.setVisible(true);
    }//GEN-LAST:event_newuserbuttonActionPerformed

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        username = usernametextfield.getText();    
        pwd = passwordtextfield.getText();
        //users.login(username, pwd);
        user = hotelsystemMAIN.systemUserList.login(username, pwd);
        
        if (user.getLoggedIn()==true && user.getAdmin()==true){
        	dispose();
        	administratoroptions adminwindow = new administratoroptions(new javax.swing.JFrame(),true);
        	adminwindow.setSize(800,620);
        	adminwindow.setVisible(true);
             
             
             return;
        }
        
        if (user.getLoggedIn()==true){
                useroptionswindow optwin = new useroptionswindow(new javax.swing.JFrame(), true);
                optwin.setSize(800,620);
                optwin.setVisible(true);
                
                return;
        }
        
        if (user.getLoggedIn()==false){
        	Component frame = null;
            JOptionPane.showMessageDialog(frame, "Login invalid.");
        }
    }//GEN-LAST:event_submitbuttonActionPerformed
        
    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    private void passwordtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextfieldActionPerformed
        pwd = passwordtextfield.getText();
    }//GEN-LAST:event_passwordtextfieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loginpage dialog = new loginpage(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel loginbackground;
    private javax.swing.JButton newuserbutton;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField passwordtextfield;
    private javax.swing.JButton submitbutton;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametextfield;
    // End of variables declaration//GEN-END:variables
}
