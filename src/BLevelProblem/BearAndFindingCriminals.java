package BLevelProblem;
import java.util.*;
public class BearAndFindingCriminals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();

        int[]arr = new int[n];

        for(int i = 0; i<n; i++)
        arr[i] = input.nextInt();

        a -= 1; //subtract one, because

        int i = a-1;
        int j = a+1;
        int answer = 0;

        if(i>=0)
        while(i>=0 && j<n){
            if(arr[i] == 1 && arr[j] == 1)
            answer+=2;
            i--;
            j++;
        }

        //if j reached to end and 'i' hasn't reached 0. just like merge sort, where leftover values are added to new sorted array.
        while(i>=0){
            if(arr[i] == 1)
            answer++;
            i--;
        }

        //if 'j' hasn't reached end while 'i' has reached 0 then.
        while(j<n){
            if(arr[j] == 1)
            answer++;
            j++;
        }

        //if the city where officer is has criminal, then add '1' to answer.
        if(arr[a] == 1)
        answer++;

        System.out.println(answer);
    }
}
