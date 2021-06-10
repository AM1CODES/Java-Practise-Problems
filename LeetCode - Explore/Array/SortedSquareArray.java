class Solution {
    public int[] sortedSquares(int[] nums) {
        /*For this problem, we need to take all the elements of the given array and sqaure them and arrange them in acending order. We first sqaure every element present in the given array and once we have the squared elements, we can sort them in acending order.*/
        for(int k = 0;k<nums.length;k++) //squaring each element of the array
        {
            nums[k] = nums[k]*nums[k];
        }
        
        for(int i =0;i<nums.length;i++) //sorting all the elements of the array
        {
        for(int j = i+1;j<nums.length;j++)
        {
            int temp = 0;
            if(nums[i]>nums[j])
            {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }
    
        return nums;
    }
}