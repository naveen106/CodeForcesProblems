package CodeForcesTraining;
//https://codeforces.com/contest/71/problem/A
import java.util.*;
public class WayTooLongWords {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    ArrayList<String> list = new ArrayList<>();

    for(int i = 0; i<n; i++){
      String str = input.next();

      if(str.length()>10)
      list.add(str.charAt(0) + Integer.toString(str.length()-2) + str.charAt(str.length() -1));

      else
      list.add(str);
    }

    for(int i = 0; i<n; i++)
    System.out.println(list.get(i));
  }
}
