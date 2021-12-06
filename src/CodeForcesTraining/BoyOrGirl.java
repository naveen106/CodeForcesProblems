package CodeForcesTraining;
//https://codeforces.com/contest/236/problem/A
import java.util.ArrayList;
import java.util.Scanner;
public class BoyOrGirl {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.next();

    ArrayList<Character> arr = new ArrayList<>();

    for(int i = 0; i<str.length(); i++){
      if(arr.contains(str.charAt(i)))
      continue;
      arr.add(str.charAt(i));
    }

    //if even
    if((arr.size() ^ 1) == arr.size() + 1)
      System.out.println("CHAT WITH HER!");

    //if odd
    else
      System.out.println("IGNORE HIM!");
  }
}
