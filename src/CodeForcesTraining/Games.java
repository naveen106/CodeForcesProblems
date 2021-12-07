package CodeForcesTraining;
//https://codeforces.com/contest/268/problem/A
import java.util.*;
public class Games {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    int[] home = new int[n], guest = new int[n];

    for(int i = 0; i<n; i++){
      home[i] = input.nextInt();
      guest[i] = input.nextInt();
    }

    int answer = 0;

    for(int i = 0; i<n; i++)
      for(int j = 0; j<n; j++){
        if(home[i] == guest[j])
          answer++;
      }
    System.out.println(answer);

////////was trying to do with bette approach, but noticed after a bit..."there is no order", so I had to use brute force.
/*
    int home = input.nextInt();
    int guest = input.nextInt();

    int constHome = home;
    int constGuest = guest;

    int games = 0;

    for(int i = 0; i<teams-1; i++){
      int home2 = input.nextInt();
      int guest2 = input.nextInt();

      if(home == guest2)
        games++;

      if(guest == home2)
        games++;

      home = home2;
      guest = guest2;
    }
    System.out.println(games);
 */
  }
}
