package hotelguis;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.lang.String;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class adminEditUsers extends javax.swing.JDialog {

    private final DefaultTableModel model;

    public adminEditUsers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        userListTable.setRowSelectionAllowed(true);
        model = (DefaultTableModel) userListTable.getModel();
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
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        userIDSearchButton = new javax.swing.JButton();
        instructionsLabel = new javax.swing.JLabel();
        changeFirstNameButton = new javax.swing.JButton();
        changeEmailButton = new javax.swing.JButton();
        changePhoneButton = new javax.swing.JButton();
        changePasswordButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        UserIDSearch = new javax.swing.JTextField();
        changeLastNameButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();
        listAllButton = new javax.swing.JButton();
        changeFirstNameTXT = new javax.swing.JTextField();
        changeEmailTXT = new javax.swing.JTextField();
        changePhoneNumTXT = new javax.swing.JTextField();
        changePasswordTXT = new javax.swing.JTextField();
        changeLastNameTXT = new javax.swing.JTextField();
        instructions = new javax.swing.JLabel();
        graphic = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
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
        userIDSearchButton.setBounds(510, 160, 85, 29);

        instructionsLabel.setText("Enter a User ID to edit account information:");
        getContentPane().add(instructionsLabel);
        instructionsLabel.setBounds(30, 160, 290, 16);

        changeFirstNameButton.setText("Change First Name");
        changeFirstNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFirstNameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeFirstNameButton);
        changeFirstNameButton.setBounds(550, 390, 190, 29);

        changeEmailButton.setText("Change Email");
        changeEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeEmailButton);
        changeEmailButton.setBounds(550, 450, 190, 29);

        changePhoneButton.setText("Change Phone Number");
        changePhoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePhoneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changePhoneButton);
        changePhoneButton.setBounds(550, 480, 190, 29);

        changePasswordButton.setText("Change Password");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changePasswordButton);
        changePasswordButton.setBounds(550, 510, 190, 29);

        deleteUserButton.setText("DELETE USER");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteUserButton);
        deleteUserButton.setBounds(550, 570, 190, 29);

        UserIDSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIDSearchActionPerformed(evt);
            }
        });
        getContentPane().add(UserIDSearch);
        UserIDSearch.setBounds(320, 160, 160, 26);

        changeLastNameButton.setText("Change Last Name");
        changeLastNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLastNameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(changeLastNameButton);
        changeLastNameButton.setBounds(550, 420, 190, 29);

        userListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "First Name", "Last Name", "Phone Number", "Username", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userListTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 750, 160);

        listAllButton.setText("List All Users");
        listAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllButtonActionPerformed(evt);
            }
        });
        getContentPane().add(listAllButton);
        listAllButton.setBounds(610, 160, 140, 29);

        changeFirstNameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFirstNameTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changeFirstNameTXT);
        changeFirstNameTXT.setBounds(230, 390, 320, 26);

        changeEmailTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEmailTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changeEmailTXT);
        changeEmailTXT.setBounds(230, 450, 320, 26);

        changePhoneNumTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePhoneNumTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changePhoneNumTXT);
        changePhoneNumTXT.setBounds(230, 480, 320, 26);

        changePasswordTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changePasswordTXT);
        changePasswordTXT.setBounds(230, 510, 320, 26);

        changeLastNameTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeLastNameTXTActionPerformed(evt);
            }
        });
        getContentPane().add(changeLastNameTXT);
        changeLastNameTXT.setBounds(230, 420, 320, 26);

        instructions.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        instructions.setText("Enter updated information, and click the adjacent 'change' button.");
        getContentPane().add(instructions);
        instructions.setBounds(10, 370, 440, 16);

        graphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/146931675277809-1.png"))); // NOI18N
        getContentPane().add(graphic);
        graphic.setBounds(300, 0, 660, 180);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/WHITE-BOX7-1024x902.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeFirstNameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFirstNameTXTActionPerformed
        //Doesn't change full name, just the first name.
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 1, changeFirstNameTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changeFirstNameTXTActionPerformed

    private void changeEmailTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailTXTActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 4, changeEmailTXT.getText());
         updateUserInfoText();
    }//GEN-LAST:event_changeEmailTXTActionPerformed

    private void changeFirstNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFirstNameButtonActionPerformed
        //Doesn't change full name, just the last name.
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 1, changeFirstNameTXT.getText());
        updateUserInfoText();
        hotelsystemMAIN.reportError("Changed First Name");
    }//GEN-LAST:event_changeFirstNameButtonActionPerformed

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

    private void changePasswordTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordTXTActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 3, changePasswordTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changePasswordTXTActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 3, changePasswordTXT.getText());
        updateUserInfoText();
        hotelsystemMAIN.reportError("Changed Password");
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
        //Is there a delete function in Users/User?
        hotelsystemMAIN.reportError("User Deleted!");
    }//GEN-LAST:event_deleteUserButtonActionPerformed

    private void userIDSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIDSearchButtonActionPerformed
        int size = 100; //needs to be size of Users List

        for(int i = 0; i < size; i++){
            if((hotelsystemMAIN.systemUserList._users.get(i).getUserID()) == searchedUserID){
                //User s = hotelsystemMAIN.user NEED TO SET TO SEARCHED USER
                Vector<String> usr = new Vector<>();

                usr.add(Integer.toString(s.getUserID()));
                usr.add((s.getFirstName()));
                usr.add((s.getLastName()));
                usr.add((s.getPhoneNumber()));
                usr.add((s.getUserName()));
                usr.add((s.getEmail()));

                model.addRow(usr);   
            }
    }//GEN-LAST:event_userIDSearchButtonActionPerformed

    private void listAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllButtonActionPerformed
        int size = 100; //needs to be size of Users list
        
        for (int i = 0; i < size; i++) {
            User e = hotelsystemMAIN.systemUserList._users.get(i);
            Vector<String> usr = new Vector<>();
            
            usr.add(Integer.toString(e.getUserID()));
            usr.add((e.getFirstName()));
            usr.add((e.getLastName()));
            usr.add((e.getPhoneNumber()));
            usr.add((e.getUserName()));
            usr.add((e.getEmail()));
              
            model.addRow(usr);            
        }
    }//GEN-LAST:event_listAllButtonActionPerformed

    private void changeLastNameTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLastNameTXTActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 1, changeLastNameTXT.getText());
        updateUserInfoText();
    }//GEN-LAST:event_changeLastNameTXTActionPerformed

    private void changeLastNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLastNameButtonActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 1, changeLastNameTXT.getText());
        updateUserInfoText();
        hotelsystemMAIN.reportError("Changed Last Name");
    }//GEN-LAST:event_changeLastNameButtonActionPerformed

    private void UserIDSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIDSearchActionPerformed
        //Collects UserID inputted from administrator in the text box.
        searchedUserID = Integer.parseInt(UserIDSearch.getText());
    }//GEN-LAST:event_UserIDSearchActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        administratoroptions adminwindow = new administratoroptions(new javax.swing.JFrame(), true);
        adminwindow.setSize(800,620);
        adminwindow.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
    private javax.swing.JTextField UserIDSearch;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel background;
    private javax.swing.JButton changeEmailButton;
    private javax.swing.JTextField changeEmailTXT;
    private javax.swing.JButton changeFirstNameButton;
    private javax.swing.JTextField changeFirstNameTXT;
    private javax.swing.JButton changeLastNameButton;
    private javax.swing.JTextField changeLastNameTXT;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JTextField changePasswordTXT;
    private javax.swing.JButton changePhoneButton;
    private javax.swing.JTextField changePhoneNumTXT;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JLabel graphic;
    private javax.swing.JLabel instructions;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listAllButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton userIDSearchButton;
    private javax.swing.JTable userListTable;
    // End of variables declaration//GEN-END:variables
}
