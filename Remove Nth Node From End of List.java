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
        
        ListNode l,p1,p2,prev_pnt;
        int c=0;
        
        l=head;
        
        p1=head;
        
        prev_pnt=head;
            
        while(l!=null)
        {
            if(c!=n)
            {
                c=c+1;
                p2=l;
                l=l.next;
            }
            else
            {
                prev_pnt=p1;
                p1=p1.next;
                p2=l;
                l=l.next;
            }
        }
        
        if(p1!=head)
            prev_pnt.next=p1.next;
        else
            head=head.next;
        
        return head;
        
    }
}