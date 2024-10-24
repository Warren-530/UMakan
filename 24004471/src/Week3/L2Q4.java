package Week3;
import java.util.Scanner;
    public class L2Q4 {
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of seconds");
            int time = sc.nextInt();
            int hours = time/3600;
            double remainder_hours = time%3600;
            double minutes = remainder_hours/60;
            double remainder_minutes = remainder_hours%60;
            double seconds = remainder_minutes;
            System.out.printf( time + " seconds is " + hours + " hours, " + (int) minutes + " minutes and " + (int) seconds + " seconds");
        }
    }