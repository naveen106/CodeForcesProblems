package CodeForcesTraining;
import java.util.Scanner;
public class VanyaAndFence {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int totalFriends = input.nextInt();
    int fenceHeight = input.nextInt();
    int count = 0;

    while(totalFriends-- > 0){
      int height = input.nextInt();

      if(height > fenceHeight)
      count++;

      count++;
    }
    System.out.println(count);
  }
}
