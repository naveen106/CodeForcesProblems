package CLevelProbsDiv2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PoisonedDagger {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);

    byte n = input.nextByte();
    long health = input.nextLong();

    int k = 0;
    if(health%n == 0)
      k = (int)health/n;
    else
      k = (int)health/n+1;

    long damageDealt = 0;
    int[]seconds = new int[n];

    for(int i = 0; i<n; i++)
      seconds[i] = input.nextInt();

    int i = 0;
    int tempIdx = 0;
    long tempDamage = 0;
    while(damageDealt < health){
      if(i+1 < n && seconds[i+1] - seconds[i] >= k) {
        if(tempDamage == 0)
          tempDamage = damageDealt;
        damageDealt += k;
        if(tempIdx == 0)
          tempIdx = i;
      }
      else if(i+1 < n)
        damageDealt += seconds[i+1]-seconds[i];
      else if(i==n-1)
        damageDealt +=k;

      if(i==n-1 && damageDealt < health){
        i = tempIdx-1;
        damageDealt = tempDamage;
        k++;
      }
      i++;
    }
    out.println(k);

  }

}
