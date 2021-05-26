class Solution{
    public int removeduplicates(int[] nums)
    {
        if(nums.length == 0) //checking if the given array length is 0 or not
        {
            return 0;
        }

        int index = 1; //the starting index element will always be unique hence we will start comparing from the element after it and out elements that are unique in this index number
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1]) //checking if the next number at the (i+1)th position is unique or not, if yes then we put that element in the index that we had defined before
            {
                nums[index] = nums[i+1];
                index++;
            }
        }
        return index;
    }
}