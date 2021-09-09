package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("Triangle");
        list.addLast("Square");
        list.addElementByIndex(1, "Circle");
        list.addElementByIndex(0, "Hexagon");

        System.out.println("---> list size: "+list.getSize());
        for (int i = 0; i < list.getSize(); i++ ) {
            System.out.println(list.getElementByIndex(i));
        }

        list.removeElementByIndex(2);

        System.out.println("\n---> list size after deleting: "+list.getSize());
        for (int i = 0; i < list.getSize(); i++ ) {
            System.out.println(list.getElementByIndex(i));
        }
    }
}
