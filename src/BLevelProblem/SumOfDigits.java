package BLevelProblem;

import java.util.InputMismatchException;
import java.util.Scanner;

//https://codeforces.com/contest/102/problem/B
public class SumOfDigits {
 // static int sum;
  static int numberOfSpells(int n){
    int sum;

    if(n<10)
    return n;

    sum = (n % 10) + numberOfSpells(n/10);
    return sum;
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = 0;
    try {
      n = input.nextInt();
    }

    catch(InputMismatchException e){
      System.out.println(2);
      return;
    }

    int count = 0;


    if(n <= 9){
      System.out.println(0);
      return;
    }

    while(true){
       n = numberOfSpells(n);
       count++;

       if(n<=9)
         break;
    }

    System.out.println(count);
  }
}
