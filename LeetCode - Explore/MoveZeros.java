class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; //setting an initial index value that we will use to place our initial non zero values
        for(int i=0;i<nums.length;i++) //loop to walk through the whole array and and check for all the non zero values and place them at the index value that we defined earlier - this will fill up all the non zero numbers in orderly manner
        {
            if(nums[i]!=0)
            {
                nums[index] = nums[i];
                index++;
            }
        }
        
        for(int i =index;i<nums.length;i++) //after we have filled all non-zero numbers we just need to start from the index position after we had filled the last non zero number and add zeros after that
        {
            nums[i] = 0;
        }
}
}