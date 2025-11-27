/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.ArrayList;
import java.util.Scanner;

/**
 Library Management System 
Using an ArrayList, allow users to add new books, view available books, search for a book by its title, 
* and delete a book if it exists. Ensure duplicate book entries are not allowed.
* This models basic CRUD functionality found in most software systems.
 */
class Books{
    ArrayList<String> books = new ArrayList<>();
    // view books
    void viewbooks(){
        if(books.isEmpty()){
            System.out.println("No books available:");
        } else {
            System.out.println("Available bokks:");
            // all books have to display so, I have using for each 
            for(String book : books){
                System.out.println("-"+ book);
            }
        }
    }
    // search books
    void searchbooks(String title){
        if(books.contains(title)){
            System.out.println("Books found:" + title);
        } else {
            System.out.println("Books Not found");
        }
    }
    // delete
    void deletebooks(String title){
        if(books.remove(title)){
            System.out.println("Books deleted sucessfully" );
        } else {
            System.out.println("Books cannot found. so I cannot delete from list");
        }
    }
   // duplicate books
    void dup(String title){
        if(books.contains(title)){
            System.out.println("Books already exists ! cannot add duplicates");
        }
        else {
            books.add(title);
            System.out.println("Books added sucessfully");
        }
    }
            
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
         Books b = new Books();
         Scanner sc = new Scanner(System.in);
         
         while(true){
             System.out.println("1.add books");
             System.out.println("2.view all books");
             System.out.println("3. search books");
             System.out.println("4. Delete books ");
             System.out.println("5.Exit");
             System.out.println("please enter your choice:");
             int choice = sc.nextInt();
             sc.nextLine();
             switch(choice){
                 case 1:
                     System.out.println("Enter  book title:");
                     String title = sc.nextLine();
                     b.dup(title);
                     break;
                 case 2:
                     b.viewbooks();
                     break;
                 case 3:
                     System.out.println("Enter title to search:");
                     String search = sc.nextLine();
                     b.searchbooks(search);
                     break;
                 case 4:
                     System.out.println("Enter title to delete:");
                     String delete = sc.nextLine();
                     b.deletebooks(delete);
                     break;
                 case 5:
                     System.out.println("Exit");
                     System.exit(0);
                 default:
                     System.out.println("Invaild choice. Try again...");
             
             }
             
         }
    }
}
