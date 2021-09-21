class Solution {
    public int[] sortedSquares(int[] nums) {
        /*For this problem, we need to take all the elements of the given array and sqaure them and arrange them in acending order. We first square every element present in the given array and once we have the squared elements, we can sort them in acending order.*/
        for(int k = 0;k<nums.length;k++)
        {
            nums[k] = nums[k]*nums[k];
        }
        Arrays.sort(nums);
    
        return nums;
    }
}