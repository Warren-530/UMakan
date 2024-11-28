package Week4;
import java.util.Scanner;
    public class L3Q3{ 
        public static void main (String[]args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the sales volume:");
            int SalesVolume =sc.nextInt();
            System.out.println("Enter the total sales:");
            double total = sc.nextDouble();
            double commision=0;
            if (SalesVolume <= 100 && SalesVolume>=0)
                commision = total*0.05;
            else if (SalesVolume >100 && SalesVolume<=500)
                commision = total*0.075;
            else if (SalesVolume >500 && SalesVolume<=1000)
                commision = total*0.1;
            else if (SalesVolume >1000)
                commision = total*0.125;
            else 
                System.out.println("Invalid Sales Volume");
            System.out.printf("\nThe commission is RM%.2f",commision);
        }
}    
