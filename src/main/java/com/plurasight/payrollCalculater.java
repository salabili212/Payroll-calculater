package com.plurasight;

import java.util.Scanner;

public class payrollCalculater {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        //get the user name using the function and assigning it to a variable
        String name = fullName();

        //take the input for the hours worked
        double hoursWorked = hoursWorked();

        //call the function to get the payRate and store it in the variable
        double payRate = payRate();

        //calculate the overtime payrate
        double overTime = oT(hoursWorked, payRate);


        //find the gross pay by multiply the payRate and hoursWorked
        double grossPay = (payRate * hoursWorked) + overTime;



        //print the user's name and its payRate
        printInfo(name,grossPay);

    }


    //calculate the overtime payrate
    public static double oT(double hours,double payRate){
        if(hours > 40){
            double overTimeAmount = (hours - 40) * (payRate * 1.5);
            return overTimeAmount;
        }else{
            return 0;
        }
    }
    public static void printInfo(String name, double grossPay){
        //Display the name and the gross pay
        System.out.println("Name: "+ name);
        System.out.println("Gross pay:  $" + grossPay);
    }

    public static String fullName(){
        System.out.println("Enter Full Name: ");
        String fullName = myScanner.nextLine();
        return fullName;
    }

    public static double hoursWorked(){
        //take the input for the hours worked
        System.out.println("Enter hours worked.");
        double hoursWorked = myScanner.nextDouble();
        return hoursWorked;
    }

    public static double payRate(){
        System.out.println("Enter the payRate");
        double payRate = myScanner.nextDouble();
        return payRate;
    }



}
