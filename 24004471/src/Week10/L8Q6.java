
package Week10;
/*
import java.util.ArrayList;
import java.util.Scanner;
class Burger{
    private String ID;
    private int numBurger;
    private static int totalNumberBurger = 0;
    public Burger(String ID, int numBurger){
       this.ID = ID;
       this.numBurger = numBurger;
       totalNumberBurger+=numBurger;
    }
    public int burgerSold(){
        return totalNumberBurger;
    }
    @Override
    public String toString(){
        return "Burger Stall ID:" + ID + "\nNumber of Burger sold:" + numBurger;
    }
}
public class L8Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Burger> burger = new ArrayList<>();
        System.out.println("Enter the ID of the burger stall(enter -1 to finish):");
        System.out.print("-->");
        String ID = sc.nextLine();
        while(!ID.equals("-1")){
            
            System.out.println("Number of burger sold today:");
            System.out.print("-->");
            int numBurger =sc.nextInt();
            Burger sales = new Burger(ID,numBurger);
            burger.add(sales);
            sc.nextLine();
            System.out.println("Enter the ID of the burger stall(enter -1 to finish):");
            System.out.print("-->");
            ID = sc.nextLine();
            if(ID.equals("-1")){
                System.out.println("The total number of burger sold today is " + sales.burgerSold());
                break;
            }
            }
        for (Burger b : burger){
            System.out.println("Burger Stall ID and number of burger sales : "+ b);
        }
        
    }
}
*/