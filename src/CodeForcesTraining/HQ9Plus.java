package CodeForcesTraining;
//https://codeforces.com/contest/133/problem/A
import java.util.*;

public class HQ9Plus {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String p = input.next();

    for(int i = 0; i<p.length(); i++){
      if(p.charAt(i) == 'H' || p.charAt(i) == 'Q' || p.charAt(i) == '9') {
        System.out.println("YES");
        return;
      }
    }

    System.out.println("NO");
  }
}
