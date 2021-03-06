/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Util;
import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class Main extends MyOwnJFrame {
    private final static Logger log = Logger.getLogger(Main.class);

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        int i;
        
        for(i=0; i<Util.TOTAL_CATEGORIES; i++){
            jComboBoxProductType.addItem(Util.CATEGORY[i]);
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

        jScrollPaneMain = new javax.swing.JScrollPane();
        jPanelMain = new javax.swing.JPanel();
        jComboBoxProductType = new javax.swing.JComboBox();
        jTextFieldProductSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jLabelProfile = new javax.swing.JLabel();
        jLabelSell = new javax.swing.JLabel();
        jLabelSignUp = new javax.swing.JLabel();
        jLabelNotAMember = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jComboBoxProductType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButtonSearch.setText("Go");

        jLabelProfile.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelProfile.setForeground(new java.awt.Color(0, 102, 102));
        jLabelProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProfile.setText("Profile");
        jLabelProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelProfileMouseExited(evt);
            }
        });

        jLabelSell.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelSell.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSell.setText("Sell");
        jLabelSell.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSellMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSellMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSellMouseExited(evt);
            }
        });

        jLabelSignUp.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelSignUp.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSignUp.setText("Sign Up");
        jLabelSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSignUpMouseExited(evt);
            }
        });

        jLabelNotAMember.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabelNotAMember.setText("Not a member yet?");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addComponent(jLabelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSell, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNotAMember)
                    .addComponent(jTextFieldProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProfile)
                    .addComponent(jLabelSell)
                    .addComponent(jLabelSignUp)
                    .addComponent(jLabelNotAMember))
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addContainerGap(264, Short.MAX_VALUE))
        );

        jScrollPaneMain.setViewportView(jPanelMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUpMouseExited
        // TODO add your handling code here:
        jLabelSignUp.setForeground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLabelSignUpMouseExited

    private void jLabelSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUpMouseEntered
        // TODO add your handling code here:
        jLabelSignUp.setForeground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_jLabelSignUpMouseEntered

    private void jLabelSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignUpMouseClicked
        // TODO add your handling code here:
        SignUp sgn = new SignUp();
        sgn.setVisible(true);
        sgn.setFatherWindow(this, false);
    }//GEN-LAST:event_jLabelSignUpMouseClicked

    private void jLabelSellMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSellMouseExited
        // TODO add your handling code here:
        jLabelSell.setForeground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLabelSellMouseExited

    private void jLabelSellMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSellMouseEntered
        // TODO add your handling code here:
        jLabelSell.setForeground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_jLabelSellMouseEntered

    private void jLabelSellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSellMouseClicked
        // TODO add your handling code here:
        SellingMenu sm = new SellingMenu();
        sm.setVisible(true);
        sm.setFatherWindow(this, true);
    }//GEN-LAST:event_jLabelSellMouseClicked

    private void jLabelProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProfileMouseExited
        // TODO add your handling code here:
        jLabelProfile.setForeground(new java.awt.Color(0, 102, 102));
    }//GEN-LAST:event_jLabelProfileMouseExited

    private void jLabelProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProfileMouseEntered
        // TODO add your handling code here:
        jLabelProfile.setForeground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_jLabelProfileMouseEntered

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox jComboBoxProductType;
    private javax.swing.JLabel jLabelNotAMember;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JLabel jLabelSell;
    private javax.swing.JLabel jLabelSignUp;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPaneMain;
    private javax.swing.JTextField jTextFieldProductSearch;
    // End of variables declaration//GEN-END:variables
}
