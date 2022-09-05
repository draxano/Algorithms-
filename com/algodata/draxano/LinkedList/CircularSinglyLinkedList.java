package com.algodata.draxano.LinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;


    //Creation method
    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    //Insertion Algorithm
    public void insertCSLL(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head == null){
            createCSLL(nodeValue);
            return;
        }else if (location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        }else if (location >= size){
            tail.next = node;
            tail = node;
            tail.next = head;
        }else{
            Node tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.next;  // this part confuses me a bit
                index++;
            }
        node.next = tempNode.next;
            tempNode.next = node;
        }
    size++;
    }

    //Traversal method
    public void traversal(){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);  //I think the temp node is only used for the iterations
                if (i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        } else {
            System.out.println("\n cSLL does not exist!");
        }
    }

    //Searching

    public boolean searchNode(int nodeValue){
        if (head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("found node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("node not found");
        return false;
    }

    //deletion of a node





}
