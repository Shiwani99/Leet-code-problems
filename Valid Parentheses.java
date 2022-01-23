class Solution {
    public boolean isValid(String s) {
        
        int i,c=0,t;
        Stack<Integer> store= new Stack<>();
        
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==40)
                store.push(1);
            if(s.charAt(i)==123)
                store.push(4);
            if(s.charAt(i)==91)
                store.push(7);
            
            t=Boolean.compare(store.empty(),false);
            
            if(s.charAt(i)==41)
            {
                if(t==0 && store.peek()==1)
                    store.pop();
                else
                {
                    c=1;
                    break;
                }
            }
            if(s.charAt(i)==125)
            {
                if(t==0 && store.peek()==4)
                    store.pop();
                else
                {
                    c=1;
                    break;
                }
            }
            if(s.charAt(i)==93)
            {
                if(t==0 && store.peek()==7)
                    store.pop();
                else
                {
                    c=1;
                    break;
                }
            }
                
                
        }
        
        int b;
        b=Boolean.compare(store.empty(),true);
        
        
        if(c==0 && b!=-1)
            return true;
        else
            return false;
        
        
        
        
    }
}