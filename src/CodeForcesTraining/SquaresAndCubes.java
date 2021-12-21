package CodeForcesTraining;
import java.util.*;
public class SquaresAndCubes {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){
      int num = input.nextInt();
      HashSet<Long>set = new HashSet<>();
      for(int i = 1; i<33000;i++){
        if(i*i > num)
          break;

        long num1 = i*i;
        if(num1 <= num)
          set.add(num1);

        long num2 = (long)i*(long)i*(long)i;
        if(num2 <= num)
          set.add(num2);
      }
      System.out.println(set.size());
    }
  }
}
