package com.javarush.task.pro.task13.task1313;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;
        Node endNode = last.prev;
        node.prev = endNode;
        endNode.next = node;
        last.prev = node;

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
    HashMap<String, String> map = new HashMap<>();
    Collection<String> strings = map.values();
}

