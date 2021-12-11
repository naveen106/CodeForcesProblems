package BLevelProblem;
//http://codeforces.com/contest/66/problem/B
import java.util.*;

public class PetyaAndCountryside {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int prev = input.nextInt();
    int temp2 = 0, count = 0;
    for(int i = 1; i<n; i++){
      int temp = input.nextInt();
      //temp2 = input.nextInt();
      if(temp <= prev)
        count++;


    }



  }
}
