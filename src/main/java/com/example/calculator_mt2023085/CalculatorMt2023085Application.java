package com.example.calculator_mt2023085;

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
        int choice = 0;
        while(true) 
        {
            System.out.println("Please select the operation from below: ");
            System.out.println("1. Add ");
            System.out.println("2. Subtract ");
            System.out.println("3. Multiply ");
            System.out.println("4. Division ");
            System.out.println("5. Exit ");

            // Creating a Scanner object
            Scanner input = new Scanner(System.in);  
            System.out.println("Enter Choice: ");
            
            // Reading User Input
            choice = input.nextInt();  
            if(choice == 5) 
                System.exit(0);
    
            System.out.println("Enter the 2 numbers: ");
            int num1 = input.nextInt();  
            int num2 = input.nextInt();  
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
                default:
                    System.exit(0);
                    input.close();
                }
            System.out.println("The answer is = "+ans);
            input.close();
        }
    }
}
