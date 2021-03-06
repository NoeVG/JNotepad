/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edit;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

/**
 *
 * @author eon
 */
public class JFrameFind extends javax.swing.JFrame {
    public static final boolean FIND_UP = true;
    public static final boolean FIND_DOWN = false;
    
    private boolean firstToFind = true;
    private int fromIndex;
    private boolean direcctionFind = FIND_DOWN;
    private JTextArea  jTextAreaToFind;
    private Pattern p;
    private Matcher m;
    /**
     * Creates new form JFrameFind
     */
    public JFrameFind() {
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
        jPanelFindWhat = new javax.swing.JPanel();
        jLabelFindWhat = new javax.swing.JLabel();
        jTextFieldFind = new javax.swing.JTextField();
        jPanelMatchCase = new javax.swing.JPanel();
        jCheckBoxMatchCase = new javax.swing.JCheckBox();
        jPanelDirection = new javax.swing.JPanel();
        jRadioButtonUP = new javax.swing.JRadioButton();
        jRadioButtonDown = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonFindNext = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(420, 80));
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanelFindWhat.setLayout(new java.awt.BorderLayout());

        jLabelFindWhat.setText("Find what: ");
        jPanelFindWhat.add(jLabelFindWhat, java.awt.BorderLayout.WEST);

        jTextFieldFind.setPreferredSize(new java.awt.Dimension(2, 25));
        jTextFieldFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFindKeyTyped(evt);
            }
        });
        jPanelFindWhat.add(jTextFieldFind, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanelFindWhat, java.awt.BorderLayout.NORTH);

        jPanelMatchCase.setLayout(new java.awt.BorderLayout());

        jCheckBoxMatchCase.setText("Match Case");
        jPanelMatchCase.add(jCheckBoxMatchCase, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanelMatchCase, java.awt.BorderLayout.WEST);

        jPanelDirection.setBorder(javax.swing.BorderFactory.createTitledBorder("Direction"));
        jPanelDirection.setLayout(new java.awt.BorderLayout());

        jRadioButtonUP.setText("Up");
        jRadioButtonUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonUPActionPerformed(evt);
            }
        });
        jPanelDirection.add(jRadioButtonUP, java.awt.BorderLayout.WEST);

        jRadioButtonDown.setText("Down");
        jRadioButtonDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDownActionPerformed(evt);
            }
        });
        jPanelDirection.add(jRadioButtonDown, java.awt.BorderLayout.EAST);

        jPanel1.add(jPanelDirection, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonFindNext.setText("Find Next");
        jButtonFindNext.setEnabled(false);
        jButtonFindNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindNextActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonFindNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFindKeyTyped
        this.jButtonFindNext.setEnabled(true);
        this.firstToFind = true;
    }//GEN-LAST:event_jTextFieldFindKeyTyped

    private void jButtonFindNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindNextActionPerformed
        if(this.firstToFind){
           this.firstToFind = false;
           this.p = Pattern.compile(this.jTextFieldFind.getText());   // the pattern to search for
           this.m = p.matcher(this.jTextAreaToFind.getText());
        }
        /*
        if(m.find()){
            System.out.println("Of: "+m.start()+" at "+m.end());
            this.jTextAreaToFind.select(m.start(), m.end());
        }else{
            JOptionPane.showConfirmDialog(null, "Not Found","Not Found",JOptionPane.WARNING_MESSAGE);
        }
        */
        find();
    }//GEN-LAST:event_jButtonFindNextActionPerformed

    private void jRadioButtonUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonUPActionPerformed
        this.direcctionFind = FIND_UP;
    }//GEN-LAST:event_jRadioButtonUPActionPerformed

    private void jRadioButtonDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDownActionPerformed
        this.direcctionFind = FIND_DOWN;
    }//GEN-LAST:event_jRadioButtonDownActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelActionPerformed

    public JTextArea getjTextAreaToFind() {
        return jTextAreaToFind;
    }

    public void setjTextAreaToFind(JTextArea jTextAreaToFind) {
        this.jTextAreaToFind = jTextAreaToFind;
    }
    public void find(){
        if(m.find()){
            System.out.println("Of: "+m.start()+" at "+m.end());
            this.jTextAreaToFind.select(m.start(), m.end());
        }else{
            JOptionPane.showConfirmDialog(null, "Not Found","Not Found",JOptionPane.WARNING_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(JFrameFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFind().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonFindNext;
    private javax.swing.JCheckBox jCheckBoxMatchCase;
    private javax.swing.JLabel jLabelFindWhat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDirection;
    private javax.swing.JPanel jPanelFindWhat;
    private javax.swing.JPanel jPanelMatchCase;
    private javax.swing.JRadioButton jRadioButtonDown;
    private javax.swing.JRadioButton jRadioButtonUP;
    private javax.swing.JTextField jTextFieldFind;
    // End of variables declaration//GEN-END:variables
}
