package CodeForcesTraining;
//https://codeforces.com/contest/344/problem/A
import java.util.*;
public class Magnets {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int val = input.nextInt();
    int count = 1;

    for(int i = 0; i<n-1; i++){
      int val2 = input.nextInt();
      if(val2 != val){
        count++;
        val = val2;
      }
    }
    System.out.println(count);
  }
}
