class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        
        int i,j,min,t,p,t1,t2;
        
        List<Integer> l=new ArrayList<Integer>();
        
        if(triangle.size()>1)
        {
            l.add(triangle.get(0).get(0)+triangle.get(1).get(0));
            l.add(triangle.get(0).get(0)+triangle.get(1).get(1));
        }
        else
            l.add(triangle.get(0).get(0));
        
        
        for(i=2;i<triangle.size();i++)
        {
            p=triangle.get(i).size();
            for(j=0;j<p;j++)
            {
                if(j==0)
                {
                    t=l.get(0);
                    l.add(t+triangle.get(i).get(j));
                }
                else if(j==p-1)
                {
                    t=l.get(0);
                    l.add(t+triangle.get(i).get(j));
                    
                    
                    l.remove(0);
                }
                else
                {
                    t1=l.get(0)+triangle.get(i).get(j);
                    t2=l.get(1)+triangle.get(i).get(j);
                    
                    if(t1<=t2)
                        l.add(t1);
                    else
                        l.add(t2);
                    
                    l.remove(0);
                    
                }
                
            }
        
        }
        
        for(i=0;i<l.size();i++)
            System.out.print(l.get(i)+"\n");
        
        min=l.get(0);
        for(i=1;i<l.size();i++)
        {
            if(l.get(i)<min)
                min=l.get(i);
        }
        
        return min;

    }
}
