package CodeForcesTraining;
//https://codeforces.com/contest/318/problem/A
import java.util.*;
public class EvenOdds {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextLong();
    long k = input.nextLong();

    //In 11th grade, I learned AP(arith..progression), I used formula to fine nth term (a+(n-1)d) here, here k is n.

    if((n^1) == n-1){
      if(k <= n/2 + 1){
        System.out.println(1+(k-1)*2);
      }

      else{
        long temp = k-(n/2+1); //temp is the nth number in Arithmetic progression.
        System.out.println(2 + (temp-1)*2); //n/2+1 == total odd numbers.
      }
    }

    else{
      if(k<=n/2){
        System.out.println(1+(k-1)*2);
      }
      else{
        System.out.println(2+((k-n/2)-1)*2);
      }
    }
  }
}