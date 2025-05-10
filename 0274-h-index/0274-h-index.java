class Solution {
    public int hIndex(int[] citations) {

        int [] arr = new int [citations.length];

        for(int i= 0 ; i < citations.length ; i++)
        {
            int t = citations[i];
            if(citations[i] > arr.length)
            {
                t = arr.length;
            }
            for(int k = 0 ; k < t; k++)
            {
                arr[k]++;
            }
        }

        int max = 0;

        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] >= i+1)
            {
                max = Math.max(i+1 ,max);
            }
        }

        return max;
        
    }
}