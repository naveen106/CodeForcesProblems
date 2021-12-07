package CodeForcesTraining;
//http://codeforces.com/contest/731/problem/A
import java.util.*;
public class NightAtTheMuseum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String s = input.next();

    int start = 0;
    int travel = 0;
    int rotations = 0;

    for(int i = 0; i<s.length(); i++){
      int destination = s.charAt(i) - 97;
      travel = Math.abs(start - destination);

      if(travel < 13)
        rotations += travel;

      else
        rotations += 26-travel;

      start = destination;
    }
    System.out.println(rotations);
  }

}
