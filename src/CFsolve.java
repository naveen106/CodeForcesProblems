import java.util.*;
import java.io.*;

public class CFsolve {
  static PrintWriter out = new PrintWriter(System.out);
  
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    int n = input.nextInt();
    int[]arr = new int[n];
  
    for(int i = 0; i<n; i++){
      arr[i]=input.nextInt();
    }
    int end = -1;
    int start = -1;
  
    for(int i = n-1; i>=0; i--){
    
      if (end != -1 && arr[i] < arr[end]) {
        start = i + 1;
        break;
      }
    
      if (i-1>=0 && arr[i - 1] > arr[i]) {
        if (end == -1)
          end = i;
      }
    }
  
    //if array is completely decreasing
    if(end > -1 && start == -1){
      out.println( "yes\n"+arr[end] + " "+ arr[0]);
      out.close();
      return;
    }
    //if the array is already sorted
    if(end == -1){
      out.println("yes\n"+arr[0]+" "+arr[0]);
      out.close();
      return;
    }
    
    for(int i = start; i<=end; i++){
      swap(arr[start],arr[end]);
    }
  
    boolean isSorted = true;
  
    for(int i = 1; i<n; i++ ){
      if(arr[i] < arr[i-1]) {
        out.println("no");
        isSorted = false;
        break;
      }
    }
    if(isSorted){
      out.println( "yes\n"+arr[start] + " "+ arr[end]);
    }
    else
      out.println("no");
    out.close();
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
