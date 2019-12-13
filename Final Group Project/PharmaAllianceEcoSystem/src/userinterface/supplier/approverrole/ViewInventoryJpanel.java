/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.supplier.approverrole;

import business.drug.Drug;
import business.inventory.Inventory;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author NEERAJ PREMANI
 */
public class ViewInventoryJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewOrderjpanel
     */
    private JPanel userProcessContainer;
    private Inventory inventory;

    public ViewInventoryJpanel(JPanel userProcessContainer, Inventory inventory) {
        initComponents();
        this.setSize(1200, 750);
        ((DefaultTableCellRenderer) drugquantity.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        this.userProcessContainer = userProcessContainer;
        this.inventory = inventory;
        populateRequestTable();
    }

    public void populateRequestTable() {
          drugquantity.getTableHeader().setFont(new Font("Segoe UI", 1, 20));
        DefaultTableModel model = (DefaultTableModel) drugquantity.getModel();

        model.setRowCount(0);
        for (Drug drug : inventory.getDrugStock()) {
            Object[] row = new Object[2];
            row[0] = drug.getName();
            row[1] = drug.getQuantity();
            model.addRow(row);
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
        drugquantity = new javax.swing.JTable();
        title = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 750));

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(183, 248, 230));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1200, 750));
        kGradientPanel1.setLayout(null);

        drugquantity.setBackground(new java.awt.Color(153, 255, 255));
        drugquantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        drugquantity.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        drugquantity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        drugquantity.setGridColor(new java.awt.Color(0, 0, 0));
        drugquantity.setSelectionBackground(new java.awt.Color(153, 255, 255));
        drugquantity.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(drugquantity);

        kGradientPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(162, 173, 612, 231);

        title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        title.setText("Inventory");
        title.setAlignmentX(740.0F);
        title.setAlignmentY(245.0F);
        kGradientPanel1.add(title);
        title.setBounds(220, 70, 320, 48);

        backJButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/arrow-back-icon_1_40x40.png"))); // NOI18N
        backJButton1.setContentAreaFilled(false);
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backJButton1);
        backJButton1.setBounds(20, 40, 50, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons/supp.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(-95, -84, 2080, 1410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JTable drugquantity;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
