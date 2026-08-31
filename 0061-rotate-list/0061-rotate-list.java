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
    public ListNode rotateRight(ListNode head, int k) {
         if(head == null || head.next == null) {
            return head;
        }
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
         if(k == 0) {
            return head;
        }
        
        temp=head;
         for(int i = 0; i < count - k - 1; i++) {
            temp = temp.next;
        }

        ListNode temp2=temp.next;
        temp.next=null;
        ListNode last=temp2;
        while(last.next!=null){
            last=last.next;
        }
        last.next=head;
        return temp2;
       
        
        
    }
}