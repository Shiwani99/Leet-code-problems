class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int store[]=new int[127];
        int i,j,k,max=0,count=0,t;
        
        for(i=0;i<26;i++)
            store[i]=0;
        
        for(i=0;i<s.length();i++)
        {
            for(j=i;store[s.charAt(j)]<1;j++)
            {
                t=s.charAt(j);
                store[t]=store[t]+1;
                count=count+1;
                
                if(j+1>=s.length())
                    break;
            }
            
            if(count>max)
                max=count;
            count=0;
            
            for(k=0;k<127;k++)
                store[k]=0;
        
        }
        
        return max;
        
    }
}