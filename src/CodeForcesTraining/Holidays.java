package CodeForcesTraining;
//https://codeforces.com/contest/670/problem/A
import java.util.*;

public class Holidays {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    if(n == 1) {
      System.out.println("0 1");
      return;
    }

    if(n>=2 && n<=5) {
      System.out.println("0 2");
      return;
    }

    if(n==7) {
      System.out.println("2 2");
      return;
    }

    int min = 0, i = 1, count = 1;

    while(i<=n){

      if(i == 7*count - 1)
      min += 1;

      if(i == 7*count) {
        min += 1;
        count++;
        i+=4;
      }
      i++;
    }

    i = 2;
    count = 1;
    int max = 2;

    while(i<=n){
      if(i == 7*count + 1)
      max += 1;

      if(i == 7*count + 2) {
        max += 1;
        count++;
        i+=4;
      }
      i++;
    }

    System.out.println(min + " " + max);
  }
}