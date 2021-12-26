package CLevelProbsDiv2_3;

import java.io.*;
import java.util.*;

public class PoisonedDagger {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    int t = input.nextInt();
    while(t-- > 0){
      byte n = input.nextByte();
      long health = input.nextLong();

      int min;
      if (health % n == 0)
        min = (int) health / n;
      else
        min = (int) health / n + 1;

      long damage = 0;

      int[] time = new int[n];

      for (int i = 0; i < n; i++)
        time[i] = input.nextInt();

      int constIdx = 0;
      long constDamage = 0;
      for (int i = 1; i < n; i++) {
        int temp = time[i] - time[i - 1];

        if (temp > min) {
          if (constIdx == 0)
            constIdx = i-1;
          if (constDamage == 0)
            constDamage = damage;
          damage += min;
        } else
          damage += temp;
      }
      damage += min;
      min++;
      while (damage < health) {
        damage = constDamage;
        for (int i = Math.max(constIdx,0); i < n; i++) {
          if (i+1 < n && time[i+1]-time[i] > min)
            damage += min;
          else if(i+1 < n)
            damage += time[i+1]-time[i];
        }
        damage += min;
        min++;
      }
      if(health <= n)
        System.out.println(1);
      else
      System.out.println(--min);
    }
  }

  static class FastScanner {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    String next() {
      while (!st.hasMoreTokens())
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    int[] readArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++) a[i] = nextInt();
      return a;
    }

    byte nextByte() {
      return Byte.parseByte(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }
  }
}