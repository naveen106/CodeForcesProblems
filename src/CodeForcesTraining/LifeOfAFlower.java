package CodeForcesTraining;
//https://codeforces.com/contest/1591/problem/A
import java.util.*;
public class LifeOfAFlower {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){
      int n = input.nextInt();
      int result = 1;
       if(n == 1){
         int temp = input.nextInt();
         if(temp == 0)
         System.out.println(1);
         else
         System.out.println(2);
       }

       else{

          int[] arr = new int[n];

          for(int i = 0; i<n; i++)
          arr[i] = input.nextInt();

          for(int i = 1; i<n; i++){

            if(arr[i] == 1 && arr[i-1] == 1)
              result+=5;

            if(arr[i] == 1 && arr[i-1] == 0)
              result++;

            if(arr[i] == 0 && arr[i-1] == 0) {
              result = -1;
              break;
            }
          }
         if(arr[0] == 1 && result != -1)
         System.out.println(result+1);
         else
           System.out.println(result);
       }
    }
  }
}
