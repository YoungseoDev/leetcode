class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reverseNum = 0;

        if( x < 0)
        {
            return false;
        }

        while(x > 0 )
        {
            reverseNum = reverseNum * 10 + (x % 10);
            x = x / 10;

        }

        if(original == reverseNum)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}