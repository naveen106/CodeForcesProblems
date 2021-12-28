import java.util.HashMap;
import java.util.*;

public class Tester {
  public static void main(String[] args) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 1; i<10; i++){
      map.put(i,i+5);
    }
    for(int i = 1; i<10; i++){
      System.out.print(map.get(i) + " ");
    }
  }
}
