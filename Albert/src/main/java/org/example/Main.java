package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // public static int temp = 34;
    // private  static int roomTemp = 72;
    public static void main(String[] args) {
        // System.out.println("The temp outside is " + temp + ".");
        // System.out.println("The temp inside is " + roomTemp + ".");

        //Data Types
//        int a = 10;
//        long b = 20;
//        float c = 67.89F;
//        double d = 56.334;
//        boolean flag = true; //0 or 1
//        char intitial = 'Z';

        //User input and String Manipulation
        boolean flag = true;
        while(flag) {
            System.out.println("Enter selection choice: ");
            System.out.println("Addition");
            System.out.println("Subtraction");
            System.out.println("Exit");
            System.out.print("-> ");

            // Create Scanner object
            Scanner scan = new Scanner(System.in);
            //Get user input
            String selection = scan.next();
            // System.out.println(selection);

            //Get num1 and num2 from user input
            double num1 = 0, num2 = 0;
            if(!selection.equals("Exit")) {
                System.out.print("\nEnter number 1: ");
                num1 = scan.nextDouble();

                System.out.print("\nEnter number 2: ");
                num2 = scan.nextDouble();
            }
            //a = 5 , b = 5, c = 8
            // a == b, c > b, a < c & b < c
            double result;
            if (selection.equals("Addition")) {
                result = Add(num1, num2);
                System.out.println(result);
            } else if (selection.equals("Subtraction")) {
                result = Subtract(num1, num2);
                System.out.println(result);
            } else if(selection.equals("Exit")){
                flag = false;
            } else {
                System.out.println("Try again. Enter 'Exit' to quit.");
            }


        }
    }
    // Functions
    public static double Add(double a, double b){
        return a + b;
    }
    public static double Subtract(double a, double b){
        if(b > a){
            return b - a;
        }
        return a - b;
    }
}