package CodeForcesTraining;
//https://codeforces.com/contest/443/problem/A
import java.util.*;
public class AntonAndLetters {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    str = str.substring(1, str.length()-1);
    System.out.println(str);
    HashSet<Character> set = new HashSet<>();

      for(int i = 0; i<str.length(); i++){
        if(str.charAt(i) != ',' && str.charAt(i) != ' ')
        set.add(str.charAt(i));
      }
    System.out.println(set.size());
  }
}