class Solution {
    public int nextBeautifulNumber(int n) {
        
        boolean answer = false;
        n++;
        while ( n < 9999999)
        {
            String str = String.valueOf(n);
            
            HashMap<Character, Integer> map = new HashMap<>();

            char [] chars = str.toCharArray();
            Arrays.sort(chars);

            String sorted = new String(chars);

            for(int i = 0 ; i < sorted.length(); i++)
            {
                if(!map.containsKey(sorted.charAt(i)))
                {
                    map.put(sorted.charAt(i),0);
                }

                map.put(sorted.charAt(i), map.get(sorted.charAt(i)) + 1 );

            }

            for(int i = 0 ; i < sorted.length(); i++)
            {   
                int digit = sorted.charAt(i) - '0';
                if(digit == map.get(sorted.charAt(i)))
                {
                    answer = true;
                   
                }
                else
                {
                    answer = false;
                    break;
                }
            }
            if(answer ==true)
            {
                return n;
            }

            n++;
        }

        return 0;


    }



    
}