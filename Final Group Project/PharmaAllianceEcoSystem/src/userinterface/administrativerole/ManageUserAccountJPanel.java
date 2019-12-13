/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.administrativerole;

import business.employee.Employee;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.role.Role;
import business.useraccount.UserAccount;
import commonutils.PasswordUtility;
import commonutils.Validator;
import commonutils.email.SendEmail;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author jaysh
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    private JPanel container;
    private Enterprise enterprise;
    

    private static final Logger log = LogManager.getLogger(ManageUserAccountJPanel.class);

    /**
     * Creates new form ManageUserAccountJPanel
     */
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.setSize(1200, 750);
        this.enterprise = enterprise;
        this.container = container;
        ((DefaultTableCellRenderer) userJTable.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        userJTable.setShowGrid(true);
        userJTable.setSize(300, 64);
        popOrganizationComboBox();
        // employeeJComboBox.removeAllItems();
        popData();
        log.info("ManageUserAccountJPanel loaded successfully");
    }

    public void populateEmployeeComboBox(Organization organization) {
        
        userJTable.getTableHeader().setFont(new Font("Segoe UI", 1, 20));
        employeeJComboBox.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    private void populateRoleComboBox(Organization organization) {
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()) {
            roleJComboBox.addItem(role);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        emailIdJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setMaximumSize(new java.awt.Dimension(1200, 750));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1200, 750));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1200, 750));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createUserJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createUserJButton.setText("Create");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 30));
        kGradientPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 250, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("User Name");
        jLabel1.setToolTipText("");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, -1, -1));

        userJTable.setBackground(new java.awt.Color(102, 255, 204));
        userJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userJTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role", "Organization"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJTable.setSelectionBackground(new java.awt.Color(102, 255, 204));
        userJTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(userJTable);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 750, 220));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Email ID");
        jLabel2.setToolTipText("");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Employee");
        jLabel3.setToolTipText("");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 470, -1, -1));

        kGradientPanel1.add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 250, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Organization");
        jLabel5.setToolTipText("");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        kGradientPanel1.add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 250, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Role");
        jLabel4.setToolTipText("");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, -1));

        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });
        kGradientPanel1.add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 250, -1));
        kGradientPanel1.add(emailIdJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, 250, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("Manage User Account");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 420, 50));

        backJButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/arrow-back-icon_1_40x40.png"))); // NOI18N
        backJButton1.setContentAreaFilled(false);
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setToolTipText("");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, -80, 1270, 830));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setToolTipText("");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, -80, 1270, 830));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/org.jpg"))); // NOI18N
        jLabel11.setText("jLabel8");
        kGradientPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -40, 1270, 830));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = nameJTextField.getText();
        //String password = passwordJTextField.getText();
        String emailID = emailIdJTextField.getText();

        //Validations remaining
        if (!Validator.isValidUsername(userName)) {
            JOptionPane.showMessageDialog(null, "Username in incorrect format. Should be 2 to 25 characters "
                    + "and characters, numbers and the ., -, _ symbols");
            log.info("Username in incorrect format. Should be 2 to 25 characters "
                    + "and characters, numbers and the ., -, _ symbols");
            return;
        }
        
        if(!Validator.isValidEmail(emailID))
        {
            JOptionPane.showMessageDialog(null, "Email should be in correct format!"
                    + "Format: abc@def.com");
            log.info( "Email should be in correct format! "
                    + " Format:   abc@def.com");
            return;
        }

        String password = PasswordUtility.createPassword(userName);

        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();

        if (employee == null || role == null) {
            JOptionPane.showMessageDialog(null, "Please fill correct information in employee and role fields");
            log.info("Please fill correct information in employee and role fields");
            return;
        }

        UserAccount userAccount = organization.getUserAccountDirectory().createUserAccount(userName, password, emailID, employee, role);

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Username already exists in this organization! Please check");
            log.info("Username already exists in this organization! Please check");
            return;
        }
        //Send email to user with password.
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable runnableTask = () -> {
            try {
                log.info("Send email task started");
                SendEmail sendEmail = new SendEmail();
                sendEmail.sendMail(userName, emailID, password, role);

            } catch (Exception exception) {
                //JOptionPane.showMessageDialog(null, "We were unable to send mail to the desired recepient! Please contact system administrator");
                exception.printStackTrace();
            }
        };

        executor.execute(runnableTask);

        executor.shutdown();

//        try {
//            SendEmail sendEmail = new SendEmail();
//
//            sendEmail.sendMail(userName, emailID, password);
//        } catch (Exception exception) {
//            JOptionPane.showMessageDialog(null, "We were unable to send mail to the desired recepient! Please contact system administrator");
//            exception.printStackTrace();
//        }
        JOptionPane.showMessageDialog(null, "User created successfully. Please check email for login credentials.");
        log.info("User created successfully. Please check email for login credentials.");
        organizationJComboBox.setSelectedIndex(0);
        employeeJComboBox.setSelectedIndex(0);
        roleJComboBox.setSelectedIndex(0);
        nameJTextField.setText("");
        emailIdJTextField.setText("");
        popData();
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        System.out.println(organization);
        if (organization != null) {
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButton1ActionPerformed

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

            for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountListValues()) {
                Object row[] = new Object[3];
                row[0] = userAccount;
                row[1] = userAccount.getRole();
                row[2] = organization;
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JTextField emailIdJTextField;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}