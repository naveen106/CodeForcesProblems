package BLevelProblem;
import java.util.*;
public class ReplaceTheNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int q = input.nextInt();
    int arr[] = new int[q];
    int count = 0;
    for(int i = 0; i<q; i++){
      if(count == q)
        break;

      int first = input.nextInt();
      if(first == 1){
        arr[i] = input.nextInt();
      }
      else{
        int second = input.nextInt();
        int third = input.nextInt();
        for(int j = 0; j<i && arr[j]!=0; j++){
          if(arr[j] == second)
            arr[j] = third;
        }
        i--;
      }
      count++;
    }

    for(int i = 0; i<arr.length && arr[i]!=0; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();

  }
}
