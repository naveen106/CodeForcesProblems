package CodeForcesTraining;
import java.util.Scanner;
//https://codeforces.com/contest/791/problem/A
public class BearAndBigBrother {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int lim = input.nextInt();
    int bob = input.nextInt();
    int count = 0;

    while(lim <= bob){
      lim = lim*3;
      bob = bob*2;
      count++;
    }

    System.out.println(count);
  }

}
