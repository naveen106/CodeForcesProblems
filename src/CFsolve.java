
  import java.util.*;
  import java.io.*;

  public class CFsolve {
    public static void main(String[] args) {
      FastScanner input = new FastScanner();
      PrintWriter out = new PrintWriter(System.out);
      int t = input.nextInt();
      while(t-- > 0){
        int n = input.nextInt();
        int[][]arr = new int[n][n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
          int key = input.nextInt();
          arr[0][i] = key;
          map.put(key, map.containsKey(key)? map.get(key)+1 : 1);
        }

        int q = input.nextInt();
        int count  = 1;
        int times = 0;
        while(q-- > 0){

          int ai = input.nextInt()-1;
          int step = input.nextInt();
          int tempStep = step;
          while(step-- > 0 && times < n && count < n){

            if(arr.length >= step && arr[count][0] != 0){
              if(arr[tempStep][ai] != 0)
              System.out.println(arr[tempStep][ai]);
              else
                System.out.println(arr[step+1][ai]);
            }
            else
            for(int i = 0; i<n; i++){
              arr[count][i] = map.get(arr[count-1][i]);
            }
            map.clear();
            for(int i = 0; i<n; i++){
              map.put(arr[count][i], map.containsKey(arr[count][i])? map.get(arr[count][i])+1:1);
            }

            times++;
            count++;
          }

          if(tempStep >= n){
            System.out.println(arr[n-1][ai]);
          }
          else if(arr[tempStep][ai] != 0)
            System.out.println(arr[tempStep][ai]);
          else
            System.out.println(arr[step+1][ai]);
        }
      //  map.forEach((key,val) -> out.println(key + " : " + val));
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
