package com.practice.collections.queue;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class DeQueue {
    Queue<Integer> queue = new ArrayDeque<>();
    Deque<Integer> linkDque = new LinkedBlockingDeque<>();

    public static void main(String[] args) {

        DeQueue dq = new DeQueue();
        System.out.println(dq.queue.add(1));
        System.out.println(dq.queue.poll());
        System.out.println(dq.queue.offer(2));
        System.out.println(dq.queue.peek());
        System.out.println("------ Linklist Deque --------");
        System.out.println(dq.linkDque.offer(1));
        System.out.println(dq.linkDque.add(2));
        System.out.println(dq.linkDque.offerFirst(3));
        System.out.println(dq.linkDque.offerLast(4));
        System.out.println(dq.linkDque.peek());
        System.out.println(dq.linkDque.pollFirst());
        System.out.println(dq.linkDque.pollLast());
        System.out.println(dq.linkDque.pop());

    }
}
