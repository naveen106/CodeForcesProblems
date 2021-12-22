package CodeForcesTraining;
//https://codeforces.com/contest/382/problem/A
import java.util.*;
public class KseniaAndPanScales {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringBuilder str1 = new StringBuilder(input.next());
    StringBuilder str2 = new StringBuilder(input.next());

    int numOfChars1 = 0;
    int numOfChars2 = 0;

    int i = 0;
    while(str1.charAt(i) != '|') {
      numOfChars1++;
      i++;
    }

    while(++i<str1.length())
      numOfChars2++;

    if(numOfChars1 != 0)
      numOfChars2 += str2.length();
    else
      numOfChars1 = str2.length();

    if(numOfChars1 == numOfChars2){
      if (numOfChars1 < str2.length() || str1.charAt(0) ==  '|')
        System.out.println(str2.append(str1));
      else
        System.out.println(str1.append(str2));
      return;
    }

    else{
      if(str2.length() > numOfChars1 && str2.length() > numOfChars2){}
    }









  }
}