package CodeForcesTraining;
//https://codeforces.com/contest/768/problem/A
import java.util.*;

//I don't know why the code isn't working in IDE, while it's showing 'Accepted' in codeforces.


public class OathOfNightWatch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    if(n<=2){
      System.out.println(0);

      for(int i = 0; i<n; i++)
      input.nextInt();

      return;
    }
    int[]arr = new int[n];
//
//    for(int i = 0; i<n; i++)
//    arr[i] = input.nextInt();
//
//    int answer = 0;
//    Arrays.sort(arr);
//
//    for(int i = 0; i<n; i++){
//      if(arr[0]<arr[i] && arr[n-i] > arr[i])
//      answer++;
//    }
//    System.out.println(answer);


    for (int i = 0; i < n; i++)
      arr[i] = input.nextInt();

    int count = 0;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for(int i=0; i<n; i++){
      min = Math.min(arr[i], min);
      max = Math.max(arr[i], max);
    }

    for(int i=0; i<n; i++){
      if(arr[i]>min && arr[i] < max){
        count++;
      }
    }
    System.out.println(count);
  }
}