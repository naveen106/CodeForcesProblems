package CodeForcesTraining;
//https://codeforces.com/contest/732/problem/A
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class BuyAshovel {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int price = input.nextInt();
    int r = input.nextInt();

    int i = 1;

    while(true){
      int remainder = price * i % 10;
      if(remainder == r || remainder == 0)
      break;
      i++;
    }
    System.out.println(i);
  }

}
