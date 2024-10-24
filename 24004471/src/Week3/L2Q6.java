package Week3;

import java.util.Scanner;
public class L2Q6 {
        public static void main (String[]args){
            Scanner sc = new Scanner (System.in);
                System.out.println("Enter the amount of water in gram:");
                double amount = sc.nextDouble();
                System.out.println("Enter the initial temperature in Fahrenheit:");
                double initial_Fahrenheit = sc.nextDouble();
                System.out.println("Enter the final temperature in Fahrenheit:");
                double final_Fahrenheit = sc.nextDouble();
                double M = amount/1000;
                double initial_Temperature = (initial_Fahrenheit-32)/1.8;
                double final_Temperature = (final_Fahrenheit-32)/1.8;
                double Q = M*(final_Temperature - initial_Temperature)*4184; 
                System.out.printf("The energy needed is %.5e Joules ",Q);
    }
    }