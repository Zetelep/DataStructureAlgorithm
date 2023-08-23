package DataStructures;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<>();
        //Linkedlist can be acted like Stack or Queue
        LL.offer("A");
        LL.offer("B");
        LL.offer("C");
        LL.offer("D");
        LL.offer("E");

        LL.add(2,"F");
        System.out.println(LL); //[A, B, F, C, D, E]
        LL.remove("F");
        System.out.println(LL); //[A, B, C, D, E]
        System.out.println(LL.peekFirst()); //A
    }
}
