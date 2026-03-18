class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

       List<Boolean> answer = new ArrayList<>(Collections.nCopies(candies.length,false));

       int max = Integer.MIN_VALUE;
       for(int num : candies)
       {
            max = Math.max(max,num);
       } 

       for(int i = 0; i < candies.length; i++)
       {
            if( max <= candies[i] + extraCandies)
            {
                answer.set(i,true);
            }
       }

       return answer;
    }
}