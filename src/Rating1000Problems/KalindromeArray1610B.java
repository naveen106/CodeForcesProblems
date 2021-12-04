package Rating1000Problems;

import java.util.*;
public class KalindromeArray1610B {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int numOfTests = input.nextInt();

    while(--numOfTests >= 0){

      int n = input.nextInt();

      ArrayList<Integer> arr = new ArrayList<>();
      boolean isKalindrome = true;
      for(int i = 0; i<n; i++){
        arr.add(input.nextInt());
      }

      for(int i = 0; i<n-i-1; i++){
        if(!arr.get(i).equals(arr.get(n-i-1))){
          isKalindrome = isKalindrome(arr, n, arr.get(i)) || isKalindrome(arr, n, arr.get(n - i-1));
          break;
        }
      }
      if(isKalindrome)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }

  static boolean isKalindrome(ArrayList<Integer> arr, int length, int num) {
    int i = 0, j = length-1;

    while( j >= i){

      if(arr.get(i) == num) {
        i++;
        continue;
      }

      else if(arr.get(j) == num){
        j--;
        continue;
      }


      if(!arr.get(i).equals(arr.get(j)))
      return false;
      i++;
      j--;
    }
    return true;
  }
}
