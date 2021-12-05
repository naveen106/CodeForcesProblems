package CodeForcesTraining;
//https://codeforces.com/contest/231/problem/A
import java.util.Scanner;
public class Team {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numOfProbs = input.nextInt();
    int answer = 0;
    while(numOfProbs-- > 0){
      int count = 0;
      for(int i = 0; i<3; i++){
        if(input.nextInt() == 1)
          count++;
      }
      if(count >= 2)
        answer++;
    }
    System.out.println(answer);
  }
}
