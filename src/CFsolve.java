import java.util.*;
import java.io.*;

public class CFsolve {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    String str = input.next();
    String[] output = getCode(str);
   // possibleCodes(str);
    for(String i : output)
      out.println(i);
    out.close();
  }
//  static void possibleCodes(String str){
//    if(str.length() == 0)
//      return;
//    int a = str.charAt(0)-'0';
//
//    System.out.print((char)(a + 96));
//    possibleCodes(str.substring(1));
//    System.out.print((char)(96+a));
//
//  }

  public static char getChar(int n){
    return (char)(n + 96);
  }

  public static String[] getCode(String str){
    if (str.length() == 0)
    return new String[]{""};

    String[] output1 = getCode(str.substring(1));
    String[] output2 = new String[0];
    int firstDigit = (str.charAt(0) - '0');
    int firstTwoDigit = 0;

    if (str.length() >= 2) {
      firstTwoDigit = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');

      if (firstTwoDigit <= 26)
        output2 = getCode(str.substring(2));
    }

    String[] output = new String[output1.length + output2.length];
    int k = 0;
    for (int i = 0; i < output1.length; i++) {
      char ch = getChar(firstDigit);
      output[i] = ch + output1[i];
      k++;
    }

    for (String s : output2) {
      char ch = getChar(firstTwoDigit);
      output[k] = ch + s;
      k++;
    }
    return output;
  }


  static int LCM(int a, int b, int gcd){
    return a/gcd * b;
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
