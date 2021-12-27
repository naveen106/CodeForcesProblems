package MathLib;

import java.util.ArrayList;
import java.util.Collections;

public class Lib {
  static int gcd(int a,int b){
    while(b>0){
      a%=b;
      a = a^b;
      b = a^b;
      a = a^b;
    }
    return a;
  }

  static int LCM(int a, int b){
    return a/gcd(a,b) * b;
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

}
