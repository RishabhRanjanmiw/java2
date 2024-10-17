package collectionQueueAndSet;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerFirst(20);
        dq.offerLast(30);
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
        System.out.println(dq.peekLast());
//    ------>Stack operation<-----------
 ArrayDeque<Integer> stack = new ArrayDeque<>();
          stack.push(10);
          stack.push(20);
          stack.push(30);
         stack.push(40);
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack.peek());
//   ----------->End<---------------


//   -------------->Queue operation--------------

ArrayDeque<Integer> queue = new ArrayDeque<>();
queue.offer(100);
queue.offer(200);
queue.offer(300);
queue.offer(400);
queue.offer(500);
System.out.println(queue);
System.out.println(queue.poll());

// ------------>End<--------------
    }
}
