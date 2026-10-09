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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode dummy1=new ListNode(0);
        ListNode dummy=dummy1;
        dummy.next=temp;
     
        while(dummy!=null){
            if(dummy.next!=null && dummy.next.val==val){
                ListNode t=dummy;
                while(t.next!=null && t.next.val==val)
                t=t.next;
                dummy.next=t.next;
            }
            else{
                dummy=dummy.next;
            }

        }
        return dummy1.next; 
    }
}