package SwitchCase;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your opretion you want \n + , - , * , / , % , ^ ");
        String c = sc.nextLine();
        System.out.println("enter two number that you want to be try to operation\n");
        int n1= sc.nextInt();
        int n2 = sc.nextInt();
        switch(c){
            case "+":
            System.out.println("addition is "+(n1+n2));
            break;
            case "-":
            System.out.println("subtratiction is "+ (n1-n2));
            break;
            case "*":
            System.out.println("multiplication is "+ (n1*n2));
            break;
            case "/":
            System.out.println("division is " + (n1/n2));
            break;
            case "%":
            System.out.println("modulus is "+ (n1%n2));
            break;
            case "^":
            System.out.println("power is "+ (n1^n2));
            break;
        }
    }
    
}
