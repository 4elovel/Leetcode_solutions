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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        if(head!=null){
        while(head.next!=null){
            if(head.val == head.next.val) {
                head.next = head.next.next;
                continue;
            }
            head= head.next;
        }}
        return start;
    }
}