  import java.util.*;
  import java.io.*;

  public class CFsolve {
    public static void main(String[] args) {
      FastScanner input = new FastScanner();
      PrintWriter out = new PrintWriter(System.out);
      int t = input.nextInt();
      while(t-- > 0) {
        int n = input.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
          arr[i] = input.nextLong();
        }


        if(n == 2){
          if(arr[0] != arr[1]){
            out.println(Math.max(arr[0],arr[1]));
          }
          else
            out.println(0);
          continue;
        }

 //       ArrayList<Long> list = new ArrayList<>();

        long gcd = 0;
        boolean check = false;
        for (int i = 1; i < n; i+=2) {
          long temp = 0;
//          if((arr[i]&1) == 0 && (arr[i-1]&1) == 0){
//            if(arr[i] == arr[i-1]) {
//              out.println(0);
//              check = true;
//              break;
//            }
//          }
//
//          if((arr[i]&1) != 0 && (arr[i-1]&1) != 0){
//            if(arr[i] == arr[i-1]) {
//              out.println(0);
//              check = true;
//              break;
//            }
//          }
          if(i+2 < n && arr[i]!=arr[i+1] || arr[i] != arr[i-1]) {
            temp = gcd(arr[i], arr[i + 2]);
            if (temp > gcd && arr[i] % temp != 0)
              gcd = temp;
            else if (arr[i]!=arr[i-1] || arr[i] != arr[i+1])
              gcd = arr[i];
          }
        }
        if(!check)
        out.println(gcd);
      }
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
