package stackAndQueues;

import java.util.Stack;

public class SortStack {

    public void sortedInsert(Stack<Integer> stack,int x) {

        //if stack is empty or x is greater the push x
        if (stack.isEmpty()|| x>stack.peek()) {
            stack.push(x);
            return;
        }

        //else x is lesser the pop the top element and check with next top
        //using recursion
        int temp=stack.pop();
        sortedInsert(stack,x);
        stack.push(temp);

    }
    public void sortStack(Stack<Integer> stack) {
       if (stack.isEmpty()) {
           return;
       }

             int temp=stack.pop();
             sortStack(stack);
            sortedInsert(stack,temp);


    }
    public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();
         stack.push(1);
         stack.push(5);
         stack.push(2);
         stack.push(4);
         stack.push(3);

         SortStack sort = new SortStack();
         sort.sortStack(stack);
         while (!stack.isEmpty()) {
             System.out.println(stack.pop());

         }


    }
}
