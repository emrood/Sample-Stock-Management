/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Data.DBConnection;
import Data.Utils;
import Models.Produits;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Administrator
 */
public class ModifyProduct extends javax.swing.JFrame {

    /**
     * Creates new form ModifyProduct
     */
    public ModifyProduct() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(AddProduct.DISPOSE_ON_CLOSE);
        DefaultComboBoxModel typeModel = new DefaultComboBoxModel();

        Utils u = new Utils();

        u.getType().forEach((_item) -> {
            typeModel.addElement(_item);
        });
        jCB_typeChooser.setModel(typeModel);
        getData();
    }

    private void getData() {
        if (DBConnection.Connect()) {
            //Prendre liste des clients

            //prendre liste des produits
            if (DBConnection.ListProduits()) {
                System.out.println("liste produits pret");
                DefaultComboBoxModel productModel = new DefaultComboBoxModel();
                productModel.addElement("Pas de selection");
                DBConnection.mesProduits.forEach((_item) -> {
                    productModel.addElement("PR00" + _item.getID() + " : " + _item.getP_name());
                });
                jCB_productChooser.setModel(productModel);

            } else {
                System.out.println("Erreur liste produits");
            }

        } else {

        }
        
        jT_productName.setText("");
        jT_constructorName.setText("");
        jT_price.setText("");
        jS_quantity.setValue(0);
        jCB_typeChooser.setSelectedIndex(0);
        jL_ID.setText("");

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
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCB_productChooser = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jL_ID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jT_productName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jT_constructorName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jT_price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jS_quantity = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jCB_typeChooser = new javax.swing.JComboBox<>();
        btn_deleteProduct = new javax.swing.JButton();
        btn_annu = new javax.swing.JButton();
        btn_modifyProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(41, 98, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modifier un produit");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 490, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(7, 2, 4, 4));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Selectione un produit :");
        jPanel3.add(jLabel3);

        jCB_productChooser.setBackground(new java.awt.Color(255, 255, 255));
        jCB_productChooser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCB_productChooser.setForeground(new java.awt.Color(0, 0, 0));
        jCB_productChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCB_productChooser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 98, 255), 1, true));
        jCB_productChooser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCB_productChooserItemStateChanged(evt);
            }
        });
        jCB_productChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_productChooserActionPerformed(evt);
            }
        });
        jPanel3.add(jCB_productChooser);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID:");
        jPanel3.add(jLabel4);

        jL_ID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jL_ID.setForeground(new java.awt.Color(0, 0, 0));
        jL_ID.setText("jLabel9");
        jPanel3.add(jL_ID);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nom:");
        jPanel3.add(jLabel5);

        jT_productName.setBackground(new java.awt.Color(255, 255, 255));
        jT_productName.setForeground(new java.awt.Color(0, 0, 0));
        jT_productName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jT_productName.setText("jTextField1");
        jT_productName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 98, 255), 1, true));
        jPanel3.add(jT_productName);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Constructeur");
        jPanel3.add(jLabel6);

        jT_constructorName.setBackground(new java.awt.Color(255, 255, 255));
        jT_constructorName.setForeground(new java.awt.Color(0, 0, 0));
        jT_constructorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jT_constructorName.setText("jTextField2");
        jT_constructorName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 98, 255), 1, true));
        jPanel3.add(jT_constructorName);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Prix:");
        jPanel3.add(jLabel7);

        jT_price.setBackground(new java.awt.Color(255, 255, 255));
        jT_price.setForeground(new java.awt.Color(0, 0, 0));
        jT_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jT_price.setText("jTextField3");
        jT_price.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 98, 255), 1, true));
        jPanel3.add(jT_price);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Quantite:");
        jPanel3.add(jLabel8);
        jPanel3.add(jS_quantity);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Type:");
        jPanel3.add(jLabel2);

        jCB_typeChooser.setBackground(new java.awt.Color(255, 255, 255));
        jCB_typeChooser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jCB_typeChooser.setForeground(new java.awt.Color(0, 0, 0));
        jCB_typeChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCB_typeChooser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(41, 98, 255), 1, true));
        jCB_typeChooser.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCB_typeChooserItemStateChanged(evt);
            }
        });
        jCB_typeChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_typeChooserActionPerformed(evt);
            }
        });
        jPanel3.add(jCB_typeChooser);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 580, 260));

        btn_deleteProduct.setBackground(new java.awt.Color(255, 0, 0));
        btn_deleteProduct.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_deleteProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_delete_forever_white.png"))); // NOI18N
        btn_deleteProduct.setText("Supprimer");
        btn_deleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteProductActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 160, 40));

        btn_annu.setBackground(new java.awt.Color(41, 98, 162));
        btn_annu.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_annu.setForeground(new java.awt.Color(255, 255, 255));
        btn_annu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_cancel_white.png"))); // NOI18N
        btn_annu.setText("Annule");
        btn_annu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_annuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_annu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 150, 40));

        btn_modifyProduct.setBackground(new java.awt.Color(41, 98, 162));
        btn_modifyProduct.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_modifyProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_modifyProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_create_white.png"))); // NOI18N
        btn_modifyProduct.setText("Vallider");
        btn_modifyProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modifyProductActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modifyProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCB_typeChooserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB_typeChooserItemStateChanged
        // TODO add your handling code here:
        //jCB_productChooser.getSelectedIndex();
        if (jCB_typeChooser.getSelectedIndex() != 0) {

        } else {

        }

        //String.valueOf(jS_Quantite.getValue());
    }//GEN-LAST:event_jCB_typeChooserItemStateChanged

    private void jCB_typeChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_typeChooserActionPerformed
        // TODO add your handling code here:
        //jCB_productChooser.getSelectedIndex();
    }//GEN-LAST:event_jCB_typeChooserActionPerformed

    private void jCB_productChooserItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCB_productChooserItemStateChanged
        // TODO add your handling code here:
        if (jCB_productChooser.getSelectedIndex() != 0) {
            try {

                jT_productName.setText(DBConnection.mesProduits.get(jCB_productChooser.getSelectedIndex() - 1).getP_name());
                jT_constructorName.setText(DBConnection.mesProduits.get(jCB_productChooser.getSelectedIndex() - 1).getConstructor());
                jT_price.setText(String.valueOf(DBConnection.mesProduits.get(jCB_productChooser.getSelectedIndex() - 1).getPrice()));
                jS_quantity.setValue(DBConnection.mesProduits.get(jCB_productChooser.getSelectedIndex() - 1).getQuantite());
                jL_ID.setText("PR00" + DBConnection.mesProduits.get(jCB_productChooser.getSelectedIndex() - 1).getID());

            } catch (Exception e) {
                jT_productName.setText("");
                jT_constructorName.setText("");
                jT_price.setText("");
                jS_quantity.setValue("");
                jL_ID.setText("");
                jCB_typeChooser.setSelectedIndex(0);
            }

        } else {

        }
    }//GEN-LAST:event_jCB_productChooserItemStateChanged

    private void jCB_productChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_productChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_productChooserActionPerformed

    private void btn_deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteProductActionPerformed
        // TODO add your handling code here:
        if(jCB_productChooser.getSelectedIndex() != 0){
            if(DBConnection.DeleteProduit(Integer.valueOf(DBConnection.mesProduits.get(jCB_productChooser.getSelectedIndex()).getID()))){
                MainScreen.infoBox("Produit supprime", "Info");
                getData();
            }else{
                MainScreen.infoBox("Erreur losr de la suppression", "Erreur");
            }
        
        }else{
        
            MainScreen.infoBox("Aucun produit n'est selectionne", "Erreur");
        }


    }//GEN-LAST:event_btn_deleteProductActionPerformed

    private void btn_annuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_annuActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btn_annuActionPerformed

    private void btn_modifyProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modifyProductActionPerformed
        // TODO add your handling code here:
        if (jCB_productChooser.getSelectedIndex() != 0) {
            if (Integer.valueOf(String.valueOf(jS_quantity.getValue())) > 0) {
                if (!jT_productName.getText().isEmpty()) {
                    if (!jT_constructorName.getText().isEmpty()) {
                        if (!jT_price.getText().isEmpty()) {
                            if (DBConnection.Connect()) {
                                try {
                                    Produits p = new Produits(jT_productName.getText(), jT_constructorName.getText(), Float.valueOf(jT_price.getText()), Integer.valueOf(String.valueOf(jS_quantity.getValue())), String.valueOf(jCB_typeChooser.getSelectedItem()));
                                    p.setID(String.valueOf(DBConnection.mesProduits.get(jCB_productChooser.getSelectedIndex() - 1).getID()));
                                    if (DBConnection.updateProduct(p)) {
                                        MainScreen.infoBox("Fait !", "info");
                                        getData();
                                    } else {
                                        MainScreen.infoBox("Erreur d'insertion", "Erreur");
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println(e.getMessage());
                                }
                            } else {
                                System.out.println("Impossible de se connecter a la base de donnee");
                                MainScreen.infoBox("Impossible de se connecter a la base de donnee", "Erreur");
                            }

                        } else {
                            MainScreen.infoBox("Le prix ne peut pas etre vide", "Erreur");
                        }
                    } else {
                        MainScreen.infoBox("Le nomdu constructeur ne peut pas etre vide", "Erreur");
                    }

                } else {
                    MainScreen.infoBox("Le nom du produit ne peut pas etre vide", "Erreur");
                }

            } else {
                System.out.println("La quantite selectionnee n'est pas correct");
                MainScreen.infoBox("La quantite selectionnee n'est pas correct", "Erreur");
            }

        } else {
            System.out.println("Veuillez choisir un produit");
            MainScreen.infoBox("Veuillez choisir un produit", "Erreur");
        }
    }//GEN-LAST:event_btn_modifyProductActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_annu;
    private javax.swing.JButton btn_deleteProduct;
    private javax.swing.JButton btn_modifyProduct;
    private javax.swing.JComboBox<String> jCB_productChooser;
    private javax.swing.JComboBox<String> jCB_typeChooser;
    private javax.swing.JLabel jL_ID;
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
    private javax.swing.JSpinner jS_quantity;
    private javax.swing.JTextField jT_constructorName;
    private javax.swing.JTextField jT_price;
    private javax.swing.JTextField jT_productName;
    // End of variables declaration//GEN-END:variables
}
