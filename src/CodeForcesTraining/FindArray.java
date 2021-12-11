//I haven't checked this code, because I tried submitting it after contest was over...didn't know that
//I have to be there at that fixed time for contest....So, I was not able to even attempt the question,
//as I was not in my home at that time when contest started..
package CodeForcesTraining;
//https://codeforces.com/contest/1608/problem/A
import java.util.*;

public class FindArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){
      int n = input.nextInt();

      if(n == 1)
      System.out.println(1);

      else if (n==2)
      System.out.println(2 +" "+3);

      else {
        int num = 111;
        for (int i = 0; i < n; i++) {
          System.out.print(num + " ");
          num = num + (int)Math.pow(10, i+3);
        }
        System.out.println();
      }
    }
  }
}
