class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int [] arr = new int[nums.length];
        int t = 0;

        for(int i =0; i < nums.length; i++)
        {
            if(nums[i] == val)
            {
                
            }
            else
            {
                arr[t++] = nums[i]; 
                k++;
            }
        }

        for(int i = 0 ; i < nums.length; i++)
        {
            nums[i] = arr[i];
        }

        return k;
    }
}


    