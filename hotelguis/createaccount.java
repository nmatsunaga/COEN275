package hotelguis;


public class createaccount extends javax.swing.JDialog {
    
	//CONSTRUCTOR
    public createaccount(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        homebutton = new javax.swing.JButton();
        lastname = new javax.swing.JTextField();
        emaillabel = new javax.swing.JLabel();
        passwordlabel = new javax.swing.JLabel();
        usernamelabel = new javax.swing.JLabel();
        phonenumberlabel = new javax.swing.JLabel();
        phonenumbertextfield = new javax.swing.JFormattedTextField();
        passwordtextfield = new javax.swing.JTextField();
        namelabel = new javax.swing.JLabel();
        emailtextfield = new javax.swing.JTextField();
        usernametextfield = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        createaccountlabel = new javax.swing.JLabel();
        createaccountbutton = new javax.swing.JButton();
        createaccountbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(700, 10, 97, 29);

        getContentPane().add(lastname);
        lastname.setBounds(430, 40, 200, 26);

        emaillabel.setText("Email Address");
        getContentPane().add(emaillabel);
        emaillabel.setBounds(320, 130, 90, 16);

        passwordlabel.setText("Password");
        getContentPane().add(passwordlabel);
        passwordlabel.setBounds(350, 100, 59, 16);

        usernamelabel.setText("Desired Username");
        getContentPane().add(usernamelabel);
        usernamelabel.setBounds(300, 70, 120, 16);

        phonenumberlabel.setText("Phone Number");
        getContentPane().add(phonenumberlabel);
        phonenumberlabel.setBounds(320, 160, 100, 16);

        try {
            phonenumbertextfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }      
        getContentPane().add(phonenumbertextfield);
        phonenumbertextfield.setBounds(430, 160, 200, 26);

        getContentPane().add(passwordtextfield);
        passwordtextfield.setBounds(430, 100, 200, 26);

        namelabel.setText("First Name");
        getContentPane().add(namelabel);
        namelabel.setBounds(340, 10, 70, 20);

        getContentPane().add(emailtextfield);
        emailtextfield.setBounds(430, 130, 200, 26);

        getContentPane().add(usernametextfield);
        usernametextfield.setBounds(430, 70, 200, 26);

        getContentPane().add(firstname);
        firstname.setBounds(430, 10, 200, 26);

        jLabel1.setText("Last Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 40, 80, 20);

        createaccountlabel.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        createaccountlabel.setText("Create New Account");
        getContentPane().add(createaccountlabel);
        createaccountlabel.setBounds(20, 20, 200, 20);

        createaccountbutton.setText("CreateAccount");
        createaccountbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(createaccountbutton);
        createaccountbutton.setBounds(500, 200, 130, 29);

        createaccountbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/hotelpool.jpg"))); // NOI18N
        createaccountbackground.setText("Create New Account");
        getContentPane().add(createaccountbackground);
        createaccountbackground.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Action listener to return user to welcome page upon click.
    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        this.dispose();
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed
    
    //Action listener to retrieve user input upon click of create action button.
    private void createaccountbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountbuttonActionPerformed
    	String userfirstname = firstname.getText(); 
        String userlastname = lastname.getText();
        String username = usernametextfield.getText();
        String userpassword = passwordtextfield.getText();
        String useremail = emailtextfield.getText();
        String userphonenum = phonenumbertextfield.getText();
        
        //Checks on user input
        if(!hotelsystemMAIN.isValidName(userfirstname)){
        	hotelsystemMAIN.reportError("Invalid First Name!");
        	
        	return;
        }
        
        if(!hotelsystemMAIN.isValidName(userlastname)){
        	hotelsystemMAIN.reportError("Invalid Last Name!");
        	
        	return;
        }
        
        if(!hotelsystemMAIN.isValidUserName(username)){
        	hotelsystemMAIN.reportError("Invalid Username!");
        	
        	return;
        }
        
        if(!hotelsystemMAIN.isValidPassWord(userpassword)){
        	hotelsystemMAIN.reportError("Invalid Password!");
        	
        	return;
        }
        
        if(!hotelsystemMAIN.isValidEmail(useremail)){
        	hotelsystemMAIN.reportError("Invalid Email!");
        	
        	return;
        }
        
        if(!hotelsystemMAIN.isValidPhoneNumber(userphonenum)){
        	hotelsystemMAIN.reportError("Invalid Phone Number!");
        	
        	return;
        }
        
        //If user input is valid, then account is created.
	    if(!hotelsystemMAIN.systemUserList.createNewUser(userfirstname, userlastname, username, userpassword, useremail, userphonenum)){
        	hotelsystemMAIN.reportError("Username already exists!");
        }
        else{
        	hotelsystemMAIN.reportError("Successfully created new account!");
            
            this.dispose();
            loginpage loginPage = new loginpage(new javax.swing.JFrame(), true);
            loginPage.setSize(800,620);
            loginPage.setVisible(true);
            
            System.out.println("Added " + username);
        }     
    }//GEN-LAST:event_createaccountbuttonActionPerformed

    //Local main to test page specific GUI attributes
    /*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                createaccount dialog = new createaccount(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel createaccountbackground;
    private javax.swing.JButton createaccountbutton;
    private javax.swing.JLabel createaccountlabel;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JTextField emailtextfield;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField passwordtextfield;
    private javax.swing.JLabel phonenumberlabel;
    private javax.swing.JFormattedTextField phonenumbertextfield;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametextfield;
    // End of variables declaration//GEN-END:variables
}
