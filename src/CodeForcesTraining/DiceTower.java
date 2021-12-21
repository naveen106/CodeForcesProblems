package CodeForcesTraining;
//https://codeforces.com/contest/225/problem/A
import java.util.*;

public class DiceTower {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int top = input.nextInt();
    byte[]arr = new byte[7];

    for(byte i=1;i<=6;i++)
    arr[i] = i;

    for(int i = 0; i<n; i++){
      int left = input.nextInt();
      int right = input.nextInt();

      arr[7-left] = 0;
      arr[7-right] = 0;
      arr[left] = 0;
      arr[right] = 0;

      int sum = 0;
      for(int j = 1; j<arr.length; j++){
        if(arr[j]!=0)
          sum+=arr[j];
      }

      if(sum!=7) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
