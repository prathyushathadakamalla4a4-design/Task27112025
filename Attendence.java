/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.Scanner;

/**
Attendance Eligibility Checker 
Store attendance records for multiple students. Calculate percentage attendance for each student
* and print whether they are eligible for exams (threshold 75%).
* This is similar to attendance systems in education ERP.
 */
public class Attendence {
    public static void main(String[] args) {
        Scanner attendence = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = attendence.nextInt();
        String[] names = new String[n];
        int[] totalclasses = new int[n];
        int[] attendedclasses = new int[n];
        // for all students
        for(int i=0 ; i< n ; i++){
            System.out.println("Enter details for student" + (i+1));
            System.out.println("Name:");
            names[i] = attendence.next();
            System.out.println("Total classes held:");
            totalclasses[i] = attendence.nextInt();
            System.out.println("classes attended:");
            attendedclasses[i] = attendence.nextInt();
        }
            System.out.println("-------Attendence report-----------");
            
            for (int i= 0; i < n; i++){
                 double per = (attendedclasses[i] * 100.0)/totalclasses[i];
                 System.out.println("students:" + names[i]);
                 System.out.println("attendence percentage:"+ per + "%");
                 if(per >= 75){
                     System.out.println("status: Elogible for exams");
                     
            } else {
                     System.out.println("not eligible for exams");
                     
                 }
        }
    attendence.close();
    
    }
   
}
