package Week8;
/*
public class L6Q6 {

    public static void main(String[] args) {
        palindromicPrime();
        System.out.println();
        emirp();
    }

    //palindomic prime is a prime that read from infront or behind is also a prime but the sequence must be same
    //emirp read from infront or behind also a prime
    public static void palindromicPrime() {
        int counter = 0;
        int i = 2;
        
        //Check for first 20 palindromic prime
        while (counter < 20) {
            boolean isPrime = true;
            
            if (i <= 1) {
                isPrime = false;
            }
            else if (i == 2) {
                isPrime = true;
            } else if (i % 2 == 0) {
                isPrime = false;
            } else {
                for (int j = 3; j <= Math.sqrt(i); j = j + 2) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
          
            //Check for palindromic prime for the prime number
            if (isPrime == true) {
                  String number = Integer.toString(i);
                  String check="";
                
                    for (int z = number.length() - 1; z >= 0; z--) {
                        check += number.charAt(z);
                    }
                    if(number.equals(check)){
                        if(counter==19){
                        System.out.print(i);
                        }
                        else{
                        System.out.print(i + " , ");
                        }
                        counter++;
                    }
                }
                i++;
            }
            
        }
    //Emirp 
    public static void emirp(){
        int counter=0;
        int i = 10;
        //First 20 number of emirp
        while(counter<20){
            boolean isPrime=true;
            boolean reversePrime=true;
            //Check for prime number first
            if(i%2==0)
                isPrime=false;
            else{
             for (int j = 3; j<=Math.sqrt(i) ; j+=2){
                 if(i%j==0){
                     isPrime=false;
                     break;
                }
                }
                }
            if(isPrime==true){
                String number =Integer.toString(i);
                String reverse="";
                for(int j = number.length()-1 ; j>=0 ; j--){
                    reverse+=number.charAt(j);
                }
                int reverseNumber=Integer.parseInt(reverse);
                //Check if the reverse number is the prime number also
                if(reverseNumber%2==0)
                reversePrime=false;
                else{
                for (int j = 3; j<=Math.sqrt(reverseNumber) ; j+=2){
                 if(reverseNumber%j==0){
                     reversePrime=false;
                     break;
                }
                }
                }
                //Make sure that the number is prime number for both original and reverse form
                if(reversePrime ==true){
                    //Make sure that the original form is not the same as reverse form
                    if(reverseNumber !=i){
                          if(counter==19){
                              System.out.println(i);
                          }
                          else{
                             System.out.print(i + " , ");
                          }
                    counter++;    
                }
                }
                }
            i++;
        }
    }
    }

*/