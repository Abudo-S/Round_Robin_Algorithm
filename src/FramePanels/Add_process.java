/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FramePanels;

import imp.exceptionrule;
import imp.process;
import imp.ready_queue;
import javax.swing.JOptionPane;

/**
 *
 * @author mt
 */
public class Add_process extends javax.swing.JPanel {

    /**
     * Creates new form Add_process
     */
    exceptionrule ex=new exceptionrule();
    public Add_process() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_process_name = new javax.swing.JTextField();
        jTextField_burst_time = new javax.swing.JTextField();
        jTextField_arrival_time = new javax.swing.JTextField();
        jButton_ADD = new javax.swing.JButton();
        jLabelSucessOrFail = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jLabel1.setText("process name");

        jLabel2.setText("burst time");

        jLabel3.setText("arrival time");

        jTextField_burst_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_burst_timeActionPerformed(evt);
            }
        });

        jButton_ADD.setText("ADD");
        jButton_ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ADD)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField_arrival_time, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                        .addComponent(jTextField_burst_time)
                        .addComponent(jTextField_process_name))
                    .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_process_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_burst_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_arrival_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabelSucessOrFail, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_ADD)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_burst_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_burst_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_burst_timeActionPerformed

    private void jButton_ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADDActionPerformed
        // TODO add your handling code here:
         try{
         if (!jTextField_process_name.getText().equals("") && !jTextField_burst_time.getText().equals("") && !jTextField_arrival_time.getText().equals("")){
         process pro=new process();
         ready_queue rd=new ready_queue();
         String name;
         int burst,arrival;
          name=jTextField_process_name.getText();
          for(int j=0;j<ready_queue.processes.size();j++){
           if(name.equals(ready_queue.processes.get(j).get_pro_name()))
           {
              name=ex.checkname();
              break;
           }
          } 
          pro.set_pro_name(name);
          burst=Integer.parseInt(jTextField_burst_time.getText());
          arrival=Integer.parseInt(jTextField_arrival_time.getText());
          if(burst<0){
          burst=ex.checkPositive("burst time");
          pro.set_burst_time(burst);
          }else{
              pro.set_burst_time(burst);
          }
          if(arrival<0){
           arrival=ex.checkPositive("arrival time");
           pro.set_arrival_time(arrival);
          }else{
              pro.set_arrival_time(arrival);
          }
          if(rd.enqueue(pro)){
            jLabelSucessOrFail.setText("Added Successfully ... !");      
                resetPanelData();
          }
         }else {
            jLabelSucessOrFail.setText("Missing required Fields ... ! ");
         }
         }catch(Exception e){
              JOptionPane.showMessageDialog(null,e+" in add");
         }
    }//GEN-LAST:event_jButton_ADDActionPerformed
 protected void resetPanelData() {
        jTextField_process_name.setText("");
        jTextField_burst_time.setText("");
        jTextField_arrival_time.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ADD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelSucessOrFail;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField_arrival_time;
    private javax.swing.JTextField jTextField_burst_time;
    private javax.swing.JTextField jTextField_process_name;
    // End of variables declaration//GEN-END:variables

}
