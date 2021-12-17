package CodeForcesTraining;
//https://codeforces.com/contest/707/problem/A
import java.util.*;

public class BrainsPhotos {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int r = input.nextInt();
    int c = input.nextInt();

    String photo = "#Black&White";
    for(int i = 0; i<r*c; i++){
      String temp = input.next();
      if(temp.equals("C") || temp.equals("Y") || temp.equals("M")) {
        System.out.println("#Color");
        return;
      }
    }
    System.out.println(photo);
  }
}
