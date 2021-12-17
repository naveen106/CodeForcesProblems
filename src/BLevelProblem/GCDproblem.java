package BLevelProblem;
import java.util.*;

public class GCDproblem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){

      int n = input.nextInt();
      int a = 0;
      for(int i = n/2+1; i>=0; i--){
        if(n%i == 0)
        a = i;
      }



    }


  }
}
