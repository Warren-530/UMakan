package Week4;
import java.util.Scanner;
public class L3Q6 {
 public static void main (String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Input the radius of the circle:");
     double radius = sc.nextDouble();
     System.out.println("Enter the x-coordinate of the point:");
     double x = sc.nextDouble();
     System.out.println("Enter the y-coordinate of the point:");
     double y = sc.nextDouble();
     double distance = (x*x + y*y);
     if (distance<=radius)
         System.out.println("The point is inside the circle");
     else 
         System.out.println("The point is outside the circle");
 }   
}
