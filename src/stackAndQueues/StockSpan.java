package stackAndQueues;

import java.util.Stack;

public class StockSpan {
    public static int [] stock(int[] prices) {
         int n = prices.length;
         int [] result = new int[n];
         Stack<Integer> stack = new Stack<Integer>();
         for(int i = 0; i < n; i++) {
             while(!stack.isEmpty() && prices[stack.peek()] < prices[i]) {
                 stack.pop();

             }
             result[i] = (stack.isEmpty() ? i+1 :i-stack.peek());


             stack.push(i);
         }
         return result;
    }
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = stock(prices);

        // Print the results
        for (int span : spans) {
            System.out.print(span + " ");
        }

    }
}
