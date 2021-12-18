package CodeForcesTraining;
//https://codeforces.com/contest/80/problem/A;
import java.util.*;
public class PanoramixPrediction {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();

    boolean isPrime = true;
    //checking for prime
    for(int i = 2; i<=m/2; i++){
      if(m%i == 0) {
        isPrime = false;
        break;
      }
    }
    //if it's not prime print no, and return.
    if(!isPrime) {
      System.out.println("NO");
      return;
    }

    //n< every number < m, we check if it's prime, if it is then we print "NO" and return else it's a "YES"
    while(--m > n){
      isPrime = true;
      for(int i = 2; i<=m/2; i++){
        if(m%i == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}