import java.util.*;

public class Tester {
  public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    LinkedListNode<Integer> head = new LinkedListNode<>(input.nextInt());
    LinkedListNode<Integer> temp2 = head;
    for(int i = 1; i<20; i++){
      temp2.next = new LinkedListNode<>(input.nextInt());
      temp2 = temp2.next;
    }

    if(head.next == null){
      head.data+=1;
      print(head);
      return;
    }

    StringBuilder str = new StringBuilder();
    LinkedListNode temp = head;


    while(temp.next != null){
      str.append(temp.data);
      temp = temp.next;
    }
    str.append(temp.data);
    LinkedListNode tail = temp;
    //temp = head.next;
    char a = str.charAt(str.length()-1);
    if(a == '9'){
      recursion(head);
    }

    else{
      tail.data = (str.charAt(str.length()-1) - '0') + 1;
    }
    print(head);

  }

  static void print(LinkedListNode<Integer>head){
    LinkedListNode temp = head;
    while(temp!=null){
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }

  static int num = 0;
  static void recursion(LinkedListNode<Integer> temp){

    if(temp == null){
      return;
    }

    recursion(temp.next);

    if(num == 1){
      temp.data += 1;
      if(temp.data + 1 > 9)
        num = 1;
      else
        num = 0;
    }

    if(temp.next == null){
      if(temp.data + 1 > 9)
        num = 1;
      temp.data += 1;
    }
  }

  static class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
      this.data = data;
    }
  }
}
