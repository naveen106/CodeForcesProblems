package CodeForcesTraining;
//https://codeforces.com/contest/218/problem/A
import java.util.*;
public class MountainScenery {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();

    int[]vertices = new int [2*n+1];

    for(int i = 0;i<2*n+1;i++)
      vertices[i] = input.nextInt();


    for(int i = vertices.length-2; i>=1 && k!=0; i--){
      if((i & 1) != 0 && vertices[i]-vertices[i+1] >= 2 && vertices[i]-vertices[i-1]>=2){
        vertices[i]--;
        k--;
      }
    }
    for(int ele : vertices)
    System.out.print(ele + " ");
  }
}
