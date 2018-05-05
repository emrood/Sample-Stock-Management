/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Administrator
 */
public class Produits {
    
    public String ID;
    public String p_name;
    public String constructor;
    public int quantite;
    public String type;
    public String status;
    public float price;
    
    
    //Constructors
    public Produits(){
        
    
    }
    
    public Produits(String p_name, String constructor, float price, int quantite, String type){
    
        this.ID = null;
        this.p_name = p_name;
        this.constructor = constructor;
        this.quantite = quantite;
        this.type = type;
        this.price = price;
        this.quantite = quantite;
        
        if(this.quantite > 0){
            this.status = "Disponible";
        }else{
            this.status = "Rupture de stock";
        }
        
        
    
    }
    
    public Produits(String id, String p_name, String constructor, float price, int quantite, String type){
   
        this.ID = id;
        this.p_name = p_name;
        this.constructor = constructor;
        this.quantite = quantite;
        this.type = type;
        this.price = price;
        this.quantite = quantite;
        
        if(this.quantite > 0){
            this.status = "Disponible";
        }else{
            this.status = "Rupture de stock";
        }
        
        
    }

   
    
    //Getters
    public String getID(){return this.ID;}
    
    public String getP_name(){return this.p_name;}
    
    public String getConstructor(){return this.constructor;}
    
    public String getStatus(){return this.status;}
    
    public String getType(){return this.type;} 
    
    public int getQuantite(){return this.quantite;}
    
    public float getPrice(){return this.price;}
   
    //Setters
    public void setID(String id){ this.ID = id;}
    
    public void setConstructor(String constructor){this.constructor  = constructor;}
    
    public void setp_name(String name){this.p_name = name;}
    
    public void setStatus(String status){this.status = status;}
    
    public void setQuantite(int quantite){ this.quantite = quantite;}
    
    public void setPrice(float price){ this.price = price;}
    
    public void setType(String type){this.type = type;}
    
    
    
}





