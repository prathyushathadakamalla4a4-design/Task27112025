/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.Scanner;

/**
User Login System 
Create a Java program to validate login credentials. The username must follow a valid email format
* and the password must have a minimum of eight characters. Display specific messages such as 
* “Invalid Email”, “Password too short”, or “Login Successful”. This simulates basic login logic used 
* in real applications. 
 */
public class Login {
    public static void main(String[] args) {
        Scanner lg = new Scanner(System.in);
        System.out.println("Enter email:");
        String username = lg.nextLine();
        // password
        System.out.println("Enter password it must be eight digits:");
        String password = lg.nextLine();
        // check email validity(basci check)
        if(!username.contains("@") || !username.contains("."))
        {
            System.out.println("Invaild email");
            
        }
        else {
            int index = username.indexOf("@");
            // checking if no text before @
            if(index == 0){
                System.out.println("Invaild email");
            }
        
        // password
        else if (password.length()!=8 ){
            System.out.println("password too short ");
        }
        else {
            System.out.println("Login sucessfully done");
        }
        }
        lg.close();
    }
    
}
