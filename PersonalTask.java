/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.ArrayList;
import java.util.Scanner;

/**
Personal Task Scheduler 
Allow users to add tasks, mark tasks as completed, and display only pending tasks.
* Maintain tasks using a List. This resembles real task management features in productivity tools.
 */

public class PersonalTask {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<Boolean> completed = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("1. add task");
            System.out.println("2. mark task as completed");
            System.out.println("3. display pending task");
            System.out.println("4.Exit");
            System.out.println("5.enter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter task name:");
                    String name = sc.nextLine();
                    tasks.add(name);
                    completed.add(false);
                    System.out.println("task added sucessfully");
                    break;
                case 2:
                    System.out.println("All tasks");
                    for(int i =0; i <tasks.size(); i++){
                        System.out.println((i+1) +"." + tasks.get(i) + (completed.get(i) ? "(completed)": "pending"));
                }
                    System.out.println("Enter task number to mark as completed:");
                int tasknum = sc.nextInt();
                    if(tasknum >0 && tasknum <= tasks.size()){
                        completed.set(tasknum -1, true);
                        System.out.println("Task  mark as completed ");
                    } else {
                        System.out.println("Invaild task completed");
                    }
                break;
                case 3 :
                    System.out.println("pending tasks");
                    for(int i =0; i < tasks.size(); i++){
                        if(!completed.get(i)){
                            System.out.println(tasks.get(i));
                        }
                    }
                break;
                case 4 :
                    System.out.println("Existing...");
                    break;
                default:
                     System.out.println("Invaild choice! try again");
            }
        }
   
    } 
}
