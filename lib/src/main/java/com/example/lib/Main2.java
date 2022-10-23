package com.example.lib;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.offer("Hello");
        queue.offer("bye");
        queue.offer("world");
        System.out.println(queue);
        queue.poll();
        System.out.print(queue);
    }
}
