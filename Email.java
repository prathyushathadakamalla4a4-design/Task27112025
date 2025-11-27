/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
Unique Email Collection System 
Read a list of email IDs from the user. Store them in a Set to automatically remove duplicates.
* Print all unique email IDs. This logic is frequently used in user registration and data cleanup
* operations
 */
public class Email {
    public static void main(String[] args) {
        Scanner email = new Scanner(System.in);
        Set<String> unemail = new HashSet<>();
        int df =0;
        System.out.println("---unique email------------");
        System.out.println("Enter email ids one by one");
        System.out.println("Type done and press Enter to finish enterning");
        String input;
        while(true){
            System.out.println("Enter email or done:");
            input = email.nextLine().trim();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            if(!input.isEmpty()){
                boolean wasadd = unemail.add(input);
                if(wasadd){
                    System.out.println("added" +input +  " " +  "new email");
                } else {
                    System.out.println("ignored" + input +  " " + "duplicate email");
                    df++;
                }
            }
        }
        System.out.println("---------------summary--------");
        System.out.println("total unique emails collected:"+ unemail.size());
        System.out.println("total duplicate ignored:" + df);
        for(String email1 : unemail){
            System.out.println(email1);
        }
        email.close();
    }
}
