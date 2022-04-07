class Solution {
    public int singleNumber(int[] nums) {
        
        int i,find_ele=-1;
        Arrays.sort(nums);
        System.out.print(Arrays.toString(nums));
        
        for(i=0;i<nums.length-1;i=i+3)
        {
            if(nums[i]!=nums[i+1])
            {
                find_ele=nums[i];
                break;
            }
        }
        
        if(find_ele==-1)
            find_ele=nums[nums.length-1];
        return find_ele;
        
    }
}
