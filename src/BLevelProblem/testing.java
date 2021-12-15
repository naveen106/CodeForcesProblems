package BLevelProblem;
import java.util.*;
import java.lang.Math;
public class testing {
  public static void main(String[] args) {

    int[]slimes = {13, 57, 43, 50, 10};
    int n = 5;
    Arrays.sort(slimes);

    int temp = slimes[slimes.length-1] + slimes[slimes.length-2];
    int cost = slimes[slimes.length-1] * slimes[slimes.length-2];

    for(int i = slimes.length-3; i>=0; i--){

      if(temp < 100){
        temp  = slimes[i] + temp;
        cost += slimes[i] * temp;
        i--;
      }

      else{
        temp = slimes[i] + slimes[i-1];
        cost+= slimes[i] * slimes[i-1];
        i--;
      }
    }
    System.out.println(cost);
  }
}
