package other_questions;
import java.util.Scanner;

public class leap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh year you want to know that leap or not: ");
        int year = sc.nextInt();
        if (year%4==0||year%400==0||year%100==0){
            System.out.println("year is leap ");
        }
        else{
            System.out.println("year is not leap");
        }
    }
    
}
