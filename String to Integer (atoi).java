class Solution {
    public int myAtoi(String s) {
        
        int i,res=0,f=0,subtract=0,final_res=0,is_num=0;
        
        for(i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)>=48 && s.charAt(i)<=57 && is_num!=1)
            {
                if(f==0)
                {
                    if(subtract==0)
                        res=s.charAt(i)-48;
                    else
                        res=-(s.charAt(i)-48);
                    f=1;
                }
                else
                {
                    if(subtract==0)
                        res=res*10+(s.charAt(i)-48);
                    else
                        res=res*10-(s.charAt(i)-48);
                }
               
                if(i<s.length()-1)
                {
                    if(s.charAt(i+1)<48 || s.charAt(i+1)>57)
                        is_num=1;
                }
                
                if(final_res!=(res/10))
                {
                    if(subtract==1)
                        res=-2147483648;
                    else
                        res=2147483647;
                }
                    
                final_res=res;    
            }
            
            else if(s.charAt(i)==45)
            {
                if(i<s.length()-1)
                {
                    if(s.charAt(i+1)<48 || s.charAt(i+1)>57)
                    {
                        res=0;
                        break;
                    }
                    else
                        subtract=1;
                }
            }
            
            else if(is_num==0 && s.charAt(i)!=32 && s.charAt(i)!=43)
            {
                res=0;
                subtract=-1;
                break;
            }
            
            else if(is_num==0 && s.charAt(i)!=32 && s.charAt(i)==43)
            {
                if(i<s.length()-1)
                {
                    if(s.charAt(i+1)<48 || s.charAt(i+1)>57)
                    {
                        res=0;
                        break;
                    }
                }
            }
            
            
        }
        
            
        return res;
        
        
    }
}