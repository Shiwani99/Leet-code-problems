import java.lang.Math;

class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
            return false;
        else
        {
            int on1,on2,c=0,s=0,calc,rem;
            
            on1=x;
            
            while(on1>0)
            {
                on1=on1/10;
                c=c+1;
            }
            
            if(c>1)
            {
                calc=(int)Math.pow(10,c-1);
            
                on2=x;
            
                while(on2>0)
                {
                    rem=on2%10;
                    s=s+calc*rem;
                    on2=on2/10;
                    calc=calc/10;
                }
            }
            
            if(s==x || c==1)
                return true;
            else
                return false; 
            
        }
        
    }
}