package loops;

import java.util.*;
public class armstrong {
    static int findlength(int x){
        int c =0,num=x;
        while (num != 0) {
            num/= 10;
            c++;
        }
        return c;
    }
     static int findpower(int x,int y){
         int i=1;
         for (int j=1;j<=y;j++){
            i*=x;
         }
         return i;

     }
     static int isArmstrong(int x) {
        int numCopy = x;
        int numberLenght = findlength(numCopy);
        int sum = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            sum += findpower(lastDigit, numberLenght);
            x/= 10;
        }

        return sum;

    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want");
        int n=sc.nextInt();
        int val=isArmstrong(n);
        if(n==val){
            System.out.println("number is armstromg");

        }
        else{
            System.out.println("number is not armstrong");


        }

    }
 }


