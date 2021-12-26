package CLevelProbsDiv2_3;
//https://codeforces.com/contest/1613/problem/C
import java.io.*;

public class PoisonedDagger {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    int t = input.nextInt();
    while(t-- > 0){
      byte n = input.nextByte();
      long health = input.nextLong();
      int arr[] = input.readArray(n);
      long left = 0;
      long right = health;

      while(left <= right){
        long min = (left+right)/2;
        long damage = min;
        for(int i = 0; i<n-1; i++){
          damage += Math.min(arr[i+1]-arr[i], min);
        }
        if(damage < health) left = min + 1 ;
        else right = min - 1;
      }
      out.println(left);
    }
    out.close();
  }
}