/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=prev;

            prev=curr;
            curr=nxt;

        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode head2=slow.next;
        slow.next=null;
        head2=reverse(head2);
    
        ListNode dummy=new ListNode(0);
        ListNode temp1=head;
        ListNode temp2=head2;
        while(temp2!=null){
            ListNode next1=temp1.next;
            ListNode next2=temp2.next;
            temp1.next=temp2;
            temp2.next=next1;
            temp1=next1;
            temp2=next2;
        }


        
    }
}