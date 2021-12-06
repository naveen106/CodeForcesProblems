package CodeForcesTraining;
//https://codeforces.com/contest/266/problem/A
import java.util.*;
public class StonesOnTheTable {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String str = input.next();

    int j = 1, i = 0, answer = 0;

    while(j<n){
      if(str.charAt(i) == str.charAt(j))
        answer++;

      i = j;
      j++;
    }
    System.out.println(answer);
  }
}
