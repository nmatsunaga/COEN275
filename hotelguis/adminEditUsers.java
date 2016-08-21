package hotelguis;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.lang.String;
import javax.swing.JTextArea;

public class adminEditUsers extends javax.swing.JDialog {

    public adminEditUsers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
 String newfirstname = "";
    String newlastname = "";
    String newpassword = "";
    String newemail = "";
    String newphonenumber;
    int searchedUserID;
    //User user = new User();
    //Users users = new Users();

    private String getUserInfo(){
    	if(!hotelsystemMAIN.user.getLoggedIn()){
    		System.out.println("Current user is not logged in!");
    		return "";
    	}
    	else{
    		String s = hotelsystemMAIN.user.getFirstName() + "\n" +
                    hotelsystemMAIN.user.getLastName() + "\n" +
                    hotelsystemMAIN.user.getUserName() + "\n" +
                    hotelsystemMAIN.user.getPassWord() + "\n" +
                    hotelsystemMAIN.user.getEmail() + "\n" +
                    hotelsystemMAIN.user.getPhoneNumber();
    		
    		return s;
    	}
    }
    
    private String getStringWidth(FontMetrics fm){
    	if(!hotelsystemMAIN.user.getLoggedIn()){
    		System.out.println("Current user is not logged in!");
    		return "";
    	}
    	else{
    		String list[] = {hotelsystemMAIN.user.getFirstName(),
                    hotelsystemMAIN.user.getLastName(),
                    hotelsystemMAIN.user.getFirstName(),
                    hotelsystemMAIN.user.getFirstName(),
                    hotelsystemMAIN.user.getFirstName(),
                    hotelsystemMAIN.user.getPhoneNumber()
    		};
    		String a = list[0];
    		
    		for(int i = 1; i < list.length; i++){
    			if(fm.stringWidth(list[i]) > fm.stringWidth(a)){
    				a = list[i];
    			}
    		}
    		
    		return a;
    	}
    }
    
    private void setUserHeader(){
    	userHeader.setText("Account information for User ID#: " + searchedUserID);
    	FontMetrics fm = userHeader.getFontMetrics(userHeader.getFont());
        userHeader.setBounds(20, 120, fm.stringWidth("Current user information"), 20);
    }
    
    private void setUserLabels(){
    	String s = "First Name:\n" +
    				"Last Name:\n" +
    				"Username:\n" +
    				"Password:\n" +
    				"E-mail:\n" +
    				"Phone Number:";
    	
    	userLabels.setText(s);
    	FontMetrics fm = userLabels.getFontMetrics(userLabels.getFont());
    	userLabels.setBounds(20, 120 + userHeader.getHeight() + 15, fm.stringWidth("Phone Number:"), 100);
    }
    
