package com.practice.collections.queue;

public class CustomCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(5);
          boolean param_1 = obj.enQueue(4);
          boolean param_2 = obj.deQueue();
          int param_3 = obj.Front();
          int param_4 = obj.Rear();
          boolean param_5 = obj.isEmpty();
          boolean param_6 = obj.isFull();
    }
        private static class MyCircularQueue {

            int[] myQueue;
            int start=-1;
            int end=-1;
            int size;
            /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
                myQueue = new int[k];
                size =k;
            }

            /** Insert an element into the circular queue. Return true if the operation is successful. */
            public boolean enQueue(int value) {
                if (isFull()) {
                    return false;
                }
                if (isEmpty() == true) {
                    start = 0;
                }
                end = (end + 1) % size;
                myQueue[end] = value;
                return true;

            }

            /** Delete an element from the circular queue. Return true if the operation is successful. */
            public boolean deQueue() {
                if(!isEmpty()){
                    if (start == end) {
                        start = -1;
                        end = -1;
                        return true;
                    }
                    start = (start + 1) % size;
                    return true;
                }
                return false;



            }

            /** Get the front item from the queue. */
            public int Front() {
                if( isEmpty()){
                    return -1;
                }
                return myQueue[start];

            }

            /** Get the last item from the queue. */
            public int Rear() {
                if( isEmpty()){
                    return -1;
                }
                return myQueue[end];
            }

            /** Checks whether the circular queue is empty or not. */
            public boolean isEmpty() {
                return (start == -1);

            }

            /** Checks whether the circular queue is full or not. */
            public boolean isFull() {
                return ((end + 1) % size) == start;
            }
        }

    }

