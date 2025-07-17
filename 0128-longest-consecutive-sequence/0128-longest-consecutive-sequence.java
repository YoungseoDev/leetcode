class Solution {
    public int longestConsecutive(int[] nums) {
        //HashSet is better choice than a HashMap.Because we don't need key-valuse data structure.

        HashSet <Integer> set = new HashSet<>();
        int answer = 0 ;
        
        for (int i = 0; i < nums.length ; i++)
        {
            set.add(nums[i]);
        }

        for(int num : set)
        {
            int t = 0;
            if(!set.contains(num-1))
            {
                int k = num;
                while(set.contains(k))
                {
                    t++;
                    k++;
                }
                answer = Math.max(answer, t);
            }
        }

        return answer;
        
    }
}