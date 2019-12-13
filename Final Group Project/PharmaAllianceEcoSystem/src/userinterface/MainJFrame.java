/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.EcoSystem;
import business.db4outil.DB4OUtil;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.Organization;
import business.useraccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import userinterface.logout.LogOutScreen;

/**
 *
 * @author jaysh
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    //The parent EcoSystem Singleton Object
    private EcoSystem system;
    private static final Logger log = LogManager.getLogger(MainJFrame.class);
    //Singleton DB4O object to store and retrieve the EcoSystem when system STARTS/STOPS
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        setUndecorated(true);
        initComponents();
        //Retrieving the system from the file
        system = dB4OUtil.retrieveSystem();
        this.setSize(1200, 750);
        jButtonLogIn.setEnabled(true);
        jButtonLogOut.setEnabled(false);

        jButtonClose.addActionListener(new CloseListener());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelUserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldUn = new javax.swing.JTextField();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jButtonLogIn = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jSplitPane1.setPreferredSize(new java.awt.Dimension(1200, 750));

        jPanel1.setBackground(new java.awt.Color(23, 35, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 750));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUserName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUserName.setText("User Name");
        jPanel1.add(jLabelUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 104, -1, -1));
        jPanel1.add(jTextFieldUn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, 87, -1));
        jPanel1.add(jPasswordFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 126, 87, -1));

        jButtonLogIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/greenfor.png"))); // NOI18N
        jButtonLogIn.setText("Login");
        jButtonLogIn.setMaximumSize(new java.awt.Dimension(90, 36));
        jButtonLogIn.setMinimumSize(new java.awt.Dimension(90, 36));
        jButtonLogIn.setPreferredSize(new java.awt.Dimension(90, 36));
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 90, 36));

        jButtonLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logout_btn.png"))); // NOI18N
        jButtonLogOut.setText("Out");
        jButtonLogOut.setMaximumSize(new java.awt.Dimension(90, 36));
        jButtonLogOut.setMinimumSize(new java.awt.Dimension(90, 36));
        jButtonLogOut.setPreferredSize(new java.awt.Dimension(77, 36));
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 90, 36));

        jButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/logout.png"))); // NOI18N
        jButtonClose.setText("Stop");
        jButtonClose.setMaximumSize(new java.awt.Dimension(90, 36));
        jButtonClose.setMinimumSize(new java.awt.Dimension(90, 36));
        jButtonClose.setPreferredSize(new java.awt.Dimension(90, 36));
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 90, 36));

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(204, 204, 255));
        container.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel4.setText("                                         DRUG INVENTORY SYSTEM");
        container.add(jLabel4, "card2");

        jSplitPane1.setRightComponent(container);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1100, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed

        // TODO add your handling code here:
        // Get user name
        String userName = jTextFieldUn.getText();
        // Get Password
        char[] passwordCharArray = jPasswordFieldLogin.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;
        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : system.getNetworkDirectory().getNetworkList()) {
                //Step 2.a: check against each enterprise
                if (userAccount == null) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                        if (userAccount == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                if (userAccount != null) {
                                    inEnterprise = enterprise;
                                    inOrganization = organization;
                                    inNetwork = network;
                                    break;
                                }
                            }

                        }
                        if (userAccount != null) {
                            inEnterprise = enterprise;
                            inNetwork = network;
                            break;
                        }
                    }
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            System.out.println("Main mai"+inOrganization+ "  "+ inEnterprise+ "  "+ userAccount+ "  "+ inNetwork);
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, inNetwork));
            layout.next(container);
        }

        jButtonLogIn.setEnabled(false);
        jButtonLogOut.setEnabled(true);
        jTextFieldUn.setEnabled(false);
        jPasswordFieldLogin.setEnabled(false);

    }//GEN-LAST:event_jButtonLogInActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        jButtonLogIn.setEnabled(true);
        jButtonLogOut.setEnabled(false);
        jTextFieldUn.setEnabled(true);
        jPasswordFieldLogin.setEnabled(true);

        jTextFieldUn.setText("");
        jPasswordFieldLogin.setText("");

        container.removeAll();
        JPanel logoutPanel = new LogOutScreen();
        container.add("logoutScreen", logoutPanel);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed

    }//GEN-LAST:event_jButtonCloseActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextFieldUn;
    // End of variables declaration//GEN-END:variables
}
