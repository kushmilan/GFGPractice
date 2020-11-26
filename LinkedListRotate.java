
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

class LinkedListRotate {

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
        LinkedListRotate list = new LinkedListRotate();
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
        Node current = head;
        int count = 1;
        while(count < k && current != null){
            current = current.next;
            count++;
        }

        if(current == null){
            return head;
        }

        Node KthNode = current;
        while(current.next != null){
            current = current.next;
        }

        current.next = head;
        head = KthNode.next;
        Kthnode.next = null;
        return head;
    }

    static Node rotategivenSize(Node node, int k){
        if(k==0){
            return node;
        }
        Node current = node;
        Node prev = null;
        Node next = null;

        int count  = 0;
        while(count < k && current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if(next!=null){
            node.next =  rotategivenSize(next, k);
        }

        return prev;
    }

    static int intersectPoint(Node headA, Node headB){
        headA = reverse(headA);
        headB = reverse(headB);        
        int num = 0;
        while(headA.data == headB.data && headA != null && headB != null){
            if(headA.data == headB.data){
                num = headA.data;
            }
        }
        if(headA==null && headB == null){
            return -1;
        }else{
            return num;
        }
    }
    
    static Node reverse(Node head){
        Node current = head;
        Node next = null;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}