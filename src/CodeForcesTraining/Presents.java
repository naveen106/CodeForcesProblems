package CodeForcesTraining;
//https://codeforces.com/contest/136/problem/A
import java.util.*;


// index =  0 1 2 3
// i =      1 2 3 4
// pi =     2 3 4 1

//it can be written like this. friend num 2 gives gift to friend num 1, and 3 to 2, and 4 to 3 and 1 to 4
// 2 ---> 1
// 3 ---> 2
// 4 ---> 3
// 1 ---> 4

//now, 1st one gives to 4
//0   1 ---> 4
//1   2 ---> 1
//2   3 ---> 2
//3   4 ---> 3

//if i starts from 0 index than - pi[i] - 1 = i+1;






public class Presents {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[]arr = new int[n];
    int[]answer = new int[n];

    for(int i = 0; i<n; i++)
    arr[i] = input.nextInt();

    for(int i = 0; i<n; i++)
    answer[arr[i] - 1] = i+1;

    for(int element : answer)
    System.out.print(element + " ");
  }
}