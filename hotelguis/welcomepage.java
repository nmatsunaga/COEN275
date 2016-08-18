package hotelguis;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class welcomepage extends javax.swing.JDialog {   

    /* Creates new form welcomepage */
    public welcomepage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        welcomepagepanel = new javax.swing.JPanel();
        welcometext = new javax.swing.JLabel();
        checkavailbutton = new javax.swing.JButton();
        loginbutton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        welcomepagepanel.setBackground(java.awt.SystemColor.textHighlight);
        welcomepagepanel.setLayout(null);

        welcometext.setFont(new java.awt.Font("Oriya MN", 1, 48)); // NOI18N
        welcometext.setForeground(new java.awt.Color(255, 255, 255));
        welcometext.setText("Welcome to the SCU Hotel!");
        welcomepagepanel.add(welcometext);
        welcometext.setBounds(70, 30, 690, 132);

        checkavailbutton.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        checkavailbutton.setText("Check Availability");
        checkavailbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkavailbuttonActionPerformed(evt);
            }
        });
        welcomepagepanel.add(checkavailbutton);
        checkavailbutton.setBounds(60, 550, 215, 38);

        loginbutton.setFont(new java.awt.Font("Oriya MN", 1, 18)); // NOI18N
        loginbutton.setText("Log-In");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        welcomepagepanel.add(loginbutton);
        loginbutton.setBounds(600, 550, 118, 38);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelguis/newpackage/hotelresized.jpg"))); // NOI18N
        welcomepagepanel.add(background);
        background.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomepagepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomepagepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void checkavailbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkavailbuttonActionPerformed
        checkavail cawindow = new checkavail(new javax.swing.JFrame(), true);
        cawindow.setSize(800,620);
        cawindow.setVisible(true);
    }//GEN-LAST:event_checkavailbuttonActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        loginpage loginwindow = new loginpage(new javax.swing.JFrame(), true);
        loginwindow.setSize(800,620);
        loginwindow.setVisible(true);
    }//GEN-LAST:event_loginbuttonActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(welcomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                welcomepage dialog = new welcomepage(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel background;
    private javax.swing.JButton checkavailbutton;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPanel welcomepagepanel;
    private javax.swing.JLabel welcometext;
    // End of variables declaration//GEN-END:variables
}