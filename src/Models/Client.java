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
public class Client {
    
    public String f_name;
    public String telephone;
    public String ID;
    public String adress;
    public String email;
    
    public Client(){
    
    }
    
    
    public Client(String Id, String name, String adress, String telephone, String email){
        this.ID = Id;
        this.adress = adress;
        this.f_name = name;
        this.telephone = telephone;
        this.email = email;
    }
    
    public Client(String name, String adress, String telephone, String email){
        this.ID = null;
        this.adress = adress;
        this.f_name = name;
        this.telephone = telephone;
        this.email = email;
    }
    
    //Getters
    public String getID(){return this.ID;}
    public String getf_name(){return this.f_name; }
    public String getTelephone(){return this.telephone;}
    public String getAdress(){ return this.adress;}
    public String getEmail(){return this.email;}
    
    //Setters
    public void setID(String id){this.ID = id;}
    public void setF_name(String name){this.f_name = name;}
    public void setTelephone(String telephone){this.telephone = telephone;}
    public void setAdress(String adress){this.adress = adress;}
    public void setEmail(String email){this.email = email;}
    
    
    
}


