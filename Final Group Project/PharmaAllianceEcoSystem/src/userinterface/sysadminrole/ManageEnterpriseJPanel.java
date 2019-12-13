/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.sysadminrole;

import business.ConfigureASystem;
import business.EcoSystem;
import business.enterprise.ChemistEnterprise;
import business.enterprise.Enterprise;
import business.enterprise.SupplierEnterprise;
import business.network.Network;
import commonutils.Validator;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author NEERAJ PREMANI
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    private static final Logger log = LogManager.getLogger(ManageEnterpriseJPanel.class);

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.setSize(1200, 750);
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        ((DefaultTableCellRenderer) enterpriseJTable.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        enterpriseJTable.setShowGrid(true);
        enterpriseJTable.setSize(300, 64);

        populateTable();
        populateComboBox();
        log.info("ManageEnterpriseJPanel loaded successfully");
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkDirectory().getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network;
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }

    private void populateComboBox() {
         enterpriseJTable.getTableHeader().setFont(new Font("Segoe UI", 1, 20));
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkDirectory().getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        updateEnterprisejButton = new javax.swing.JButton();
        deleteEnterprisejButton = new javax.swing.JButton();
        backJButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1200, 750));
        setMinimumSize(new java.awt.Dimension(1200, 750));
        setPreferredSize(new java.awt.Dimension(1200, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 255, 255));
        kGradientPanel1.setMaximumSize(new java.awt.Dimension(1200, 750));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1200, 750));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1200, 750));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setBackground(new java.awt.Color(153, 255, 255));
        enterpriseJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enterpriseJTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enterpriseJTable.setGridColor(new java.awt.Color(0, 0, 0));
        enterpriseJTable.setSelectionBackground(new java.awt.Color(153, 255, 255));
        enterpriseJTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(enterpriseJTable);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 800, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Network");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        kGradientPanel1.add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 136, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kGradientPanel1.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 136, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enterprise Type");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        enterpriseTypeJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });
        kGradientPanel1.add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 136, -1));

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, 100, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setText("Manage Enterprise");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 380, 50));

        updateEnterprisejButton.setText("Edit");
        updateEnterprisejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEnterprisejButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(updateEnterprisejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        deleteEnterprisejButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteEnterprisejButton.setText("Delete");
        deleteEnterprisejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEnterprisejButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(deleteEnterprisejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        backJButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/arrow-back-icon_1_40x40.png"))); // NOI18N
        backJButton1.setContentAreaFilled(false);
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/org.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -420, 1900, 1370));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            log.info("Invalid input!!");
            return;
        }

        String name = nameJTextField.getText();

        if (!Validator.isValidAlphaNumericWithSpaces(name)) {
            //Name is not valid
            JOptionPane.showMessageDialog(null, "Please enter a valid name. Only alphanumeric characters, spaces and . allowed.");
            log.info("Please enter a valid name. Only alphanumeric characters, spaces and . allowed.");
            return;
        }

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);

        if (enterprise == null) {
            //Enterprise with same name already exists. Throw error
            JOptionPane.showMessageDialog(null, "Enterprise with the given name already exists in this network! Please check.");
            log.info("Enterprise with the given name already exists in this network! Please check.");
            return;
        }

        if (type == Enterprise.EnterpriseType.Chemist) {
            ChemistEnterprise chemistEnterprise = (ChemistEnterprise) enterprise;
            chemistEnterprise.getInventory().setDrugStock(ConfigureASystem.generateInventory());
        } else if (type == Enterprise.EnterpriseType.Supplier) {
            SupplierEnterprise supplierEnterprise = (SupplierEnterprise) enterprise;
            supplierEnterprise.getInventory().setDrugStock(ConfigureASystem.generateInventory());
        }
//        }else if (type == Enterprise.EnterpriseType.Manufacturer) {
//            ManufacturerEnterprise manufacturerEnterprise = (ManufacturerEnterprise) enterprise;
//            manufacturerEnterprise.getInventory().setDrugStock(ConfigureASystem.generateInventory());
//        }

        JOptionPane.showMessageDialog(null, "Enterprise created successfully.");
        log.info("Enterprise created successfully.");
        nameJTextField.setText("");
        networkJComboBox.setSelectedIndex(0);
        enterpriseTypeJComboBox.setSelectedIndex(0);
        populateTable();

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void updateEnterprisejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEnterprisejButtonActionPerformed

        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!!");
        } else {
            Enterprise enterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);
            Network network = (Network) enterpriseJTable.getValueAt(selectedRow, 1);
            JFrame frame = new JFrame();
            String message = (String) JOptionPane.showInputDialog(frame,
                    "Update Enterprise",
                    "New Name",
                    JOptionPane.OK_CANCEL_OPTION);
            if (!Validator.isValidAlphaNumericWithSpaces(message)) {
                JOptionPane.showMessageDialog(null, "Enterprise update failed. Only alphanumeric characters, spaces and . allowed.");
                log.info("Enterprise update failed. Only alphanumeric characters, spaces and . allowed.");
                return;
            }

            network.getEnterpriseDirectory().updateEnterprise(enterprise.getName(), message);
            populateTable();
        }

    }//GEN-LAST:event_updateEnterprisejButtonActionPerformed

    private void deleteEnterprisejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEnterprisejButtonActionPerformed
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!!");
            log.info("Please select a row!!!");
        } else {
            Enterprise enterprise = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);
            Network network = (Network) enterpriseJTable.getValueAt(selectedRow, 1);

            if (enterprise.getOrganizationDirectory().getOrganizationList().size() > 0) {
                JOptionPane.showMessageDialog(null, "Enterprise has organization which are active. Please remove them first");
                log.info("Enterprise has organization which are active. Please remove them first");
                return;
            }

            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                //can delete the network now.
                network.getEnterpriseDirectory().removeEnterprise(enterprise);
            }

            populateTable();
        }
    }//GEN-LAST:event_deleteEnterprisejButtonActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton deleteEnterprisejButton;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton updateEnterprisejButton;
    // End of variables declaration//GEN-END:variables
}