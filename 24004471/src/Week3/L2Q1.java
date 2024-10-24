package Week3;

import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        double Fahrenheit = sc.nextDouble();
        double Celcius = (Fahrenheit -32)/1.8;
        System.out.printf("\nTemperaure in Celcius is %.2f",Celcius);
        
    }
}