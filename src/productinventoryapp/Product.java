/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productinventoryapp;

/**
 *
 * @author Declan
 */
public class Product {
    
    //  Variables
     private String pName;
     private Double pPrice;
     private int pQuantity;
     private int pId;
    
     
     // Product Class Constructor
    public Product(int id, int quantity, Double price, String name){
        pName = name;
        pPrice = price;
        pQuantity = quantity;
        pId = id;
       
    }
    
    // Setters and Getters for Product Class
    public int getQuantity(){

        return pQuantity;
    }
    
    public Double getPrice(){

        return pPrice;
    }
    public String getName(){

        return pName;
    }
    public int getId(){

        return pId;
    }
}