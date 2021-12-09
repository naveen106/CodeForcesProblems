package CodeForcesTraining;
//http://codeforces.com/contest/339/problem/A
import java.util.*;

public class HelpfulMaths {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.next();
    ArrayList<Integer> arr = new ArrayList<>();

    for(int i = 0; i<str.length(); i+=2)
    arr.add(Integer.parseInt(String.valueOf(str.charAt(i))));

    Collections.sort(arr);
    StringBuilder resultingString = new StringBuilder();

    for(int i = 0; i<arr.size()-1; i++)
    resultingString.append(arr.get(i)).append("+");

    resultingString.append(arr.get(arr.size()-1));

    System.out.println(resultingString);
  }
}