    private void updateUserInfoText(){
    	userInfo.setEnabled(false);
    	userInfo.setText(getUserInfo());
        FontMetrics fm = userInfo.getFontMetrics(userInfo.getFont());
        userInfo.setBounds(20 + userLabels.getWidth() + 10, 120 + userHeader.getHeight() + 15, fm.stringWidth(getStringWidth(fm)), 100);
        userInfo.setEnabled(true);
        
        System.out.println(userInfo.getText());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        userIDSearchButton = new javax.swing.JButton();
        enterUserIDNum = new javax.swing.JTextField();
        instructionsLabel = new javax.swing.JLabel();
        changeNameButton = new javax.swing.JButton();
        changeEmailButton = new javax.swing.JButton();
        changePhoneButton = new javax.swing.JButton();
        changeUsernameButton = new javax.swing.JButton();
        changePasswordButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        changeNameTXT = new javax.swing.JTextField();
        changeEmailTXT = new javax.swing.JTextField();
        changePhoneNumTXT = new javax.swing.JTextField();
        changeUsernameTXT = new javax.swing.JTextField();
        changePasswordTXT = new javax.swing.JTextField();
        instructions = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userInfo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        userLabels = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        userHeader = new javax.swing.JTextArea();
        graphic = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        backButton.setText("BACK");
        getContentPane().add(backButton);
        backButton.setBounds(10, 560, 90, 29);

        titleLabel.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        titleLabel.setText("Administrator: Edit Users");
        getContentPane().add(titleLabel);
        titleLabel.setBounds(10, 10, 320, 70);

        userIDSearchButton.setText("Search");
        userIDSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIDSearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(userIDSearchButton);
        userIDSearchButton.setBounds(520, 150, 85, 29);

        enterUserIDNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterUserIDNumActionPerformed(evt);
            }
        });
        getContentPane().add(enterUserIDNum);
        enterUserIDNum.setBounds(310, 150, 200, 26);

        instructionsLabel.setText("Enter a User ID to edit account information:");
        getContentPane().add(instructionsLabel);
        instructionsLabel.setBounds(20, 150, 290, 16);

        changeNameButton.setText("Change Name");
        changeNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeNameButton);
        changeNameButton.setBounds(550, 360, 190, 29);

        changeEmailButton.setText("Change Email");
        changeEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeEmailButton);
        changeEmailButton.setBounds(550, 390, 190, 29);

        changePhoneButton.setText("Change Phone Number");
        changePhoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePhoneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changePhoneButton);
        changePhoneButton.setBounds(550, 420, 190, 29);

        changeUsernameButton.setText("Change Username");
        changeUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUsernameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeUsernameButton);
        changeUsernameButton.setBounds(550, 450, 190, 29);

        changePasswordButton.setText("Change Password");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changePasswordButton);
        changePasswordButton.setBounds(550, 480, 190, 29);

        deleteUserButton.setText("DELETE USER");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteUserButton);
        deleteUserButton.setBounds(550, 550, 190, 29);

        changeNameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeNameTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changeNameTXT);
        changeNameTXT.setBounds(200, 360, 320, 26);

        changeEmailTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changeEmailTXT);
        changeEmailTXT.setBounds(200, 390, 320, 26);

        changePhoneNumTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePhoneNumTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changePhoneNumTXT);
        changePhoneNumTXT.setBounds(200, 420, 320, 26);

        changeUsernameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUsernameTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changeUsernameTXT);
        changeUsernameTXT.setBounds(200, 450, 320, 26);

        changePasswordTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changePasswordTXT);
        changePasswordTXT.setBounds(200, 480, 320, 26);

        instructions.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        instructions.setText("Enter updated information, and click the adjacent 'change' button.");
        getContentPane().add(instructions);
        instructions.setBounds(20, 330, 440, 16);

        userInfo.setColumns(20);
        userInfo.setRows(5);
        jScrollPane1.setViewportView(userInfo);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 210, 350, 110);

        userLabels.setColumns(20);
        userLabels.setRows(5);
        jScrollPane2.setViewportView(userLabels);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 210, 250, 110);

        userHeader.setColumns(20);
        userHeader.setRows(5);
        jScrollPane3.setViewportView(userHeader);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 170, 330, 40);

        graphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/146931675277809-1.png"))); // NOI18N
        getContentPane().add(graphic);
        graphic.setBounds(300, 0, 660, 180);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/WHITE-BOX7-1024x902.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enterUserIDNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterUserIDNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterUserIDNumActionPerformed

    private void changeNameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeNameTXTActionPerformed

    private void changeEmailTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeEmailTXTActionPerformed

    private void userIDSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDSearchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIDSearchButtonActionPerformed

    private void changeNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeNameButtonActionPerformed

    private void changeEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeEmailButtonActionPerformed

    private void changePhoneNumTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneNumTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePhoneNumTXTActionPerformed

    private void changePhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePhoneButtonActionPerformed

    private void changeUsernameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUsernameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeUsernameTXTActionPerformed

    private void changeUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUsernameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeUsernameButtonActionPerformed

    private void changePasswordTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordTXTActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(adminEditUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminEditUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminEditUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminEditUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                adminEditUsers dialog = new adminEditUsers(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                dialog.setSize(800,620);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton changeEmailButton;
    private javax.swing.JTextField changeEmailTXT;
    private javax.swing.JButton changeNameButton;
    private javax.swing.JTextField changeNameTXT;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JTextField changePasswordTXT;
    private javax.swing.JButton changePhoneButton;
    private javax.swing.JTextField changePhoneNumTXT;
    private javax.swing.JButton changeUsernameButton;
    private javax.swing.JTextField changeUsernameTXT;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JTextField enterUserIDNum;
    private javax.swing.JLabel graphic;
    private javax.swing.JLabel instructions;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextArea userHeader;
    private javax.swing.JButton userIDSearchButton;
    private javax.swing.JTextArea userInfo;
    private javax.swing.JTextArea userLabels;
    // End of variables declaration//GEN-END:variables
}