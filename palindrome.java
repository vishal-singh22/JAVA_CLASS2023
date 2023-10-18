package loops;

import java.util.Scanner;

public class palindrome {

    public static int reverse(int n ) {
         int temp=n ;

       int rev = 0; 
       while (temp > 0) { 
           rev = rev * 10 + temp % 10; 
           temp = temp / 10; 
       } 
       return rev ;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in );
       System.out.println("Enter a number ");

       int n =sc.nextInt();
       int rev= reverse(n);
       if(n==rev){
        System.out.println("Number is palindrome ");
       }
       else 
       System.out.println("Number is not palindrome ");
       sc.close();
    }
    
}