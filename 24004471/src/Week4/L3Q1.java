package Week4;

    import java.util.Scanner;
public class L3Q1 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two integer number:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operand:");
        String operand = sc.next();
        if (operand.charAt(0) == '+') {
            int add = num1+num2;
            System.out.println(num1 + " + " + num2 + " = " + add);
        }
        else if (operand.charAt(0) == '-') {
            int diff = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + diff);
        }
        else if (operand.charAt(0) == '*') {
            double multiple = num1*num2;
            System.out.println(num1 + " * " + num2 + " = " + multiple);
        }
        else if (operand.charAt(0) == '/'){
            double quotient = num1/num2;
            System.out.println(num1 + " / " + num2 + " = " + quotient);
        }
        else if (operand.charAt(0) == '%'){
            double remainder = num1%num2;
            System.out.println(num1 + " % " + num2 + " = " + remainder);
        }
        else
            System.out.println("Invalid Operand");
    }
}
