import java.util.*;
import java.io.*;

public class CFsolve {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    int t = input.nextInt();
    while(t-- > 0){
      int n = input.nextInt();
      int[]arr = input.readArray(n);
      String str = input.next();
      sort(arr);
      int[]result = new int[n];
      int start = 0;
      int end = n-1;
      for(int i = 0; i<arr.length; i++){
        if(str.charAt(i) == '0'){
          result[i] = arr[start];
          arr[start] = 0;
          start++;
        }
        else {
          result[i] = arr[end];
          arr[end] = 0;
          end--;
        }
      }

      for(int i : result)
        out.print(i+" ");
      out.println();
    }
    out.close();
  }

  static int LCM(int a, int b, int gcd){
    return a/gcd * b;
  }

  static int gcd(int a,int b){
    while(b>0){
      a%=b;
      a=a^b;
      b=a^b;
      a=a^b;
    }
    return a;
  }

  static void swap(int a, int b){
    a = a^b;
    b = a^b;
    a = a^b;
  }

  static void sort(int[] a) {
    ArrayList<Integer> l=new ArrayList<>();
    for (int i:a) l.add(i);
    Collections.sort(l);
    for (int i=0; i<a.length; i++) a[i]=l.get(i);
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
