import java.util.*;
import java.io.*;

public class CFsolve {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    String[]arr = new String[4];

    for(int i = 0; i<4; i++)
      arr[i] = input.next();

    int rows=0;
    String answer = "NO";
    while(rows != 3){
      for(int i = 0; i<3; i++){
        String s = arr[i].substring(i, i + 2);
        boolean b = s.equals(".#") || s.equals("#.");
        boolean c = arr[i+1].startsWith(".#", i) || arr[i+1].startsWith("#.", i);

        if(s.equals("##") && c){
        answer = "YES";
        }
        if(arr[i+1].startsWith("##", i) && b){
          answer = "YES";
        }
        if(s.equals("##") && c){
          answer = "YES";
        }
        if(arr[i+1].startsWith("##", i) && s.equals(".#") || s.equals("#.")){
          answer = "YES";
        }

        if(s.equals("..")){
          if(c || b)
          answer = "YES";
        }

        if(arr[i+1].startsWith("..", i)){
          answer = "YES";
        }
        if(s.equals("..") && arr[i+1].startsWith(".#", i) || arr[i+1].startsWith("#.", i)){
          answer = "YES";
        }
        if(arr[i+1].startsWith("..", i) && s.equals(".#") || s.equals("#.")){
          answer = "YES";
        }
      }
      rows++;
    }

    out.println(answer);
    out.close();



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
