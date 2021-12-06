package CodeForcesTraining;
//http://codeforces.com/contest/427/problem/A

import java.util.*;
public class PoliceRecruits {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int answer = 0;
    int j = 0;

    for(int i = 0; i<n; i++){
      int temp = input.nextInt();
      if(j>0 && temp == -1){
         j--;
        continue;
      }

      if(temp >= 0)
      j = j + temp;

      else if(temp == -1)
      answer++;
    }
    System.out.println(answer);
  }
}