class Solution {
    public int romanToInt(String s) {
        
        int i=0,r_to_i=0,diff,a=0,b=0,f=0,p,r=0;
        
        if(s.length()>1)
        {
            for(i=0;i<s.length()-1;)
            {
            
                if(s.charAt(i)=='I')
                    a=1;
                else if(s.charAt(i)=='V')
                    a=5;
                else if(s.charAt(i)=='X')
                    a=10;
                else if(s.charAt(i)=='L')
                    a=50;
                else if(s.charAt(i)=='C')
                    a=100;
                else if(s.charAt(i)=='D')
                    a=500;
                else if(s.charAt(i)=='M')
                    a=1000;
            
            
                if(s.charAt(i+1)=='I')
                    b=1;
                else if(s.charAt(i+1)=='V')
                    b=5;
                else if(s.charAt(i+1)=='X')
                    b=10;
                else if(s.charAt(i+1)=='L')
                    b=50;
                else if(s.charAt(i+1)=='C')
                    b=100;
                else if(s.charAt(i+1)=='D')
                    b=500;
                else if(s.charAt(i+1)=='M')
                    b=1000;
            
            
                if(a>b)
                {
                    if(i+1!=s.length()-1)
                        r_to_i=r_to_i+a;
                    else
                        r_to_i=r_to_i+a+b;
                    i=i+1;
                }
                else if(a<b)
                {
                    diff=b-a;
                    r_to_i=r_to_i+diff;
                    i=i+2;
                    
                    if(i==s.length()-1)
                        f=1;
                }
                else
                {
                    if(i+1!=s.length()-1)
                        r_to_i=r_to_i+a;
                    else
                        r_to_i=r_to_i+a+b;
                    i=i+1;
                }
            }
        }
        if(s.length()<=1 || (f==1))
        {
            if(s.length()<=1)
                p=0;
            else
                p=i;
            if(s.charAt(p)=='I')
                r=1;
            else if(s.charAt(p)=='V')
                r=5;
            else if(s.charAt(p)=='X')
                r=10;
            else if(s.charAt(p)=='L')
                r=50;
            else if(s.charAt(p)=='C')
                r=100;
            else if(s.charAt(p)=='D')
                r=500;
            else if(s.charAt(p)=='M')
                r=1000;
        }
        
        if(f==1)
            r_to_i=r_to_i+r;
        else if(s.length()<=1)
            r_to_i=r;
        
        return r_to_i;
        
    }
}