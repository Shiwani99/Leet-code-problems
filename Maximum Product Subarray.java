class Solution {
    public int maxProduct(int[] nums) {
        
        int i,j,new_max=0,max,mul;
        
        for(i=0;i<nums.length;i++)
        {
            mul=nums[i];
            max=mul;
            for(j=i+1;j<nums.length;j++)
            {
                mul=mul*nums[j];
                
                if(mul>max)
                    max=mul;
            }
            
            if(i==0)
                new_max=max;
            else
            {
                if(max>new_max)
                    new_max=max;
            }
           
        }
        
        return new_max;
            
           
        
        
    }
}
