
package Week5;
/*
import java.util.Scanner;
import java.util.Random;
public class L4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int p1=0;
        int p2=0;
        while (p1 <=100 && p2<=100){
            System.out.print("\nPlayer 1 roll(Enter R to roll):");
            char R1 = sc.next().charAt(0);
            if (R1 == 'R' || R1 == 'r'){
                int dice1 =random.nextInt(6)+1;
                p1 += dice1;
                if (dice1 ==6){
                    System.out.println("Player 1 got 6, Player 1 can roll the dice again.");
                    p1 += random.nextInt(6)+1;
                }
                System.out.println("Player 1 now has " + p1 + " points.");
            }
            else
                System.out.println("Invalid");
            if (p1>=100)
                break;
            System.out.print("\nPlayer 2 roll(Enter R to roll):");
            char R2 =sc.next().charAt(0);
            if (R2 == 'R' || R2 =='r'){
                int dice2 = random.nextInt(6)+1;
                p2 +=dice2;
                if (dice2 ==6){
                    System.out.println("Player 2 got 6, Player 2 can roll the dice again.");
                    p2 += random.nextInt(6)+1;
                }
                System.out.println("Player 2 now has " + p2 + " points.");
            }
            if (p2>=100)
                break;
        }
        
        if(p1>=100){
            System.out.println("Player 1 reach 100 first, Player 1 wins the game.");
        }else if (p2>=100)
            System.out.println("Player 2 reach 100 first, Player 2 wins the game.");
        }
    }

*/