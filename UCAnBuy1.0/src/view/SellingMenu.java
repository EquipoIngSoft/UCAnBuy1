/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.SellingMenuController;
import controller.Util;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Inventory;
import model.Product;
import org.apache.log4j.Logger;

/**
 *
 * @author Jesús
 */
public class SellingMenu extends MyOwnJFrame {
    private final static Logger log = Logger.getLogger(SellingMenu.class);
    private static final SellingMenuController smc = new SellingMenuController();
    /**
     * Creates new form SellingMenu
     */
    public SellingMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        int i;
        
        for(i=0; i<Util.TOTAL_CATEGORIES; i++){
            jComboBoxCategory.addItem(Util.CATEGORY[i]);
        }
        for(i=1; i<=Util.TOTAL_PRODUCTS; i++){
            jComboBoxQuantity.addItem(i);
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

        jTabbedPaneSelectCategory = new javax.swing.JTabbedPane();
        jPanelCategory = new javax.swing.JPanel();
        jPanelCustomize = new javax.swing.JPanel();
        jLabelProductName = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jLabelPrice = new javax.swing.JLabel();
        jTextFieldPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelUploadImages = new javax.swing.JLabel();
        jTextFieldImagePath = new javax.swing.JTextField();
        jButtonImagePath = new javax.swing.JButton();
        jButtonFinish = new javax.swing.JButton();
        jLabelProductType = new javax.swing.JLabel();
        jComboBoxCategory = new javax.swing.JComboBox();
        jLabelQuantity = new javax.swing.JLabel();
        jComboBoxQuantity = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTabbedPaneSelectCategory.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jPanelCategory.setEnabled(false);

        jPanelCustomize.setFocusable(false);

        jLabelProductName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelProductName.setText("Product Name:");

        jTextFieldProductName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldProductNameKeyTyped(evt);
            }
        });

        jLabelPrice.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelPrice.setText("Price (BsF):");

        jTextFieldPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPriceKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Description:");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextAreaDescriptionKeyTyped(evt);
            }
        });
        jScrollPaneDescription.setViewportView(jTextAreaDescription);

        jLabelUploadImages.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelUploadImages.setText("Upload Image:");

        jTextFieldImagePath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldImagePathKeyTyped(evt);
            }
        });

        jButtonImagePath.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonImagePath.setText(". . .");
        jButtonImagePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImagePathActionPerformed(evt);
            }
        });

        jButtonFinish.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonFinish.setText("Finish");
        jButtonFinish.setEnabled(false);
        jButtonFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinishActionPerformed(evt);
            }
        });

        jLabelProductType.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelProductType.setText("Product Type:");

        jComboBoxCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelQuantity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabelQuantity.setText("Quantity:");

        jComboBoxQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelCustomizeLayout = new javax.swing.GroupLayout(jPanelCustomize);
        jPanelCustomize.setLayout(jPanelCustomizeLayout);
        jPanelCustomizeLayout.setHorizontalGroup(
            jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomizeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDescription)
                    .addGroup(jPanelCustomizeLayout.createSequentialGroup()
                        .addComponent(jLabelUploadImages)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonImagePath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(jButtonFinish))
                    .addGroup(jPanelCustomizeLayout.createSequentialGroup()
                        .addGroup(jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelProductName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextFieldProductName)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPrice)
                            .addComponent(jLabelPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelProductType, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelQuantity)
                            .addComponent(jComboBoxQuantity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelCustomizeLayout.setVerticalGroup(
            jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCustomizeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductName)
                    .addComponent(jLabelProductType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice)
                    .addComponent(jLabelQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCustomizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUploadImages)
                    .addComponent(jTextFieldImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonImagePath)
                    .addComponent(jButtonFinish))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelCategoryLayout = new javax.swing.GroupLayout(jPanelCategory);
        jPanelCategory.setLayout(jPanelCategoryLayout);
        jPanelCategoryLayout.setHorizontalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCustomize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCategoryLayout.setVerticalGroup(
            jPanelCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCustomize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneSelectCategory.addTab("Set Product", jPanelCategory);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneSelectCategory)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneSelectCategory)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImagePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImagePathActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        jfc.setFileFilter(imageFilter);
        int r = jfc.showOpenDialog(null);
        if(r == JFileChooser.APPROVE_OPTION){
            try{
                File f = jfc.getSelectedFile();
                String fileName = f.getAbsolutePath();
                jTextFieldImagePath.setText(fileName);
            }catch(Exception e){
                log.warn("Excepción: " + e);
            }
        }
    }//GEN-LAST:event_jButtonImagePathActionPerformed

    private void jTextFieldProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldProductNameKeyTyped
        // TODO add your handling code here:
        String productName = jTextFieldProductName.getText();
        String price = jTextFieldPrice.getText();
        String description = jTextAreaDescription.getText();
        String imagePath = jTextFieldImagePath.getText();
        
        if(!productName.isEmpty() && !price.isEmpty() && !description.isEmpty() && !imagePath.isEmpty()){
            jButtonFinish.setEnabled(true);
        }else{
            jButtonFinish.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldProductNameKeyTyped

    private void jTextFieldPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPriceKeyTyped
        // TODO add your handling code here:
        String productName = jTextFieldProductName.getText();
        String price = jTextFieldPrice.getText();
        String description = jTextAreaDescription.getText();
        String imagePath = jTextFieldImagePath.getText();
        
        if(!productName.isEmpty() && !price.isEmpty() && !description.isEmpty() && !imagePath.isEmpty()){
            jButtonFinish.setEnabled(true);
        }else{
            jButtonFinish.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldPriceKeyTyped

    private void jTextAreaDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextAreaDescriptionKeyTyped
        // TODO add your handling code here:
        String productName = jTextFieldProductName.getText();
        String price = jTextFieldPrice.getText();
        String description = jTextAreaDescription.getText();
        String imagePath = jTextFieldImagePath.getText();
        
        if(!productName.isEmpty() && !price.isEmpty() && !description.isEmpty() && !imagePath.isEmpty()){
            jButtonFinish.setEnabled(true);
        }else{
            jButtonFinish.setEnabled(false);
        }
    }//GEN-LAST:event_jTextAreaDescriptionKeyTyped

    private void jTextFieldImagePathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldImagePathKeyTyped
        // TODO add your handling code here:
        String productName = jTextFieldProductName.getText();
        String price = jTextFieldPrice.getText();
        String description = jTextAreaDescription.getText();
        String imagePath = jTextFieldImagePath.getText();
        
        if(!productName.isEmpty() && !price.isEmpty() && !description.isEmpty() && !imagePath.isEmpty()){
            jButtonFinish.setEnabled(true);
        }else{
            jButtonFinish.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldImagePathKeyTyped

    private void jButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinishActionPerformed
        // TODO add your handling code here:
        Inventory i = new Inventory();
        ArrayList<Product> productsList = new ArrayList<>();
        Product p = new Product();
        p.setName(jTextFieldProductName.getText());
        p.setCategory(jComboBoxCategory.getSelectedItem().toString());
        p.setPrice(Integer.parseInt(jTextFieldPrice.getText()));
        p.setQuantity(Integer.parseInt(jComboBoxQuantity.getSelectedItem().toString()));
        p.setDescription(jTextAreaDescription.getText());
    //    p.setProductImages(jTextFieldImagePath.getText());
        
        productsList.add(p);
        i.setProductsList(productsList);
        Util.ACTUAL_ADMIN.setInventory(i);
        Util.ACTUAL_ADMIN.setId("25.214.999");//Pongan el ID que quieran hasta que se implemente el log in
        
        smc.saveAdminInDataBase(Util.ACTUAL_ADMIN);
        
        this.restoreFatherWindow();
    }//GEN-LAST:event_jButtonFinishActionPerformed

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
            java.util.logging.Logger.getLogger(SellingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellingMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinish;
    private javax.swing.JButton jButtonImagePath;
    private javax.swing.JComboBox jComboBoxCategory;
    private javax.swing.JComboBox jComboBoxQuantity;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JLabel jLabelProductType;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelUploadImages;
    private javax.swing.JPanel jPanelCategory;
    private javax.swing.JPanel jPanelCustomize;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JTabbedPane jTabbedPaneSelectCategory;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldImagePath;
    private javax.swing.JTextField jTextFieldPrice;
    private javax.swing.JTextField jTextFieldProductName;
    // End of variables declaration//GEN-END:variables
}