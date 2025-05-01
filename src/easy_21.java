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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if( list1 == null) return list2;
        if( list2 == null) return list1;
        boolean leaver = list1.val < list2.val;
        ListNode start;
        ListNode out;
        if(leaver) {
            out = new ListNode(list1.val);
            list1 = list1.next;
            }else{
                out=new ListNode(list2.val);
                list2 = list2.next;
            }
            start = out;
            while(list1!= null || list2 !=null){
                if(list1 ==null) leaver=false;
                else if(list2 ==null) leaver=true;
                else leaver = list1.val < list2.val;
                if(leaver){
                    out.next = new ListNode(list1.val);
                    out= out.next;
                    list1=list1.next;
                }else{
                    out.next = new ListNode(list2.val);
                    out= out.next;
                    list2=list2.next;
                }
            }

        return start;
    }
}