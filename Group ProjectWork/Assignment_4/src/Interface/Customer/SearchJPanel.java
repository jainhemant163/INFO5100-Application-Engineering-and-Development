/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Customer;

import Business.BookingDirectory;
import Business.Customer;
import Business.FlytSchedule;
import Business.FlytScheduleDirectory;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author VARSHA PREMANI
 */
public class SearchJPanel extends javax.swing.JPanel {
    private JPanel rightPanel;    
    private Customer customer;
    private FlytScheduleDirectory fschDir;
    private BookingDirectory bookDir;
     public ArrayList<FlytSchedule> searchFlightsresultDirectory=new ArrayList<>();
     
    /**
     * Creates new form SearchJPanel
     */
    public SearchJPanel(JPanel rightPanel,Customer customer,BookingDirectory bookDir,FlytScheduleDirectory fschDir) {
        initComponents();
        this.rightPanel = rightPanel;
        this.customer = customer;
        this.fschDir = fschDir;
        this.bookDir = bookDir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
     private boolean getDateRegex(String date)
   {
       
       //String regex= "\\d{2}\\-\\d{2}\\-\\d{4}";
       String dRegex="^(0[0-9]|1[0-2])\\-(0[1-9]|1[0-9]|2[0-9]|3[0-1])\\-(199[0-9]|20[0-1][0-8])";
       final Pattern pattern = Pattern.compile(dRegex);
       boolean bool=pattern.matcher(date).matches();
       return bool;
   }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        flyTojTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        flyFromjTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        flyNumjTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        radioBtn1 = new javax.swing.JRadioButton();
        radioBtn3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        radioBtn2 = new javax.swing.JRadioButton();
        radioBtn4 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        flyDatejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Search your flight");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Arrival Location :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Departure Location :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flyFromjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flyTojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(flyFromjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flyTojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Flight No. :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Or");

        buttonGroup1.add(radioBtn1);
        radioBtn1.setText("12 AM - 6 AM");
        radioBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBtn3);
        radioBtn3.setText("12 PM - 6 PM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Preffered Time :");

        buttonGroup1.add(radioBtn2);
        radioBtn2.setText("6 AM - 12 PM");

        buttonGroup1.add(radioBtn4);
        radioBtn4.setText("6 PM - 12 AM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioBtn1)
                            .addComponent(radioBtn4)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(radioBtn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioBtn2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(89, 89, 89))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(flyNumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(flyNumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(radioBtn1)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(radioBtn2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Date :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("mm-dd-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5)
                                        .addGap(62, 62, 62)
                                        .addComponent(flyDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(flyDatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(searchBtn))
                .addGap(28, 28, 28))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
             if ( (flyNumjTextField.getText().isEmpty() ) 
                && 
             (flyFromjTextField.getText().isEmpty())
           )
         {
            JOptionPane.showMessageDialog(null, "Please either enter the flight number or Depature location ");
            return;
         }
        
        if (flyFromjTextField.getText().isEmpty())
        {
            
        }
        else if (flyTojTextField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the arrival location too");
            return;
        }
        
         if (flyDatejTextField.getText().isEmpty())
           {
            JOptionPane.showMessageDialog(null, "Please mention the date you wish to travel");
            return;
           }
         
           if(!getDateRegex(flyDatejTextField.getText()))
               {
                 
                   JOptionPane.showMessageDialog(null,"Please Enter date in format MM-dd-YYYY","ERROR",0);
                   return;
               }
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy");
        Date BOD = null ;
        df.setLenient(false);
        try
        {
            BOD = df.parse(flyDatejTextField.getText());            
        }
        catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Please enter a valid date in MM-dd-yyyy format");
                    return;
                }
        
        
         boolean Temp = false;
         String timeoption = " ";
         if (radioBtn1.isSelected())
         {
             Temp = true;
             timeoption = "A";
         }
                 
         else if (radioBtn2.isSelected())
         {
             if (Temp == true){
                 Temp = false;
                 JOptionPane.showMessageDialog(null, "Please select only one preferred time");
                 return;
             }
             Temp = true;
             timeoption = "B";
         }
         
         else if (radioBtn3.isSelected())
         {
             if (Temp == true){
                 Temp = false;
                 JOptionPane.showMessageDialog(null, "Please select only one preferred time");
                 return;
             }
             Temp = true;
             timeoption = "C";
         }
         
         else if (radioBtn4.isSelected())
         {
             if (Temp == true){
                 Temp = false;
                 JOptionPane.showMessageDialog(null, "Please select only one preferred time");
                 return;
             }
             Temp = true;
             timeoption = "D";
         }
                         
         if ( Temp == false)
         {
            JOptionPane.showMessageDialog(null, "Please select preferred time of your travel");          
            return; 
         }
         
         char option = ' ';
         if (flyNumjTextField.getText().isEmpty())
         {             
         }
         else
         {
             option = 'A';
         }
         
         if (flyFromjTextField.getText().isEmpty())
         {             
         }
         else
         {
             if (option == ' ')
             {
              option = 'B';
             }
         }

         switch (option){
             case 'A':
                       FlytSchedule flsch =  fschDir.searchAccount(flyNumjTextField.getText(),flyDatejTextField.getText(),timeoption);
                       if( flsch == null){
                       JOptionPane.showMessageDialog(null,"No flights found");
                       }
                       else
                       {
                           
                             AvlFlytJPanel afPanel = new AvlFlytJPanel(rightPanel,customer,flsch,bookDir,fschDir);
                             rightPanel.add("AvlFlytJPanel",afPanel);
                             CardLayout layout = (CardLayout)rightPanel.getLayout();
                             layout.next(rightPanel);
                           

                       }
                       break;
             case 'B':
                       searchFlightsresultDirectory.clear();
                       searchFlightsresultDirectory =  fschDir.searchFlight(flyFromjTextField.getText(),flyTojTextField.getText(),flyDatejTextField.getText(),timeoption);
                       if( searchFlightsresultDirectory == null){
                       JOptionPane.showMessageDialog(null,"No flights found");
                       }
                       else                           
                       {                           
                               AvlFlytJPanel afPanel = new AvlFlytJPanel(rightPanel,customer,searchFlightsresultDirectory,bookDir,fschDir);
                               rightPanel.add("AvlFlytJPanel",afPanel);
                               CardLayout layout = (CardLayout)rightPanel.getLayout();
                               layout.next(rightPanel);
                           
                       }    
                
                       break;                 
             default :
                       JOptionPane.showMessageDialog(null,"Search criteria returned no flight");
                       break;
         }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void radioBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField flyDatejTextField;
    private javax.swing.JTextField flyFromjTextField;
    private javax.swing.JTextField flyNumjTextField;
    private javax.swing.JTextField flyTojTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton radioBtn1;
    private javax.swing.JRadioButton radioBtn2;
    private javax.swing.JRadioButton radioBtn3;
    private javax.swing.JRadioButton radioBtn4;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}