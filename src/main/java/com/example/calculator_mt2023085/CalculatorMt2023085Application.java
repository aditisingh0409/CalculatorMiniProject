package com.example.calculator_mt2023085;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class CalculatorMt2023085Application {

    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static int subtract(int num1,int num2){
        return num1-num2;
    }

    public static int multiply(int num1,int num2){
        return num1*num2;
    }

    public static int division(int num1,int num2){
        return num1/num2;
    }
    public static void main(String[] args) {
        // Main calc = new Main();
        System.out.println("Please select the operation from below: ");
        System.out.println("1. Add ");
        System.out.println("2. Subtract ");
        System.out.println("3. Multiply ");
        System.out.println("4. Division ");
        System.out.println("5. Exit ");
        //H
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter Choice: ");
        int choice = myObj.nextInt();  // Read user input

        System.out.println("Enter the 2 numbers: ");
        int num1 = myObj.nextInt();  // Read user input
        int num2 = myObj.nextInt();  // Read user input
        int ans=0;
        switch(choice) {
            case 1:
                ans=add(num1,num2);
                break;
            case 2:
                ans=subtract(num1,num2);
                break;
            case 3:
                ans=multiply(num1,num2);
                break;
            case 4:
                ans=division(num1,num2);
                break;
            case 5:
                myObj.close();
                return;
        }
        System.out.println("The answer is = "+ans);
        myObj.close();
    }
}
