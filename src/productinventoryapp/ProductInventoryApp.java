/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productinventoryapp;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 *
 * @author Declan
 */
public class ProductInventoryApp {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Product> al = new ArrayList();
        Inventory inventory = new Inventory(al);
        
        
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("Inventory Management System");
        System.out.println("---------------------------");
        System.out.println("1. List");
        System.out.println("2. Add Product");
        System.out.println("3. Remove Product");
        System.out.println("4. Exit");
        
        int s;
        Scanner in = new Scanner(System.in);
        s = Integer.parseInt(in.nextLine());
        
        switch(s){
            case 1: s = 1;
                    inventory.printList(al);
                    break;
            case 2: s = 2;
                    inventory.add(al, null);
                    break;
            case 3: s = 3;
                    inventory.remove(al,null);
                    break;
            case 4: s = 4;
                    
                                                     
        };
        
    }
    
}
