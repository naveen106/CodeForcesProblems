package CodeForcesTraining;
//http://codeforces.com/contest/381/problem/A
import java.util.ArrayList;
import java.util.Scanner;
public class SerejaAndDim {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int sereja = 0;
    int dima = 0;

    ArrayList<Integer> cards = new ArrayList<>();
    while(n-- > 0){
      cards.add(input.nextInt());
    }

 //   Collections.sort(cards);
    int i = cards.size()-1;
    int j = 0;
    int temp = 0;

    while(i>=j){

      if(cards.get(i) >= cards.get(j)){
        if(temp == 0)
        sereja = sereja + cards.get(i);

        else
        dima = dima + cards.get(i);

        i--;
      }

      else if(cards.get(j) > cards.get(i)) {
        if(temp == 0)
        sereja = sereja + cards.get(j);

        else
        dima = dima + cards.get(j);

        j++;
      }

      if(temp == 0)
      temp = 1;
      else
      temp = 0;
    }
    System.out.println(sereja + " " + dima);
  }
}
