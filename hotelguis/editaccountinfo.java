package hotelguis;

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.lang.String;
import javax.swing.JTextArea;

public class editaccountinfo extends javax.swing.JDialog {

    String newfirstname = "";
    String newlastname = "";
    String newpassword = "";
    String newemail = "";
    String newphonenumber;
    
    public editaccountinfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

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
    	userHeader.setText("Current user information");
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

        instructions = new javax.swing.JLabel();
        LNtextfield = new javax.swing.JTextField();
        phonenumtextfield = new javax.swing.JFormattedTextField();
        FNtextfield = new javax.swing.JTextField();
        passwordbutton = new javax.swing.JButton();
        phonenumberbutton = new javax.swing.JButton();
        emailtextfield = new javax.swing.JFormattedTextField();
        emailbutton = new javax.swing.JButton();
        passwordtextfield = new javax.swing.JTextField();
        LNbutton = new javax.swing.JButton();
        userHeader = new javax.swing.JTextArea();
        userLabels = new javax.swing.JTextArea();
        userInfo = new javax.swing.JTextArea();
        pagetitle = new javax.swing.JLabel();
        homebutton = new javax.swing.JButton();
        editaccountinfobackground = new javax.swing.JLabel();
        backtouseroptions = new javax.swing.JButton();
        FNbutton = new javax.swing.JButton();
        whiteboxbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        instructions.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        instructions.setText("Enter updated information, and click the adjacent 'change' button.");
        getContentPane().add(instructions);
        instructions.setBounds(130, 300, 440, 16);

        getContentPane().add(LNtextfield);
        LNtextfield.setBounds(130, 350, 200, 26);

        try {
            phonenumtextfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        
        getContentPane().add(phonenumtextfield);
        phonenumtextfield.setBounds(130, 440, 200, 26);

        FNtextfield.setToolTipText("");
        
        getContentPane().add(FNtextfield);
        FNtextfield.setBounds(130, 320, 200, 30);

        passwordbutton.setText("Change Password");
        passwordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(passwordbutton);
        passwordbutton.setBounds(340, 380, 170, 29);

        phonenumberbutton.setText("Change Phone Number");
        phonenumberbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenumberbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(phonenumberbutton);
        phonenumberbutton.setBounds(340, 440, 170, 29);

        try {
            emailtextfield.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************@*********************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        
        getContentPane().add(emailtextfield);
        emailtextfield.setBounds(130, 410, 200, 26);

        emailbutton.setText("Change Email");
        emailbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(emailbutton);
        emailbutton.setBounds(340, 410, 170, 29);

       
        getContentPane().add(passwordtextfield);
        passwordtextfield.setBounds(130, 380, 200, 26);

        LNbutton.setText("Change Last Name");
        LNbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(LNbutton);
        LNbutton.setBounds(340, 350, 170, 29);

        setUserHeader();
        getContentPane().add(userHeader);
        
        setUserLabels();
        getContentPane().add(userLabels);
        
        updateUserInfoText();
        getContentPane().add(userInfo);

        pagetitle.setFont(new java.awt.Font("Oriya MN", 0, 24)); // NOI18N
        pagetitle.setText("Edit User Account Information");
        getContentPane().add(pagetitle);
        pagetitle.setBounds(20, 10, 360, 50);

        homebutton.setFont(new java.awt.Font("Oriya MN", 0, 13)); // NOI18N
        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(710, 10, 85, 29);

        editaccountinfobackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/146931675277809-1.png"))); // NOI18N
        getContentPane().add(editaccountinfobackground);
        editaccountinfobackground.setBounds(560, 20, 210, 620);

        backtouseroptions.setFont(new java.awt.Font("Oriya MN", 0, 13)); // NOI18N
        backtouseroptions.setText("Back to Options");
        backtouseroptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtouseroptionsActionPerformed(evt);
            }
        });
        getContentPane().add(backtouseroptions);
        backtouseroptions.setBounds(30, 550, 150, 29);

        FNbutton.setText("Change First Name");
        FNbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(FNbutton);
        FNbutton.setBounds(340, 320, 170, 29);

        whiteboxbackground.setBackground(new java.awt.Color(255, 255, 255));
        whiteboxbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/WHITE-BOX7-1024x902.png"))); // NOI18N
        getContentPane().add(whiteboxbackground);
        whiteboxbackground.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        this.dispose();
        welcomepage homewindow = new welcomepage(new javax.swing.JFrame(), true);
        homewindow.setSize(800,620);
        homewindow.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    private void FNbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNbuttonActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 0, FNtextfield.getText());
        updateUserInfoText();
    }//GEN-LAST:event_FNbuttonActionPerformed

    private void LNbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNbuttonActionPerformed
         hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 1, LNtextfield.getText());
         updateUserInfoText();
    }//GEN-LAST:event_LNbuttonActionPerformed

    private void passwordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordbuttonActionPerformed
         hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 3, passwordtextfield.getText());
         updateUserInfoText();
    }//GEN-LAST:event_passwordbuttonActionPerformed

    private void emailbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailbuttonActionPerformed
         hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 4, emailtextfield.getText());
         updateUserInfoText();
    }//GEN-LAST:event_emailbuttonActionPerformed

    private void backtouseroptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtouseroptionsActionPerformed
        this.dispose();
        useroptionswindow optwin = new useroptionswindow(new javax.swing.JFrame(), true);
             optwin.setSize(800,620);
             optwin.setVisible(true);
    }//GEN-LAST:event_backtouseroptionsActionPerformed
    
    private void phonenumberbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenumberbuttonActionPerformed
        hotelsystemMAIN.systemUserList.editUserInfo(hotelsystemMAIN.user.getUserName(), 5, phonenumtextfield.getText());
        updateUserInfoText();
    }//GEN-LAST:event_phonenumberbuttonActionPerformed

    public static void main(String args[]) {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editaccountinfo dialog = new editaccountinfo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton FNbutton;
    private javax.swing.JTextField FNtextfield;
    
    private javax.swing.JButton LNbutton;
    private javax.swing.JTextField LNtextfield;
    
    private javax.swing.JButton passwordbutton;
    private javax.swing.JTextField passwordtextfield;
    
    private javax.swing.JButton emailbutton;
    private javax.swing.JFormattedTextField emailtextfield;
    
    private javax.swing.JButton phonenumberbutton;
    private javax.swing.JFormattedTextField phonenumtextfield;
    
    private javax.swing.JButton backtouseroptions;
    private javax.swing.JLabel editaccountinfobackground;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel instructions;
    private javax.swing.JTextArea userHeader;
    private javax.swing.JTextArea userLabels;
    private javax.swing.JTextArea userInfo; 
    private javax.swing.JLabel pagetitle;
    private javax.swing.JLabel whiteboxbackground;
    // End of variables declaration//GEN-END:variables
}
