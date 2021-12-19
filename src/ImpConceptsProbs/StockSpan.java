/*
Stock Span
Send Feedback
Afzal has been working with an organization called 'Money Traders' for the past few years.
The organization is into the money trading business. His manager assigned him a task.
For a given array/list of stock's prices for N days, find the stock's span for each day.
The span of the stock's price today is defined as the maximum number of consecutive days(starting from today and
going backwards) for which the price of the stock was less than today's price.
For example, if the price of a stock over a period of 7 days are [100, 80, 60, 70, 60, 75, 85],
then the stock spans will be -     [1, 1, 1, 2, 1, 4, 6].
Explanation:
On the sixth day when the price of the stock was 75, the span came out to be 4,
because the last 4 prices(including the current price of 75) were less than the current or the sixth day's price.

Similarly, we can deduce the remaining results.
Afzal has to return an array/list of spans corresponding to each day's stock's price. Help him to achieve the task.
 */
//  THE SPAN FOR A SINGLE STARTS FROM '1' (NOT '0')
package ImpConceptsProbs;
import java.util.*;

public class StockSpan {
  public static void main(String[] args) {
    int[]price = {60, 70, 80, 100, 90, 75, 80, 120};
    //answer should be = 1 2 3 4 1 1 2 8
    int[] span = new int [price.length];
    Stack<Integer> stk = new Stack<>();

    for(int i = 0; i < price.length; ++i){
      while(!stk.isEmpty() && price[stk.peek()] < price[i])
        stk.pop();

      if(stk.isEmpty())
        span[i] = i + 1;

      else
        span[i] = i - stk.peek();
      stk.push(i);

    }
    System.out.println(Arrays.toString(span));
  }
  /*
  * This question is important, because it teaches you how to use stack to keep track of previous index(or elements in some problems)
  * A naive approach would be to just iterate backwards till you find element that is not greater than the current.
  * But with this approach we are doing the same work again, we need to stop doing that work again and again, instead we should use what we have already
  * That is where the stack comes here.
  * */
}