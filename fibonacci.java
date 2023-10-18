package loops;

import java.util.Scanner;

public class fibonacci {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
       System.out.println("Enter a number ");

       int n =sc.nextInt();
       int num1  =0 , num2=1;
       for (int i =0 ; i<n ;i++){
        System.out.print(num1+" ");
            int num3 =num1 +num2 ;
            num1 =num2 ;
            num2 =num3;
       }
       sc.close();
    }
    
}
