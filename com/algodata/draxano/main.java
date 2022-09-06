package com.algodata.draxano;

import com.algodata.draxano.LinkedList.CircularSinglyLinkedList;
import com.algodata.draxano.LinkedList.SinglyLinkedList;

public class main {
    public static void main(String args[]){
        // You can play around here with the sLL to get an intuition

        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();

        cSLL.createCSLL(5);
        cSLL.insertCSLL(4,0);
        cSLL.insertCSLL(6,1);
        cSLL.insertCSLL(7,8);
        cSLL.traversal();
        cSLL.deleteNode(0);
        cSLL.traversal();



    }
}


