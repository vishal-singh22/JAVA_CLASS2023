package loops;

import java.util.Scanner;

public class sum_num{
    private static void sumOfDigit(int n) {
        int sum =0;
        while(n!=0){
          sum+=n%10;
          n=  n/10;
        }
        System.out.println("Sum of digits "+sum);
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number  ");
        int n = sc.nextInt();
        
        sumOfDigit(n);


        sc.close();
    }

}