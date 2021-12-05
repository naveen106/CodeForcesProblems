package CodeForcesTraining;
import java.util.Scanner;
public class AntonyAndDanik {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numOfGames = input.nextInt();
    String whoWon = input.next();

    int antony = 0;
    //int danik = 0;
    for(int i = 0; i<numOfGames; i++){
      if(whoWon.charAt(i) == 'A')
        antony++;
    }

    //if numOfGames is even
    if((numOfGames ^ 1) == numOfGames + 1){
      if(antony > numOfGames/2)
      System.out.println("Anton");

      else if(antony == numOfGames/2)
        System.out.println("Friendship");

      else
        System.out.println("Danik");
    }

    //else if numOfGames is odd
    else{
      if(antony <= numOfGames/2)
      System.out.println("Danik");

      else
        System.out.println("Anton");
    }
  }
}
