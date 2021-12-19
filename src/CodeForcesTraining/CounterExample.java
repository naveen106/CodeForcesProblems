package CodeForcesTraining;
//https://codeforces.com/contest/483/problem/A
import java.util.*;
public class CounterExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long a = input.nextLong();
    long b = input.nextLong();

    if(b-a < 2){
      System.out.println(-1);
      return;
    }

    //if a is even
    if((a^1) == a+1) {
      System.out.println(a + " " + (a + 1) + " " + (a + 2));
      return;
    }

    //if differnce between them is greater than 2.
    if(b-a > 2){
      System.out.println(a+1+" "+(a+2)+" "+(a+3));
      return;
    }
   System.out.println(-1);
  }
}
