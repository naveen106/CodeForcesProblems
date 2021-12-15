package CodeForcesTraining;
import java.util.*;
//https://codeforces.com/contest/469/problem/A
public class IWannaBeTheGuy {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
/*
    int p = input.nextInt();
    int[]x = new int[p];

    for(int i = 0; i<p; i++)
    x[i] = input.nextInt();

    int q = input.nextInt();
    int[]y = new int[q];

    for(int i = 0; i<q; i++)
    y[i] = input.nextInt();

    boolean[] passedLevel = new boolean[n+1];

    for(int i = 0; i<x.length; i++)
      passedLevel[x[i]] = true;

    for(int i = 0; i<y.length; i++)
      passedLevel[y[i]] = true;

    for(int i = 1; i<passedLevel.length; i++){
      if(!passedLevel[i]) {
        System.out.println("Oh, my keyboard!");
        return;
      }
    }
    System.out.println("I become the guy.");
    */

    //hmm...tried a new idea which came to my mind.
    int p = input.nextInt();
    HashSet<Integer> set = new HashSet<>();

    while(p-- > 0)
    set.add(input.nextInt());

    int q = input.nextInt();
    while(q-- > 0)
    set.add(input.nextInt());

    int check = set.size()*(set.size() + 1) / 2;
    if(check == n*(n+1)/2)
      System.out.println("I become the guy.");
    else
      System.out.println("Oh, my keyboard!");
  }
}