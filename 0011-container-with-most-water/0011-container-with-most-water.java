class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int amount = 0;
        int answer = 0;
        
        while(left < right)
        {
            amount = (right - left) * Math.min(height[left], height[right]);

            if( amount > answer)
            {
                answer = amount;
            }

            if(height[left] < height [right])
            {
                left++;
            }
            else
            {
                right--;
            }

        }

        return answer;

    }
}