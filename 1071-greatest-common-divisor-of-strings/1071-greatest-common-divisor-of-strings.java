class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String first = str1 + str2;
        String second = str2 + str1 ;

        if(first.equals(second))
        {
            int k = gcd(str1.length() ,str2.length());
            return first.substring(0,k);
        }

        return "";

    }

    public int gcd(int a, int b)
    {
        int temp = 0;
        while(b!=0)
        {
            temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}