package CodeForcesTraining;
//https://codeforces.com/contest/382/problem/A
import java.util.*;
public class KseniaAndPanScales {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringBuilder str1 = new StringBuilder(input.next());
    StringBuilder str2 = new StringBuilder(input.next());
    StringBuilder result = new StringBuilder();

    int left = 0;
    int right;

    int i = 0;

    while(str1.charAt(i) != '|'){
      result.append(str1.charAt(i));
      left++;
      i++;
    }
    right =  str1.length()-1 - i;

    if(left==0&&right==0 && (str2.length() & 1) == 0){
      String temp = str2.substring(0,str2.length()/2) + "|" + str2.substring(str2.length()/2);
      System.out.println(temp);
      return;
    }

    result.append('|');

    while(++i<str1.length())
      result.append(str1.charAt(i));


    for(i=0;i<str2.length(); i++){
      //if remaining length is not even.
      if(left == right && (str2.length()-i & 1) != 0){
        System.out.println("Impossible");
        return;
      }

      if(left <= right) {
        result.insert(0, str2.charAt(i));
        left++;
      }

      else {
        result.append(str2.charAt(i));
        right++;
      }
    }
    if(left != right)
      System.out.println("Impossible");
    else
    System.out.println(result);
  }
}