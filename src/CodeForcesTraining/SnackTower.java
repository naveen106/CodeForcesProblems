package CodeForcesTraining;
//https://codeforces.com/problemset/problem/767/A
import java.util.*;

public class SnackTower {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[]arr = new int[n];

    for(int i = 0; i<n; i++)
      arr[i] = input.nextInt();

    int count = n;
    int i;
    int temp = -1, temp2=0;
//    boolean nextline = false;

    for(i = 0; i<count; i++){
      if(i == count-1)
        break;
      if(arr[i] == n){
        if(temp == -1) //storing index of biggest snack
        temp = i;

        System.out.print(n-- + " ");
        temp2 = n;

        if(i != 0 && arr[i+1] != n)
        i = i-2;
      }
      else if(n==0)
        break;

      else {
        System.out.println();
      }
    }

    for(i = 0; temp2 >= 1; i++) {
      System.out.print(temp2-- + " ");
    }

  }
}
