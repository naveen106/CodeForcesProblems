package CodeForcesTraining;
//http://codeforces.com/contest/9/problem/A
import java.util.*;
public class DieRoll {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int y = input.nextInt();
    int w = input.nextInt();

    if(w>y) y = w;

    int min = 6 - y + 1 ;
    int max = 6;

    //if 'min' is '1' or '5', this loop won't have any effect, hence answer
    // will be 1/6 and 5/6 respectively. But if they have common divisor
    // simplified fraction form will be printed
    for(int i=2; i<=6; i++){
      if(min%i == 0 && max%i == 0 ){
        min /= i;
        max /= i;
      }
    }
    System.out.println(min + "/" + max);
  }
}
