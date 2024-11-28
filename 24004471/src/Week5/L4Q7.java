package Week5;
/*
import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nEnter principal amount: ");
        double principal = sc.nextDouble();
        
        System.out.print("\nEnter interest in %: ");
        double interest = sc.nextDouble();
        
        System.out.print("\nEnter total number of month(s): ");
        int month = sc.nextInt();
        
        double totalInterest = 0;
        double M = (principal * (interest / (12 * 100))) / (1 - Math.pow((1 + interest / (12 * 100)), -month));
        
        System.out.printf("%-6s %-18s %-12s %-12s %-18s %-15s\n", 
                          "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
       
        for (int i = 1; i <= month; i++) {
            double C = M * Math.pow(1 + (interest / (12 * 100)), -(1 + month - i));
            double L = M - C;
            double R = (L / (interest / (12 * 100))) - C;
            totalInterest += L;

            System.out.printf("%-6d %-18.2f %-12.2f %-12.2f %-18.2f %-15.2f\n", 
                              i, M, C, L, R, totalInterest);
        }
    }
}
*/