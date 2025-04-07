class Solution {
    public boolean isAnagram(String s, String t) {

        int [] arr = new int [26];

        if(s.length() != t.length())
            return false;

        for(int i = 0 ; i < s.length(); i++)
        {
            int k = s.charAt(i) - 'a';
            arr[k]++;
        }

        for(int i = 0; i < t.length(); i++)
        {
            int k = t.charAt(i) - 'a';
            if(arr[k] ==0)
                return false;
            
        }
        
        return true;
    }
}