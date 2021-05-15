class Clone {
    //Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        
        //Update current list
        Node t = head;
        while(t != null){
            Node next = t.next;
            t.next = new Node(t.data);
            t.next.next = next;
            t = next;
        }
        
        t = head;
        
        //Updating arb variable
        while(t != null){
            if(t.arb != null){
                t.next.arb = t.arb.next;   
            }
            
            t = t.next.next;
        }
        
        //Updating original list
        Node ans = new Node(0);
        Node cp, copy = ans;
        t = head;
        while(t != null){
            Node next = t.next;
            
            cp = next;
            copy.next = cp;
            copy = cp;
            
            t.next = t.next.next;
            t = t.next;
        }
        
        return ans.next;
    }
}