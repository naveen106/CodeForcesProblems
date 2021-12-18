package CodeForcesTraining;
//https://codeforces.com/contest/785/problem/A
import java.util.*;
public class AntonAndPolyhedrons {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int faces = 0;
    while(n-- > 0){
      String temp = input.next();
      switch (temp) {
        case "Icosahedron" : faces += 20;
        break;
        case "Dodecahedron" : faces += 12;
        break;
        case "Octahedron" : faces += 8;
        break;
        case "Cube" : faces += 6;
        break;
        default : faces += 4;
      }
    }
    System.out.println(faces);
  }
}
