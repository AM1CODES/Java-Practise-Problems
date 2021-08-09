class Solution{
    public int remove_element(int[] nums,int val)
    {
        if(nums.length ==0)
        {
            return 0;
        }
        
        /*We will check the elements of the array and if the element is not equal to the element which has to be deleted the we shift it to the start of the array and increment the length by 1*/
        int length = 0;//reference to the first element of the array
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}