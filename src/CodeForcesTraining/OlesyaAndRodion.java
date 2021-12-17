package CodeForcesTraining;
//https://codeforces.com/contest/584/problem/A
import java.util.*;

public class OlesyaAndRodion {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int t = input.nextInt();

    if(n==1){
      if(t<10)
      System.out.println(t);
      else
        System.out.println(-1);
      return;
    }

    StringBuilder num = new StringBuilder();
    num.append(t);

    if(t<10)
      for(int i = 1; i<n; i++)
      num.append('0');
    else
      for(int i = 1; i<n-1; i++)
      num.append('0');

    System.out.println(num);
    ///we can also directly print '0' instead of concatenating it. because 0 will be printed on the same line.
  }
}
