package CodeForcesTraining;
//http://codeforces.com/contest/265/problem/A
import java.util.*;
public class ColorfulStones {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();
    String t = input.next();

    int i = 0;
    int j = 0;

    while(j<t.length()){
      if(s.charAt(i) == t.charAt(j))
      i++;
      j++;
    }
    System.out.println(i+1);
  }
}
