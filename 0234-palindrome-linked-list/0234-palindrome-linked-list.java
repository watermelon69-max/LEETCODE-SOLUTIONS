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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head; 
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null)
            next=next.next;
        }
        
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        //find the middle of LL 
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //now reverse the list from 
        ListNode secondHalf=reverseList(slow);
        slow=head;
        while(secondHalf!=null){
                if(slow.val!=secondHalf.val){
                    return false;
                }
                slow=slow.next;
                secondHalf=secondHalf.next;
        }
        return true;

    }
}