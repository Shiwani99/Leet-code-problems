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
    public ListNode swapPairs(ListNode head) {
        
        ListNode l,o_h,t,p,y;
        l=head;
        
        int c=0;
        
        o_h=head;
        y=head;
    
        while(l!=null)
        {
            if(l.next!=null)
            {
                p=l.next;
                t=l.next.next;
                l.next.next=l;
                l.next=t;
                
                if(c==0)
                {
                    o_h=p;
                    c=1;
                }
                else
                    y.next=p;
            
                y=l;
            }
            l=l.next;

        }
        
        return o_h;
        
    }
}