class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int order = 0;
        int max = 0;
        for(int i =0; i < nums.length; i++)
        {
            if(nums[i]==1)
            {
                order++;
                if(order > max)
                    max = order;
            }
            else
                order = 0;
        }
        return max;
        
    }
}