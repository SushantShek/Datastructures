package com.practice.collections.stack;

import java.util.EmptyStackException;

public class ArrayAsStack<Integer> {
    static int MAX = 100;
    static int[] stack = new int[MAX];

    static int head = -1;


    public static int push(int value) {
        if (head == 100) {
            throw new StackOverflowError();
        }
        stack[++head] = value;
        return value;
    }

    public static int pop() {
        if (head == -1) {
            throw new EmptyStackException();
        }
        int x = stack[head--];
        return x;
    }

    public static int peek() {
        if (head == -1) {
            throw new EmptyStackException();
        }
        int x = stack[head];
        return x;
    }

    public int search(int value) {
        int index=-1;
        if (head < 0)
            return -1;
        else{
            for(int x : stack){
                index++;
                if(x == value)
                    break;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        ArrayAsStack stack = new ArrayAsStack();

        System.out.println("push " + push(1));
        System.out.println("push " + stack.push(2));
        System.out.println("push " + stack.push(3));
        System.out.println("peek " + stack.peek());
        System.out.println("pop " + stack.pop());
        System.out.println("peek " + stack.peek());
        System.out.println("search 1 " + stack.search(1));
    }
}
