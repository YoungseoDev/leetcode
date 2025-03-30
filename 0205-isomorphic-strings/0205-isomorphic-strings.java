class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        boolean answer= true;

        for(int i = 0; i < s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                //같은 키의 다른값
                if(map.get(s.charAt(i)) != t.charAt(i))
                {
                    answer = false;
                    return answer;
                }
                
            }
            else
            {
                //다른 키의 같은 값
                if(map.containsValue(t.charAt(i)))
                {
                    answer = map.containsKey(s.charAt(i));
                    if(answer == false)
                    {
                        return answer;
                    }
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }

        return answer;

    }
}