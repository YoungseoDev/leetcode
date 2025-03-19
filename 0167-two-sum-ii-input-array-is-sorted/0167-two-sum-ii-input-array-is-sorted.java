class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int last = 0;
        int []answer = new int[2];
        for(int i= 0; i < numbers.length ; i++)
        {
            start = numbers[i];
            for(int k = i+1 ; k < numbers.length ; k ++)
            {
                last = numbers[k];

                if(start + last == target)
                {
                    answer[0] = i+1;
                    answer[1] = k+1;
                    return answer;
                }

            }
        }

        return answer;
    }
}