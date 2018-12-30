/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import FramePanels.Add_process;
import FramePanels.List_processes;
import imp.process;
import imp.ready_queue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JOptionPane;
/**
 *
 * @author mt
 */
public class ALDA extends javax.swing.JFrame {

    /**
     * Creates new form ALDA
     */
    Add_process ad;
    List_processes lis;
    GridBagLayout layout=new GridBagLayout();
     GridBagConstraints c=new  GridBagConstraints();
    public ALDA() {
         initComponents();
        ad=new Add_process();
          Dynamicpanel.setLayout(layout);
         c.gridx=0;
         c.gridy=0;
         Dynamicpanel.add(ad,c); 
      ad.setVisible(true);
       //lis.setVisible(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jButton_delate_all = new javax.swing.JButton();
        Dynamicpanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_RR_Frame = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAdd.setText("Add proc.");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonList.setText("List all proc.");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });

        jButton_delate_all.setText("Delete all ");
        jButton_delate_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_delate_allActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jButtonList))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_delate_all, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButtonAdd)
                .addGap(87, 87, 87)
                .addComponent(jButtonList)
                .addGap(69, 69, 69)
                .addComponent(jButton_delate_all)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout DynamicpanelLayout = new javax.swing.GroupLayout(Dynamicpanel);
        Dynamicpanel.setLayout(DynamicpanelLayout);
        DynamicpanelLayout.setHorizontalGroup(
            DynamicpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );
        DynamicpanelLayout.setVerticalGroup(
            DynamicpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        getContentPane().add(Dynamicpanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("More");

        jMenuItem_RR_Frame.setText("RR scheduler");
        jMenuItem_RR_Frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RR_FrameActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_RR_Frame);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        ad.setVisible(true);
        lis.setVisible(false);
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        // TODO add your handling code here:
        lis=new List_processes();
        Dynamicpanel.add(lis,c);
        ad.setVisible(false);
        lis.setVisible(true);
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jMenuItem_RR_FrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RR_FrameActionPerformed
        // TODO add your handling code here:
        RR_scheduler rr=new RR_scheduler();
        rr.setVisible(true);
    }//GEN-LAST:event_jMenuItem_RR_FrameActionPerformed

    private void jButton_delate_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_delate_allActionPerformed
        // TODO add your handling code here:
         ready_queue.processes.clear();
         ready_queue.readyq.clear();
          JOptionPane.showMessageDialog(null,"All processes have been deleted");
    }//GEN-LAST:event_jButton_delate_allActionPerformed

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
            java.util.logging.Logger.getLogger(ALDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ALDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ALDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ALDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALDA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Dynamicpanel;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButton_delate_all;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_RR_Frame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}