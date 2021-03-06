package hotelguis;


import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class adminEditUsers extends javax.swing.JDialog {

    private DefaultTableModel model;

    public adminEditUsers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        userListTable.setEnabled(false);
        model = (DefaultTableModel) userListTable.getModel();
        setTableContent();
    }
    
    private void setTableContent(){
        Users.Iterator uIter = hotelsystemMAIN.systemUserList.getUserIter();
        
        for (uIter.rewind(); uIter.isValid(); uIter.next()) {
            User u = uIter.getValue();
            Vector<String> usr = new Vector<>();
            
            usr.add(Integer.toString(u.getUserID()));
            usr.add((u.getFirstName()));
            usr.add((u.getLastName()));
            usr.add((u.getUserName()));
            usr.add((u.getPassWord()));
            usr.add((u.getEmail()));
            usr.add((u.getPhoneNumber()));
              
            model.addRow(usr);            
        }
    }
    
    private int checkAndGetInput(){
    	int userID = Integer.parseInt(UserIDSearch.getText());
    	User user = hotelsystemMAIN.systemUserList.getUserByID(userID);
    	 
    	if(user.getUserID() > 0){
    		return userID;
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid user ID!");
    		 
    		return -1;
    	}
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        instructionsLabel = new javax.swing.JLabel();
        changeFirstNameButton = new javax.swing.JButton();
        changeEmailButton = new javax.swing.JButton();
        changePhoneButton = new javax.swing.JButton();
        changePasswordButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        UserIDSearch = new javax.swing.JTextField();
        changeLastNameButton = new javax.swing.JButton();
        editUsernameButton = new javax.swing.JButton();
        editUserNameTXT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        userListTable = new javax.swing.JTable();
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
        changePasswordButton.setBounds(550, 540, 190, 29);

        deleteUserButton.setText("DELETE USER");
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteUserButton);
        deleteUserButton.setBounds(550, 570, 190, 29);

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

        editUsernameButton.setText("Change Username");
        editUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUsernameButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editUsernameButton);
        editUsernameButton.setBounds(550, 510, 190, 29);

        getContentPane().add(editUserNameTXT);
        editUserNameTXT.setBounds(230, 510, 320, 26);

        userListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "User ID", "First Name", "Last Name", "Username", "Password", "Email", "Phone Number"
            })
        {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userListTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 750, 160);

        getContentPane().add(changeFirstNameTXT);
        changeFirstNameTXT.setBounds(230, 390, 320, 26);

        getContentPane().add(changeEmailTXT);
        changeEmailTXT.setBounds(230, 450, 320, 26);

        getContentPane().add(changePhoneNumTXT);
        changePhoneNumTXT.setBounds(230, 480, 320, 26);

        getContentPane().add(changePasswordTXT);
        changePasswordTXT.setBounds(230, 540, 320, 26);

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

    private void changeFirstNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFirstNameButtonActionPerformed
        //Doesn't change full name, just the last name.
    	int userID = checkAndGetInput();
    	
    	if(userID > 0){
    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 0, changeFirstNameTXT.getText());
    		//Update table
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
    				model.setValueAt(changeFirstNameTXT.getText(), i, 1);
    				break;
    			}
    		}
    	}
    }//GEN-LAST:event_changeFirstNameButtonActionPerformed
    
    private void changeLastNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLastNameButtonActionPerformed
    	int userID = checkAndGetInput();
    	
    	if(userID > 0){
    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 1, changeLastNameTXT.getText());
    		//Update table
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
    				model.setValueAt(changeLastNameTXT.getText(), i, 2);
    				break;
    			}
    		}
    	}
    }//GEN-LAST:event_changeLastNameButtonActionPerformed
    
    private void editUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUsernameButtonActionPerformed
    	int userID = checkAndGetInput();
    	
    	if(userID > 0){
    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 2, editUserNameTXT.getText());
    		//Update table
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
    				model.setValueAt(editUserNameTXT.getText(), i, 3);
    				break;
    			}
    		}
    	}
    }//GEN-LAST:event_editUsernameButtonActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
    	int userID = checkAndGetInput();
    	
    	if(userID > 0){
    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 3, changePasswordTXT.getText());
    		//Update table
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
    				model.setValueAt(changePasswordTXT.getText(), i, 4);
    				break;
    			}
    		}
    	}
    }//GEN-LAST:event_changePasswordButtonActionPerformed
    
    private void changeEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailButtonActionPerformed
    	int userID = checkAndGetInput();
    	
    	if(userID > 0){
    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 4, changeEmailTXT.getText());
    		//Update table
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
    				model.setValueAt(changeEmailTXT.getText(), i, 5);
    				break;
    			}
    		}
    	}
    }//GEN-LAST:event_changeEmailButtonActionPerformed
    
    private void changePhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneButtonActionPerformed
    	int userID = checkAndGetInput();
    	
    	if(userID > 0){
    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 5, changePhoneNumTXT.getText());
    		//Update table
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
    				model.setValueAt(changePhoneNumTXT.getText(), i, 6);
    				break;
    			}
    		}
    	}
    }//GEN-LAST:event_changePhoneButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
    	int userID = checkAndGetInput();
    	
    	if(userID > 0){
    		hotelsystemMAIN.systemUserList.removeUser(userID);
    		//Update table
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
    				model.removeRow(i);
    				break;
    			}
    		}
    	}
    }//GEN-LAST:event_deleteUserButtonActionPerformed

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
    private javax.swing.JTextField editUserNameTXT;
    private javax.swing.JButton editUsernameButton;
    private javax.swing.JLabel graphic;
    private javax.swing.JLabel instructions;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTable userListTable;
    // End of variables declaration//GEN-END:variables
}
