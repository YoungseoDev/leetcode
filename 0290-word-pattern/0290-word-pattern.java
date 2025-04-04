class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");

        if(pattern.length() != words.length)
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(pattern.charAt(i)) == null) {
                if(map.containsValue(words[i]))
                {
                    return false;
                }

                map.put(pattern.charAt(i), words[i]);

            }
            else
            {
                if(!(map.get(pattern.charAt(i)).equals(words[i])))
                {
                    return false;
                }
            }

        }

        return true;

    }
}