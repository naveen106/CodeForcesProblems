package CodeForcesTraining;
//https://codeforces.com/problemset/problem/767/A
import java.util.*;

public class SnackTower {
      public static void main(String[] args) {
      //TODO code application logic here

      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int[] snack = new int[n+1];

      for (int i = 1; i <= n; i++)
        snack[i] = input.nextInt();

      boolean[] visited = new boolean[n + 1];
      int count = n;

      for (int i = 1; i <= n; i++) {
        visited[snack[i]] = true;

        while(visited[count] && count>0)
        System.out.print(count-- +" ");

        System.out.println();
      }

      // what I learned from this problem - I can create a visited[] array to keep track of elements and use it to move
        // further in my approach.
    }
}
