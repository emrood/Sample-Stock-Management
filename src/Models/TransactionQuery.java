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
public class TransactionQuery {
    
    private int ID;
    private String client;
    private String vendor;
    private int quantite;
    private float total;
    private String produit;
    private Date date;
    
    public TransactionQuery(){
    
    
    }
    
    public TransactionQuery(int id, String c, String v, int q, float t, String p, Date d){
        this.ID = id;
        this.client =c;
        this.produit = p;
        this.quantite = q;
        this.total = t;
        this.vendor = v;
        this.date = d;
    }
    
    //Getters
    public int getID(){return this.ID;}
    public int getQuantite(){return this.quantite;}
    public String getClient(){return this.client;}
    public String getProduit(){return this.produit;}
    public String getVendor(){return this.vendor;}
    public float getTotal(){return this.total;}
    public Date getDate(){return this.date;}
    
    //Setters
    public void setID(int id){this.ID = id;}
    public void setClient(String c){this.client = c;}
    public void setVendor(String v){this.vendor = v;}
    public void setProduit(String p){this.produit = p;}
    public void setQuantite(int q){this.quantite = q;}
    public void setTotal(float t){this.total = t;}
    public void setDate(Date d){this.date = d;}
}






