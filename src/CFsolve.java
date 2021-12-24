import java.util.*;
import java.io.*;

public class CFsolve {
  public static void main(String[] args) {

    FastScanner input = new FastScanner();
    //WRITE YOUR CODE HERE // use - out.println() or out.print() to print. //
    int t = input.nextInt();

    while(t-- > 0){

      byte n = input.nextByte();
      long health = input.nextLong();
      long permHealth = health;
      long k = 0;
      byte attacks = n;
      int firstnum = input.nextInt();

      for(int i = 1; i<attacks; i++){
        int b = input.nextInt();
        if(attacks == 2)
          health -= firstnum;
        else
        health -= Math.abs(b-firstnum);
        if( n==2 ){
            k = health / 2 + health%2;  // k=health/(n-i) + 1;
        }

        health -= Math.abs(b-firstnum);
        firstnum = b;

        n--;
      }
      if(attacks == 1)
       System.out.println(permHealth);
      else if(attacks>permHealth)
        System.out.println(1);
      else
      System.out.println(k);
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
    byte nextByte(){
      return Byte.parseByte(next());
    }
    long nextLong() {
      return Long.parseLong(next());
    }
  }
}
