package CodeForcesTraining;
import java.util.*;
import java.io.*;

public class LaunchOfCollide {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);


    int n = input.nextInt();
    String str = input.next();
    int[] arr = input.readArray(n);
    int min = Integer.MAX_VALUE;
    for(int i = 1; i<n; i++){
      if(str.charAt(i) == 'L' && str.charAt(i-1) == 'R'){
        min = Math.min(min,(arr[i]-arr[i-1])/2);
      }
    }
    if(min == Integer.MAX_VALUE) {
      out.println(-1);
      out.close();
    }
    else {
      out.println(min);
      out.close();
    }
  }

  static class FastScanner {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    String next() {
      while (!st.hasMoreTokens())
        try {
          st=new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
    int[] readArray(int n) {
      int[] a=new int[n];
      for (int i=0; i<n; i++) a[i]=nextInt();
      return a;
    }
    byte nextByte(){return Byte.parseByte(next());}
    long nextLong() {
      return Long.parseLong(next());
    }
  }
}
