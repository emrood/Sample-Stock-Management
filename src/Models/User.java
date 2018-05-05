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
public class User {
    
    public String ID;
    public String vendor_name;
    public String password;
    
    public User(){
        
    }
    
    public User(String Id, String name, String pass){
        this.ID = Id;
        this.vendor_name = name;
        this.password = pass;
    }
    
    public User(String name, String pass){
        this.ID = null;
        this.vendor_name = name;
        this.password = pass;
    }
    
    //Getters
    public String getID(){return this.ID;}
    public String getVendor_Name(){return this.vendor_name;}
    public String getPassword(){return this.password;}
    
    //Setters
    public void setID(String id){this.ID = id;}
    public void setVendor_Name(String name){this.vendor_name = name;}
    public void setPassword(String pass){this.password = pass;}
   
}


