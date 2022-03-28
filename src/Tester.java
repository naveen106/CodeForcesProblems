import java.util.*;
import java.io.*;



public class Tester {
  
  static PrintWriter out = new PrintWriter(System.out);
  
  public static int maxArea(int[] arr) {
    
    int maxArea = 0;
  
  
    int leftMost = 0;
    int rightMost = arr.length-1;
  
  
    while(leftMost < rightMost){
      int vertEdge = Math.min(arr[leftMost],arr[rightMost]);
      int width = leftMost-rightMost;
    
      maxArea = Math.max(maxArea, vertEdge*width);
    
      if(arr[leftMost]<arr[rightMost])
        leftMost++;
      else
        rightMost--;
    }
  
    return maxArea;
  }
  
  public static void main(String[] args) {
      int[]arr= {1,8,6,2,5,4,8,3,7};
      System.out.println(maxArea(arr));
   
  }
}
