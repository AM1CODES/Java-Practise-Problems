class Solution { //Brute force - Hashmaps not known yet
    int getPairsCount(int[] arr, int n, int k) {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int  j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==k)
                {
                    count++;
                }
            }
        }
        
        return count;
    }
}