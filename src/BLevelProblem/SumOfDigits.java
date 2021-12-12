package BLevelProblem;
import java.util.Scanner;

//https://codeforces.com/contest/102/problem/B
public class SumOfDigits {
   public static void main(String[] args){
//
//     Scanner input = new Scanner(System.in);
//     String s = input.next();
//     int sum=0;
//
//     for(int i=0;i<s.length();i++)
//       sum+=s.charAt(i)-'0';
//
//     if(s.length()==1){
//       System.out.println(0);
//       return;
//     }
//
//     int a=0;
//     int count=1;
//
//     for(int i=0;sum>=10;i++){
//       while(sum!=0){
//         a+=sum%10;
//         sum/=10;
//       }
//       sum=a;
//       a=0;
//       count++;
//     }
//     System.out.println(count);

     Scanner input = new Scanner(System.in);
     char[] charArr = input.next().trim().toCharArray();

     int result = 0;
     //while resulting sum is not of length 1, length of array is also not 1,
     while(charArr.length > 1) {
       int sum = 0;
       for(char c : charArr)
         sum += c - '0';
       charArr = Integer.toString(sum).toCharArray(); //new elements(digits of resulting 'sum') added to charArr.
       result++;  //number of spells
     }

   System.out.println(result);
  }
}
