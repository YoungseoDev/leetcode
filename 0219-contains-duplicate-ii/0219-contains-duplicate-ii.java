class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int start = 0 ;
        int last = start + k;
        if(last >= nums.length)
        {
            last = nums.length-1;
        }

        while(start != last)
        {
            for(int i = start +1 ; i <= last; i++)
            {
                if(nums[start] == nums[i] && Math.abs(i-start) <= k)
                {
                    System.out.print(i);
                    return true;
                }
            }
            start++;
            last++;
            if(last >= nums.length)
            {
                last = nums.length-1;
            }
        }

        return false;
        
    }
}