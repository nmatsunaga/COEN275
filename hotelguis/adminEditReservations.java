package hotelguis;


import java.util.Calendar;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class adminEditReservations extends javax.swing.JDialog {

	//DATA
    private DefaultTableModel model;
    
    //CONSTRUCTOR
    public adminEditReservations(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        reservationDisplayTable.setEnabled(false);
        model = (DefaultTableModel) reservationDisplayTable.getModel();
        setTableContents();
    }
    
    //Get mm/dd/yyyy string format from Calendar object
    private String getDateString(Calendar date){
    	return (date.get(Calendar.MONTH) + 1) + "/" + date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.YEAR);
    }
    
    //Populate Table with Existing Reservations in System
    private void setTableContents(){
    	for (int i = 0; i < hotelsystemMAIN.systemReservationList.reservationCount(); i++) {
            reservationProcess.Entry e = hotelsystemMAIN.systemReservationList.entries.get(i);
            
        	Vector<String> resv = new Vector<>();
        
        	resv.add(Integer.toString(e.getReservId()));
        	resv.add(getDateString(e.getStartDate()));
        	resv.add(getDateString(e.getEndDate()));
        	resv.add(Integer.toString(e.getRoomId()));
              
            model.addRow(resv);
        }
    }
    
    //Sanitize the reservation ID user input
    private int getResID(String s){
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
    //GUI Element Descriptions
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        pagetitle = new javax.swing.JLabel();
        checkindate = new javax.swing.JLabel();
        checkoutdate = new javax.swing.JLabel();
        endmonthchoice = new java.awt.Choice();
        startmonthchoice = new java.awt.Choice();
        startdaychoice1 = new java.awt.Choice();
        enddaychoice = new java.awt.Choice();
        startyearchoice1 = new java.awt.Choice();
        endyearchoice = new java.awt.Choice();
        adminPageButton = new javax.swing.JButton();
        editResDates = new javax.swing.JButton();
        deleteResButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationDisplayTable = new javax.swing.JTable();
        reservationIDtextfield = new javax.swing.JTextField();
        searchforreservation = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        pagetitle.setFont(new java.awt.Font("Oriya MN", 1, 24)); // NOI18N
        pagetitle.setForeground(new java.awt.Color(255, 255, 255));
        pagetitle.setText("Admin: Edit Reservations");
        getContentPane().add(pagetitle);
        pagetitle.setBounds(10, 10, 320, 50);

        checkindate.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkindate.setForeground(new java.awt.Color(255, 255, 255));
        checkindate.setText("New Check-In Date");
        getContentPane().add(checkindate);
        checkindate.setBounds(100, 140, 180, 22);

        checkoutdate.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkoutdate.setForeground(new java.awt.Color(255, 255, 255));
        checkoutdate.setText("New Check-Out Date");
        getContentPane().add(checkoutdate);
        checkoutdate.setBounds(90, 170, 210, 22);

        endmonthchoice.add("January");
        endmonthchoice.add("February");
        endmonthchoice.add("March");
        endmonthchoice.add("April");
        endmonthchoice.add("May");
        endmonthchoice.add("June");
        endmonthchoice.add("July");
        endmonthchoice.add("August");
        endmonthchoice.add("September");
        endmonthchoice.add("October");
        endmonthchoice.add("November");
        endmonthchoice.add("December");
        getContentPane().add(endmonthchoice);
        endmonthchoice.setBounds(300, 170, 179, 20);

        startmonthchoice.add("January");
        startmonthchoice.add("February");
        startmonthchoice.add("March");
        startmonthchoice.add("April");
        startmonthchoice.add("May");
        startmonthchoice.add("June");
        startmonthchoice.add("July");
        startmonthchoice.add("August");
        startmonthchoice.add("September");
        startmonthchoice.add("October");
        startmonthchoice.add("November");
        startmonthchoice.add("December");
        getContentPane().add(startmonthchoice);
        startmonthchoice.setBounds(300, 140, 179, 20);

        startdaychoice1.add("1");
        startdaychoice1.add("2");
        startdaychoice1.add("3");
        startdaychoice1.add("4");
        startdaychoice1.add("5");
        startdaychoice1.add("6");
        startdaychoice1.add("7");
        startdaychoice1.add("8");
        startdaychoice1.add("9");
        startdaychoice1.add("10");
        startdaychoice1.add("11");
        startdaychoice1.add("12");
        startdaychoice1.add("13");
        startdaychoice1.add("14");
        startdaychoice1.add("15");
        startdaychoice1.add("16");
        startdaychoice1.add("17");
        startdaychoice1.add("18");
        startdaychoice1.add("19");
        startdaychoice1.add("20");
        startdaychoice1.add("21");
        startdaychoice1.add("22");
        startdaychoice1.add("23");
        startdaychoice1.add("24");
        startdaychoice1.add("25");
        startdaychoice1.add("26");
        startdaychoice1.add("27");
        startdaychoice1.add("28");
        startdaychoice1.add("29");
        startdaychoice1.add("30");
        startdaychoice1.add("31");
        getContentPane().add(startdaychoice1);
        startdaychoice1.setBounds(490, 140, 70, 20);

        enddaychoice.add("1");
        enddaychoice.add("2");
        enddaychoice.add("3");
        enddaychoice.add("4");
        enddaychoice.add("5");
        enddaychoice.add("6");
        enddaychoice.add("7");
        enddaychoice.add("8");
        enddaychoice.add("9");
        enddaychoice.add("10");
        enddaychoice.add("11");
        enddaychoice.add("12");
        enddaychoice.add("13");
        enddaychoice.add("14");
        enddaychoice.add("15");
        enddaychoice.add("16");
        enddaychoice.add("17");
        enddaychoice.add("18");
        enddaychoice.add("19");
        enddaychoice.add("20");
        enddaychoice.add("21");
        enddaychoice.add("22");
        enddaychoice.add("23");
        enddaychoice.add("24");
        enddaychoice.add("25");
        enddaychoice.add("26");
        enddaychoice.add("27");
        enddaychoice.add("28");
        enddaychoice.add("29");
        enddaychoice.add("30");
        enddaychoice.add("31");
        getContentPane().add(enddaychoice);
        enddaychoice.setBounds(490, 170, 70, 20);

        startyearchoice1.add("2016");
        startyearchoice1.add("2017");
        startyearchoice1.add("2018");
        getContentPane().add(startyearchoice1);
        startyearchoice1.setBounds(570, 140, 98, 20);

        endyearchoice.add("2016");
        endyearchoice.add("2017");
        endyearchoice.add("2018");
        getContentPane().add(endyearchoice);
        endyearchoice.setBounds(570, 170, 98, 20);

        adminPageButton.setText("Back to ADMIN Page");
        adminPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminPageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(adminPageButton);
        adminPageButton.setBounds(600, 0, 200, 29);

        editResDates.setText("Edit Reservation");
        editResDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editResDatesActionPerformed(evt);
            }
        });
        getContentPane().add(editResDates);
        editResDates.setBounds(470, 230, 200, 29);

        deleteResButton.setText("Delete Reservation");
        deleteResButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteResButton);
        deleteResButton.setBounds(470, 260, 200, 29);

        reservationDisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Reservation ID", "User ID", "Start Date", "End Date"}
        	) {
            	Class[] types = new Class [] {
            			java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            	};

            	public Class getColumnClass(int columnIndex) {
            		return types [columnIndex];
            	}
        	}
        );
        reservationDisplayTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(reservationDisplayTable);
        reservationDisplayTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 350, 690, 230);

        getContentPane().add(reservationIDtextfield);
        reservationIDtextfield.setBounds(410, 70, 160, 26);

        searchforreservation.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        searchforreservation.setForeground(new java.awt.Color(255, 255, 255));
        searchforreservation.setText("Enter the Reservation ID # you'd like to edit:");
        getContentPane().add(searchforreservation);
        searchforreservation.setBounds(20, 70, 430, 22);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/resizedblackbackground.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminPageButtonActionPerformed
        this.dispose();
        administratoroptions adminwindow = new administratoroptions(new javax.swing.JFrame(), true);
        adminwindow.setSize(800,620);
        adminwindow.setVisible(true);
    }//GEN-LAST:event_adminPageButtonActionPerformed

    private void editResDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editResDatesActionPerformed
    	String resIDInput = reservationIDtextfield.getText();
    	
    	int resID = getResID(resIDInput);
    	
    	if(resID >= 0){
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == resID){
    				Calendar startDate = Calendar.getInstance();
    				Calendar endDate = Calendar.getInstance();
    				
    				startDate.set(startyearchoice1.getSelectedIndex() + 2016, startmonthchoice.getSelectedIndex(), startdaychoice1.getSelectedIndex() + 1);
    				endDate.set(endyearchoice.getSelectedIndex() + 2016, endmonthchoice.getSelectedIndex(), enddaychoice.getSelectedIndex() + 1);
    				
    				if(hotelsystemMAIN.systemReservationList.adminChangeReservation(resID, startDate, endDate)){
    					model.setValueAt(getDateString(startDate), i, 1);
    					model.setValueAt(getDateString(endDate), i, 2);
    					
    					return;
    				}
    			}
    		}
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid reservation ID!");
    		
    		return;
    	}
    	
    	hotelsystemMAIN.reportError("Reservation ID not found!");
    }//GEN-LAST:event_editResDatesActionPerformed

    //Action Listener for deleting reservation that has been selected in table.
    private void deleteResButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResButtonActionPerformed
    	String resIDInput = reservationIDtextfield.getText();
    	
    	int resID = getResID(resIDInput);
    	
    	if(resID >= 0){
    		for(int i = 0; i < model.getRowCount(); i++){
    			if(Integer.parseInt((String) model.getValueAt(i, 0)) == resID){
    				if(hotelsystemMAIN.systemReservationList.adminCancelReservationByRid(resID)){
    					model.removeRow(i);
    					
    					return;
    				}
    			}
    		}
    	}
    	else{
    		hotelsystemMAIN.reportError("Invalid reservation ID!");
    		
    		return;
    	}
    	
    	hotelsystemMAIN.reportError("Reservation ID not found!");
    }//GEN-LAST:event_deleteResButtonActionPerformed
    
    //Local main to test page specific GUI attributes
    /*
    public static void main(String args[]) {
        //Create and display the dialog
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                adminEditReservations dialog = new adminEditReservations(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton adminPageButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel checkindate;
    private javax.swing.JLabel checkoutdate;
    private javax.swing.JButton deleteResButton;
    private javax.swing.JButton editResDates;
    public java.awt.Choice enddaychoice;
    public java.awt.Choice endmonthchoice;
    public java.awt.Choice endyearchoice;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pagetitle;
    private javax.swing.JTable reservationDisplayTable;
    private javax.swing.JTextField reservationIDtextfield;
    private javax.swing.JLabel searchforreservation;
    public java.awt.Choice startdaychoice1;
    public java.awt.Choice startmonthchoice;
    public java.awt.Choice startyearchoice1;
    // End of variables declaration//GEN-END:variables
}
