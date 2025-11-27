/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.ArrayList;
import java.util.Scanner;

/**
Online Shopping Cart Calculation 
Create a Product class and add multiple products into a cart with price and quantity.
* Calculate total bill including GST (example 18%) and apply discount if the total price exceeds a 
* defined amount. This reflects real e-commerce billing logic.
 */
class product{
    String name;
    double price;
    int quantity;

    public product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    double gettotalprice(){
        return price*quantity;
    }

}
public class Shoppingcart {
    public static void main(String[] args) {
        Scanner online = new Scanner(System.in);
        ArrayList<product> cart = new ArrayList<>();
        System.out.println("How many product do you want");
        int count = online.nextInt();
        online.nextLine();
        for(int i=0 ; i <count ; i++){
            System.out.println("Enyter the product details" + (i+1));
            System.out.println("product name:");
            String name = online.nextLine();
            System.out.println("price:");
            double price = online.nextDouble();
            System.out.println("quantity:");
          int quantity = online.nextInt();
            online.nextLine();
            cart.add(new product(name, price, quantity));
        }
        double total =0;
        for(product p: cart){
            total += p.gettotalprice();
        }
        // calculation of gst(18)
        double gst = total * 0.18;
        // discount if total exceeds 1000
        double discount =0;
        if(total >1000){
            discount = total * 0.10;
        }
        double finalamount = total + gst - discount;
        // now iam priniting bill
        for(product p : cart){
            System.out.println(p.name +"(x"+ p.quantity +") = " + p.gettotalprice());
        }
        System.out.println("Total price :" + total);
        System.out.println("GST (18):" + gst);
        System.out.println("Discount applied:" + discount);
        System.out.println("Final amount:" + finalamount) ;
    }
}
