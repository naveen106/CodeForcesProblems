import java.util.*;
import java.io.*;

public class CFsolve {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    int n = input.nextInt();
  
    if(n==2){
      if(input.nextInt() <= input.nextInt())
        out.println("yes\n1 1");
      else
        out.println("yes\n1 2");
      out.close();
      return;
    }
  
    int[]arr = input.readArray(n);
    
    if(n==1) {
      out.println("yes\n 1 1");
      out.close();
      return;
    }
    
    int start = 0;
    int end = 0;
    
    for(int i = n-2; i>=0; i--){
        
        if(arr[i+1] < arr[i]) {
          end = i + 1;
          break;
        }
    }
    
    for(int i = 1; i<n-1; i++){
        
        if(arr[i-1] > arr[i]) {
          start = i - 1;
          break;
        }
    }
  
    //Array is already sorted
    if(start == 0 && end == 0){
      out.println("yes\n" + "1 1");
      out.close();
      return;
    }

    int s = start, e = end--;
    while(end >= start){
      if(arr[end+1] > arr[end--]) {
        out.println("no");
        out.close();
        return;
      }
    }
  
    if(e+1 < n && arr[e+1] < arr[s])
      out.println("no");
    else if(s-1 >= 0 && arr[s-1] > arr[e])
      out.println("no");
    else
    out.println("yes\n" + ++s +" "+ ++e);
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
