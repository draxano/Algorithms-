package com.algodata.draxano;

import com.algodata.draxano.LinkedList.SinglyLinkedList;

public class main {
    public static void main(String args[]){
        // You can play around here with the sLL to get an intuition

        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        //System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 5);
        sLL.traverseSLL();
        //System.out.println(sLL.head.value);


    }
}


