package other_questions;

import java.util.Scanner;
public class vowel_or_not {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the alphabets : ");
        char alpha=sc.next().charAt(0);
        if(alpha=='a'|| alpha=='e'|| alpha=='i'|| alpha=='o'|| alpha=='u' || alpha=='A'|| alpha=='E'|| alpha=='I'|| alpha=='O'|| alpha=='U'){

        
            System.out.println("it is vowel ");
        
        }
        else{
            System.out.println("it is not vowel");
        }

    }
    
}
