package com.algodata.draxano.LinkedList;

public class doublyLinkedList {

    DoublyNode head;
    DoublyNode tail;
    int size;

    //creation method
    public DoublyNode cretaeDLL(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}
