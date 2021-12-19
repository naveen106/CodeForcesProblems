package BLevelProblem;
import java.util.*;
public class ReplaceTheNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int q = input.nextInt();
    int []arr = new int[q];
    String []arr2 = new String[q];
    ArrayList<Integer>count = new ArrayList<>();


    for(int i = 0; i<q; i++){

      int first = input.nextInt();
      if(first == 1)
      arr[i] = input.nextInt();

      else{
        int second = input.nextInt();
        int third = input.nextInt();
        arr2[second] = arr2[second].concat(Integer.toString(third));
        count.add(i);
      }
    }

    for(int i = 0; i<arr.length && arr[i]!=0; i++){

    }



    for(int i = 0; i<arr.length && arr[i]!=0; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();

  }
}
