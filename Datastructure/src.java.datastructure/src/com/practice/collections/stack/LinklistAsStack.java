package com.practice.collections.stack;

import java.util.LinkedList;

public class LinklistAsStack {

    LinkedList<Integer> stack = new LinkedList<>();

    StackNode head;

    int v =2;

    private class StackNode{
        int value;
        StackNode next;
        StackNode(int value){
            this.value = value;
        }
    }

    public int push(int data)
    {
        StackNode newNode = new StackNode(data);

        if (head == null) {
            head = newNode;
        }
        else {
            StackNode temp = head;
            head = newNode;
            newNode.next = temp;
        }
        return data;
    }

    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (head == null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = head.value;
            head = head.next;
        }
        return popped;
    }

    public int peek()
    {
        if (head == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return head.value;
        }
    }
    public static void main(String[] args) {

        LinklistAsStack stack = new LinklistAsStack();

        System.out.println( "push " +stack.push(4));
        System.out.println("push " + stack.push(7));
        System.out.println("push " + stack.push(3));
        System.out.println("peek " + stack.peek());
        System.out.println("pop " + stack.pop());
        System.out.println("peek " + stack.peek());
    }
}
