/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author JAINHEMANT
 */
public class CarManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CarManagementJPanel
     */
    private JPanel rightPanel;
    private CarDirectory carDirectory;
    
    public CarManagementJPanel(JPanel rightPanel,CarDirectory carDirectory) {
        initComponents();
        this.rightPanel=rightPanel;
        this.carDirectory=carDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnaddCar = new javax.swing.JButton();
        btnManageCar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 204, 255));

        btnaddCar.setText("Add New Car Details");
        btnaddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddCarActionPerformed(evt);
            }
        });

        btnManageCar.setText("Manage Car Details");
        btnManageCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnaddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnManageCar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddCar)
                    .addComponent(btnManageCar))
                .addContainerGap(392, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddCarActionPerformed
        // TODO add your handling code here:
        
        
        CreateCarJPanel createPanel = new CreateCarJPanel(this.rightPanel,carDirectory);
        this.rightPanel.add("CreateCarJPanel",createPanel);
        CardLayout layout = (CardLayout) this.rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnaddCarActionPerformed

    private void btnManageCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCarActionPerformed
        // TODO add your handling code here:
        
             
        ViewCarJPanel viewPanel = new ViewCarJPanel(this.rightPanel,carDirectory);
        this.rightPanel.add("ViewCarJPanel",viewPanel);
        CardLayout layout = (CardLayout) this.rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_btnManageCarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCar;
    private javax.swing.JButton btnaddCar;
    // End of variables declaration//GEN-END:variables
}