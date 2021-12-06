package CodeForcesTraining;

import java.util.Locale;
import java.util.Scanner;
public class Word {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.next();
    int size = str.length();
    int uppercase = 0;

    for(int i = 0; i<size; i++){
      if(str.charAt(i) <= 90)
        uppercase++;
    }

    //if str length is even
    if((size^1) == size + 1){
      if(uppercase <= size/2)
        str = str.toLowerCase();

      else if(uppercase > size/2)
        str = str.toUpperCase();
    }

    if((size^1) == size - 1){
      if(uppercase <= size/2)
        str = str.toLowerCase();

      else if(uppercase >= size/2 + 1)
        str = str.toUpperCase();
    }
    System.out.println(str);
  }
}
