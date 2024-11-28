
package Week10;
/*
import java.util.Scanner;
class BankAccount{
    private String name;
    private String IC;
    private String passport;
    private double deposit;
    private double balance=0;
    
    public BankAccount(String name, String IC,String password){
        this.name = name;
        this.IC = IC;
        this.passport = password;
    }
    
    @Override
    public String toString(){
        return "Name:"+ name + "\nIC:" + IC + "\nPassport:" + passport;
    }
    public void setDeposit(double deposit){
        this.deposit = deposit;
    }
    public String getName(){
        return name;
    }
    public String getIC(){
        return IC;
    }
    public String getPassport(){
        return passport;
    }
    public double getDeposit(){
        return deposit;
    }
    public double deposit(){
        return balance+=deposit;
    }
    public double withdraws(double withdrawsAmount){
        if(balance>withdrawsAmount){
            System.out.println("Amount RM" + withdrawsAmount + " have been withdraws.");
            return balance-=withdrawsAmount;
        }else{ 
            System.out.println("Your bank account does not have enough balance to withdraw RM" + withdrawsAmount);
            return balance;
        }
    }
    public void displayBalance(){
        System.out.println("Current balance is RM" + balance);
    }
}

public class L8Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name, IC or passport");
        String name = sc.nextLine();
        String IC = sc.next();
        String passport = sc.next();
        boolean repeat = true;
        BankAccount bank = new BankAccount(name, IC, passport);
        System.out.println(bank.toString());
        System.out.println("============ Welcome "+ name + " ============");
        while (repeat ==true){
        
        System.out.println("\nPlease select either you want to deposit(1) or withdraw(2) or display current balance(3) money from your account.");
        bank.displayBalance();
        System.out.print("-->");
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("\nPlease enter the amount that you would like to deposit:RM");
                    double deposit = sc.nextDouble();
                    bank.setDeposit(deposit);
                    bank.deposit();
                    bank.displayBalance();
                    break;
                case 2:
                    System.out.print("\nPlease enter the amount that you would like to withdraws:RM");
                    double withdraws = sc.nextDouble();
                    bank.withdraws(withdraws);
                    bank.displayBalance();
                    break;
                case 3:
                    bank.displayBalance();
                    break;
                default:
                    System.out.println("Invalid option inputted");
                    break;
            }
            System.out.println("\nEnter 1 to exit or Enter 2 to continue the transaction:");
            System.out.print("\n-->");
            int selection = sc.nextInt();
            if(selection==1){
                repeat=false;
            }else{
                repeat=true;
            }
    }
    }
}
*/