package CodeForcesTraining;
import java.util.*;
//https://codeforces.com/contest/520/problem/A

public class Pangram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String str = input.next();
    str = str.toLowerCase();

    if(n<26){
      System.out.println("NO");
      return;
    }

    boolean[]visited = new boolean[27];

    for(int i = 0; i<n; i++){
      int temp = str.charAt(i)-96;
      visited[temp] = true;
    }

    for(int i = 1; i<visited.length; i++){
      if(!visited[i]) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}