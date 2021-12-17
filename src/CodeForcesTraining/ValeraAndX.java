package CodeForcesTraining;
import java.util.*;
//https://codeforces.com/contest/404/problem/A
public class ValeraAndX {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    ArrayList<String> arr = new ArrayList<>();
    for(int i = 0; i<n; i++){
      arr.add(input.next());
    }
    HashSet<Character> set = new HashSet<>();
    int count = 0;
    int flag = 0;
    for(int i = 0; i<n; i++){

        if(arr.get(i).charAt((n-1)-i) != arr.get(0).charAt(0)) {
          System.out.println("NO");
          return;
        }
        else {
          count++;
          flag = 1;
        }
       for(int j = 0; j<n; j++){
         if(flag == 0 && arr.get(i).charAt(j) == arr.get(0).charAt(0))
         count++;
         flag = 0;
         set.add(arr.get(i).charAt(j));
       }

    }
    if(set.size() != 2 || count >= n*2) {
      System.out.println("NO");
      return;
    }

    System.out.println("YES");

  }
}
