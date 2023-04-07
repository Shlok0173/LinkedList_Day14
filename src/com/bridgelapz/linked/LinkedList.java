package com.bridgelapz.linked;

public class LinkedList {


    public Node head;
    public Node tail;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Adding new Node with values
    public void add(int datas){
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Search the Element
    public int search(int element) {
        if (head == null) {
            return -1;
        }
        int index = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == element) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(56);
        list.add(30);
        list.add(70);

        int Searchelement = 20;
        int ans = list.search(Searchelement);
        if (ans == -1) {
            System.out.println("Element not found in the Linked List");
        }
        else
            System.out.println("Element found in the Linked List at "+ans);
    }

	}
	

