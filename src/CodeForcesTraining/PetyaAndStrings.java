package CodeForcesTraining;
//https://codeforces.com/contest/112/problem/A
import java.util.Scanner;
public class PetyaAndStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str1 = input.next();
    String str2 = input.next();

    str1 = str1.toUpperCase();
    str2 = str2.toUpperCase();

    int val1 = 0, val2 = 0;

    for(int i = 0; i<str1.length(); i++){
      val1 += str1.charAt(i);
      val2 += str2.charAt(i);
      if(val1 != val2)
        break;
    }

    if(val1 < val2)
      System.out.println(-1);
    else if(val1>val2)
      System.out.println(1);
    else
      System.out.println(0);
  }
}
