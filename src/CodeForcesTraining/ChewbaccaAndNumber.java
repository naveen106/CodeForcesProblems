package CodeForcesTraining;
//https://codeforces.com/contest/514/problem/A
import java.util.*;
public class ChewbaccaAndNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long num = input.nextLong();
    if(num<10){
      System.out.println(num);
      return;
    }

    String temp = Long.toString(num);
    byte len = (byte)temp.length();

    StringBuilder str = new StringBuilder();
    byte i = 0;
    while(i<len) {
      byte digit = (byte)(temp.charAt(i) - '0');

      if(i==0 && digit == 9) {
        str.append(digit);
        i++;
        continue;
      }

      if(digit > 4)
        str.append(9-digit);
      else
        str.append(digit);
      i++;
    }
    System.out.println(str);
  }
}
