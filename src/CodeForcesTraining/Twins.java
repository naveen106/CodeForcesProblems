package CodeForcesTraining;
//https://codeforces.com/contest/160/problem/A
import java.util.*;

public class Twins {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[]arr = new int[n];
    int sum = 0;

    for(int i = 0; i<n; i++) {
      arr[i] = input.nextInt();
      sum += arr[i];
    }

    Arrays.sort(arr);
    int count = 0, newSum = 0;

    for(int i = n-1; i>=0; i--){
      sum -= arr[i];
      newSum += arr[i];
      count++;

      if(newSum > sum)
        break;
    }
    System.out.println(count);
  }

  //takeaway from this prolem = to find newSum, you can subtract the elements value from sum (useful in situation where addition is needed).
}
