package stackAndQueues;

import java.util.Stack;

public class Queue1 {
    Stack <Integer> stack=new Stack<>();

    public void enqueue(int item) {
        stack.push(item);
    }
    Stack<Integer> stack2=new Stack<>();
    public int dequeue() {
        while(!stack.isEmpty()) {
            stack2.push(stack.pop());

        }
        int x= stack2.pop();
        while(!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
        return x;

    }
    public static void main(String[] args) {
      Queue1 q=new Queue1();
      q.enqueue(1);
      q.enqueue(2);
      q.enqueue(3);
      q.enqueue(4);
      q.enqueue(5);

      System.out.println(q.dequeue());
      System.out.println(q.dequeue());

    }
}
