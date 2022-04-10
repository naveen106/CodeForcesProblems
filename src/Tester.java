import java.util.*;
import java.io.*;


public class Tester {
  
  
  
  public static void main (String[] args) {
  
    int[]arr = {1,2,3,1};
  
    int left = 0;
    int right = arr.length - 1;
  
    int mid = 0;
  
    while(left <= right){
    
      mid = left + (right-left)/2;
    
      if(arr[mid+1] > arr[mid])
        left = mid+1;
      else
        right = mid-1;
    
    }
    
    System.out.println(mid);
    
  }
  
  
}
