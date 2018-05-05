/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Models.Client;
import Models.Produits;
import Models.TransactionQuery;
import Models.Transactions;
import Models.User;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class DBConnection {

    public static String USERNAME = "root";
    public static String PASSWORD = "";
    public static String CONNECT = "jdbc:mysql://localhost:3309/propb";
    private static Connection conn = null;
    private static ResultSet result = null;
    public static int r;
    public static ArrayList<Produits> mesProduits;
    public static ArrayList<Transactions> mesTransactions;
    public static ArrayList<User> mesUtilisateurs;
    public static ArrayList<Client> mesClients;
    public static ArrayList<TransactionQuery> mesRequetes;
    public static Produits produit;
    public static Transactions transaction;
    public static Client client;
    public static User user;
    public static TransactionQuery transactionQ;

    public DBConnection() {

    }

    public static boolean Connect() {

        try {
            conn = DriverManager.getConnection(CONNECT, USERNAME, PASSWORD);
            System.out.println("Connection Succes");
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            System.out.println("Error Connection");
            return false;
        }

    }

    //Retoune la liste des produits et les stocks dans la liste 'mesProduits'
    public static boolean ListProduits() {

        mesProduits = new ArrayList<>();

        try {
            Statement stmt = (Statement) conn.createStatement();
            String request = "SELECT * FROM produits";
            result = stmt.executeQuery(request);
            while (result.next()) {
                produit = new Produits();
                produit.setID(String.valueOf(result.getInt("ID")));
                produit.setp_name(result.getString("p_name"));
                produit.setConstructor(result.getString("constructor"));
                produit.setPrice(result.getFloat("price"));
                produit.setQuantite(result.getInt("quantite"));
                produit.setType(result.getString("type"));
                produit.setStatus(result.getString("status"));
                mesProduits.add(produit);
                // System.out.println(result.getString("Nom") + " " + result.getString("Prenom")+ " "  + result.getString("email"));
            }
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean AjouterProduit(Produits produit) {

        try {
            Statement stmt = (Statement) conn.createStatement();
            String insert = "INSERT INTO produits(`p_name`,`constructor`,`price`,`quantite`, `type`, `status`) VALUES ('" + produit.getP_name() + "','" + produit.getConstructor() + "'," + produit.getPrice() + "," + produit.getQuantite() + ",'" + produit.getType() + "','" + produit.getStatus() + "')";
            stmt.executeUpdate(insert);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    //Retoune la liste des produits et les stocks dans la liste 'mesProduits'
    public static boolean ListTransactions() {

        mesTransactions = new ArrayList<>();

        try {
            Statement stmt = (Statement) conn.createStatement();
            String request = "SELECT * FROM transactions";
            result = stmt.executeQuery(request);
            while (result.next()) {
                transaction = new Transactions();
                transaction.setID(String.valueOf(result.getInt("ID")));
                transaction.setCliendID(result.getInt("client_id"));
                transaction.setDate(result.getDate("date"));
                transaction.setUserId(result.getInt("user_id"));
                transaction.setProductID(result.getInt("produit_id"));
                transaction.setQuantite(result.getInt("quantite"));
                transaction.setTotal(result.getFloat("total"));
                mesTransactions.add(transaction);
            }
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean AjouterTransaction(Transactions transaction) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String insert = "INSERT INTO transactions(`client_id`,`user_id`,`produit_id`,`date`, `quantite`, `total`) VALUES ("
                    + transaction.getClientID()
                    + "," + transaction.getUserID()
                    + "," + transaction.getProduitID()
                    + ",'" + String.valueOf(transaction.getDate())
                    + "'," + transaction.getQuantite()
                    + "," + transaction.getTotal() + ")";
            stmt.executeUpdate(insert);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }
    
    public static boolean updateProduct(Produits p){
    
        
        try {
            Statement stmt = (Statement) conn.createStatement();

            String update = "UPDATE produits set `quantite` = " + p.getQuantite()
                    + ", `price` = " + p.getPrice() 
                    + ", `p_name` = '" + p.getP_name() 
                    + "', `constructor` = '" + p.getConstructor()
                    + "', `type` = '" + p.getType()
                    + "', `status` = '" + p.getStatus()
                    + "' WHERE ID = " + p.getID() + "";

            stmt.executeUpdate(update);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    
    
    }

    public static boolean UpdateProductQuantity(int id, int q) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String update = "UPDATE produits set quantite = " + q + " WHERE ID = " + id + "";

            stmt.executeUpdate(update);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean UpdateProductPrice(int id, float p) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String update = "UPDATE produits SET price = " + p + " WHERE ID = " + id + " ";
            stmt.executeUpdate(update);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean DeleteProduit(int id) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String delete = "DELETE FROM produits WHERE ID = " + id + " ";

            stmt.executeUpdate(delete);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean RechercheProduit(String keyword) {

        mesProduits = new ArrayList<>();
        try {
            Statement stmt = (Statement) conn.createStatement();
            String request = "SELECT * FROM produits WHERE p_name LIKE '%" + keyword + "%' OR constructor LIKE '%" + keyword + "%' OR type LIKE '%" + keyword + "%'";
            result = stmt.executeQuery(request);

            while (result.next()) {
                produit = new Produits();
                produit.setID(String.valueOf(result.getInt("ID")));
                produit.setp_name(result.getString("p_name"));
                produit.setConstructor(result.getString("constructor"));
                produit.setPrice(result.getFloat("price"));
                produit.setQuantite(result.getInt("quantite"));
                produit.setType(result.getString("type"));
                produit.setStatus(result.getString("status"));
                mesProduits.add(produit);
            }
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean RechercheTransaction(String keyword) {

        mesRequetes = new ArrayList<>();
        try {
            Statement stmt = (Statement) conn.createStatement();
            String request = "SELECT transactions.ID, produits.p_name, transactions.quantite, transactions.total , clients.f_name, users.vendor_name, transactions.date  FROM transactions, produits, clients, users WHERE (transactions.produit_id = produits.ID AND transactions.client_id = clients.ID AND transactions.user_id = users.ID) AND ((produits.p_name LIKE '%" + keyword + "%' OR clients.f_name LIKE '%" + keyword + "%' OR users.vendor_name LIKE '%" + keyword + "%') OR (clients.phone = '" + keyword + "'))";
            result = stmt.executeQuery(request);

            while (result.next()) {
                transactionQ = new TransactionQuery();
                transactionQ.setID(result.getInt("transactions.ID"));
                transactionQ.setProduit(result.getString("produits.p_name"));
                transactionQ.setClient(result.getString("clients.f_name"));
                transactionQ.setTotal(result.getFloat("transactions.total"));
                transactionQ.setQuantite(result.getInt("transactions.quantite"));
                transactionQ.setVendor(result.getString("users.vendor_name"));
                transactionQ.setDate(result.getDate("transactions.date"));
                mesRequetes.add(transactionQ);
            }
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean ListClients() {

        mesClients = new ArrayList<>();
        try {
            Statement stmt = (Statement) conn.createStatement();
            String request = "SELECT * FROM clients";
            result = stmt.executeQuery(request);
            while (result.next()) {
                client = new Client();
                client.setID(String.valueOf(result.getInt("ID")));
                client.setF_name(result.getString("f_name"));
                client.setAdress(result.getString("adress"));
                client.setTelephone(result.getString("phone"));
                client.setEmail(result.getString("email"));
                mesClients.add(client);
            }
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean AjouterClient(Client client) {

        try {
            Statement stmt = (Statement) conn.createStatement();
            String insert = "INSERT INTO clients(`f_name`,`phone`,`adress`,`email`) VALUES ('" + client.getf_name() + "','" + client.getTelephone() + "','" + client.getAdress() + "','" + client.getEmail() + "')";
            stmt.executeUpdate(insert);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean deleteClient(int id) {

        try {
            Statement stmt = (Statement) conn.createStatement();
            String delete = "DELETE FROM clients WHERE ID = " + id + " ";
            stmt.executeUpdate(delete);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean UpdateClientPhone(int id, String phone) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String update = "UPDATE clients SET phone = " + phone + " WHERE ID = " + id + " ";
            stmt.executeUpdate(update);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean UpdateClientName(int id, String name) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String update = "UPDATE clients SET f_name = " + name + " WHERE ID = " + id + " ";
            stmt.executeUpdate(update);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean UpdateClientAdress(int id, String adress) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String update = "UPDATE clients SET adress = " + adress + " WHERE ID = " + id + " ";
            stmt.executeUpdate(update);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean ListUtilisateurs() {

        mesUtilisateurs = new ArrayList<>();

        try {
            Statement stmt = (Statement) conn.createStatement();
            String request = "SELECT * FROM users";
            result = stmt.executeQuery(request);
            while (result.next()) {
                user = new User();
                user.setID(result.getString("ID"));
                user.setPassword(result.getString("password"));
                user.setVendor_Name(result.getString("vendor_name"));
                mesUtilisateurs.add(user);
            }
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean AjouterUtilisateur(User user) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String insert = "INSERT INTO users(`ID`,`vendor_name`,`password`) VALUES ("
                    + null
                    + "," + user.vendor_name
                    + "," + user.getPassword() + ")";
            stmt.executeUpdate(insert);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    public static boolean updateUserPassword(int id, String newPass) {

        try {
            Statement stmt = (Statement) conn.createStatement();

            String update = "UPDATE clients SET password = " + newPass + " WHERE ID = " + id + " ";
            stmt.executeUpdate(update);
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }
    
    public static boolean RunServer(String path) {
        try {
            Process p = Runtime.getRuntime().exec(new String[]{path});
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

}





