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
        int len1=0,len2=0,i,max_len,f,carry=0,sum,max=0;
        
        //ListNode l3 = new ListNode();
        
        ListNode a1 = new ListNode();
        ListNode a2 = new ListNode();
        
        a1=l1;
        a2=l2;
        
        while(a1!=null)
        {
            len1=len1+1;
            a1=a1.next;
        }
        
        while(a2!=null)
        {
            len2=len2+1;
            a2=a2.next;
        }
        
        if(len1<len2)
        {
            max_len=len2;
            f=2;
        }
        else
        {
            max_len=len1;
            f=1;
        }
        int[] store= new int[max_len+1];
        for(i=0;i<store.length;i++)
            store[i]=-1;
        
        if(f==1)
        {
            while(l1!=null)
            {
                if(l2!=null)
                {
                    sum=(l1.val+l2.val+carry)%10;   
                    carry=(l1.val+l2.val+carry)/10;
                    store[max]=sum;
                    l2=l2.next;
                }
                else
                {
                    sum=(l1.val+carry)%10;
                    carry=(l1.val+carry)/10;
                    store[max]=sum;
                }
                max=max+1;
                l1=l1.next;
            }
        }
        else
        {
            while(l2!=null)
            {
                if(l1!=null)
                {
                    sum=(l1.val+l2.val+carry)%10;   
                    carry=(l1.val+l2.val+carry)/10;
                    store[max]=sum;
                    l1=l1.next;
                }
                else
                {
                    sum=(l2.val+carry)%10;
                    carry=(l2.val+carry)/10;
                    store[max]=sum;
                }
                max=max+1;
                l2=l2.next;
            }
        }
        
        if(carry==1)
            store[max_len]=1;
        
        for(i=0;i<store.length;i++)
        {
            System.out.print(store[i]);
        }
        ListNode l3 = new ListNode();
        ListNode l5 = new ListNode();
        l5=l3;
        for(i=0;i<store.length;i++)
        {
            if(store[i]!=-1)
            {
                ListNode l4 = new ListNode();
                l3.val=store[i];
                if((carry==1 && i+1!=store.length) || (carry==0 && i!=store.length-2))
                {
                    l3.next=l4;
                    l4.next=null;
                }
                l3=l4;
            }
        }
        return l5;
    }
}