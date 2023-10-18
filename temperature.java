package other_questions;
import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENETR TEMPERATURE");
        float tmp = sc.nextFloat();
        System.out.println("Enter Conversion parameters (F OR C)");
        char para = sc.next().charAt(0);
        if (para == 'C' || para == 'c') {
            float res1 = ((tmp - 32) * (5)) / 9;
            System.out.println("The temperature in Celcius  " + res1);
        } else if (para == 'F' || para == 'f') {
            float res = (((tmp * 9) / 5) + 32);
            System.out.println("The temperature in Fahrenheiet" + res);
        }
        sc.close();
    }
}
