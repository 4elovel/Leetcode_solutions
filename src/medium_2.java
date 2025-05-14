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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        boolean leaver = false;
        boolean test=true;
        while(l1!=null||l2!=null){
            if(!test){
                current.next = new ListNode();
                current = current.next;
            }else{
                test=false;
            }
            System.out.println(1);
            int sum = 0;
            if(leaver){
                sum++;
                leaver=false;
            }
            if(l1==null){
                sum+=l2.val;
                if(sum>9){
                sum-=10;
                leaver=true;
            }
                current.val=sum;
                l2=l2.next;
                continue;
            } else if(l2==null){
                sum+=l1.val;
                if(sum>9){
                sum-=10;
                leaver=true;
            }
                current.val=sum;
                l1=l1.next;
                continue;
            }
            sum += l1.val + l2.val;
            if(sum>9){
                sum-=10;
                leaver=true;
            }
            current.val=sum;
            l1 = l1.next;
            l2= l2.next;

        }
        if(leaver) current.next = new ListNode(1);
        return head;
    }
}