import java.util.*;
import java.io.*;

public class CFsolve {
  static PrintWriter out = new PrintWriter(System.out);
  
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    int n = input.nextInt();
    int[]arr = new int[n];
    int start = 0;
    
    if(n==2){
//      int temp = input.nextInt();
//      int temp2 = input.nextInt();
      if(input.nextInt() <= input.nextInt())
        out.println("yes\n1 1");
      else
        out.println("yes\n1 2");
      out.close();
      return;
    }
    
    for(int i = 0; i<n; i++)
      arr[i]=input.nextInt();
    
    
    for(int i = 1; i<arr.length; i++){
      if(arr[i-1] > arr[i]){
        start = i-1;
        break;
      }
    }
    int end = 0;
    
    for(int i = n-2; i>=start; i--){
      if(arr[i] > arr[i+1]) {
        end = i + 1;
        break;
      }
    }

    //Array is already sorted
    if(start == 0 && end == 0){
      out.println("yes\n" + "1 1");
      out.close();
      return;
    }
    
    if(end-start == 1){
      
      if(end+1 < n && arr[start] < arr[end+1])
      //out.println("yes\n" + end+1 +" "+ start+1);
        out.println("yes\n" + ++start +" "+ ++end);
      else
        out.println("no");
      out.close();
      return;
    }
    
    int s = 0;
    int e=end;
    if(end < arr.length-1)
      e = end+1;
    
    if(start>0)
    s=start-1;
    
    for(int i = end; i>=start; i--){
      
      if(start > 0 && end != arr.length-1){
        
        if(arr[i] < arr[s] || arr[i] > arr[e]){
          out.println("no");
          out.close();
          return;
        }
        continue;
      }
      
      if(end == arr.length-1 && start>0){
        if(arr[i] > arr[start] || arr[i] < arr[s]){
          out.println("no");
          out.close();
          return;
        }
        continue;
      }
      
      if(arr[i] > arr[s] || arr[i] < arr[e]){
        out.println("no");
        out.close();
        return;
      }
    }
    
    //out.println("yes\n" + arr[end-1] +" "+ arr[start+1]);
    //out.println("yes\n" + end+1 +" "+ start+1);
    out.println("yes\n" + ++start +" "+ ++end);
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
