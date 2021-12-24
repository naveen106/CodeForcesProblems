import java.util.*;
import java.io.*;

public class CFsolve2 {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    int t = input.nextInt();
    while(t-- > 0){
      int n = input.nextInt();
      int[]arr = new int[n];

      for(int i = 0; i<n; i++)
        arr[i] = input.nextInt();

      Arrays.sort(arr);
      int i = 0, j = arr.length-1;

      while(i<=j){
        int left = arr[i];
        int right = arr[j];

        while(left != right){
          left+=1;
          right-=1;
        }
        i++;
        j--;
      }

      int min = 0;
      for(i = 0; i<=arr.length-2;i++){
       if(arr[i] != arr[i+1]) {
         min = Math.abs(arr[i]-arr[i+1]);
         break;
       }
      }
      System.out.println(min);
    }
    }
  }

   class FastScanner {
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
    byte nextByte(){
      return Byte.parseByte(next());
    }
    long nextLong() {
      return Long.parseLong(next());
    }
}

