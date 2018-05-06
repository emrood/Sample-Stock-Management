/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Data.DBConnection;
import Data.Utils;
import Models.Produits;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    Produits p;

    public MainScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        jListing.setVisible(false);
        jAcceuil.setVisible(true);
        btn_addProduct.setVisible(false);
        btn_raffraichir.setVisible(false);
        jRecherche.setVisible(false);
        btn_ProductSearch.setVisible(false);
        btn_TransactionSearch.setVisible(false);
        JT_keyword.setVisible(false);
        jT_Recherche.setVisible(false);
        jScrollPane2.setVisible(false);
        if(DBConnection.RunServer("C:\\wamp64\\wampmanager.exe")){
           System.out.println("program running");
        }else{
            System.out.println("Error lauching server");
        }
        // retourne la liste des produits
        populateList();

    }

    // Methode pourrechercher un produit par un mot cle et les affiche dans le jTable jT_Recherche
    private void RechercherProduit() {

        if (!JT_keyword.getText().isEmpty()) {

            DefaultTableModel models = new DefaultTableModel();
            models.addColumn("ID");
            models.addColumn("Nom");
            models.addColumn("Constructeur");
            models.addColumn("Prix");
            models.addColumn("Quantite");
            models.addColumn("Type");
            models.addColumn("Status");
            if (DBConnection.Connect()) {
                if (DBConnection.RechercheProduit(JT_keyword.getText())) {
                    DBConnection.mesProduits.forEach((_item) -> {
                        models.addRow(new Object[]{"PR00" + _item.getID(), _item.getP_name(), _item.getConstructor(), _item.getPrice(), _item.getQuantite(), _item.getType(), _item.getStatus()});
                    });
                    
                    
                jT_Recherche.setModel(models);
                jT_Recherche.setVisible(true);
                jScrollPane2.setVisible(true);
                } else {
                     System.out.println("erreur recherche");
                }
            } else {
                System.out.println("erreur connection");
            }

           

        }else{
            System.out.println("Champs vide");
        }

    }

    // Methode pour rechercher une transaction par un mot cle et les affiche dans le jTable jT_Recherche
    private void RechercherTransaction() {
               if (!JT_keyword.getText().isEmpty()) {

            DefaultTableModel models = new DefaultTableModel();
            models.addColumn("Transation ID");
            models.addColumn("Produit");
            models.addColumn("Quantite");
            models.addColumn("total");
            models.addColumn("Client");
            models.addColumn("vendeur");
            models.addColumn("Date");
            if (DBConnection.Connect()) {
                if (DBConnection.RechercheTransaction(JT_keyword.getText())) {
                    
                    DBConnection.mesRequetes.forEach((_item) -> {
                        models.addRow(new Object[]{"PR00" + _item.getID(), _item.getProduit(), _item.getQuantite(), _item.getTotal(), _item.getClient(), _item.getVendor(), _item.getDate()});
                    });

                jT_Recherche.setModel(models);
                jT_Recherche.setVisible(true);
                jScrollPane2.setVisible(true);
                } else {
                     System.out.println("erreur recherche");
                }
            } else {
                System.out.println("erreur connection");
            }

           

        }else{
            System.out.println("Champs vide");
        }

    }

    // Methode initialisant la liste des produits
    private void populateList() {

        DefaultTableModel models = new DefaultTableModel();
        models.addColumn("ID");
        models.addColumn("Nom");
        models.addColumn("Constructeur");
        models.addColumn("Prix");
        models.addColumn("Quantite");
        models.addColumn("Type");
        models.addColumn("Status");

        if (DBConnection.Connect()) {
            if (DBConnection.ListProduits()) {
                DBConnection.mesProduits.forEach((_item) -> {
                    models.addRow(new Object[]{"PR00" + _item.getID(), _item.getP_name(), _item.getConstructor(), _item.getPrice(), _item.getQuantite(), _item.getType(), _item.getStatus()});
                });
            } else {

            }
        } else {

        }
        //models.addRow(new Object[] {"PRO001", "A name", "Hello", "96", "34", "sgf", "fsd"});

        jT_Products.setModel(models);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        dsgbar = new javax.swing.JPanel();
        MenuItem1 = new javax.swing.JPanel();
        JL_icon1 = new javax.swing.JLabel();
        JL_acceuil = new javax.swing.JLabel();
        MenuItem2 = new javax.swing.JPanel();
        JL_icon2 = new javax.swing.JLabel();
        JL_ListItem = new javax.swing.JLabel();
        MenuItem3 = new javax.swing.JPanel();
        JL_icon3 = new javax.swing.JLabel();
        JL_recherche = new javax.swing.JLabel();
        MenuItem4 = new javax.swing.JPanel();
        JL_icon4 = new javax.swing.JLabel();
        JL_settings = new javax.swing.JLabel();
        dsgbar1 = new javax.swing.JPanel();
        MenuItem5 = new javax.swing.JPanel();
        JL_icon5 = new javax.swing.JLabel();
        JL_status = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        jListing = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Products = new javax.swing.JTable();
        btn_addProduct = new javax.swing.JButton();
        btn_raffraichir = new javax.swing.JButton();
        jAcceuil = new javax.swing.JPanel();
        btn_ajouter = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_Vendre = new javax.swing.JButton();
        jRecherche = new javax.swing.JPanel();
        btn_ProductSearch = new javax.swing.JButton();
        JT_keyword = new javax.swing.JTextField();
        btn_TransactionSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_Recherche = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setBackground(new java.awt.Color(41, 98, 255));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dsgbar.setBackground(new java.awt.Color(144, 202, 249));

        javax.swing.GroupLayout dsgbarLayout = new javax.swing.GroupLayout(dsgbar);
        dsgbar.setLayout(dsgbarLayout);
        dsgbarLayout.setHorizontalGroup(
            dsgbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dsgbarLayout.setVerticalGroup(
            dsgbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menu.add(dsgbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 270, 30));

        MenuItem1.setBackground(new java.awt.Color(41, 98, 255));
        MenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuItem1MouseReleased(evt);
            }
        });

        JL_icon1.setBackground(new java.awt.Color(41, 98, 255));
        JL_icon1.setForeground(new java.awt.Color(255, 255, 255));
        JL_icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3.png"))); // NOI18N

        JL_acceuil.setBackground(new java.awt.Color(41, 98, 255));
        JL_acceuil.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JL_acceuil.setForeground(new java.awt.Color(255, 255, 255));
        JL_acceuil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_acceuil.setText("Acceuil");
        JL_acceuil.setOpaque(true);

        javax.swing.GroupLayout MenuItem1Layout = new javax.swing.GroupLayout(MenuItem1);
        MenuItem1.setLayout(MenuItem1Layout);
        MenuItem1Layout.setHorizontalGroup(
            MenuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem1Layout.createSequentialGroup()
                .addComponent(JL_icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuItem1Layout.setVerticalGroup(
            MenuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem1Layout.createSequentialGroup()
                .addGroup(MenuItem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL_icon1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_acceuil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(MenuItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 60));

        MenuItem2.setBackground(new java.awt.Color(41, 98, 255));
        MenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuItem2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuItem2MouseReleased(evt);
            }
        });

        JL_icon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_dns_white.png"))); // NOI18N

        JL_ListItem.setBackground(new java.awt.Color(41, 98, 255));
        JL_ListItem.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JL_ListItem.setForeground(new java.awt.Color(255, 255, 255));
        JL_ListItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_ListItem.setText("Liste des produits");
        JL_ListItem.setOpaque(true);

        javax.swing.GroupLayout MenuItem2Layout = new javax.swing.GroupLayout(MenuItem2);
        MenuItem2.setLayout(MenuItem2Layout);
        MenuItem2Layout.setHorizontalGroup(
            MenuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem2Layout.createSequentialGroup()
                .addComponent(JL_icon2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_ListItem, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addContainerGap())
        );
        MenuItem2Layout.setVerticalGroup(
            MenuItem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JL_icon2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(JL_ListItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu.add(MenuItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 270, 50));

        MenuItem3.setBackground(new java.awt.Color(41, 98, 255));
        MenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuItem3MouseReleased(evt);
            }
        });

        JL_icon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_search_white.png"))); // NOI18N

        JL_recherche.setBackground(new java.awt.Color(41, 98, 255));
        JL_recherche.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JL_recherche.setForeground(new java.awt.Color(255, 255, 255));
        JL_recherche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_recherche.setText("Recherche");
        JL_recherche.setOpaque(true);

        javax.swing.GroupLayout MenuItem3Layout = new javax.swing.GroupLayout(MenuItem3);
        MenuItem3.setLayout(MenuItem3Layout);
        MenuItem3Layout.setHorizontalGroup(
            MenuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem3Layout.createSequentialGroup()
                .addComponent(JL_icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuItem3Layout.setVerticalGroup(
            MenuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem3Layout.createSequentialGroup()
                .addGroup(MenuItem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL_icon3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(MenuItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 60));

        MenuItem4.setBackground(new java.awt.Color(41, 98, 255));
        MenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuItem4MouseReleased(evt);
            }
        });

        JL_icon4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_settings_white_24dp.png"))); // NOI18N

        JL_settings.setBackground(new java.awt.Color(41, 98, 255));
        JL_settings.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JL_settings.setForeground(new java.awt.Color(255, 255, 255));
        JL_settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_settings.setText("Parametres");

        javax.swing.GroupLayout MenuItem4Layout = new javax.swing.GroupLayout(MenuItem4);
        MenuItem4.setLayout(MenuItem4Layout);
        MenuItem4Layout.setHorizontalGroup(
            MenuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem4Layout.createSequentialGroup()
                .addComponent(JL_icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuItem4Layout.setVerticalGroup(
            MenuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem4Layout.createSequentialGroup()
                .addGroup(MenuItem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL_icon4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_settings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(MenuItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 270, 60));

        dsgbar1.setBackground(new java.awt.Color(144, 202, 249));

        javax.swing.GroupLayout dsgbar1Layout = new javax.swing.GroupLayout(dsgbar1);
        dsgbar1.setLayout(dsgbar1Layout);
        dsgbar1Layout.setHorizontalGroup(
            dsgbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dsgbar1Layout.setVerticalGroup(
            dsgbar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menu.add(dsgbar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 30));

        MenuItem5.setBackground(new java.awt.Color(41, 98, 255));
        MenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuItem5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MenuItem5MouseReleased(evt);
            }
        });

        JL_icon5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_trending_up_white.png"))); // NOI18N

        JL_status.setBackground(new java.awt.Color(41, 98, 255));
        JL_status.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JL_status.setForeground(new java.awt.Color(255, 255, 255));
        JL_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JL_status.setText("Status");
        JL_status.setOpaque(true);

        javax.swing.GroupLayout MenuItem5Layout = new javax.swing.GroupLayout(MenuItem5);
        MenuItem5.setLayout(MenuItem5Layout);
        MenuItem5Layout.setHorizontalGroup(
            MenuItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem5Layout.createSequentialGroup()
                .addComponent(JL_icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_status, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuItem5Layout.setVerticalGroup(
            MenuItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuItem5Layout.createSequentialGroup()
                .addGroup(MenuItem5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JL_icon5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_status, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menu.add(MenuItem5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 270, 60));

        jPanel2.setBackground(new java.awt.Color(41, 98, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(41, 98, 255));
        jLabel2.setFont(new java.awt.Font("Clarendon BT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PDB S.A.");
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 210, 80));

        btn_exit.setBackground(new java.awt.Color(41, 98, 162));
        btn_exit.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(0, 0, 0));
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_exit_to_app_white.png"))); // NOI18N
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel2.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 40));

        menu.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 80));

        background.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 540));

        jListing.setBackground(new java.awt.Color(255, 255, 255));
        jListing.setForeground(new java.awt.Color(255, 255, 255));
        jListing.setOpaque(false);
        jListing.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jT_Products.setBackground(new java.awt.Color(255, 255, 255));
        jT_Products.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 98, 255)));
        jT_Products.setForeground(new java.awt.Color(0, 0, 0));
        jT_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_Products.setGridColor(new java.awt.Color(0, 0, 255));
        jT_Products.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jT_Products.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jT_Products);
        if (jT_Products.getColumnModel().getColumnCount() > 0) {
            jT_Products.getColumnModel().getColumn(6).setResizable(false);
        }

        jListing.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 26, 743, 402));

        background.add(jListing, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 770, 470));

        btn_addProduct.setBackground(new java.awt.Color(13, 71, 161));
        btn_addProduct.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_addProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_addProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_create_white.png"))); // NOI18N
        btn_addProduct.setText("Ajouter");
        btn_addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProductActionPerformed(evt);
            }
        });
        background.add(btn_addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 120, 30));

        btn_raffraichir.setBackground(new java.awt.Color(13, 71, 161));
        btn_raffraichir.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        btn_raffraichir.setForeground(new java.awt.Color(255, 255, 255));
        btn_raffraichir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ic_refresh_white.png"))); // NOI18N
        btn_raffraichir.setText("Raffraichir");
        btn_raffraichir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raffraichirActionPerformed(evt);
            }
        });
        background.add(btn_raffraichir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, 30));

        jAcceuil.setBackground(new java.awt.Color(255, 255, 255));
        jAcceuil.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btn_ajouter.setBackground(new java.awt.Color(13, 71, 161));
        btn_ajouter.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_ajouter.setForeground(new java.awt.Color(255, 255, 255));
        btn_ajouter.setText("Ajouter");
        btn_ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ajouterActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(13, 71, 161));
        btn_edit.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Modifier");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_Vendre.setBackground(new java.awt.Color(13, 71, 161));
        btn_Vendre.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_Vendre.setForeground(new java.awt.Color(255, 255, 255));
        btn_Vendre.setText("Vendre");
        btn_Vendre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VendreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAcceuilLayout = new javax.swing.GroupLayout(jAcceuil);
        jAcceuil.setLayout(jAcceuilLayout);
        jAcceuilLayout.setHorizontalGroup(
            jAcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAcceuilLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btn_Vendre, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btn_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jAcceuilLayout.setVerticalGroup(
            jAcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAcceuilLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(jAcceuilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Vendre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        background.add(jAcceuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 770, 540));

        jRecherche.setBackground(new java.awt.Color(255, 255, 255));
        jRecherche.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        btn_ProductSearch.setBackground(new java.awt.Color(13, 71, 161));
        btn_ProductSearch.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_ProductSearch.setForeground(new java.awt.Color(255, 255, 255));
        btn_ProductSearch.setText("Rechercher un produit");
        btn_ProductSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductSearchActionPerformed(evt);
            }
        });

        JT_keyword.setBackground(new java.awt.Color(255, 255, 255));
        JT_keyword.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JT_keyword.setForeground(new java.awt.Color(0, 0, 0));
        JT_keyword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 255), 1, true));

        btn_TransactionSearch.setBackground(new java.awt.Color(13, 71, 161));
        btn_TransactionSearch.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btn_TransactionSearch.setForeground(new java.awt.Color(255, 255, 255));
        btn_TransactionSearch.setText("Rechercher une transaction");
        btn_TransactionSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TransactionSearchActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jT_Recherche.setBackground(new java.awt.Color(255, 255, 255));
        jT_Recherche.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jT_Recherche.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jT_Recherche.setForeground(new java.awt.Color(0, 0, 0));
        jT_Recherche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jT_Recherche.setGridColor(new java.awt.Color(51, 51, 255));
        jT_Recherche.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jScrollPane2.setViewportView(jT_Recherche);

        javax.swing.GroupLayout jRechercheLayout = new javax.swing.GroupLayout(jRecherche);
        jRecherche.setLayout(jRechercheLayout);
        jRechercheLayout.setHorizontalGroup(
            jRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRechercheLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JT_keyword, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jRechercheLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btn_ProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btn_TransactionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jRechercheLayout.setVerticalGroup(
            jRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRechercheLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JT_keyword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jRechercheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ProductSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_TransactionSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(jRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 770, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProductActionPerformed
        // TODO add your handling code here:
        AddProduct ap = new AddProduct();
        ap.setVisible(true);
    }//GEN-LAST:event_btn_addProductActionPerformed

    private void MenuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem2MouseEntered
        
    }//GEN-LAST:event_MenuItem2MouseEntered

    private void MenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem2MousePressed
        JL_ListItem.setBackground(Color.WHITE);
        JL_ListItem.setForeground(Color.BLACK);
    }//GEN-LAST:event_MenuItem2MousePressed

    //TO DEFINE LISTING OPTION
    //Effet sur les bouttons du menu
    
    private void MenuItem2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem2MouseReleased
        // TODO add your handling code here:
        JL_ListItem.setBackground(Color.getColor("#2962ff"));
        JL_ListItem.setForeground(Color.WHITE);
        jListing.setVisible(true);
        jAcceuil.setVisible(false);
        btn_addProduct.setVisible(true);
        btn_raffraichir.setVisible(true);
        btn_ajouter.setVisible(false);
        btn_edit.setVisible(false);
        btn_Vendre.setVisible(false);
        btn_ProductSearch.setVisible(false);
        btn_TransactionSearch.setVisible(false);
        JT_keyword.setVisible(false);
        jT_Recherche.setVisible(false);
        jRecherche.setVisible(false);
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_MenuItem2MouseReleased

    private void MenuItem3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem3MousePressed
        // TODO add your handling code here:
        JL_recherche.setBackground(Color.WHITE);
        JL_recherche.setForeground(Color.BLACK);
    }//GEN-LAST:event_MenuItem3MousePressed

    private void MenuItem3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem3MouseReleased
        // TODO add your handling code here:
        JL_recherche.setBackground(Color.getColor("#2962ff"));
        JL_recherche.setForeground(Color.WHITE);
        
        jListing.setVisible(false);
        jAcceuil.setVisible(false);
        btn_addProduct.setVisible(false);
        btn_raffraichir.setVisible(false);
        btn_ajouter.setVisible(false);
        btn_edit.setVisible(false);
        btn_Vendre.setVisible(false);
        btn_ProductSearch.setVisible(true);
        btn_TransactionSearch.setVisible(true);
        JT_keyword.setVisible(true);
        jT_Recherche.setVisible(true);
        jRecherche.setVisible(true);
        jScrollPane2.setVisible(true);
    }//GEN-LAST:event_MenuItem3MouseReleased

    private void MenuItem5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem5MousePressed
        // TODO add your handling code here:
        JL_status.setBackground(Color.WHITE);
        JL_status.setForeground(Color.BLACK);

    }//GEN-LAST:event_MenuItem5MousePressed

    private void MenuItem5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem5MouseReleased
        // TODO add your handling code here:
        JL_status.setBackground(Color.getColor("#2962ff"));
        JL_status.setForeground(Color.WHITE);
    }//GEN-LAST:event_MenuItem5MouseReleased

    private void MenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem1MousePressed
        // TODO add your handling code here:
        JL_acceuil.setBackground(Color.WHITE);
        JL_acceuil.setForeground(Color.BLACK);
    }//GEN-LAST:event_MenuItem1MousePressed

    private void MenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem1MouseReleased
        // TODO add your handling code here:
        JL_acceuil.setBackground(Color.getColor("#2962ff"));
        JL_acceuil.setForeground(Color.WHITE);
        jListing.setVisible(false);
        jAcceuil.setVisible(true);
         btn_ajouter.setVisible(true);
        btn_edit.setVisible(true);
        btn_Vendre.setVisible(true);
        btn_addProduct.setVisible(false);
        btn_raffraichir.setVisible(false);
        btn_ProductSearch.setVisible(false);
        btn_TransactionSearch.setVisible(false);
        JT_keyword.setVisible(false);
        jT_Recherche.setVisible(false);
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_MenuItem1MouseReleased

    private void btn_raffraichirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raffraichirActionPerformed
        populateList();
    }//GEN-LAST:event_btn_raffraichirActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ajouterActionPerformed
        AddProduct ap = new AddProduct();
        ap.setVisible(true);
    }//GEN-LAST:event_btn_ajouterActionPerformed

    private void btn_ProductSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductSearchActionPerformed
        RechercherProduit();
    }//GEN-LAST:event_btn_ProductSearchActionPerformed

    private void btn_TransactionSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TransactionSearchActionPerformed
        // TODO add your handling code here:
        RechercherTransaction();
    }//GEN-LAST:event_btn_TransactionSearchActionPerformed

    private void btn_VendreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VendreActionPerformed
        SellProduct sp = new SellProduct();
        sp.setVisible(true);
    }//GEN-LAST:event_btn_VendreActionPerformed

    private void MenuItem4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem4MousePressed
        JL_settings.setBackground(Color.WHITE);
        JL_settings.setForeground(Color.BLACK);
    }//GEN-LAST:event_MenuItem4MousePressed

    //TO DEFINE SETTINGS OPTION
    private void MenuItem4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem4MouseReleased
        JL_settings.setBackground(Color.getColor("#2962ff"));
        JL_settings.setForeground(Color.WHITE);
    }//GEN-LAST:event_MenuItem4MouseReleased

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        ModifyProduct mp = new ModifyProduct();
        mp.setVisible(true);
    }//GEN-LAST:event_btn_editActionPerformed

     public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_ListItem;
    private javax.swing.JLabel JL_acceuil;
    private javax.swing.JLabel JL_icon1;
    private javax.swing.JLabel JL_icon2;
    private javax.swing.JLabel JL_icon3;
    private javax.swing.JLabel JL_icon4;
    private javax.swing.JLabel JL_icon5;
    private javax.swing.JLabel JL_recherche;
    private javax.swing.JLabel JL_settings;
    private javax.swing.JLabel JL_status;
    private javax.swing.JTextField JT_keyword;
    private javax.swing.JPanel MenuItem1;
    private javax.swing.JPanel MenuItem2;
    private javax.swing.JPanel MenuItem3;
    private javax.swing.JPanel MenuItem4;
    private javax.swing.JPanel MenuItem5;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_ProductSearch;
    private javax.swing.JButton btn_TransactionSearch;
    private javax.swing.JButton btn_Vendre;
    private javax.swing.JButton btn_addProduct;
    private javax.swing.JButton btn_ajouter;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_raffraichir;
    private javax.swing.JPanel dsgbar;
    private javax.swing.JPanel dsgbar1;
    private javax.swing.JPanel jAcceuil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jListing;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jRecherche;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jT_Products;
    private javax.swing.JTable jT_Recherche;
    private javax.swing.JPanel menu;
    // End of variables declaration//GEN-END:variables
}
