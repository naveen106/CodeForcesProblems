package CodeForcesTraining;
//http://codeforces.com/contest/807/problem/A
import java.util.*;

public class IsItRated {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[]arr = new int[n+1];
    int i;
    for(i = 0; i<n; i++){
      int temp = input.nextInt();
      if(input.nextInt() != temp)
      break;
      arr[i]  = temp;
    }

    if(i<n){
      while(i++ < n){
        if(i != n) {
          input.nextInt();
          input.nextInt();
        }

        if(i == n || i+1 == n) {
          System.out.println("rated");
          return;
        }
      }
    }

    for(int j = 0; j<arr.length-1; j++){
      if(arr[j] < arr[j+1]) {
        System.out.println("unrated");
        return;
      }
    }
    System.out.println("maybe");
  }
}
