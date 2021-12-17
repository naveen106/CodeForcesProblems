package CodeForcesTraining;
//import java.util.*;
public class test {
    public static void main(String[] args) {
      int n = 4, k = 2;
      String[]arr = {"IVA","IVO","ANA","TOM","",""};

      int count=0;

      for(int i = 0; i<arr.length-k; i++){
        int j = i+1;
        int count2 = 0;

        while(count2 < k){
          if(arr[i].length() == arr[j].length())
            count++;
          j++;
          count2++;
        }
      }

      System.out.println(count);
  }
}
