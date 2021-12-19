package CodeForcesTraining;
import java.util.*;
public class test {
    public static void main(String[] args) {
      int[]price = {60, 70, 80, 100, 90, 75, 80, 120};
      int[] arr = new int[price.length];
      Stack<Integer> stack = new Stack<>();

      stack.push(0);
      int top = 0;
      arr[0] = 1;

      for(int i = 1; i<price.length; i++){
        top = stack.pop();
        if(price[i] > price[top]){
          arr[i] = i+1;
          stack.push(i);
        }

        else{
          arr[i] = 1;
//                stack.push(top);
          stack.push(i);
        }
      }
      System.out.println(Arrays.toString(arr));
    }
}