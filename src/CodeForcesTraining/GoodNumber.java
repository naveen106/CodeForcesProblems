package CodeForcesTraining;
import java.util.*;
public class GoodNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();
    int result=0;

    while(n-- > 0){
      boolean[] arr = new boolean[k+1];
      int num = input.nextInt();

      if(Integer.toString(num).length() < k+1)
      continue;

//      if(k==0 && num%10 == 0) {
//        result++;
//        continue;
//      }

      while(num != 0){
        if(num%10 < k+1)
        arr[num%10] = true;
        num = num/10;
      }
      boolean flag = true;
      for (Boolean aBoolean : arr) {
        if (!aBoolean) {
          flag = false;
          break;
        }
      }
      if(flag)
      result++;
    }
    System.out.println(result);
  }
}
