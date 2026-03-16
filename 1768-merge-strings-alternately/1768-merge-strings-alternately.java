class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();
        
        while(word1.length() > 0 || word2.length() > 0)
        {
            if(word1.length() > 0)
            {
                s.append(word1.charAt(0));
                word1 = word1.substring(1);
            }

            if(word2.length() > 0 )
            {
                s.append(word2.charAt(0));
                word2 = word2.substring(1);
            }
        }
        return s.toString();
    }
}