
/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-03-30 23:07:38
 * @modify date 2020-03-30 23:07:38
 * @desc [description]
 */

import java.util.*;
import java.io.*;
import java.lang.*;

class LinkedListReverse {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arrS[] = br.readLine().split("\\s+");
        int k = Integer.parseInt(br.readLine());
        LinkedListReverse list = new LinkedListReverse();
        list.head = new Node(Integer.parseInt(arrS[0]));
        Node previousNode = list.head;
        for (int i = 1; i < n; i++) {
            Node newNode = new Node(Integer.parseInt(arrS[i]));
            previousNode.next = newNode;
            previousNode = newNode;
        }
        // printList(list.head);
        // System.out.println(getMiddle(list.head));
        // printList(reverseList(list.head));
        printList(rotate(list.head, k));
    }

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    static int getMiddle(Node head) {
        Node n = head;
        int num = 0;
        int size = 0;
        while (n != null) {
            size++;
            n = n.next;
        }
        n = head;
        if (size % 2 == 0) {
            for (int i = 0; i <= size / 2; i++) {
                num = n.data;
                n = n.next;
            }
        } else {
            for (int i = 0; i < (size / 2) + 1; i++) {
                num = n.data;
                n = n.next;
            }
        }
        return num;
    }

    static Node reverseList(Node head) {
        Node next = null;
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode != null) {
            next = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = next;
        }
        head = previousNode;
        return head;
    }

    static Node rotate(Node head, int k) {
        if(k == 0){
            return head;
        }
        Node previous = null;
        Node first = head;
        Node n = head;
        while (k > 0 && n != null) {
            previous = n;
            n = n.next;
            k--;
        }
        if (k >=1 ) {
            return head;
        }
        previous.next = null;
        head = n;
        while (n.next != null) {
            n = n.next;
        }
        n.next = first;
        return head;
    }

}