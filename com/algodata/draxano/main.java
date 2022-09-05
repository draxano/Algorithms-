package com.algodata.draxano;

import com.algodata.draxano.LinkedList.CircularSinglyLinkedList;
import com.algodata.draxano.LinkedList.SinglyLinkedList;

public class main {
    public static void main(String args[]){
        // You can play around here with the sLL to get an intuition

        CircularSinglyLinkedList cSLL = new CircularSinglyLinkedList();

        cSLL.createCSLL(5);
        System.out.println(cSLL.head.value);
        System.out.println(cSLL.head.next.value);



    }
}


