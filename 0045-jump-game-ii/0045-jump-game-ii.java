class Solution {
    public int jump(int[] nums) {
    
        int num = 0;
        if(nums.length == 1)
            return 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            int k = nums[i] + i;
            if(k >= nums[nums.length-1])
            {   
                num++;
                return num;
            }

            if(nums[i] >0)
            {
               num++;
            }
        }
        return num;
    }
}