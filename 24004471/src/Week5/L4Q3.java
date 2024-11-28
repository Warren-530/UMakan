package Week5;
/*
import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a score [negative score to quit]:");
        int score = sc.nextInt();
        int numOfStudent=0;
        int minimum = 101;
        int maximum = 0;
        double total =0;
        double average;
        double standardDeviation;
        double scoreSquare=0;
        do{
        numOfStudent++;
        if (score<minimum){
            minimum = score;
        }
        if (score>maximum){
            maximum = score;
        }
        total +=score;
        scoreSquare += Math.pow(score,2);
        
            System.out.println("Enter a score [negative score to quit]:");
            score = sc.nextInt();
        }while(score>=0);
        average = total/numOfStudent;
        standardDeviation = Math.sqrt((scoreSquare -(Math.pow(total,2)/numOfStudent))/(numOfStudent-1));
        System.out.println("Minimum Score:" + minimum);
        System.out.println("Maximum Score:" + maximum);
        System.out.println("Average Score:" + average);
        System.out.printf("Standard Deviation:%.2f",standardDeviation);
       }
}
*/