import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class CFsolve {
  
  
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    int t = input.nextInt();
    
    while(t-- > 0){
    
    }
    out.close();
  }
  
  
  
  static boolean sumIsGreaterThanMax(long max, long mid, int k){
    
    if(mid >= k){
      /*
      long Ksum = sum(k);
      long tempSum = sum(2*k-1-mid);
      long greaterThanKSum = (temp*(temp+1)/2);//(mid-1)*mid/2;

      totalSum = midSum + Ksum - greaterThanKSum;
       */
      
      /* Positions:        1 2 3 4 5 6 7
       * How? for example: 1 2 3 4 3 2 1, then total sum = sum(k) + sum(k-1);  // sumOf( 1 --> 4) + sumOf( 3 <-- 1 )
       * if mid = 5 (position 5), then sum till position 5 = totalsum - sumOf(totalElements - mid)
       * // and totalElements - mid == total numbers left on the right side (which is 2 here (7th and 6th position).
       * // so we just subtract sum of totalElements left on the right side  from total sum to find the addition till 5th position.
      */
      long totalSum = sum(k)+sum(k-1)-sum((2L*k-1)-mid);
      return totalSum >= max;
    }
    
    else //else mid is less than k, meaning
    return sum(mid)>=max;
    
  }
  
  static long sum(long a){
    return a*(a+1)/2;
  }

  static int LCM(int a, int b){
    return a/gcd(a,b) * b;
  }
  static long LCM(long a, long b){
    return (a/gcd(a,b) * b);
  }
  
  static long pow(long a, long b) {
    long res = 1;
    while (b > 0) {
      if ((b & 1)!=0)
        res = res * a;
      a = a * a;
      b >>= 1;
    }
    return res;
  }
  
  static int pow(int a, int b) {
    int res = 1;
    while (b > 0) {
      if ((b & 1)!=0)
        res = res * a;
      a = a * a;
      b >>= 1;
    }
    return res;
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
  
  static long gcd(long a,long b){
    while(b>0){
      a%=b;
      a=a^b;
      b=a^b;
      a=a^b;
    }
    return a;
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
