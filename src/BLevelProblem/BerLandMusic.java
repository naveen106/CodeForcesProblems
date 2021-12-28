package BLevelProblem;
//https://codeforces.com/contest/1622/problem/B
import CLevelProbsDiv2_3.FastScanner;
import java.io.PrintWriter;
import java.util.*;

public class BerLandMusic {
  public static void main(String[] args) {
    FastScanner input = new FastScanner();
    PrintWriter out = new PrintWriter(System.out);
    int t = input.nextInt();
    while (t-- > 0) {
      int n = input.nextInt();
      int[] arr = input.readArray(n);
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < n; i++) {
        map.put(arr[i], i);
      }

      String str = input.next();
      ArrayList<Integer> disliked = new ArrayList<>();
      ArrayList<Integer> liked = new ArrayList<>();
      int[] answer = new int[n];

      for (int i = 0; i < n; i++) {
        if (str.charAt(i) == '0') {
          disliked.add(arr[i]);
        } else
          liked.add(arr[i]);
      }
      Collections.sort(liked);
      Collections.sort(disliked);

      int i = 0;
      for (i = 0; i < disliked.size(); i++) {
        answer[map.get(disliked.get(i))] = i + 1;
      }
      for (int j = 0; j < liked.size(); j++) {
        answer[map.get(liked.get(j))] = ++i;
      }
      for (int element : answer)
        out.print(element + " ");
      out.println();
    }
    out.close();
  }
}
