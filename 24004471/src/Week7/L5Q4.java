
package Week7;
/*
import java.util.Random;
public class L5Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
            int [] num = new int [9];
            for (int i = 0 ; i<num.length ; i++){
                num[i] = rand.nextInt(10);
            }
            System.out.println("3 by 3 Matrix");
            for (int i =0 ; i<3; i++){
                if(i==0){
             for(int j=0 ; j<3 ; j++){
                 System.out.print(num[j]+ " ");
             }
                }
                if(i==1){
                    for (int j=3 ; j<6;j++){
                        System.out.print(num[j] + " ");
                    }   
                }
                if(i==2){
                    for (int j=6 ; j<9;j++){
                        System.out.print(num[j] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("After rotates 90 degrees clockwise");
            int [] rotate = new int [9];
            rotate[2] = num[0];
            rotate[5] = num[1];
            rotate[8] = num[2];
            rotate[1] = num[3];
            rotate[7] = num[5];
            rotate[0] = num[6];
            rotate[3] = num[7];
            rotate[6] = num[8];
            rotate[4] = num[4];
            for (int i=0; i<rotate.length;i++ ){
                System.out.print(rotate[i] + " ");
                if(i==2 || i==5 )
                    System.out.println();
            }
            }
    }

*/
//By using 2 dimensional array
/*
import java.util.Random;
    public class L5Q4{
        public static void main(String[] args) {
            Random rand = new Random();
            int [][] num = new int [3][3];
            for (int i=0 ; i<3;i++){
                for(int j=0; j<3;j++){
                    num[i][j] = rand.nextInt(10);
                    System.out.print(num[i][j] + " ");
                    if(j==2){
                        System.out.println();
                    }
                }
            }
            System.out.println("After rotates 90 degrees clockwise");
            int [][]rotate = new int [3][3];
            rotate [0][0] = num[2][0];
            rotate [0][1] = num[1][0];
            rotate [0][2] = num[0][0];
            rotate [1][0] = num[2][1];
            rotate [1][1] = num[1][1];
            rotate [1][2] = num[0][1];
            rotate [2][0] = num[2][2];
            rotate [2][1] = num[1][2];
            rotate [2][2] = num[0][2];
            for (int i = 0 ; i<3 ; i++){
                for (int j = 0 ; j<3 ;j++){
                    System.out.print(rotate[i][j] + " ");
                }
                System.out.println();
            }
                    }
        }
    */
