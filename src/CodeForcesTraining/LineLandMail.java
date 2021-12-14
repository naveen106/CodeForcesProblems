package CodeForcesTraining;
//https://codeforces.com/contest/567/problem/A
import java.util.*;

public class LineLandMail {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[]arr = new int[n];

    for(int i = 0; i<n; i++)
    arr[i] = input.nextInt();

    int finalMin, finalMax;
    for(int i = 0; i<n; i++){
      int min1 = Integer.MAX_VALUE;

      if(i != n-1)
      min1 = Math.abs(arr[i] - arr[i+1]);

      if(i>0) {
        int min2 = Math.abs(arr[i] - arr[i - 1]);
        finalMin = Math.min(min1, min2);
      }
      else  //runs only once
      finalMin = min1;

      int max1 = Math.abs(arr[i] - arr[0]);
      int max2 = Math.abs(arr[i] - arr[n-1]);
      finalMax = Math.max(max1, max2);
      System.out.println(finalMin+" "+finalMax);
    }
  }
}
