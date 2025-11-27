/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.Scanner;

/**
  ATM Banking Operations 
Simulate ATM options including deposit, withdraw, and balance check. Handle invalid conditions such as
* insufficient balance using custom exceptions. This models core functionality in banking systems.
 */
// custom Exception
class insufficientbalanceexception extends Exception {
    public insufficientbalanceexception(String message){
        super(message);
    }
}
class banking {
    private double balance;
    public banking(double initialbalance){
        balance = initialbalance;
    }
    // Depsoit
    public void deposit(double amount){
        balance += amount;
        System.out.println("amount deposited:"+ amount);
        
    }
    // withdraw
    public void withdraw(double amount) throws insufficientbalanceexception{
        if(amount > balance){
            throw new insufficientbalanceexception("insufficient balance avilable:" +  balance);
        }
        balance -= amount;
        System.out.println("Amount withdraw:" + amount);
    }
     // balance check
    public double getbalance(){
        return balance;
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);
       banking b = new banking(1000);
       while(true){
           System.out.println("1.Deposit");
           System.out.println("2.withdraw");
           System.out.println("3.Balance check");
           System.out.println("4.exit");
           System.out.println("choose option:");
           int choice = atm.nextInt();
           switch(choice){
               case 1: 
                   System.out.println("Enter amount to deposit:");
                   double dep = atm.nextDouble();
                   b.deposit(dep);
                   break;
               case 2:
                   System.out.println("Enter withdraw amount:");
                   double wd = atm.nextDouble();
                   try {
                       b.withdraw(wd);
                       
                   } catch (insufficientbalanceexception e ){
                       System.out.println("error:" + e.getMessage());
                   }
               break;
               case 3:
                   System.out.println("current balance:" + b.getbalance());
                   break;
               case 4:
                   System.out.println("Thank you for using atm!");
                   atm.close();
                   return;
                default:
                    System.out.println("Invaild option! Try again");
           }
       }
    }
}
