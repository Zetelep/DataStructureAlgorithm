package DataStructures;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
        Queue<Double> q = new PriorityQueue<>();
        q.offer(3.0);
        q.offer(1.5);
        q.offer(2.0);
        q.offer(0.5);
        //The queue will be in order
        System.out.println(q); //[0.5, 1.5, 2.0, 3.0]

        Queue<String> q2 = new PriorityQueue<>(Collections.reverseOrder());
        q2.offer("C");
        q2.offer("A");
        q2.offer("D");
        q2.offer("B");
        System.out.println(q2);// [D, C, B, A]
    }
}
