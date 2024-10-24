
package Week3;
import java.util.Random;
public class L2Q5 {
        public static void main (String[]args){
            Random random = new Random();
            int random_number = random.nextInt(10001);
            System.out.println("The random number generated is " + random_number);
            String reverse = Integer.toString(random_number);
            String word = " ";
            int sum=0;
            for (int i = reverse.length()-1; i>=0 ; i--){
               char digitChar = reverse.charAt(i);
                word += digitChar;
                int digit = Character.getNumericValue(digitChar);
                sum += digit;
            }
            System.out.println("The reverse of the number is " + word);
            System.out.println("The sum of the digits of the random number " + sum);
        }
      
    }    