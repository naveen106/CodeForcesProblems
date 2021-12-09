package CodeForcesTraining;
//http://codeforces.com/contest/799/problem/A
import java.util.*;
import java.lang.Math;
public class CarrotCakes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int t = input.nextInt();
    int k = input.nextInt();
    int d = input.nextInt();

    int timeTaken, with=0, without=0,
        finalWithout = 0, finalWith = 0,
        flag = 0, flag2 = 0;


    for(timeTaken = 1; ; timeTaken++){

      if(timeTaken % t == 0){
        without += k;
        with += k;
      }

      if(timeTaken > d && (timeTaken - d) % t == 0)
        with += k;

      if(with >= n && flag == 0){
        finalWith = timeTaken;
        flag = 1;
      }

      if(without >= n && flag2 == 0){
        finalWithout = timeTaken;
        flag2 = 1;
      }

      if(without >= n && with >= n)
      break;
    }

    if(finalWith >= finalWithout)
      System.out.println("NO");

    else
      System.out.println("YES");
  }
}
