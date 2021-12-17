package CodeForcesTraining;
//https://codeforces.com/contest/742/problem/A
import java.util.*;
//there's a pattern for multiples of 8's last digit. 8 4 2 6|8 4 2 6|8  4  2  6
//value of n =                                       1 2 3 4 5 6 7 8 9 10 11 12 ...and so on.
public class ArpaMehrdad {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
 //   int num = 8;

//    for(int i = 1; i<n; i++){
//      num *= 8;
//      num %= 10;
//    }
    if(n==0)
      System.out.println(1);
    else if(n==1)
      System.out.println(8);
    else if(n==2)
      System.out.println(4);
    else if(n==3)
      System.out.println(2);
    else if(n==4)
      System.out.println(6);

    if(n>4){
      if(n%4 == 1)
        System.out.println(8);
      else if(n%4 == 2)
        System.out.println(4);
      else if(n%4 == 3)
        System.out.println(2);
      else
        System.out.println(6);
    }
  }
}
