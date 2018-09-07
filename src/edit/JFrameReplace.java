/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author eon
 */
public class JFrameReplace extends javax.swing.JFrame {

    private JTextArea  jTextAreaToReplace;
    private boolean firstToFind = true;
    private int fromIndex;
    private Pattern p;
    private Pattern pReplaceAll;
    private Matcher m;
    private Matcher mReplaceAll;
    /**
     * Creates new form JFrameReplace
     */
    public JFrameReplace() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFind = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBoxMatchCase = new javax.swing.JCheckBox();
        jTextFieldReplace = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonReplace = new javax.swing.JButton();
        jButtonReplaceAll = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonFindNext = new javax.swing.JButton();

        setTitle("Replace");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Remplace whit:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextFieldFind.setPreferredSize(new java.awt.Dimension(150, 20));
        jTextFieldFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFindKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 30));

        jLabel2.setText("Find What:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jCheckBoxMatchCase.setText("Match Case");
        jPanel2.add(jCheckBoxMatchCase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jTextFieldReplace.setPreferredSize(new java.awt.Dimension(150, 20));
        jTextFieldReplace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldReplaceKeyTyped(evt);
            }
        });
        jPanel2.add(jTextFieldReplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 30));

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonReplace.setText("Replace");
        jButtonReplace.setEnabled(false);
        jButtonReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplaceActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonReplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 110, -1));

        jButtonReplaceAll.setText("Replace All");
        jButtonReplaceAll.setEnabled(false);
        jButtonReplaceAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReplaceAllActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonReplaceAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 110, -1));

        jButtonFindNext.setText("Find Next");
        jButtonFindNext.setEnabled(false);
        jButtonFindNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindNextActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonFindNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, -1));

        jPanel1.add(jPanel3, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jTextFieldFindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFindKeyTyped
        this.jButtonFindNext.setEnabled(true);
        this.firstToFind = true;
    }//GEN-LAST:event_jTextFieldFindKeyTyped

    private void jTextFieldReplaceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldReplaceKeyTyped
        this.jButtonReplace.setEnabled(true);
        this.jButtonReplaceAll.setEnabled(true);
    }//GEN-LAST:event_jTextFieldReplaceKeyTyped

    private void jButtonFindNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindNextActionPerformed
        if(this.firstToFind){
           this.firstToFind = false;
           this.p = Pattern.compile(this.jTextFieldFind.getText());   // the pattern to search for
           this.m = p.matcher(this.jTextAreaToReplace.getText());
        }
        if(m.find()){
            this.jTextAreaToReplace.select(m.start(), m.end());
        }else{
            JOptionPane.showConfirmDialog(null, "Not Found","Not Found",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonFindNextActionPerformed

    private void jButtonReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReplaceActionPerformed
        this.jTextAreaToReplace.replaceSelection(this.jTextFieldReplace.getText());
    }//GEN-LAST:event_jButtonReplaceActionPerformed

    private void jButtonReplaceAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReplaceAllActionPerformed
        findSectionToRemplaceAll();
        while(this.mReplaceAll.find()){
            System.out.println("Find of "+this.mReplaceAll.start() +" to "+this.mReplaceAll.end());
            this.jTextAreaToReplace.select(this.mReplaceAll.start(), this.mReplaceAll.end());
            this.jTextAreaToReplace.replaceSelection(this.jTextFieldReplace.getText());
            findSectionToRemplaceAll();
        }
    }//GEN-LAST:event_jButtonReplaceAllActionPerformed

    public void setjTextAreaToReplace(JTextArea jTextAreaToReplace) {
        this.jTextAreaToReplace = jTextAreaToReplace;
    }
    
    public void findSectionToRemplaceAll(){   
        this.pReplaceAll = Pattern.compile(this.jTextFieldFind.getText());   // the pattern to search for
        this.mReplaceAll = pReplaceAll.matcher(this.jTextAreaToReplace.getText());
    } 
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
            java.util.logging.Logger.getLogger(JFrameReplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameReplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameReplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameReplace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameReplace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonFindNext;
    private javax.swing.JButton jButtonReplace;
    private javax.swing.JButton jButtonReplaceAll;
    private javax.swing.JCheckBox jCheckBoxMatchCase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldFind;
    private javax.swing.JTextField jTextFieldReplace;
    // End of variables declaration//GEN-END:variables
}
