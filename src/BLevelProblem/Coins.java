package BLevelProblem;
//https://codeforces.com/contest/47/problem/B
import java.util.*;
public class Coins {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str1 = input.next();
    String str2 = input.next();
    String str3 = input.next();

    char big, small, smallest;

    if(str1.charAt(1) == '>') {
      big = str1.charAt(0);
      small = str1.charAt(2);
    }

    else {
      big = str1.charAt(2);
      small = str1.charAt(0);
    }








  }
}
