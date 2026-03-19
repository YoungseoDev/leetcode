class Solution {
    public int[] productExceptSelf(int[] nums) {
    
        int product = 1;
        int zero = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] != 0)
            {
                product = product * nums[i];
            }
            else
            {
                zero++;
            }
        
        }

        int [] output = new int[nums.length];

        for(int i = 0; i < nums.length ; i++)
        {
            if(zero >= 2)
            {
                output[i] = 0;
            }
            else if(zero == 1)
            {
                output[i] = (nums[i] ==0) ? product : 0;
            }
            else
            {
                output[i] = product / nums[i];
            }
        }

        return output;
        
    }
}