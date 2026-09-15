/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node DeepCopy(Node head){
        Node temp1=head;
        Node head2=new Node(-1);
        Node temp2=head2;
        while(temp1!=null){
            temp2.next=new Node(temp1.val);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return head2.next;
    }
    public Node copyRandomList(Node head) {
        Node b=DeepCopy(head);
        Node temp1=head;
        Node temp2=b;
        HashMap<Node,Node> map=new HashMap<>();
        map.put(null,null);
        while(temp1!=null){
            map.put(temp1,temp2);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        temp1=head;
        
        while(temp1!=null){
            temp2=map.get(temp1);
            temp2.random=map.get(temp1.random);
            temp1=temp1.next;
        }
        return b;
    }
}