package org.collection;

public class LinkedListStack {

    Node head;

    class Node{
        int value;
        Node next;
    }

    LinkedListStack(){
        head = null;
    }

    // push to the begining

    public void push(int value){
        Node extraNode = head;
        head = new Node();
        head.value = value;
        head.next = extraNode;
    }

    public int pop(){
        if( head == null){
            System.out.println("Stack is empty");
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public static void main(String args[]){
        LinkedListStack lls = new LinkedListStack();
    //    lls.pop();

        lls.push(10);
        lls.push(20);
        lls.push(30);
        lls.push(40);

        System.out.println(lls.pop());
    }
}
