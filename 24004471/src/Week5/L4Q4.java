package Week5;

/*
import java.util.Scanner;
    public class L4Q4{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the year:");
            int year = sc.nextInt();
            System.out.println("\nEnter the first day of this year:");
            int firstDay =sc.nextInt();
            int day;
            int dayCounter=firstDay-3;
            System.out.println("Enter the month of calender that you wish to know in " + year);
            int SpecificMonth=sc.nextInt();
            switch (SpecificMonth){
                case 1:
                    System.out.print("\n          Calender of " + year + " January");
                    break;
                case 2:
                    System.out.print("\n          Calender of " + year + " February");
                    break;
                case 3:
                    System.out.print("\n          Calender of " + year + " March");
                    break;
                case 4:
                    System.out.printf("\n          Calender of " + year + " April");
                    break;
                case 5:
                    System.out.printf("\n          Calender of " + year + " May");
                    break;
                case 6:
                    System.out.printf("\n          Calender of " + year + " Jun");
                    break;
                case 7:
                    System.out.printf("\n          Calender of " + year + " July");
                    break;
                case 8:
                    System.out.printf("\n          Calender of " + year + " August");
                    break;
                case 9:
                    System.out.printf("\n          Calender of " + year + " September");
                    break;
                case 10:
                    System.out.printf("\n          Calender of " + year + " October");
                    break;
                case 11:
                    System.out.printf("\n          Calender of " + year + " November");
                    break;
                case 12:
                    System.out.printf("\n          Calender of " + year + " December");
                    break;
            }
            System.out.println("\n=============================================");
            System.out.printf("%-6s %-6s %-6s %-6s %-6s %-6s %-6s\n","Sun","Mon","Tues","Wed","Thurs","Fri","Sat");
            if (year%4 == 0 && year%100!=0 || year%400==0){
                for(int month =1 ; month<=12;month++){
                   if(month%2 !=0 || month==8){
                       for(day=1;day<=31;day++){
                           dayCounter++;
                           if(dayCounter==7)
                               dayCounter=0;
                       }
                   }
                   else if(month==2){
                       for(day=1;day<=29;day++){
                           dayCounter++;
                           if(dayCounter==7)
                               dayCounter=0;
                   }
                }
                   else{
                       for(day=1;day<=30;day++){
                           dayCounter++;
                           if(dayCounter==7)
                               dayCounter=0;
                   }
                    }
                   if(month==SpecificMonth){
                       
                       for(int i=0; i<dayCounter;i++)
                       {
                           System.out.printf("%-7s"," ");
                       }
                       if(SpecificMonth==1 || SpecificMonth==3 || SpecificMonth==5 ||SpecificMonth==7 ||SpecificMonth==8 ||SpecificMonth==9||SpecificMonth==11){
                           for(day=1;day<=31;day++){
                               switch(dayCounter){
                     case 0 -> System.out.printf("%-7d",day);
                     case 1 -> System.out.printf("%-7d",day);
                     case 2 -> System.out.printf("%-7d",day);
                     case 3 -> System.out.printf("%-7d",day);
                     case 4 -> System.out.printf("%-7d",day);
                     case 5 -> System.out.printf("%-7d",day);
                     case 6 -> System.out.printf("%-7d",day);
                               }
                               dayCounter++;
                               if(dayCounter==7){
                                   dayCounter=0;
                                   System.out.println();
                               }
                           }
                       }
                       else if(SpecificMonth==2){
                           
                           for(day=1;day<=29;day++){
                               switch(dayCounter){
                     case 0 -> System.out.printf("%-7d",day);
                     case 1 -> System.out.printf("%-7d",day);
                     case 2 -> System.out.printf("%-7d",day);
                     case 3 -> System.out.printf("%-7d",day);
                     case 4 -> System.out.printf("%-7d",day);
                     case 5 -> System.out.printf("%-7d",day);
                     case 6 -> System.out.printf("%-7d",day);
                               }
                               dayCounter++;
                               if(dayCounter==7){
                                   dayCounter=0;
                                   System.out.println();
                               }
                           }
                       }
                       else{
                           for(day=1;day<=30;day++){
                               switch(dayCounter){
                     case 0 -> System.out.printf("%-7d",day);
                     case 1 -> System.out.printf("%-7d",day);
                     case 2 -> System.out.printf("%-7d",day);
                     case 3 -> System.out.printf("%-7d",day);
                     case 4 -> System.out.printf("%-7d",day);
                     case 5 -> System.out.printf("%-7d",day);
                     case 6 -> System.out.printf("%-7d",day);
                               }
                               dayCounter++;
                               if(dayCounter==7){
                                   dayCounter=0;
                                   System.out.println();
                               }
                           }
                       }
                       break;
            }
                }
        }
            else{
                for(int month =1 ; month<=12;month++){
                   if(month%2 !=0 || month==8){
                       for(day=1;day<=31;day++){
                           dayCounter++;
                           if(dayCounter==7)
                               dayCounter=0;
                       }
                   }
                   else if(month==2){
                       for(day=1;day<=28;day++){
                           dayCounter++;
                           if(dayCounter==7)
                               dayCounter=0;
                   }
                }
                   else{
                       for(day=1;day<=30;day++){
                           dayCounter++;
                           if(dayCounter==7)
                               dayCounter=0;
                   }
                    }
                   if(month==SpecificMonth){
                       
                       for(int i=0; i<dayCounter;i++){
                       
                           System.out.printf("%-7s"," ");
                       }
                       if(SpecificMonth==1 || SpecificMonth==3 || SpecificMonth==5 ||SpecificMonth==7 ||SpecificMonth==8 ||SpecificMonth==9||SpecificMonth==11){
                           for(day=1;day<=31;day++){
                               switch(dayCounter){
                     case 0 -> System.out.printf("%-7d",day);
                     case 1 -> System.out.printf("%-7d",day);
                     case 2 -> System.out.printf("%-7d",day);
                     case 3 -> System.out.printf("%-7d",day);
                     case 4 -> System.out.printf("%-7d",day);
                     case 5 -> System.out.printf("%-7d",day);
                     case 6 -> System.out.printf("%-7d",day);
                               }
                               dayCounter++;
                               if(dayCounter==7){
                                   dayCounter=0;
                                   System.out.println();
                               }
                           }
                       }
                       else if(SpecificMonth==2){;
                           for(day=1;day<=28;day++){
                               switch(dayCounter){
                     case 0 -> System.out.printf("%-7d",day);
                     case 1 -> System.out.printf("%-7d",day);
                     case 2 -> System.out.printf("%-7d",day);
                     case 3 -> System.out.printf("%-7d",day);
                     case 4 -> System.out.printf("%-7d",day);
                     case 5 -> System.out.printf("%-7d",day);
                     case 6 -> System.out.printf("%-7d",day);
                               }
                               dayCounter++;
                               if(dayCounter==7){
                                   dayCounter=0;
                                   System.out.println();
                               }
                           }
                       }
                       else{
                           for(day=1;day<=30;day++){
                               switch(dayCounter){
                     case 0 -> System.out.printf("%-7d",day);
                     case 1 -> System.out.printf("%-7d",day);
                     case 2 -> System.out.printf("%-7d",day);
                     case 3 -> System.out.printf("%-7d",day);
                     case 4 -> System.out.printf("%-7d",day);
                     case 5 -> System.out.printf("%-7d",day);
                     case 6 -> System.out.printf("%-7d",day);
                               }
                               dayCounter++;
                               if(dayCounter==7){
                                   dayCounter=0;
                                   System.out.println();
                               }
                           }
                       }
                       break;  
            }
                }
            }
            System.out.println();
        }
        }
        */