package BLevelProblem;
//https://codeforces.com/contest/682/problem/B
import java.util.*;
public class AlyonaAndMex {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    if(n == 1){
      System.out.println(2);
      return;
    }

    ArrayList<Long> list = new ArrayList<>();

    for(int i = 0; i<n; i++)
      list.add(input.nextLong());
    //if you use array instead of list, then it will give TLE. because collections use merge sort(Onlogn)worst,while arrays.sort()use dual-pivot quicksort(On^2)worst case.
    Collections.sort(list);
    long curr = 1;
    for(int i = 0; i<list.size();i++){
      if(list.get(i) >= curr)
        curr++;
    }
    System.out.println(curr);

  }
}
