package CodeForcesTraining;
//http://codeforces.com/contest/431/problem/A
import java.util.*;
public class BlackSquare {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[]arr = new int[4];
    for(int i = 0; i<4; i++)
      arr[i] = input.nextInt();

    String s = input.next();
    int energy = 0;

    for(int i  = 0; i<s.length(); i++){
      if(s.charAt(i) == '1')
        energy += arr[0];

      else if(s.charAt(i) == '2')
        energy += arr[1];

      else if(s.charAt(i) == '3')
        energy += arr[2];

      else if(s.charAt(i) == '4')
        energy += arr[3];
    }
    System.out.println(energy);
  }
}
