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
    
    public JTextArea userHeader;
    public JTextArea userLabels;
    public JTextArea userInfo;
    String newfirstname = "";
    String newlastname = "";
    String newpassword = "";
    String newemail = "";
    String newphonenumber;
    int searchedUserID;
    

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
   
    //Need help to set the "current user" to the 'searchedUserID' so that the accessors in the User and Users class can be utilized.
    /*
    private String getStringWidth(FontMetrics fm){
        int i;
            for(i = 0; i < 50; i++){ //arbitrary size for testing - should be length of user list (arraylist of users)
		if(hotelsystemMAIN.user.get(i).getUserID().equals(searchedUserID)){
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
            }
            }
            return a;
    }
    */
    
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
        userHeader = new javax.swing.JTextArea();
        userLabels = new javax.swing.JTextArea();
        userInfo = new javax.swing.JTextArea();
        changeNameTXT = new javax.swing.JTextField();
        changeEmailTXT = new javax.swing.JTextField();
        changePhoneNumTXT = new javax.swing.JTextField();
        changeUsernameTXT = new javax.swing.JTextField();
        changePasswordTXT = new javax.swing.JTextField();
        instructions = new javax.swing.JLabel();
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
        //Doesn't change full name, just the last name.
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 1, changeNameTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changeNameTXTActionPerformed

    private void changeEmailTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailTXTActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 4, changeEmailTXT.getText());
         updateUserInfoText();
    }//GEN-LAST:event_changeEmailTXTActionPerformed

    private void userIDSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDSearchButtonActionPerformed
        int i;
		
		for(i = 0; i < _users.size(); i++){
			
			if(_users.get(i).getUserName().equals(userName)){
				
				_users.get(i).setLoggedIn(false);
				
				




// TODO add your handling code here:
    }//GEN-LAST:event_userIDSearchButtonActionPerformed

    private void changeNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeNameButtonActionPerformed
        //Doesn't change full name, just the last name.
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 1, changeNameTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changeNameButtonActionPerformed

    private void changeEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailButtonActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 4, changeEmailTXT.getText());
         updateUserInfoText();
    }//GEN-LAST:event_changeEmailButtonActionPerformed

    private void changePhoneNumTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneNumTXTActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 5, changePhoneNumTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changePhoneNumTXTActionPerformed

    private void changePhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneButtonActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 5, changePhoneNumTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changePhoneButtonActionPerformed

    private void changeUsernameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUsernameTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeUsernameTXTActionPerformed

    private void changeUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUsernameButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeUsernameButtonActionPerformed

    private void changePasswordTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordTXTActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 3, changePasswordTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changePasswordTXTActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 3, changePasswordTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        //Is there a delete function in Users/User?
    }//GEN-LAST:event_deleteUserButtonActionPerformed

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
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton userIDSearchButton;
    // End of variables declaration//GEN-END:variables
}
