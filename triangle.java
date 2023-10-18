package patterns;

import java.util.Scanner;
public class triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value you see the pattern");
        int p = sc.nextInt();
        for(int i= 0; i<p;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
