package CodeForcesTraining;
//https://codeforces.com/contest/43/problem/A
import java.util.*;
public class Football {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String first = input.next();
    String second = "";
    int count = 0;
    String temp;

    for(int i = 1; i<n; i++){
      temp = input.next();
      if(temp.equals(first))
        count++;
      else
        second = temp;
    }

    if(Math.max(count,n/2) == count)
    System.out.println(first);
    else
      System.out.println(second);
  }
}
