
package Week3;

    import java.util.Scanner;
    public class L2Q2 {
        public static void main (String[]args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Price of the car:");
            double P = sc.nextDouble();
            System.out.println("Down Payment:");
            double D = sc.nextDouble();
            System.out.println("Interest rate in %");
            float R = sc.nextFloat();
            System.out.println("Loan Duration in year");
            float Y = sc.nextFloat();
            double M;
            M = ((P-D)*(1+((R*Y)/100))/(Y*12));
            System.out.printf("\nThe monthly payment is RM%.2f",M);
           
        }
    }
