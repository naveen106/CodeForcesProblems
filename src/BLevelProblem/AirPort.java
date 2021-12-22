package BLevelProblem;
//https://codeforces.com/contest/218/problem/B
import java.util.*;

public class AirPort {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = input.nextInt();

    if(k==1){
      int temp = input.nextInt();
      int sum = temp*(temp+1)/2 - (temp-n)*(temp-n + 1)/2;
      System.out.println(sum+" "+sum);
      return;
    }

    ArrayList<Integer> seats = new ArrayList<>();

    for(int i = 0; i<k; i++)
    seats.add(input.nextInt());


    ///4 3
    // 2 2 2

    Collections.sort(seats);
    int minprice = 0;
    int maxprice = 0;
    int persons = n;
    int temp = seats.get(0);
    int idx = 0;

    //minimum
    for(int i = 0; i<n && persons!=0; i++){
/*
        if(temp == 0) {
          temp = seats.get(idx);
          idx++;
        }

        minprice += temp;
        if(temp <= 1 && i+1 < k) {
          temp = seats.get(i + 1);
          idx = i+1;
        }
        else
        temp--;

        persons--;
        */
      int temp2 = seats.get(i);

      if(persons>=temp2) {
        minprice += temp2*(temp2+1)/2;
        persons -= temp2;
      }
      else{
        minprice += temp2*(temp2+1)/2 - (temp2-persons)*(temp2-persons+1)/2;
        persons=0;
      }
     }
    persons = n;

    int i = seats.size()-1;

    while(persons != 0) {
      int p = seats.get(i);
      if(i==0) {
        maxprice += p;
        persons--;
      }
      if(i>0 && p >= seats.get(i-1)) {
        maxprice += p;
        seats.set(i, --p);
        persons--;
      }

      if (i == 0)
      i = seats.size() - 1;

      if(i>0 && p<seats.get(i-1))
      i -= 1;

      else if(i+1 < seats.size() && seats.get(i+1) >= p)
      i=seats.size() - 1;

    }
    System.out.println(maxprice+" "+minprice);
  }
}
