package BLevelProblem;
import java.util.*;
import java.lang.Math;
public class testing {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt();
    int m = input.nextInt();

    if(n == m){
      System.out.println("YES");
      return;
    }

    StringBuilder first = new StringBuilder(Integer.toBinaryString(n));
    first = first.reverse();

    int num = Integer.parseInt(first.toString());
    int newNum = 0;

    int i = 0;
    while(num!=0){
      newNum += num%10 * Math.pow(2,i);
      num=num/10;
      ++i;
    }
    System.out.println(newNum);

  }
}
