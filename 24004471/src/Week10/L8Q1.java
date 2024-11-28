/*
package Week10;
import java.util.Random;
class Number{
    Random rand = new Random();
    private int num;
    public Number(){
        //insert value into integer
        int [] integer = new int [10];
        for (int i = 0 ; i<integer.length ;i++){
            integer [i] = rand.nextInt(101);
            if(integer[i] %2 ==0){
                System.out.println("Even number appear at index " + i + " and the even number is " + integer[i]);
            }
        }
        //Declare variables
        int maximum=integer[0];
        int minimum=integer[0];
        double total=0;
        double average;
        
        
        //Determine prime number
        for(int i = 0 ; i<integer.length;i++){
        boolean isPrime = true;
        if(integer[i]<=1){
            isPrime = false;
    }   else if(integer[i]==2){
        isPrime=true;
    }   else if(integer[i]%2 == 0 ){
        isPrime=false;
    }   else{
        for(int j = 3 ; j<Math.sqrt(integer[i]);j++){
            if(integer[i]%j ==0){
                isPrime = false;
                break;
            }
        }
    }
        if(isPrime==true){
            System.out.println("Prime number at index "+ i + " and the prime number is " + integer[i]);
        }
        
}       //Determine maximum and minimum value and also total num
        for(int i = 0 ; i<integer.length;i++){
            boolean squareNum = false;
            int sqrt = (int) Math.sqrt(integer[i]);
            if(integer[i]>maximum){
                maximum = integer[i];
            }
            if(integer[i]<minimum){
                minimum = integer[i];
            }
            total+=integer[i];
            if(integer[i]<1){
                squareNum = false;
           }else if(sqrt*sqrt== integer[i]){
               squareNum=true;
           }
            if(squareNum == true){
                System.out.println("The square number is at index " + i + " and the square number is " + integer[i]);
            }
        }
            average = total/integer.length;
            System.out.println("The total number is "+ total);
            System.out.printf("\nThe average number is %.2f\n",average);
    }
    //Overriding
    public Number(int number){
        //insert value into integer
        int [] integer = new int [number];
        for (int i = 0 ; i<integer.length ;i++){
            integer [i] = rand.nextInt(101);
            if(integer[i] %2 ==0){
                System.out.println("Even number appear at index " + i + " and the even number is " + integer[i]);
            }
        }
        //Declare variables
        int maximum=integer[0];
        int minimum=integer[0];
        double total=0;
        double average;
        
        
        //Determine prime number
        for(int i = 0 ; i<integer.length;i++){
        boolean isPrime = true;
        if(integer[i]<=1){
            isPrime = false;
    }   else if(integer[i]==2){
        isPrime=true;
    }   else if(integer[i]%2 == 0 ){
        isPrime=false;
    }   else{
        for(int j = 3 ; j<Math.sqrt(integer[i]);j++){
            if(integer[i]%j ==0){
                isPrime = false;
                break;
            }
        }
    }
        if(isPrime==true){
            System.out.println("Prime number at index "+ i + " and the prime number is " + integer[i]);
        }
        
}       //Determine maximum and minimum value and also total num
        for(int i = 0 ; i<integer.length;i++){
            boolean squareNum = false;
            int sqrt = (int) Math.sqrt(integer[i]);
            if(integer[i]>maximum){
                maximum = integer[i];
            }
            if(integer[i]<minimum){
                minimum = integer[i];
            }
            total+=integer[i];
            if(integer[i]<1){
                squareNum = false;
           }else if(sqrt*sqrt== integer[i]){
               squareNum=true;
           }
            if(squareNum == true){
                System.out.println("The square number is at index " + i + " and the square number is " + integer[i]);
            }
        }
            average = total/integer.length;
            System.out.println("The total number is "+ total);
            System.out.printf("\nThe average number is %.2f\n",average);
    }
    
    
    
    
    
    public Number(int number, int range){
    //insert value into integer
        int [] integer = new int [number];
        for (int i = 0 ; i<integer.length ;i++){
            integer [i] = rand.nextInt(range+1);
            if(integer[i] %2 ==0){
                System.out.println("Even number appear at index " + i + " and the even number is " + integer[i]);
            }
        }
        //Declare variables
        int maximum=integer[0];
        int minimum=integer[0];
        double total=0;
        double average;
        
        
        //Determine prime number
        for(int i = 0 ; i<integer.length;i++){
        boolean isPrime = true;
        if(integer[i]<=1){
            isPrime = false;
    }   else if(integer[i]==2){
        isPrime=true;
    }   else if(integer[i]%2 == 0 ){
        isPrime=false;
    }   else{
        for(int j = 3 ; j<Math.sqrt(integer[i]);j++){
            if(integer[i]%j ==0){
                isPrime = false;
                break;
            }
        }
    }
        if(isPrime==true){
            System.out.println("Prime number at index "+ i + " and the prime number is " + integer[i]);
        }
        
}       //Determine maximum and minimum value and also total num
        for(int i = 0 ; i<integer.length;i++){
            boolean squareNum = false;
            int sqrt = (int) Math.sqrt(integer[i]);
            if(integer[i]>maximum){
                maximum = integer[i];
            }
            if(integer[i]<minimum){
                minimum = integer[i];
            }
            total+=integer[i];
            if(integer[i]<1){
                squareNum = false;
           }else if(sqrt*sqrt== integer[i]){
               squareNum=true;
           }
            if(squareNum == true){
                System.out.println("The square number is at index " + i + " and the square number is " + integer[i]);
            }
        }
            average = total/integer.length;
            System.out.println("The total number is "+ total);
            System.out.printf("\nThe average number is %.2f\n",average);
    }
    }

public class L8Q1 {
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4,50);
    }
}
*/