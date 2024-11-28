package Week10;
/*
class money{
    private double [] money = {100,50,10,5,1,0.5,0.2,0.1,0.05};
    private int [] amount = new int [money.length];
    private double total;
    
    public money(double total){
        this.total =total;
    }
    
            public void noteANDcoins(){
            double remaining = roundValue();
            for(int i=0;i<money.length;i++){
                while(remaining>=money[i]){
                    double remainder = remaining%money[i];
                    amount[i] = (int)(remaining/money[i]);
                    remaining = remainder;
                }
            }
            }

    public double roundValue(){
            
            String numWord = String.format("%.2f",total);
            char lastDigit = numWord.charAt(numWord.length()-1);
            int last = Character.getNumericValue(lastDigit);
            
            if(last==1 || last==2){
                total-=last/100.0;
            }else if(last>2 && last<8){
                total-=last/100.0;
                total+=0.05;
            }else if(last>=8 && last<=9){
                total -=last/100.0;
                total +=0.1;
            }
            return total;
        }
    public double addition(money addition){
        return this.total+addition.roundValue();
        
    }
    public double subtraction(money subtract){
        total = total-subtract.roundValue();
        return total;
    }
    public void display(){
        System.out.printf("\nThe amount of RM%.2f after round off is RM%.2f",total,roundValue());
        noteANDcoins();
        for(int i = 0  ; i<amount.length;i++){
            if(amount[i]>0)
            System.out.println("\n" + amount[i] + " RM" + money[i]);
        }
    }
    }

    

public class L8Q7 {
    public static void main(String[] args) {
         System.out.println("M1:");
        money m1 = new money(1587.32);
        m1.display();
        
        System.out.println();
        System.out.println("M2:");
        money m2 = new money(255.78);
        m2.display();
        
        double totaladd = m1.addition(m2);
        double totalsub = m2.subtraction(m1);
        System.out.printf("M1+M2: RM%.2f\n",totaladd);
        System.out.printf("M2-M1: RM%.2f\n",totalsub);
    }
}
*/