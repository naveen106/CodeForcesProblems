package CodeForcesTraining;
import java.util.*;
import java.io.*;
//THE SOLUTION WAS NOT DONE BY ME, BUT I LEARNED A LOOOOOOT FROM THIS PROBLEM
//https://codeforces.com/contest/1446/problem/A
public class KnapSack {
  public static void main(String[] args) {
    FastScanner fs = new FastScanner();
    int T = fs.nextInt();
    PrintWriter out = new PrintWriter(System.out);
    for (int tt = 0; tt < T; tt++) {
      int n = fs.nextInt();
      long W = fs.nextLong();
      Item toTake = null;
      ArrayList<Item> small = new ArrayList<>();
      long smallTotal = 0;
      for (int i = 0; i < n; i++) {
        int weight = fs.nextInt();
        if (weight > W) continue;
        if (weight >= (W + 1) / 2) {
          toTake = new Item(i + 1, weight);
        } else {
          if (smallTotal + weight <= W) {
            small.add(new Item(i + 1, weight));
            smallTotal += weight;
          }
        }
      }
      if (toTake != null) {
        out.println(1);
        out.println(toTake.id);
      } else if (smallTotal >= (W + 1) / 2) {
        out.println(small.size());
        for (Item i : small) {
          out.print(i.id + " ");
        }
        out.println();
      } else
        out.println(-1);
    }
    out.close();
  }

  static class Item {
    int id, weight;
    public Item(int id, int weight) {
      this.id=id;
      this.weight=weight;
    }
  }

  static class FastScanner {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    String next() {
      while (!st.hasMoreTokens())
        try {
          st=new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }
    int[] readArray(int n) {
      int[] a=new int[n];
      for (int i=0; i<n; i++) a[i]=nextInt();
      return a;
    }
    long nextLong() {
      return Long.parseLong(next());
    }
  }
  /*
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){

      int n = input.nextInt();
      long w = input.nextLong();
      long[]arr = new long[(int)n];
      long min = Integer.MAX_VALUE;
      long c = (w+1)/2;

      for(int i=0; i<n;i++){
        arr[i] = input.nextLong();
        min = Math.min(min, arr[i]);
      }

      int temp=0;
      if(min <= w && min >= c){
        System.out.println(1);
        for(int i = 0; i<arr.length; i++){
          if(arr[i] == min){
            temp = i;
            break;
          }
        }
        System.out.println(++temp);
      }

      ArrayList<Integer> list = new ArrayList<>();
      long sum = 0;
      for(int i = 0; i<n && c>0; i++){

        if(arr[i] <= c){
          c-=arr[i];
          sum+=arr[i];
          list.add(i+1);
        }
      }

      if(temp != 0){
        continue;
      }

      if(list.size() == 0 || sum < c || sum > w) {
        System.out.println(-1);
        continue;
      }

      System.out.println(list.size());
      for(int element : list)
        System.out.print(element + " ");
      System.out.println();

    }
  }
  */
}
