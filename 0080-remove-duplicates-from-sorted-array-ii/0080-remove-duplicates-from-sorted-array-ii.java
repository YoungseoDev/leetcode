class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0; 
        int token = 0;
        int [] arr = new int[nums.length];
        

        for(int i = 1 ; i < nums.length; i++)
        {
            if(nums[i-1] == nums[i] && token ==0)
            {
                token = 1;
                arr[k] = nums[i-1];
                k++;
            }
            else if(nums[i-1] == nums[i] && token == 1)
            {
                
            }
            else if(nums[i-1] != nums[i])
            {
                arr[k] = nums[i-1];
                k++;
                token = 0;
                
            }
           
        }
       arr[k++] = nums[nums.length - 1];
        for(int i = 0 ; i < nums.length; i++)
        {
            nums[i] = arr[i];
        }

        return k;
        
    }
}