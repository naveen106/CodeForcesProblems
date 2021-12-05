package CodeForcesTraining;
import java.util.Scanner;
import java.lang.Math;

public class BeautifulMatrix {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int m = 0;
      int n = 0;

      for(int i = 0; i<5; i++){

        for(int j = 0; j<5; j++){
          if(input.nextInt() == 1){
            m = i;
            n = j;
          }
        }
      }

    System.out.println(Math.abs(2-m) + Math.abs(2-n));
  }
}
