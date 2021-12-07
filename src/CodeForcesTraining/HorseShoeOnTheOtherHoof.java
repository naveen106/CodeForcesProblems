package CodeForcesTraining;
//http://codeforces.com/contest/228/problem/A
import java.util.*;
public class HorseShoeOnTheOtherHoof {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    HashSet<Integer> set = new HashSet<>();

    for(int i = 0; i<4; i++)
      set.add(input.nextInt());

    System.out.println(4-set.size());
  }
}
