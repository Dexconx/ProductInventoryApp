/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productinventoryapp;

import java.util.ArrayList;

/**
 *
 * @author Declan
 */
public class Inventory {
    
    
    public Inventory(ArrayList<Product> list){    
        
        ArrayList<Product> al = list;
        // test data
        Product p = new Product(001,3,42.50,"Ball");
        al.add(p);
    }
    
    public void add(ArrayList<Product> list, Product product){
        list.add(product);
    }
    
    public void remove(ArrayList<Product> list, Product product){
        list.remove(product);
    }
    
    public int count(ArrayList<Product> list){
                      
        return list.size();        
    }
    
    public void printList(ArrayList<Product> list){
        
        for(Product elem : list){
            System.out.println(elem.getName() + ", " + elem.getId() + ", " + 
                    elem.getPrice() + ", " + elem.getQuantity());
        }
        
    }
    
}
