package CLevelProbsDiv2_3;
import java.util.*;
import java.io.*;

public class Chat_Ban {
  //https://codeforces.com/contest/1612/problem/C
  static PrintWriter out = new PrintWriter(System.out);
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    int t = input.nextInt();
    
    while(t-- > 0){
      
      int k = input.nextInt();
      long x = input.nextLong();
      
      long left = 1;
      
      long right = 2L*k-1;
      //long answer=2L*k-1;
      
      while(left < right){
        
        long mid = left+(right-left)/2;
        
        if(sumIsGreaterThanMax(x, mid, k)){
          //answer = mid;
          right = mid;
        }
        
        else
          left = mid+1;
        
      }
      //if(sum==0)
      out.println(right);//answer);
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
      long totalSum = sum(k)+sum(k-1)-sum(2L*k-1-mid);
      return totalSum >= max;
    }
    
    else
      return sum(mid)>=max;
  }
  
  static long sum(long a){
    return a*(a+1)/2;
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

