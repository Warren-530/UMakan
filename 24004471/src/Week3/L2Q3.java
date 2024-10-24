
package Week3;
import java.util.Random;
public class L2Q3 {
    public static void main (String[]args){
        Random random = new Random();
        int num1 = random.nextInt(10,51);
        int num2 = random.nextInt(10,51);
        int num3 = random.nextInt(10,51);
        System.out.println("The random numbers generated are " + num1 + " " + num2 + " "+ num3);
        double sum = num1+num2+num3;
        System.out.println("The sum of the three random numbers are " + sum);
        double average = sum/3;
        System.out.printf("The average of the three random numbers are %.2f",average);
    }
}
