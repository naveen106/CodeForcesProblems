
package ImpConceptsProbs;
import java.io.*;
import CLevelProbsDiv2_3.FastScanner;


public class ReturnAllSubsetsRecursively {
  
  
  // Return a 2D array that contains all the subsets
  public static int[][] subsets(int input[]) {
    return helper(0,input);
  }
  
  private static int[][] helper(int startIndex, int[]input){
    
    if(startIndex == input.length){
      //int arr = new int[0][0];
      return new int[1][0];
    }
    
    int[][] smallOutput = helper(startIndex+1, input);
    int[][] output = new int[smallOutput.length*2][];
    int start = 0;
  
     /*
        for (int i = 0; i < smallOutput.length; i++) {
        	output[start++] = smallOutput[i];
      	}
  
        for (int i = 0; i < smallOutput.length; i++) {
            output[start] = new int[smallOutput[i].length+1];
            output[start][0] = input[startIndex];

            for (int j = 0; j<smallOutput[i].length; j++) {
                  output[start][j+1] = smallOutput[i][j];
            }
            start++;
        }
		*/
    
    for (int[] arr : smallOutput)
      output[start++] = arr;
  
    for (int[] arr : smallOutput){
      output[start] = new int[arr.length + 1];
      output[start][0] = input[startIndex];
    
      System.arraycopy(arr, 0, output[start], 1, arr.length);
      start++;
    }
  
    return output;
  }
  
  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out);
    int[] input = takeInput();
    int[][] output = subsets(input);
    for (int[] ints : output) {
      for (int anInt : ints) {
        out.print(anInt + " ");
      }
      out.println();
    }
    out.close();
  }
  
  public static int[] takeInput() {
    FastScanner s = new FastScanner();
    int size = s.nextInt();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = s.nextInt();
    }
    return arr;
  }
}
