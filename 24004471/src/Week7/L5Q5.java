
package Week7;
/*
import java.util.Scanner;
import java.util.Random;
public class L5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
            int [] randNum = new int [20];
            System.out.println("A list of 20 random integer within 0 to 100");
            for (int i = 0 ; i<randNum.length ; i++){
                randNum[i] = rand.nextInt(101);
                if(i<randNum.length)
                System.out.print(randNum[i] + ", ");
                else
                    System.out.print(randNum[i]);
            }
            //sorting in descending order
            int temp;
            System.out.println("\nArray in descending order");
           for(int i = 0 ; i<randNum.length ; i++){
               for(int j = 0 ; j<randNum.length-1; j++){
                   if(randNum[j+1]>randNum[j]){
                   temp=randNum[j];
                   randNum[j]=randNum[j+1];
                   randNum[j+1]=temp;
                   }
               }
           }
               for(int i = 0 ; i<randNum.length ; i++){
                   if(i<randNum.length)
                   System.out.print(randNum[i] + ", ");
                   else
                       System.out.print(randNum[i]);
               }
               
               //Linear search and determine number is present in the array or not
               System.out.println("\nEnter a number to search: ");
               int key =sc.nextInt();
               int linearSearchLoop=0;
               int binarySearchLoop=0;
               boolean search=true;
               for (int i = 0 ; i<randNum.length ; i++){
                   if(key ==randNum[i]){
                       System.out.println(key + " found");
                       search=true;
                       break;
                   }
                   if(i==randNum.length-1){
                       search=false;
                       linearSearchLoop=0;
                       break;
                   }
                   linearSearchLoop++;
               }
               
               while(search ==false){
                   System.out.println("Enter a number to search: ");
                   key = sc.nextInt();
                   for(int i = 0 ; i<randNum.length ; i++){
                       if(key==randNum[i]){
                           System.out.println(key+ " found");
                           search=true;
                           break;
                       }
                       if(i==randNum.length-1){
                           search=false;
                       linearSearchLoop=0;
                       break;
                       }
                       linearSearchLoop++;
                   }
               }
               System.out.println("Linear Search - " + linearSearchLoop + " loop(s)");
               
               //Binary search
               int lowest =0;
               int highest = randNum.length-1;
               
               while(lowest<=highest){
                   binarySearchLoop++;
                   int middle = (lowest+highest)/2;
                   if(key == randNum[middle]){
                       System.out.println(key + " found");
                       break;
                   }
                   else if(key>randNum[middle]){
                       highest=middle-1;
                   }
                   else
                       lowest = middle+1;
                   
               }
               System.out.println("Binary Search - " +binarySearchLoop + " loop(s)");
}
    }
*/