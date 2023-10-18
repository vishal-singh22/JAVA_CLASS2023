package patterns;

public class hollow_rombus {
        public static void main(String[] args) {
            for(int i =0;i<5;i++) {
                for (int j = 5; j >= i; j--)
                {
                    System.out.print(" ");
                }
    
                  for (int k = 0; k < 5; k++)
                  {
                      if(i==0||i==4||k==0||k==4)
                    System.out.print("*");
                      else
                          System.out.print(" ");
                  }
                System.out.println();
            }
        }
    }
