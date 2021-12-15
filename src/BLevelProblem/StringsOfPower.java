package BLevelProblem;
//https://codeforces.com/contest/318/problem/B
import java.util.*;

public class StringsOfPower {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.next();
    if(str.length() < 10){
      System.out.println(0);
      return;
    }
//    int count = 0;
//    for(int i = 0; i<str.length()-4; i++){
//      if(str.startsWith("heavy", i)){
//        for(int j = i+5; j<str.length()-4; j++){
//          if(str.startsWith("metal", j))
//            count++;
//        }
//        i = i+4;
//      }
//    }
//    System.out.println(count);

    //number of powerful strings = number of "heavy" strings for each "metal" string.
    //like for "heavymetalismetal" before 1st "metal" there's 1 "heavy", before 2nd "metal", same "heavy" is there,
    //but we still count it.
    long count = 0;
    long heavy = 0;
    for(int i = 0; i<str.length()-4; i++){
      if(str.startsWith("heavy",i))
        heavy++;
      else if(str.startsWith("metal",i))
        count+=heavy;
    }
    System.out.println(count);
  }
}
