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
    //reverse
    public ListNode reverse(ListNode head){
        //if(head==null || head.next==null)return head;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        //main
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newNode=reverse(slow.next);
        ListNode first=head;
        ListNode last=newNode;
        while(last!=null){
            if(first.val!=last.val){
                reverse(slow.next);
                return false;
            }
            else{
                first=first.next;
                last=last.next;
                reverse(slow.next);
            }
        }
        return true;
    }
}