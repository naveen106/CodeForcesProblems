package CodeForcesTraining;
//http://codeforces.com/contest/294/problem/A
import java.util.*;
public class ShassAndOskols {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[]birds = new int[n];

    for(int i = 0; i<n; i++)
    birds[i] = input.nextInt();

    int m = input.nextInt();

    while(m-- > 0){
     int x = input.nextInt() - 1;
     int y = input.nextInt();

      if(x-1 >=0)
      birds[x-1] += y-1;

      if(x+1 < n)
      birds[x+1] += birds[x] - y;

      birds[x] = 0;
    }
    for(int element : birds)
      System.out.println(element);
  }
}
