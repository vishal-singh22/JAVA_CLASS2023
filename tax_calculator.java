package other_questions;
import java.util.Scanner;

public class tax_calculator {
    public static void main(String[] args) {
        Scanner bs = new Scanner(System.in);
        System.out.println("enter the basic salary");
        float sal = bs.nextFloat();
        if (sal == 10000) {
            System.out.println("YOUR NET SALARY " + sal);
        } else if (sal <= 10000 && sal >= 20000) {
            System.out.println(sal * 0.1);
        } else if (sal <= 20000 && sal >= 30000) {
            System.out.println(sal * 0.15);
        } else {
            System.out.println(sal * 0.25);
        }
        bs.close();

    }

}