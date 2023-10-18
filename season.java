package SwitchCase;
import java.util.Scanner;

public class season{
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the month number :");
        int n =sc.nextInt();
        switch(n){
            case 1:
            case 2:
            case 11:
            case 12:
            System.out.println("Winter");
             break  ;

             case 3:
             case 4:
             System.out.println("Spring");
             break;

             case 5:
             case 6:
             case 7:
             System.out.println("Summer");
             break;

             case 8:
             case 9:
             case 10:
             System.out.println("Autumn");
             break;
         
        }
        sc.close();
    }
    
}
