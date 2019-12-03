package com.pcm.practice;

public class LinkedList {
    LinkedList next;
    String val;
    LinkedList current;

    public LinkedList(LinkedList next, String val) {
        this.next = next;
        this.val = val;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public String getVal() {
        return val;
    }

    public LinkedList getCurrent() {
        return this.current;
    }

    public boolean search(LinkedList head, String searchStr) {
        LinkedList previous = null;
        LinkedList next = null;
        LinkedList current = head;
        boolean notFound = true;
        boolean found = false;

        while(notFound && current.getNext() != null) {
            System.out.println("compared out put " + searchStr.compareTo(current.getVal()) );
            int var = searchStr.compareTo(current.getVal());
            if(var == 0) {
                notFound = false;
            } else {
                next = current.getNext();
                previous = current;
                current = next;
            }
        }

        if(current != null) {
            if(searchStr.equals(current.getVal())) {
                found = true;
                this.current = current;
            } else {
                found = false;
            }
        }
        if(found) {
            System.out.println("Search text found in Link:" + current);
            System.out.println("Link value --> " + current.getVal());
        }

        return found;
    }
}
