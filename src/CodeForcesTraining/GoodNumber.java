package CodeForcesTraining;
import java.util.*;
public class GoodNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();
    int result=0;

    while(n-- > 0){
      int temp = input.nextInt();
      if(Integer.toString(temp).length() < k+1)
      continue;

      int sum = k*(k+1)/2;
      int tempSum = 0;

      while(temp!=0){
        int rem = temp%10;
        tempSum+=rem;
        temp = temp/10;
      }
      if(n==1 && k == 0)
        sum = 1;

      if(tempSum == sum)
        result++;
    }
    System.out.println(result);
  }
}
