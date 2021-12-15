package CodeForcesTraining;
//https://codeforces.com/contest/474/problem/A
import java.util.*;

public class Keyboard {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char ch = input.next().charAt(0);

    String str = input.next();
    String one = "qwertyuiop";
    String two = "asdfghjkl;";
    String three = "zxcvbnm,./";
    StringBuilder result = new StringBuilder();
    int k = 0;
    for(int i = 0; i<str.length(); i++){
      int j = 0;
      for(j = 0; j<one.length(); j++){
        if(str.charAt(i) == one.charAt(j)) {
          if(ch == 'L')
            result.append(one.charAt(j + 1));
          else
            result.append(one.charAt(j - 1));
          break;
        }
      }
      if(j<one.length())
      if(str.charAt(i) == one.charAt(j))
      continue;

      for(j = 0; j<two.length(); j++){
        if(str.charAt(i) == two.charAt(j)) {
          if(ch == 'L')
            result.append(two.charAt(j + 1));
          else
            result.append(two.charAt(j - 1));
          k=0;
          break;
        }
      }

      if(j<two.length())
      if(str.charAt(i) == two.charAt(j))
        continue;

      for(j = 0; j<three.length(); j++){
        if(str.charAt(i) == three.charAt(j)) {
          if(ch == 'L')
            result.append(three.charAt(j + 1));
          else
            result.append(three.charAt(j - 1));
          break;
        }
      }
    }

    System.out.println(result);

    //MORE ELEGANT SOLUTION(DEFINITELY NOT MINE, I AM NOT THAT MUCH OF A GENIUS) :
    /*
    * Scanner sc = new Scanner(System.in);

		String s = "qwertyuiopasdfghjkl;zxcvbnm,./";

		String input = sc.next();

		String m = sc.next();

		int a = 1;

		if(input.equals("R")) {
			a=-1;
		}
		for(int i =0;i<m.length();i++)
		{
			System.out.print((s.charAt(s.indexOf(m.charAt(i))+a)));
		}

    */
  }
}
