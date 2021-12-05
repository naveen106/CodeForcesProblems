package CodeForcesTraining;
//https://codeforces.com/contest/405/problem/A
//this problem was the simplest I came to...I noticed that I just had to sort the array...and their it is, the answer!!!
import java.util.*;
public class GravityFlip {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numOfCols = input.nextInt();

    ArrayList<Integer> arr = new ArrayList<>();

    for(int i = 0; i<numOfCols; i++)
    arr.add(input.nextInt());

    Collections.sort(arr);

    for(int i = 0; i<numOfCols; i++)
    System.out.print(arr.get(i) + " ");

    System.out.println();
  }
}