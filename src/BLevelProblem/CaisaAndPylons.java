package BLevelProblem;
//https://codeforces.com/contest/463/problem/B
import java.util.*;
public class CaisaAndPylons {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    //initially at 0 pylon (mentioned in question, but not shown in test case), pay = 0
    int pay = 0;
    pay = input.nextInt(); //he has to pay dollars equal to first input received(or first pylon) to rise pylon

    for(int i = 1; i<n; i++){
      int pylon = input.nextInt();  //compare next pylon (2nd input).
      if(pay - pylon < 0)  //difference between second and first input. (energy difference)
      pay += Math.abs(pay-pylon);  //if it's negative, he needs to pay absolute amount of money to balance the pylon(like to raise 3 to 4, he has to add 1 to three, Math.abs(-1).
    }

    System.out.println(pay);

  }
}
