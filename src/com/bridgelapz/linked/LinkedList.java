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
    public void add(int datas) {
        Node newNode = new Node(datas);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Insert the newNode With given index
    public void insert(int c) {
        Node newNode = new Node(c);
        Node temp = head;
        boolean b = true;
        while (b) {
            if (temp.data == 30) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
            b = true;
        }
    }

    // Display the allNodes with value
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(56);
        list.add(30);
        list.add(70);
        list.insert(40);

        list.display();
    }

	}
	

