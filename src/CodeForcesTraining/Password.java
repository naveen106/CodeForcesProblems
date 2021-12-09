package CodeForcesTraining;
//https://codeforces.com/contest/770/problem/A
import java.util.*;
public class Password {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();

    StringBuilder str = new StringBuilder();
    int lowerCase = 97;

    for(int i = 0; i<k; i++){
      str.append((char)lowerCase);
      lowerCase++;
    }

    for(int i = k; i<n; i++)
    str.append(str.charAt(i-k));

    System.out.println(str);
  }
}
