package loops;
import java.util.Scanner;

public class primerange {

    public static void prime_N(int st , int end){
        for (int i= st; i<= end; i++) {
          int  flag = 1;
            for (int j = 2; j <= i/ 2; ++j) {
                if (i% j == 0) {
                    flag = 0;
                }
            }
            if (flag == 1)
                System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number");
        int st = sc.nextInt();
        System.out.println("Enter ending number");
        int end = sc.nextInt();

        prime_N(st, end);

        sc.close();
    }
}