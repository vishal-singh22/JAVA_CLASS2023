package SwitchCase;
import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the color of traffic light :");
        String light =sc.nextLine();
        switch(light){
            case "red":
            System.out.println("Stop and next light is yellow");
            break  ;
            case "yellow":
             System.out.println("Wait and next light is green");
            break  ;
            case "green":
             System.out.println("Go and next light is yellow");
            break  ;
        }
        sc.close();
    }
}

