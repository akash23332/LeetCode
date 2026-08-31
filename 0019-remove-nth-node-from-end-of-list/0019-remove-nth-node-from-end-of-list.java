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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp1=head;
        while(temp1!=null){
            count++;
            temp1=temp1.next;
        }
        if(count==n){
            return head.next;
        }
        temp1=head;
        for(int i=0;i<count-n-1;i++){
            temp1=temp1.next;

        }
        temp1.next=temp1.next.next;
        return head;
        
    }
}