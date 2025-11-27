/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
Order Priority Sorting 
Create an Order class with priority levels such as High, Medium, and Low.
* Store multiple orders in a list and sort them so High priority orders appear first.
* Display them in sorted order. This is used in customer support ticketing systems. 
 */
class order {
    String orderId;
    String priority; // high , medium and low
     
    public order(String orderId, String priority){
        this.orderId = orderId;
        this.priority = priority;
    }
    // method
     public void display(){
         System.out.println("order Id:" + orderId + "priority:" + priority);
     }
    
}
public class OrderPriority {
    public static void main(String[] args) {
        List<order> orders = new ArrayList<>();
        orders.add(new order("10101" , "Medium"));
          orders.add(new order("10103" , "High"));
            orders.add(new order("10102" , "Low"));
              orders.add(new order("10107" , "Medium"));
                orders.add(new order("10105" , "High"));
     // sort orders
                Collections.sort(orders, new Comparator<order>() {
                   public int compare(order o1 , order o2){
                       return getPriorityValue(o1.priority) - getPriorityValue(o2.priority);
                   } 
                   private int getPriorityValue(String priority){
                       switch(priority){
                           case "High": return 1;
                           case "Medium": return  2;
                           case "Low": return  3;
                           default: return 4;
                       }
                   }
                });
             System.out.println("orders sorted by priority(high to low):");
             for(order order1 : orders){
                 order1.display();
             }
    
    
    }
}
