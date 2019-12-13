/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.hospital.doctorrole;

import business.EcoSystem;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.chemist.ManagerOrganization;
import business.organization.hospital.DoctorOrganization;
import business.organization.hospital.PatientOrganization;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;
import business.workqueue.WorkRequestDoctor;
import business.workqueue.WorkRequestDrugs;
import commonutils.Constants;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import userinterface.chemist.managerrole.AssignToSupplier;
import userinterface.chemist.managerrole.ManagerWorkAreaJPanel;
import userinterface.chemist.managerrole.ViewOrderjpanel;
import userinterface.chemist.workerrole.WorkerWorkAreaJPanel;

/**
 *
 * @author JAINHEMANT
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private static final Logger log = LogManager.getLogger(WorkerWorkAreaJPanel.class);

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (DoctorOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = business;
        
         jComboBoxFilter.removeAllItems();
        jComboBoxFilter.addItem("All");
        jComboBoxFilter.addItem(Constants.chemistCoworkerRequestCreated);
        jComboBoxFilter.addItem(Constants.chemistCoworkerSendForApproval);
        jComboBoxFilter.addItem(Constants.ManagerApprove);
        jComboBoxFilter.addItem(Constants.ManagerReject);
        jComboBoxFilter.addItem(Constants.sentToSupplier);
        jComboBoxFilter.addItem(Constants.sentToLegal);
        jComboBoxFilter.addItem(Constants.rejectedByLegal);
        jComboBoxFilter.addItem(Constants.acceptedByLegal);
        jComboBoxFilter.addItem(Constants.requestBid);
        jComboBoxFilter.addItem(Constants.resentToChemist);
        jComboBoxFilter.addItem(Constants.sentToManufacturer);
        jComboBoxFilter.addItem(Constants.priceUpdatedByManufacturer);
        jComboBoxFilter.addItem(Constants.processedByManufacturer);
        jComboBoxFilter.addItem(Constants.orderCannotBeFullfilled);
        this.setSize(1200, 750);
        ((DefaultTableCellRenderer) workRequestJTable.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        title.setText("Doctor Work Area " + userAccount.getUsername());
        workRequestJTable.setSize(300, 64);
              
        populateDoctorTable();
    }

    public void populateDoctorTable() {
  workRequestJTable.getTableHeader().setFont(new Font("Segoe UI", 1, 20));


        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        int count = 0;
        System.out.println(organization.getWorkQueue().getWorkRequestList());
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request.getReceiver() == userAccount) {
                // System.out.println(request + "Hello");
                WorkRequestDoctor workReqDoc = (WorkRequestDoctor) request;
                Object[] row = new Object[4];
                row[0] = workReqDoc;
                count++;
                row[1] = request.getSender();
                row[2] = request.getReceiver();
                row[3] = request.getStatus();
                model.addRow(row);
            }
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

        sendToPatient = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxFilter = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        sendToPatient.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sendToPatient.setText("Process");
        sendToPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToPatientActionPerformed(evt);
            }
        });
        add(sendToPatient);
        sendToPatient.setBounds(360, 510, 220, 31);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Filter Status By:");
        add(jLabel2);
        jLabel2.setBounds(150, 390, 140, 22);

        jComboBoxFilter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxFilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFilterActionPerformed(evt);
            }
        });
        add(jComboBoxFilter);
        jComboBoxFilter.setBounds(290, 390, 90, 28);

        workRequestJTable.setBackground(new java.awt.Color(153, 255, 255));
        workRequestJTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        workRequestJTable.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Doctor Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestJTable.setGridColor(new java.awt.Color(0, 0, 0));
        workRequestJTable.setSelectionBackground(new java.awt.Color(153, 255, 255));
        workRequestJTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(135, 122, 669, 245);

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setText("Title");
        title.setAlignmentX(740.0F);
        title.setAlignmentY(245.0F);
        add(title);
        title.setBounds(30, 40, 740, 48);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/doctor.jpg"))); // NOI18N
        jLabel6.setText("jLabel1");
        add(jLabel6);
        jLabel6.setBounds(-290, 10, 1390, 900);
    }// </editor-fold>//GEN-END:initComponents

    private void sendToPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToPatientActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select row");
            return;
        }

        WorkRequestDoctor request = (WorkRequestDoctor) workRequestJTable.getValueAt(selectedRow, 0);
        //        if (!(Constants.sentToSupplier).equalsIgnoreCase(request.getStatus())) {
        //            if (!(Constants.ManagerApprove).equalsIgnoreCase(request.getStatus())) {
        //                JOptionPane.showMessageDialog(null, "Request Approved can only be send to Supplier");
        //                return;
        //            } else {
         System.out.println("First DOCTOR ID "+request);
        if (request.getReceiver().equals(userAccount)) {
            if ((Constants.patientRequestCreated).equalsIgnoreCase(request.getStatus())) {
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("ProcessDoctor", new ProcessRequestJPanel(userProcessContainer, organization, ecosystem, userAccount, request, this.enterprise));
                layout.next(userProcessContainer);
                log.info("Prescription Details");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid action.");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Request not assign to you.");
            return;
        }
    }//GEN-LAST:event_sendToPatientActionPerformed

    private void jComboBoxFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFilterActionPerformed
        // TODO add your handling code here:
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(((DefaultTableModel) workRequestJTable.getModel()));
        if (jComboBoxFilter.getSelectedItem() != null) {
            if (!jComboBoxFilter.getSelectedItem().toString().equalsIgnoreCase("All")) {
                sorter.setRowFilter(RowFilter.regexFilter(jComboBoxFilter.getSelectedItem().toString()));
                workRequestJTable.setRowSorter(sorter);
            } else {
                workRequestJTable.setRowSorter(null);
            }
        }
    }//GEN-LAST:event_jComboBoxFilterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxFilter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendToPatient;
    private javax.swing.JLabel title;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}