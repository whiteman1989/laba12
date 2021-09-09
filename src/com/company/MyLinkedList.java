package com.company;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public void addFirst(T data) {
        var oldHead = head;
        var node = new Node<T>(data);
        head = node;
        node.next = oldHead;
        if(tail == null) tail = node;
        size ++;
    }

    public void addLast(T data) {
        var oldTail = tail;
        var node = new Node<T>(data);
        if(oldTail != null) oldTail.next = node;
        tail = node;
        if(head == null) head = node;
        size ++;
    }

    public int getSize() {
        return size;
    }

    public T getElementByIndex(int index) {
        if(index-1 >= size || index < 0) throw new ArrayIndexOutOfBoundsException();
        var currentNode = head;
        int i = 0;
        while (i != index && currentNode != null) {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode.data;
    }

    public void removeElementByIndex(int index) {
        if(index-1 >= size || index < 0) throw new ArrayIndexOutOfBoundsException();
        Node<T> previousNode = null;
        var currentNode = head;
        int i = 0;
        while (i != index && currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
        if(previousNode!= null) previousNode.next = currentNode.next;
        if(head == currentNode) head = currentNode.next;
        if(tail == currentNode) tail = previousNode;
        size --;
    }

    public void addElementByIndex(int index, T data) {
        var node = new Node<T>(data);
        Node<T> previousNode = null;
        var currentNode = head;
        int i = 0;
        while (i < index && currentNode != null) {
            previousNode = currentNode;
            currentNode = currentNode.next;
            i++;
        }
        if(previousNode != null)previousNode.next = node;
        node.next = currentNode;
        if(index == 0) {
            head = node;
        }
        size++;

    }


}

class Node<T> {
    public Node next;
    public T data;

    public Node(T data) {
        this.data = data;
    }
}
