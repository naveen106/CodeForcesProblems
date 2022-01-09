import java.util.*;
import java.io.*;
public class Tester {

  public static void main(String[] args) {
   ArrayList<Integer> list = new ArrayList<>();
   int t = 10;
   while(t-- > 0)
     list.add(t);

   list.add(5);
   list.add(5);

   Collections.replaceAll(list,5,90);
    System.out.print(list);

  }
}
