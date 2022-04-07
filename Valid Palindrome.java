class Solution {
    public boolean isPalindrome(String s) {
        
        String s1;
        int i,ch,t,f=0;
        s1="";
        
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                ch=s.charAt(i);
                ch=ch+32;
                s1=s1+(char)ch;
            }
            else if(s.charAt(i)>=97 && s.charAt(i)<=122)
                s1=s1+s.charAt(i);
            else if(s.charAt(i)>=48 && s.charAt(i)<=57)
                s1=s1+s.charAt(i);
        }
        
        t=s1.length()-1;
        for(i=0;i<s1.length()/2;i++)
        {
            if(s1.charAt(i)!=s1.charAt(t))
            {
                f=1;
                break;
            }
            t=t-1;
            
        }
        
        if(f==1)
            return false;
        else
            return true;
        
        
    }
}
