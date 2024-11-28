package Week4;

import java.util.Random;
public class L3Q4 {
    public static void main (String[]args){
        Random r = new Random();
        
        int dice1 = r.nextInt(6)+1;
        int dice2 = r.nextInt(6)+1;
        int dice3 = r.nextInt(6)+1;
        int dice4 = r.nextInt(6)+1;
        int p1 = dice1+dice2;
        int p2 = dice3+dice4;
        if (p1>p2)
            System.out.println("Player 1 win with score " + p1);
        else 
            System.out.println("Player 2 win with score " + p2);
    }
    
}
