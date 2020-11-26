/**
 * @author [Milan Kushwah]
 * @email [kushmilan4@gmail.com]
 * @create date 2020-05-06 19:43:51
 * @modify date 2020-05-06 19:43:51
 * @desc [description]
 */


import java.util.*;
import java.io.*;
import java.lang.*;

class LinkedList{

    Node head;
    
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String arrS[] = br.readLine().split("\\s+");
        LinkedList list = new LinkedList();
        list.head = new Node(Integer.parseInt(arrS[0]));
        Node previousNode = list.head;
        for(int i = 1; i < n; i++){
            Node newNode  = new Node(Integer.parseInt(arrS[i]));
            previousNode.next = newNode;
            previousNode = newNode;
        }
        //printList(list.head);
        System.out.println(getMiddle(list.head));
    }

    static void printList(Node n){
        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    static int getMiddle(Node head){
        Node n = head;
        int num = 0;
        int size = 0;
        while(n!=null){
            size++;
            n = n.next;
        }
        n = head;
        if(size%2 == 0){
            for(int i = 0; i <= size/2; i++){
                num = n.data; 
                n = n.next;
            }
        }else{
            for(int i = 0; i < (size/2)+1; i++){
                num = n.data; 
                n = n.next;
            }
        }
        return num;
    }

    Node addTwoLists(Node h1, Node h2){
        Node last = new Node(1);
        int lengthA = getLength(h1);
        int lengthB = getLength(h2);
        Node a = h1;
        Node b = h2;
        int carry = 0;
        if(lengthA > lengthB){
            while(b!=null){
                int sum = a.data + b.data;
                if(sum >= 10){
                    sum = sum % 10;
                    if(carry == 1){
                        a.data = sum + 1;
                    }else{
                        a.data = sum;
                    }
                    carry = 1;
                }else{
                    if(carry == 1){
                       if(sum+1 == 10){
                            a.data = 0;
                            carry = 1;    
                        }else{
                            a.data = sum+1;
                            carry = 0;    
                        } 
                    }else{
                        a.data = sum;
                    }
                }
                a = a.next;
                b = b.next;
            }
            while(a!=null){
                if(carry == 1){
                    a.data = a.data + 1;
                    if(a.data >= 10){
                        a.data = a.data % 10;
                        a = a.next;
                        carry = 1;
                    }else{
                        a = a.next;
                        carry = 0;
                    }
                }else{
                    carry = 0;
                    break;
                }
            }
            if(carry == 1){
                a.next = new Node(1);
            }
            return h1;
            
        }else{
            while(a!=null){
                int sum = a.data + b.data;
                if(sum >= 10){
                    sum = sum % 10;
                    if(carry == 1){
                        b.data = sum+1;
                    }else{
                        b.data = sum;
                    }
                    carry = 1;
                }else{
                    if(carry == 1){
                        if(sum+1 == 10){
                            b.data = 0;
                            carry = 1;    
                        }else{
                            b.data = sum+1;
                            carry = 0;    
                        }
                    }else{
                        b.data = sum;
                    }
                }
                a = a.next;
                b = b.next;
            }
            while(b!=null){
                if(carry == 1){
                    b.data = b.data + 1;
                    if(b.data >= 10){
                        b.data = b.data % 10;
                        carry = 1;
                        b = b.next;
                    }else{
                        b = b.next;
                        carry = 0;
                    }
                }else{
                    if(b.next==null){
                            break;
                    }
                    b = b.next;
                    carry = 0;
                }
            }  
            if(carry == 1){
                Node te = h2;
                while(te.next!=null){
                    te = te.next;
                }
                te.next = last;
                te.next.next = null;
            } 
            return h2;
        }
        
    }
    
    public int getLength(Node head){
        int len=0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }

    static Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        
        Node temp = head;
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        temp.next = null;
        
        Node leftSide = mergeSort(head);
        Node rightSide = mergeSort(slow);
        
        return merge(leftSide, rightSide);
    }
    
    static Node merge(Node left, Node right){
        Node ret = new Node(0);
        Node traverse = ret;
        while(left!=null && right!=null){
            if(left.data < right.data){
                traverse.next = left;
                left = left.next;
            }else{
                traverse.next = right;
                right = right.next;
            }
            traverse = traverse.next;
        }
        if(right!=null){
            traverse.next = right;
            right = right.next;
        }
        if(left!=null){
            traverse.next = left;
            left = left.next;
        }
        return ret.next;
    }
    
}