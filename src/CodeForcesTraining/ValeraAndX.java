package CodeForcesTraining;
import java.util.*;
//https://codeforces.com/contest/404/problem/A
public class ValeraAndX {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    String arr[] = new String[n+1];

    for(int i = 1; i<=n; i++)
      arr[i] = input.next();

    HashSet<Character> set = new HashSet<>();
    int count = 0;
    for(int i = 1; i<arr.length; i++){

        if(arr[i].charAt(n-i) != arr[1].charAt(0)) {
          System.out.println("NO");          
          return;
        }
        else {
          count+=2;
        }

       for(int j = 0; j<n; j++){
         if(j==i-1 && arr[i].charAt(j) != arr[1].charAt(0)) {
           System.out.println("NO");
           return;
         }

         if(j != i-1 && j!= n-i && arr[i].charAt(j) == arr[1].charAt(0))
         count++;

         set.add(arr[i].charAt(j));
       }

    }
    if(set.size() != 2 || count-1 >= n*2) {
      System.out.println("NO");
      return;
    }

    System.out.println("YES");

  }
}
