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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp1=head;
        for(int i=1;i<k;i++){
            temp1=temp1.next;
        }
        ListNode front=temp1;
        temp1=head;
        int size=0;
        while(temp1!=null){
            size++;
            temp1=temp1.next;
        }
        temp1=head;
        for(int i=0;i<(size-k);i++){
            temp1=temp1.next;
        }
        ListNode back=temp1;

        int val=front.val;
        front.val=back.val;
        back.val=val;
        return head;
    }
}