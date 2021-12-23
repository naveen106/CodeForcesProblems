package CodeForcesTraining;
import java.util.*;
//https://codeforces.com/contest/1446/problem/A
public class KnapSack {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){

      int n = input.nextInt();
      long w = input.nextLong();
      int[]arr = new int[n];
      int min = Integer.MAX_VALUE;
      long c = w/2;

      for(int i=0; i<n;i++){
        arr[i] = input.nextInt();
        min = Math.min(min, arr[i]);
      }

      if(min <= w && min > c){
        System.out.println(1);
        int temp=0;
        for(int i = 0; i<arr.length; i++){
          if(arr[i] == min){
            temp = i;
            break;
          }
        }
        System.out.println(++temp);
        continue;
      }

      ArrayList<Integer> list = new ArrayList<>();

      for(int i = 0; i<n && c>0; i++){
        if(arr[i] <= c){
          c-=arr[i];
          list.add(i+1);
        }
      }

      if(list.size() == 0) {
        System.out.println(-1);
        continue;
      }

      System.out.println(list.size());
      for(int element : list)
        System.out.print(element + " ");
      System.out.println();
//      int min = Integer.MAX_VALUE;
//
//      for(int i = 0; i<n; i++){
//        arr[i] = input.nextInt();
//        min = Math.min(min, arr[i]);
//      }
//      int c = 0;
//      if((w&1) == 0)
//      c = w/2+1;
//
//      else
//      c = w/2;
//
//      if(min > w){
//        System.out.println(-1);
//        continue;
//      }
//
//      if(min == c || min == w){
//        int temp=0;
//        System.out.println(1);
//        for(int i = 0; i<n; i++) {
//          if (arr[i] == min) {
//            temp = i;
//            break;
//          }
//        }
//        System.out.println(++temp);
//        continue;
//      }
//
//      ArrayList<Integer> list = new ArrayList<>();
//
//      for(int i = 0; i<arr.length && c!=0 || w!=0; i++){
//        if(arr[i] <= c ) {
//          c -= arr[i];
//          w -= arr[i];
//          list.add(i+1);
//        }
//      }
//      System.out.println(list.size());
//      for(int element: list)
//        System.out.print(element + " ");
    }
  }
}

//1
//3
//-1
//1
//1
//-1
//1
//1
//-1
