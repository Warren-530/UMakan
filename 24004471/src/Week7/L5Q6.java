
package Week7;
/*
import java.util.Scanner;
public class L5Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row = sc.nextInt(); //Input number of row
        System.out.println("\nThe Pascal Triangle with " + row + " row(s)");
        int [][] pas = new int [row][6];
        for (int i =0 ; i<row ; i++){ //Initialise all 0 part
                if(i==0){
                for(int j=1 ; j<6 ;j++ ){
                    pas[i][j] =0;
                }
                }
                if(i==1){
                for(int j=2 ; j<6 ;j++){
                    pas[i][j]=0;
                }
                }
                if(i==2){
                for(int j=3 ; j<6 ;j++){
                    pas[i][j]=0;
                }
                }
                if(i==3){
                for(int j=3 ; j<6 ;j++){
                    pas[i][j]=0;
                }
                }
                if(i==4){
                for(int j=4 ; j<6 ;j++){
                    pas[i][j]=0;
                }
                }
                if(i==5){
                for(int j=5 ; j<6 ;j++){
                    pas[i][j]=0;
                }
                }
        }
        for (int i = 0 ; i<row;i++){    //initialise first column become all 1
            pas[i][0]=1;
        }
        
        for(int i=1 ; i<row ; i++){ //Calculate the part that change in the Pascal Triangle
            for(int j=1; j<6 ; j++){
                pas[i][j]=pas[i-1][j-1]+pas[i-1][j];
            }
        }
        
        for(int i = 0 ; i<row ; i++){ //Display pascal Triangle
            for(int j = 0 ; j<6; j++){
                System.out.printf("%-3d",pas[i][j]);
                if(j==5)
                    System.out.println();
            }
                }
                }
    }
*/