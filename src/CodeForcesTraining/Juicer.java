package CodeForcesTraining;
//http://codeforces.com/contest/709/problem/A
import java.util.*;
public class Juicer {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n = input.nextInt();
    int b = input.nextInt();
    int d = input.nextInt();

    int wasteSize = 0;
    int result = 0;

    while(n-- > 0){
      int sizeOfOrange = input.nextInt();

      if(sizeOfOrange <= b)
      wasteSize += sizeOfOrange;

      if(wasteSize > d){
        wasteSize = 0;
        result++;
      }
    }
    System.out.println(result);
  }
}
