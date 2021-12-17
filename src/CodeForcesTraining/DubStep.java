package CodeForcesTraining;
//https://codeforces.com/contest/208/problem/A
import java.util.*;

public class DubStep {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.next();
    StringBuilder result = new StringBuilder();

    for(int i = 0; i<str.length(); i++){
      if(str.startsWith("WUB",i)) {
        i = i + 2;

        if(!result.toString().equals("") && result.charAt(result.length()-1) != ' ')
        result.append(' ');
      }
      else
        result.append(str.charAt(i));
    }
    System.out.println(result);
  }
}
