package CodeForcesTraining;
//http://codeforces.com/contest/490/problem/A
import java.util.*;

public class TeamOlympiad {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int[]arr = new int[n];
    int ones = 0, twos = 0, threes = 0;

    for(int i = 0; i<n; i++){
      arr[i] = input.nextInt();

      if(arr[i] == 1) ones++;
      else if(arr[i] == 2) twos++;
      else threes++;
    }

    int w = Math.min(twos, ones);
    if(threes < w)
    w = threes;

    System.out.println(w);
    if(w == 0)return;

    int count = 0;
    for(int i = 0; i<n; i++){
      if(arr[i] == Integer.MAX_VALUE)
      continue;

      if(arr[i] != Integer.MAX_VALUE)
        System.out.print(i+1 + " ");

      int j = i+1;
      int temp = -1000;  //just any random -ve value.
      int limiter = 1;

      while(j<n){
        if(limiter == 3)break;
        if(arr[j] != temp && arr[j] != Integer.MAX_VALUE && arr[j] != arr[i]) {
          temp = arr[j];
          System.out.print(j+1 + " ");
          arr[j] = Integer.MAX_VALUE;
          limiter++;
        }
        j++;
      }
      System.out.println();
      count++;
      if(count == w) break;
    }
  }
}