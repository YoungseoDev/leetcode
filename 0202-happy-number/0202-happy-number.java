class Solution {
    public boolean isHappy(int n) {
        
        Set<Integer> set = new HashSet<>();
        
        
        while(n != 0)
        {
            int sumOfSquares = 0;
            List<Integer> list= new ArrayList<>();
            while(n != 0)
            {
                list.add(n % 10);
                n = n / 10;
            }

            for(int digit : list)
            {
                sumOfSquares += digit * digit;
              
            }
              if(sumOfSquares == 1)
                {
                    break;
                }
                if(set.contains(sumOfSquares))
                {
                    return false;
                }
                set.add(sumOfSquares);
                n = sumOfSquares;
        }

        return true;
        
    }
}