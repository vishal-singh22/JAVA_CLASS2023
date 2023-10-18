package SwitchCase;
import java.util.Scanner;
public class weakend {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the days you want to know it is weakend or not");
        String day =sc.nextLine();
            switch(day){
                case "saturday":
                case "sunday":
                case "friday":
                System.out.println("this is weakend");
                break;
                default:
                System.out.println("this day is weakday");
            }
        
    }
    
}
