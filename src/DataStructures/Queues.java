package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        //offer() -> adding item into the queue
        q.offer("March7");
        q.offer("Kafka");
        q.offer("Blade");
        q.offer("Luocha");
        System.out.println(q); //[March7, Kafka, Blade, Luocha]

        //poll() -> removeing the index 0 item
        q.poll();
        q.poll();
        System.out.println(q); //[Blade, Luocha]

        //contains() -> checking an item is there or not
        System.out.println(q.contains("Blade")); //true

        //size() -> Checking the size of queue
        System.out.println(q.size()); //2
    }
}
