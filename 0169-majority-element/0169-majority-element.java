class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> hashing = new HashMap<>();

       for(int i = 0; i < nums.length; i++)
       {
            int k = nums[i];
            hashing.put(k, hashing.getOrDefault(k,0)+1);
       }

       int maxCount = 0;
       int majority = 0; 

        for(int number : hashing.keySet())
        {
            if(hashing.get(number)> maxCount)
            {
                maxCount = hashing.get(number);
                majority = number;
            }
        }

        return majority;
    }
}