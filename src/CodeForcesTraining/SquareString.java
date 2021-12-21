package CodeForcesTraining;
import java.util.*;
public class SquareString {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){
      String str = input.next();

      if((str.length()^1) == str.length() - 1 ) {
        System.out.println("NO");
        continue;
      }

      if(!str.substring(0,str.length()/2).equals(str.substring(str.length()/2)))
        System.out.println("NO");
      else
        System.out.println("YES");
    }

  }
}
