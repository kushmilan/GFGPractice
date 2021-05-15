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