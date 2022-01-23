class Solution {
    public int reverse(int x) {
        
        int n,i,count=0,f=0,revr_num,last_num,final_num=0,o_num;    
        n=x;
        revr_num=Math.abs(n)%10;
        while(n!=0)
        {
            last_num=Math.abs(n)%10;
            n=n/10;
            if(n!=0)
            {
                if(revr_num!=((revr_num*10)/10))
                {
                    f=-1;
                    break;
                }
                revr_num=(revr_num*10)+(Math.abs(n)%10);
            }
            if(x<0)
                final_num=-revr_num;
            else
                final_num=revr_num;
        }
        
        if(f==0)
            x=final_num;
        else
            x=0;
        
        return x;
    }
}