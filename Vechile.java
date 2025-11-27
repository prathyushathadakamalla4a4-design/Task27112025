/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task27112025;

import java.util.Calendar;
import java.util.Scanner;

/**
 Vehicle Service Reminder 
Ask the user to input last service date. Calculate the next service date after six months using LocalDate.
* Display reminders like “Service Due Soon” if the date is near. This represents maintenance logic in
* automotive applications.
 */
public class Vechile {
    public static void main(String[] args) {
        Scanner vechile = new Scanner(System.in);
        //input date
        System.out.println("Enter day:");
        int day = vechile.nextInt();
        System.out.println("Enter month:");
        int month = vechile.nextInt();
        System.out.println("Enter year:");
        int year = vechile.nextInt();
        // create localdate object
        Calendar lastservice = Calendar.getInstance();
        lastservice.set(year, month -1 , day); // month starts from zero
        // add 6 months
        Calendar nextservice = (Calendar)lastservice.clone();
        nextservice.add(Calendar.MONTH, 6);
        // todays date
        Calendar today = Calendar.getInstance();
        // convert to miliseconds
        long diffmillis = nextservice.getTimeInMillis() - today.getTimeInMillis();
        long diffdays = diffmillis/(1000 * 60 *60 *24);
        System.out.println("next service date" +
        nextservice.get(Calendar.DAY_OF_MONTH)+ "-"+
                (nextservice.get(Calendar.MONTH)+ 1)+ "-"+
                nextservice.get(Calendar.YEAR));
        // remainder logic
        if(today.after(nextservice)){
            System.out.println("service is overdue please service immediately.");
        }
        else if (diffdays <=10){
            System.out.println("service due date is soon " + diffdays + "days left.");
        } else {
            System.out.println("Service is not due soon");
        }
       vechile.close();
    }
}
