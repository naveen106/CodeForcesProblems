package BLevelProblem;
import java.util.*;

public class MissingBigram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();

    while(t-- > 0){
      int len = input.nextInt();
      input.nextLine();
      String str = input.nextLine();
      StringBuilder newStr = new StringBuilder();

      newStr.append(str.charAt(0)).append(str.charAt(1));

      for(int i = 3; i<str.length()-1; i++){
        if(str.charAt(i+1) == ' ')
          newStr.append(str.charAt(i));
      }
      newStr.append(str.charAt(str.length()-1));

      String[] arr = str.split(" ");
      String finalStr = "";
      for(int i=0; i<arr.length; i++){
        String temp1 = newStr.substring(i,i+2);

        if(!temp1.equals(arr[i])){
        finalStr = newStr.substring(0, i+1) + arr[i].charAt(0) + newStr.substring(i+1);
        break;
        }
      }

      if(finalStr == "")
        finalStr = String.valueOf(newStr.append(newStr.charAt(newStr.length()-1)));

      if(len == 3 && finalStr.length() > 3)
      finalStr = finalStr.substring(0,finalStr.length()-1);

      System.out.println(finalStr);
    }

  }
}
