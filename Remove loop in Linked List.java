class Solution{
    public static void removeLoop(Node head){
        if(head == null) return;
        
        HashSet<Node> set = new HashSet<>();
        
        while(head.next != null && !set.contains(head.next)){
            set.add(head);
            head = head.next;
        }
        
        if(head != null) head.next = null;
    }
}



//-----------------------------------------0(n) + 0(1) space ------------------------------------

class Solution{
    public static void removeLoop(Node node){
        if (node == null || node.next == null)
            return;
 
        Node slow = node, fast = node;
 
        slow = slow.next;
        fast = fast.next.next;
 
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;
 
            slow = slow.next;
            fast = fast.next.next;
        }
 
        if (slow == fast) {
            slow = node;
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
 
            if(fast != node){
                fast.next = null;  
            }else{
                fast = fast.next;
                while(fast.next != slow){
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
        
        
    }
}