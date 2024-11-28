package Week4;
import java.util.Scanner;
public class L3Q5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        System.out.println("Enter the value of c:");
        int c = sc.nextInt();
        System.out.println("Enter the value of d:");
        int d = sc.nextInt();
        System.out.println("Enter the value of e:");
        int e = sc.nextInt();
        System.out.println("Enter the value of f:");
        int f = sc.nextInt();
        if ( ( (a*d) - (b*c)) == 0)
            System.out.println("The equation has no solution");
        else {
            double x = (((e*d)-(b*f))/((a*d)-(b*c)));
            double y = (((a*f)-(e*c))/((a*d)-(b*c)));
            System.out.println("Value of x is " + x);
            System.out.println("Value of y is " + y);
        }
}
}
