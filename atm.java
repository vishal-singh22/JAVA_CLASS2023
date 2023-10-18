package SwitchCase;
import java.util.Scanner;

public class atm {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int i=0;
        while(i<5){
            System.out.println("enter your choice : \n 1. balance check \n 2. deposite \n 3. withdrawl \n 4. exit");
            int n=sc.nextInt();

            int balance =0;
            switch(n){
                case 1:
                System.out.println("your balance of account is " + balance);
                break;
                case 2:
                System.out.println("enter your you amount to deposite : \n");
                int d=sc.nextInt();
                balance =balance + d;
                break;
                case 3:
                System.out.println("enter your amount for withdrawl");
                int w = sc.nextInt();
                if (w<balance){
                    System.out.println("your withdrawl amount is : "+ w);
                    balance=balance-w;
                }
                else {
                    System.out.println("you have insufficent balance\n");
                break;
                }
                case 4:
                 i=5;
                 break;                
            }
            i++;
        }

    }
}