import java.util.*;
import java.io.*;

public class CFsolve {
  //this is done by someone else, will look into how it's done more carefully, looks like I got something new to learn again.
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    
    int t = input.nextInt();
    
    while(t-- > 0){
      
      int n = input.nextInt();
      int health = input.nextInt();
      
      int[]arr = input.readArray(n);
  
      if(n==1){
        out.println(health);
        out.close();
        continue;
      }
      
      
      int left = 1, right = health;
      int answer = 0;
      
      while(left <= right){
        
        int mid = left+(right-left)/2;
        
        if(isPossible(arr, mid, health)){
          answer = mid;
          right = mid-1;
        }
        
        else
          left = mid+1;
      }
      
     // int temp = answer;
      
      //System.out.println(temp);
      System.out.println(answer);
      
    }
    
    out.close();
  }
  
  
  //k is damage dealt by dagger for k seconds
  static boolean isPossible(int[] arr, int k, int healthLoss){
    
    for(int i = 0; i<arr.length; i++){
      
      if(i+1 < arr.length){
       
        int difference = arr[i+1]-arr[i];
    /*
        //we deal k amount of damage (in k seconds)
        if(difference > k)
          healthLoss-=k;

        //else we deal 'difference' amount of damage
        else
            healthLoss-=difference;
            
     */
        healthLoss-= Math.min(difference, k);
        
      }
      //for last second.
      else
        healthLoss-=k;
    }
    
    return healthLoss<=0;
    
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
