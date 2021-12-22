package CodeForcesTraining;
//https://codeforces.com/contest/382/problem/A
import java.util.*;
public class KseniaAndPanScales {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    StringBuilder str1 = new StringBuilder(input.next());
    StringBuilder str2 = new StringBuilder(input.next());


    int finalLen = str1.length() + str2.length();

    if(finalLen != 2*str1.length()-1) {
      System.out.println("Impossible");
      return;
    }



    int numOfChars1 = 0;
    int numOfChars2 = str2.length();

    int i = 0;
    while(str1.charAt(i) != '|') {
      numOfChars1++;
      i++;
    }

    while(i<str1.length()){
      numOfChars2++;
      i++;
    }
    if(numOfChars1 == numOfChars2){
      if (numOfChars1 < str2.length())
        System.out.println(str2.append(str1));
      else
        System.out.println(str1.append(str2));
    }
  }
}