package com.plurasight;

import java.util.Scanner;

public class payrollCalculater {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("###   Welcome  ###");

        //Take the First name
        System.out.println("Enter First Name: ");
        String firstName = myScanner.nextLine();


        //Take the last name
        System.out.println("Enter Last Name: ");
        String lastName = myScanner.nextLine();

        //take the input for the hours worked
        System.out.println("Enter hours worked.");
        double hoursWorked = myScanner.nextDouble();

        //Take the input for the pay rate
        System.out.println("Enter pay rate.");
        double payRate = myScanner.nextDouble();

        //find the gross pay by multiply the payRate and hoursWorked
        double grossPay = payRate * hoursWorked;


        //Display the name and the gross pay
        System.out.println("Name: "+ (firstName + " " + lastName));
        System.out.println("Gross pay:  $" + grossPay);

    }


}
