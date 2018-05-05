/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class Transactions {
    
    public String ID;
    public int produit_id;
    public int client_id;
    public int users_id;
    public Date date;
    public int quantite;
    public float total;
    
    public Transactions (){
        
        
    }
    
    
    public Transactions(int produit, int client, int user, int quantite, float total){
        this.ID = null;
        this.client_id = client;
        this.users_id = user;
        this.date = null;
        
        this.quantite = quantite;
        this.total = total;
    }
    
    public Transactions(String id, int produit, int client, int user, Date date, int quantite, float total){
        this.ID = id;
        this.client_id = client;
        this.produit_id = produit;
        this.date = date; 
        this.quantite = quantite;
        this.total = total;
    }
    
    
    
    //Getters
    public String getID(){return this.ID;}
    public int getClientID(){return this.client_id;}
    public int getProduitID(){return this.produit_id;}
    public int getUserID() {return this.users_id;}
    public Date getDate(){return this.date;}
    public int getQuantite(){return this.quantite;}
    public float getTotal(){return this.total;}
    
    
    //Setters
    public void setID(String id){this.ID = id;}
    public void setCliendID(int id){this.client_id = id;}
    public void setUserId(int id){this.users_id = id;}
    public void setDate(Date date){this.date = date;}
    public void setProductID(int productID){this.produit_id = productID;}
    public void setQuantite(int quantite){this.quantite = quantite;}
    public void setTotal(float total){this.total = total;}
    
    
    
}







