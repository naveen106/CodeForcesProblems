import java.util.*;

class ThrowException extends Throwable{}

public class TesterFile{
  public static void main(String[] args) throws ThrowException {
     String str = new String("123");
    System.out.println(str.toString());
    
  }
}