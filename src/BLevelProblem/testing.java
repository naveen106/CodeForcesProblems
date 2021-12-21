package BLevelProblem;
import java.util.*;
import java.lang.Math;
public class testing {

  static int fibonacci(int n){
    if(n<=1){
      return n;
    }
    return fibonacci(n - 2) + fibonacci(n - 1);
  }
  public static void main(String[] args) {
    int n = 10;
    int t = n;
    for(int i = 1; i<=n; i++)
    System.out.print(fibonacci(i) + " ");

  }
}
