/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;

import Business.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author VARSHA PREMANI
 */
public class ViewAirlineJPanel extends javax.swing.JPanel {
    private AirlinerDirectory airDir;
    private Airliner airl;
    private JPanel rightPanel;
    /**
     * Creates new form ViewAirlineJPanel
     */
    public ViewAirlineJPanel(JPanel rightPanel,Airliner airl, AirlinerDirectory airDir) {
        initComponents();
        this.airDir = airDir ;
        this.airl = airl;
        this.rightPanel = rightPanel ;
        
        saveBtn.setEnabled(false);
        airlinerNamejTextField.setText(airl.getAirlinerName());
        airlinerEmailjTextField.setText(airl.getAirlinerEmail());
        airlinerFpdjTextField.setText(String.valueOf(airl.getAirlinerflyperday()));
        airlinerAddr1jTextField.setText(airl.getAddressline1());
        airlinerAddr2jTextField.setText(airl.getAddressline2());
        cityjTextField.setText(airl.getCity());
        statejTextField.setText(airl.getState());
        zipcodejTextField.setText(airl.getZipcode());
        
         airlinerNamejTextField.setEditable(false);
        airlinerEmailjTextField.setEditable(false);
        airlinerFpdjTextField.setEditable(false);
        airlinerAddr1jTextField.setEditable(false);
        airlinerAddr2jTextField.setEditable(false);
        cityjTextField.setEditable(false);
        statejTextField.setEditable(false);
        zipcodejTextField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private boolean usernamePatternCorrect()
    {
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+.[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(airlinerEmailjTextField.getText());
        boolean b=m.matches();
        return b;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        updBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        airlinerNamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        airlinerEmailjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        airlinerFpdjTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        airlinerAddr1jTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        airlinerAddr2jTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cityjTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        statejTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        zipcodejTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Airliner");

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        updBtn.setText("Update");
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Airliner Name* :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Airliner Email* :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Flights Per Day* :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Address Line1* :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Address Line2* :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("City* :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("State* :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Zipcode* :");

        zipcodejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcodejTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(airlinerAddr1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(airlinerEmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(airlinerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(airlinerFpdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(airlinerAddr2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(statejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(zipcodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(154, 154, 154))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(saveBtn)
                            .addGap(18, 18, 18)
                            .addComponent(updBtn))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(airlinerNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(airlinerEmailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(airlinerFpdjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlinerAddr1jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(airlinerAddr2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(zipcodejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updBtn)
                    .addComponent(saveBtn))
                .addGap(26, 26, 26)
                .addComponent(backBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);        
        Component[] components = rightPanel.getComponents();
        for(Component c : components){
            if(c instanceof ManageAirJPanel){
                ManageAirJPanel panel = (ManageAirJPanel)c;
                panel.populate();
            }
    }//GEN-LAST:event_backBtnActionPerformed
    }
    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed
        // TODO add your handling code here:
           
            airlinerEmailjTextField.setEditable(true);
            airlinerFpdjTextField.setEditable(true);
            airlinerAddr1jTextField.setEditable(true);
            airlinerAddr2jTextField.setEditable(true);
            cityjTextField.setEditable(true);
            statejTextField.setEditable(true);
            zipcodejTextField.setEditable(true);
            updBtn.setEnabled(false);
            saveBtn.setEnabled(true);
    }//GEN-LAST:event_updBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
            airlinerNamejTextField.setEditable(false);
            airlinerEmailjTextField.setEditable(false);
            airlinerFpdjTextField.setEditable(false);
            airlinerAddr1jTextField.setEditable(false);
            airlinerAddr2jTextField.setEditable(false);
            cityjTextField.setEditable(false);
            statejTextField.setEditable(false);
            zipcodejTextField.setEditable(false);            
            updBtn.setEnabled(true);
            if (airlinerNamejTextField.getText().trim().isEmpty() || 
                airlinerEmailjTextField.getText().trim().isEmpty() ||
                airlinerFpdjTextField.getText().trim().isEmpty() ||
                airlinerAddr1jTextField.getText().trim().isEmpty() ||
                airlinerAddr2jTextField.getText().trim().isEmpty() ||
                cityjTextField.getText().trim().isEmpty() ||
                statejTextField.getText().trim().isEmpty() ||
                zipcodejTextField.getText().trim().isEmpty()                   
                )
                {
                JOptionPane.showMessageDialog(null, "Please fill manadatory fields");
                return;   
                }
            
            if(zipcodejTextField.getText().trim().length()!=5)
            {
                JOptionPane.showMessageDialog(null, "Zipcode should of length 5");
                return; 
            }
            if(!usernamePatternCorrect())
            {
                JOptionPane.showMessageDialog(null, "Email should be of format aa.bb@gmail.com");
                return; 
            }
            try 
            {
              int temp = (Integer.parseInt(airlinerFpdjTextField.getText().trim()));
            }
            catch(NumberFormatException nfe)
            {
                  JOptionPane.showMessageDialog(null, "Number of flight in a day should be integer");
                return;                
            }
            airl.setAirlinerflyperday(Integer.parseInt(airlinerFpdjTextField.getText()));
            airl.setAirlinerName(airlinerNamejTextField.getText());      
            airl.setAirlinerEmail(airlinerEmailjTextField.getText());
            airl.setAddressline1(airlinerAddr1jTextField.getText());
            airl.setAddressline2(airlinerAddr2jTextField.getText());
            airl.setCity(cityjTextField.getText());
            airl.setState(statejTextField.getText());
            airl.setZipcode(zipcodejTextField.getText());
            
            JOptionPane.showMessageDialog(null, "Airliner Information Updated Successfully"); 
             rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);        
        Component[] components = rightPanel.getComponents();
        for(Component c : components){
            if(c instanceof ManageAirJPanel){
                ManageAirJPanel panel = (ManageAirJPanel)c;
                panel.populate();
            }
    }     
    }//GEN-LAST:event_saveBtnActionPerformed

    private void zipcodejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipcodejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipcodejTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerAddr1jTextField;
    private javax.swing.JTextField airlinerAddr2jTextField;
    private javax.swing.JTextField airlinerEmailjTextField;
    private javax.swing.JTextField airlinerFpdjTextField;
    private javax.swing.JTextField airlinerNamejTextField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField cityjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField statejTextField;
    private javax.swing.JButton updBtn;
    private javax.swing.JTextField zipcodejTextField;
    // End of variables declaration//GEN-END:variables
}
