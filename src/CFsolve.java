import java.util.*;
import java.io.*;

public class CFsolve {
  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out);
    FastScanner input = new FastScanner();
    //WRITE YOUR CODE HERE // use - out.println() or out.print() to print. //
    int t = input.nextInt();
    while(t-- > 0){


    }
    out.close();
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
