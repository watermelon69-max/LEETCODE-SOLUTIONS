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
    public void reorderList(ListNode head) {
        //for finding the middle of the linked list 
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secondHalf=slow.next;
        slow.next=null;

        //for reversing the second half of the linked list 
        ListNode prev=null;
        while(secondHalf!=null){
            ListNode temp=secondHalf.next;
            secondHalf.next=prev;
            prev=secondHalf;
            secondHalf=temp;
        }

        //for merging two LL again 
        ListNode first=head;
        ListNode second=prev;

        while(second!=null){

            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
    }
}