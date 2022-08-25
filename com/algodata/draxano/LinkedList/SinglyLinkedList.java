package com.algodata.draxano.LinkedList;
// analyse and understand what's going on
// java already has this sorted (Node and Linked list, we are learning all this for algorithms' sake)
public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert method in Singly Linked List (Algorithm):
    // This is your insertion bible study this in depth.
    // Time and space complexity T(N), S(1), where T = time and S = space
    public void insertInLinkedList(int nodeValue, int location){
        Node node = new Node();  // making sure that we have a linked list
        node.value = nodeValue; // making sure that our nod's value is what we have given in to it
        if(head == null){ // meaning if we don't have a linked list
            createSinglyLinkedList(nodeValue); // we will create single linked list if we don't have one, with the given value
            return;
        } else if (location == 0){ // if we inset it at the beginning
            node.next = head;
            head = node;
        } else if (location >= size){
            node.next = null;
            tail.next = node;
            tail = node;
        }else {
            Node tempNode = head;
            int index = 0;
            while(index < location -1){
                tempNode = tempNode.next;  //temporary node
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }


    /*
    * First node isn't HEAD but one after that
    * Tails do have a value, but HEAD doesn't
    * Taill has next (reference) null since the train finsihes after the tail
    *
    * */

    // Traversal of Singly Linked List
    public void traverseSLL(){
        if(head == null){
            System.out.println("SLL doesn't exist");
        }
        else {
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Searching in Singly Linked Lists
    public boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for (int i = 0; i < size; i++){
                if (tempNode.value == nodeValue){
                    System.out.println("found the node at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found! ");
        return false;
    }

    // Deletion
    public void deletionOfNode(int location){
        if (head == null){
            System.out.println("SSL doesn't exist");
            return;
        }else if (location == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }else if (location >= size){
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++){
                tempNode = tempNode.next;

            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }
        else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++ ){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    //Deletion of entire list
    public void deleteSLL(){
        head = null;
        tail = null;
        System.out.println("SLL deletion is successful");
    }




}
