package com.pcm.practice;

public class TestLinkedList {
    public static void main(String[] args) {
        System.out.println("Hi, this is from main()");

        // create head
        LinkedList head = new LinkedList(new LinkedList(null, "Link1"), "Head");
        System.out.println("Node --> " + head.getVal());

        //create link1
        LinkedList link1 = head.getNext();
        System.out.println("Node --> " + link1.getVal());

        //create link2
        LinkedList link2 = new LinkedList(null, "Link2");
        link1.setNext(link2);
        System.out.println("Node --> " + link2.getVal());

        LinkedList list = new LinkedList(null, "");
        list.search(head, "Link2");

    }

}
