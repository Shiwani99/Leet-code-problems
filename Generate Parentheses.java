import java.util.*;
import java.lang.Math;
import java.util.List;
class Solution {   
    
    public String dec_to_bin(int n,int n1)
    {
       StringBuilder s=new StringBuilder();
        Stack<Integer> st=new Stack<Integer>();
        
        int rem;
        
        while(n>1)
        {
            rem=n%2;
            n=n/2;
            if(rem==0)
            {
                s.append(')');
                st.push(0);
            }
            else
            {
                s.append('(');
                
                if(st.empty()==true)
                    st.push(1);
                else
                {
                    if(st.peek()==0)
                        st.pop();
                    else
                        st.push(1);
                }
                
                
            }
        }
        
        if(n==0)
        {
            s.append(')');
            st.push(0);
        }
        else
        {
            s.append('(');
            if(st.peek()==0)
                st.pop();
            else
                st.push(1);
        }
        
        //System.out.print(n);
        
        int i;
        StringBuilder s1=new StringBuilder();
        
        
        for(i=s.length()-1;i>=0;i--)
            s1.append(s.charAt(i));
        
        if(st.empty()==true)
            return s1.toString();
        else
            return ".";
        
        
    }
    
    public List<String> generateParenthesis(int n) {
        
        
        int n1,n2,i,j;
        
        String s,s1;
        
        n1=(int)Math.pow(2,2*n-1);
        n2=(int)Math.pow(2,2*n);
        
        List<String> l=new ArrayList<String>();
        
        for(i=n2-2;i>=n1;i=i-2)
        {
            s=dec_to_bin(i,n);
            
            if(s.charAt(0)!='.')
                l.add(s);
                
        }
        
        
        return l;
        
    }
}