package BLevelProblem;
//it's D level problem
import java.util.*;

public class ExactChange {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){
      int n = input.nextInt();
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;

      for(int i = 0; i<n; i++){
        int temp = input.nextInt();
        max = Math.max(max, temp);
        min = Math.min(min, temp);
      }

      if(max == 3)
        System.out.println(1);

    }

  }
}
