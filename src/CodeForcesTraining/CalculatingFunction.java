package CodeForcesTraining;
//https://codeforces.com/contest/486/problem/A
import java.util.*;
public class CalculatingFunction {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextLong();
    long temp;

    if((n^1) == n-1)
      temp = (n/2)*(n/2+1) - (n/2+1)*(n/2+1);
    else
      temp = (n/2)*(n/2+1) - (n/2)*(n/2);

    /////EVEN MORE SIMPLE
    /*
     int n = input.nextInt();
    if((n^1) == n+1)
    System.out.println(n/2);  //// equals to total sum of n even numbers - sum of n odd numbers. //if n is even.
    else
    System.out.println(((-1)*(n+1)/2));
    */

    System.out.println(temp);
  }
}
