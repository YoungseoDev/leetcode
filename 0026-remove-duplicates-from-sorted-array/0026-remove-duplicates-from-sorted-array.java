class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int [] arr = new int[nums.length];
        int [] temp = new int[201];

        for(int i = 0; i < nums.length; i++)
        {
            if(temp[nums[i]+100] == 0)
            {
                arr[k] = nums[i];
                k++;
                temp[nums[i]+100] = 1;
            }

            else
            {

            } 
        }

        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = arr[i];
        }

        return k;
                
    }
}