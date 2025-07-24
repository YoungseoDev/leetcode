class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

    Set<Integer> window = new HashSet<>();

    for(int i = 0 ; i <= nums.length - 1; i++)
    {
        if(i > k)
        {
            window.remove(nums[i-k-1]);
        }
        if(window.add(nums[i]) == false)
        {
            return true;
        }
    }
       return false;
    }
}