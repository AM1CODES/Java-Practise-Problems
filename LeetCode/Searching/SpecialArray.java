class Solution 
{
    int arr[];
    int len;
    public int specialArray(int[] nums) 
    {
        arr=nums;
        len = nums.length;
        for(int i=0; i<=len; i++)
        {
            if(isTrue(i))
                return i;
        }
        return -1;
    }
    
    public boolean isTrue(int x)
    {
        int c=0;
        for(int i : arr)
        {
            if(i>=x)
                c++;
        }
        return c==x;
    }
}