//remove package line when submitting.
package Rating1000Problems;
import java.util.*;
public class Problem_1611C {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int testCases =  input.nextInt();

    while(--testCases >= 0){
      int length = input.nextInt();
      ArrayList<Integer> p = new ArrayList<>();

      for(int i = 0; i<length; i++)
      p.add(input.nextInt());

      if(p.get(0) != length && p.get(length-1) != length) {
        System.out.println(-1);
      }

      else
      for(int i = length-1; i>=0; i--)
      System.out.print(p.get(i) + " ");
      System.out.println();
    }

  }
}
