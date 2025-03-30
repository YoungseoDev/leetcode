class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
       int [] arr = new int[26];

       for(int i = 0; i < magazine.length(); i++)
       {
            int index = magazine.charAt(i) - 'a';
            arr[index]++;        
       }

       for(int i = 0; i < ransomNote.length(); i++)
       {
        int k = ransomNote.charAt(i)- 'a';
            if(arr[k] ==0)
            {
                return false;
            }
            else
            {
                arr[k]--;
            }
       }
       return true;


    }
}