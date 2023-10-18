package loops;

import java.util.Scanner;
public class evenoddrange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first and last number ");
        int first=sc.nextInt(),last=sc.nextInt();
        System.out.println("even number is: ");
        for(int i =first; i<last;i++){
            if (i%2==0){
                System.out.println(i);
                        
            }
        }
        System.out.println("odd number is : ");
        for(int j = first; j<last;j++){
            if(j%2!=0){
                System.out.println(j);
            }
        }
    }
}