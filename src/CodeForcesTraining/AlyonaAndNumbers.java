package CodeForcesTraining;
import java.util.*;

public class AlyonaAndNumbers {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int m = input.nextInt();

    long count = 0;
    for(int k = 1; k<=n; k++){
      long r = k%5;
      long sum = m+r;
      count += sum/5;
    }
    System.out.println(count);
  }
}
