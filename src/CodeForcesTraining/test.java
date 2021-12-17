package CodeForcesTraining;
import java.util.*;
public class test {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int k = input.nextInt();

      String[] arr = new String[n+k];

      for(int i = 0; i<n; i++)
        arr[i] = input.next();

      int count=0;

      for(int i = 0; i<arr.length-k; i++){

        int j = i+1;
        int count2 = 0;

        while(count2 < k){

          if(arr[j]!= null && arr[i].length() == arr[j].length())
            count++;
          j++;
          count2++;
        }
      }

      System.out.println(count);
  }
}
