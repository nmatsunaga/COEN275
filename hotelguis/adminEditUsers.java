package hotelguis;


import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class adminEditUsers extends javax.swing.JDialog {

	//DATA
    private DefaultTableModel model;
    
    //CONSTRUCTOR
    public adminEditUsers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        userListTable.setEnabled(false);
        model = (DefaultTableModel) userListTable.getModel();
        setTableContent();
    }
    
    //Populating table of user account information.    
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
    
    //Function to validate and return userID selected.    
    private int checkAndGetInput(String s){
    	int result = 0;
    	 
    	if(s.length() == 0){
    		return -1;
    	}
    	
    	for(int i = 0; i < s.length(); i++){
    		if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
    			result = (10 * result) + (s.charAt(i) - '0');
    		}
    		else{
    			return -1;
    		}
    	}
    	
    	return result;
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
        changePhoneNumTXT = new javax.swing.JFormattedTextField();
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
            new String [] {"User ID", "First Name", "Last Name", "Username", "Password", "Email", "Phone Number"}
            ) {
            	Class[] types = new Class [] {
            			java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            	};

            	public Class getColumnClass(int columnIndex) {
            		return types [columnIndex];
            	}
        	}
        );
        jScrollPane1.setViewportView(userListTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 750, 160);

        getContentPane().add(changeFirstNameTXT);
        changeFirstNameTXT.setBounds(230, 390, 320, 26);

        getContentPane().add(changeEmailTXT);
        changeEmailTXT.setBounds(230, 450, 320, 26);

        try {
            changePhoneNumTXT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
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
    
    //Action listener for changing of first name.
    private void changeFirstNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFirstNameButtonActionPerformed
    	int userID = checkAndGetInput(UserIDSearch.getText());
    	
    	if(userID > 0){
    		if(hotelsystemMAIN.isValidName(changeFirstNameTXT.getText())){
	    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 0, changeFirstNameTXT.getText());
	    		//Update table
	    		for(int i = 0; i < model.getRowCount(); i++){
	    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
	    				model.setValueAt(changeFirstNameTXT.getText(), i, 1);
	    				break;
	    			}
	    		}
    		}
    		else{
    			hotelsystemMAIN.reportError("Invalid value for First Name!");
    		}
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid user ID!");
    	}
    }//GEN-LAST:event_changeFirstNameButtonActionPerformed
    
    //Action listener for editing of last name.    
    private void changeLastNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeLastNameButtonActionPerformed
    	int userID = checkAndGetInput(UserIDSearch.getText());
    	
    	if(userID > 0){
    		if(hotelsystemMAIN.isValidName(changeLastNameTXT.getText())){
	    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 1, changeLastNameTXT.getText());
	    		//Update table
	    		for(int i = 0; i < model.getRowCount(); i++){
	    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
	    				model.setValueAt(changeLastNameTXT.getText(), i, 2);
	    				break;
	    			}
	    		}
    		}
    		else{
    			hotelsystemMAIN.reportError("Invalid value for Last Name!");
    		}
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid user ID!");
    	}
    }//GEN-LAST:event_changeLastNameButtonActionPerformed
    
    //Action listener for editing of username.    
    private void editUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUsernameButtonActionPerformed
    	int userID = checkAndGetInput(UserIDSearch.getText());
    	
    	if(userID > 0){
    		if(hotelsystemMAIN.isValidName(editUserNameTXT.getText())){
	    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 2, editUserNameTXT.getText());
	    		//Update table
	    		for(int i = 0; i < model.getRowCount(); i++){
	    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
	    				model.setValueAt(editUserNameTXT.getText(), i, 3);
	    				break;
	    			}
	    		}
    		}
    		else{
    			hotelsystemMAIN.reportError("Invalid value for Username!");
    		}
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid user ID!");
    	}
    }//GEN-LAST:event_editUsernameButtonActionPerformed
    
    //Action listener for editing of password.
    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
    	int userID = checkAndGetInput(UserIDSearch.getText());
    	
    	if(userID > 0){
    		if(hotelsystemMAIN.isValidName(changePasswordTXT.getText())){
	    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 3, changePasswordTXT.getText());
	    		//Update table
	    		for(int i = 0; i < model.getRowCount(); i++){
	    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
	    				model.setValueAt(changePasswordTXT.getText(), i, 4);
	    				break;
	    			}
	    		}
    		}
    		else{
    			hotelsystemMAIN.reportError("Invalid value for Password!");
    		}
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid user ID!");
    	}
    }//GEN-LAST:event_changePasswordButtonActionPerformed
    
    //Action listener for editing of email.    
    private void changeEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEmailButtonActionPerformed
    	int userID = checkAndGetInput(UserIDSearch.getText());
    	
    	if(userID > 0){
    		if(hotelsystemMAIN.isValidName(changeEmailTXT.getText())){
	    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 4, changeEmailTXT.getText());
	    		//Update table
	    		for(int i = 0; i < model.getRowCount(); i++){
	    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
	    				model.setValueAt(changeEmailTXT.getText(), i, 5);
	    				break;
	    			}
	    		}
    		}
    		else{
    			hotelsystemMAIN.reportError("Invalid value for Email!");
    		}
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid user ID!");
    	}
    }//GEN-LAST:event_changeEmailButtonActionPerformed
    
    //Action Listener for editing of phone number.    
    private void changePhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePhoneButtonActionPerformed
    	int userID = checkAndGetInput(UserIDSearch.getText());
    	
    	if(userID > 0){
    		if(hotelsystemMAIN.isValidName(changePhoneNumTXT.getText())){
	    		hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.systemUserList.getUserByID(userID).getUserName(), 5, changePhoneNumTXT.getText());
	    		//Update table
	    		for(int i = 0; i < model.getRowCount(); i++){
	    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == userID){
	    				model.setValueAt(changePhoneNumTXT.getText(), i, 6);
	    				break;
	    			}
	    		}
    		}
    		else{
    			hotelsystemMAIN.reportError("Invalid value for Phone Number!");
    		}
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid user ID!");
    	}
    }//GEN-LAST:event_changePhoneButtonActionPerformed
    
    //Creation of action listener to delete user account that has been selected by user.
    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserButtonActionPerformed
    	int userID = checkAndGetInput(UserIDSearch.getText());
    	
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
    	else{
    		hotelsystemMAIN.reportError("Invalid user ID!");
    	}
    }//GEN-LAST:event_deleteUserButtonActionPerformed
    
    //Creation of action listener for returning the user to the administrator options window.
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        administratoroptions adminwindow = new administratoroptions(new javax.swing.JFrame(), true);
        adminwindow.setSize(800,620);
        adminwindow.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed
    
    //Local main to test page specific GUI attributes
    /*
    public static void main(String args[]) {
        
        //Setting look and feel of GUI.
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
    */

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
    private javax.swing.JFormattedTextField changePhoneNumTXT;
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
