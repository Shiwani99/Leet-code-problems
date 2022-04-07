class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s=new Stack<Integer>();
        int i,j,c=1,num=0,a1,a2,res,p,l;
        
        for(i=0;i<tokens.length;i++)
        {
            if((tokens[i].charAt(0)>='0' && tokens[i].charAt(0)<='9')||tokens[i].length()>1)
            {
                c=1;
                num=0;
                
                if(tokens[i].charAt(0)=='-')
                    l=1;
                else
                    l=0;
                    
                for(j=tokens[i].length()-1;j>=l;j--)
                {
                    p=tokens[i].charAt(j);
                    num=num+((p-48)*c);
                    c=c*10;
                }
                
                if(tokens[i].charAt(0)=='-')
                    s.push(-num);
                else
                    s.push(num);
            }
            else
            {
                a2=s.pop();
                a1=s.pop();
                
                if(tokens[i].charAt(0)=='*')
                    s.push(a1*a2);
                else if(tokens[i].charAt(0)=='/')
                    s.push(a1/a2);
                else if(tokens[i].charAt(0)=='+')
                    s.push(a1+a2);
                else if(tokens[i].charAt(0)=='-')
                    s.push(a1-a2);
            }
        }
        
        
        res=s.peek();
        
        return res;
    }
}
