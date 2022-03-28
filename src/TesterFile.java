import java.util.*;

class ThrowException extends Throwable{}

public class TesterFile{
  public static void main(String[] args) throws ThrowException {
  
    int a = 5, b = 7;
    
    while(b!=0){
      int carry = a&b;
      a=a^b;
      b=carry<<1;
    }
    //return a;
    System.out.println(a);
    
  }
}