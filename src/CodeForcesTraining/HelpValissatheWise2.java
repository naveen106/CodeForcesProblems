package CodeForcesTraining;
import java.util.*;
//https://codeforces.com/contest/143/problem/A

public class HelpValissatheWise2 {
  public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    int r1 = input.nextInt();
    int r2 = input.nextInt();
    int c1 = input.nextInt();
    int c2 = input.nextInt();
    int d1 = input.nextInt();
    int d2 = input.nextInt();

    for (int a = 1; a < 10; a++) {
      for (int b = 1; b < 10; b++) {
        if (b == a)
        continue;

        for (int c = 1; c < 10; c++) {
          if (c == a || c == b)
          continue;

          for (int d = 1; d < 10; d++) {
            if (d == a || d == b || d == c)
            continue;

            if (a + b == r1 && c + d == r2 &&
                a + c == c1 && b + d == c2 &&
                a + d == d1 && b + c == d2) {
              System.out.println(a + " " + b);
              System.out.println(c + " " + d);
              return;
            }
          }
        }
      }
    }
    System.out.println(-1);
  }
}
