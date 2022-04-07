class Solution {
    public boolean isOneEditDistance(String s, String t) {
        
        int i,c=0,ptr=0;
        
        if(s.length()==t.length())
        {
            for(i=0;i<s.length();i++)
            {
                if(s.charAt(i)!=t.charAt(i))
                    c=c+1;
                
                if(c>1)
                    return false;
            }
            
            System.out.print(c);
            
            if(s.length()==0 || c==0)
                return false;
            
            
        }
        else if(s.length()<t.length())
        {
            if(t.length()-1==s.length())
            {
                if(s.length()!=0)
                {   
                    for(i=0;i<t.length();i++)
                    {
                        if(ptr<s.length())
                        {
                            if(s.charAt(ptr)==t.charAt(i))
                                ptr=ptr+1;
                            else
                                c=c+1;
                        }
                
                        if(c>1)
                            return false;
                    }
                }
                else
                {
                    if(t.length()!=1)
                        return false;
                }
            }
            else
                return false;
            
            
        }
        else if(s.length()>t.length())
        {
            if(s.length()-1==t.length())
            {
                if(t.length()!=0)
                {
                    for(i=0;i<s.length();i++)
                    {
                        if(ptr<t.length())
                        {
                            if(s.charAt(i)==t.charAt(ptr))
                                ptr=ptr+1;
                            else
                                c=c+1;
                        }
                
                        if(c>1)
                            return false;
                    }
                }
                else
                {
                    if(s.length()!=1)
                        return false;
                }
            }
            else
                return false;
            
            
        }
        
        return true;
        
    }
}
