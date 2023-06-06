package calculate;

import java.util.Scanner;

public class Main extends Calculator{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean repeat=true;
        while (repeat){
            System.out.println("Enter the first number:");
            int num1= scanner.nextInt();
            System.out.println("Enter second number:");
            int num2= scanner.nextInt();
            System.out.println("please enter one of symbol +,-,*,/ :");
            char symbol=scanner.next().charAt(0);

            Main cal= new Main();
            cal.calculateResult(num1,num2,symbol);
            System.out.println("Would you like to do more calcultaion please enter Y or N:");
            char continueprocess=scanner.next().charAt(0);
            if (continueprocess=='Y'|| continueprocess=='y'){
                repeat=true;
            }else{
                repeat=false;
            }

        }
    }
}
