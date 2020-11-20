package com.practice.collections.stack;

import java.util.LinkedList;
import java.util.Stack;

public class Stacks {

    public static void main(String [] args){

        Stack<Integer> stack = new Stack<Integer>();

        System.out.println("push " + stack.push(1));
        System.out.println("push "  + stack.push(2));
        System.out.println("push " + stack.push(3));
        System.out.println("peek " + stack.peek());
        System.out.println("pop " +stack.pop());
        System.out.println("peek " +stack.peek());
        System.out.println("search 1 " +stack.search(1));
        System.out.println("caoacity " +stack.capacity());
    }
}
