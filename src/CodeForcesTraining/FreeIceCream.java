package CodeForcesTraining;
//http://codeforces.com/contest/686/problem/A
import java.util.*;

public class FreeIceCream {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    long packs = input.nextInt();
    int leftOver = 0;

    for(int i = 0; i<n; i++){
     String sign = input.next();
     long packs2 = input.nextInt();

     if(sign.equals("+"))
       packs += packs2;

     else if(sign.equals("-") && packs < packs2)
       leftOver++;

     else
       packs -= packs2;
    }

    System.out.println(packs + " " + leftOver);
  }
}
