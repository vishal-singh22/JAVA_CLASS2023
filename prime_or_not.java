package loops;

import java.util.Scanner;

public class prime_or_not {

    public static String primenum(int n ){
        if(n==1) return "Not a prime number" ;
    
        for (int i =2 ; i<n/2 ; i++)
            if (n %i ==0)
            return "Not a prime number" ;

     return "Prime number" ;
        
        
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter a number ");

        int n = sc.nextInt();
        System.out.println(primenum(n));

        sc.close();

    }

} 
