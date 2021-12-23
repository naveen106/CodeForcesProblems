package BLevelProblem;
//https://codeforces.com/problemset/problem/1353/B
import java.util.*;

public class TwoArraysAndSwaps {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0) {
      int n = input.nextInt();
      int k = input.nextInt();
      ArrayList<Integer> list1 = new ArrayList<>();
      for (int i = 0; i < n; i++)
        list1.add(input.nextInt());

      ArrayList<Integer> list2 = new ArrayList<>();
      for (int i = 0; i < n; i++)
        list2.add(input.nextInt());

      Collections.sort(list1);
      Collections.sort(list2);

      int i = 0;
      int j = 0;
      while(i<list1.size() && k!=0) {
        int last = list2.get(list2.size()-1-j);
        if(list1.get(i) < last) {
          list1.set(i, last);
          j++;
          k--;
        }
        i++;
      }

      int sum = 0;
      for (int element : list1)
        sum += element;

      System.out.println(sum);
    }
  }
}
