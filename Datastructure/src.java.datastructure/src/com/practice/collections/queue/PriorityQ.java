package com.practice.collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(8);
        minHeap.offer(3);
        minHeap.add(2);
        System.out.println(" Min heap =" + minHeap.toString());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10, Collections.reverseOrder());
        maxHeap.offer(8);
        maxHeap.offer(3);
        maxHeap.offer(2);
        System.out.println(" Max heap =" + maxHeap.toString());
    }
}
