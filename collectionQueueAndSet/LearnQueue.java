package collectionQueueAndSet;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30); 
        q.offer(40);


        // iteration------>

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }
            //    <-------- iteration
        

        System.out.println(q);

        // remove becuase queue stands for fifo
        System.out.println(q.poll());
        System.out.println(q);



        // kaun s elemnt bahar nikalne wal hai
        System.out.println(q.peek());
        System.out.println(q);

    }
}
