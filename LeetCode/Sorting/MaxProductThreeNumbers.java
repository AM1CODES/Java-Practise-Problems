class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int positiveMax = nums[n-1]*nums[n-2]*nums[n-3]; // if array is all positive
        int negativeMax = nums[0]*nums[1]*nums[n-1]; // take product of first 2 numbers in sorted array then multiply it with largest negative number -> [-1,-2,-3] -> [-3,-2,-1] -> (-6) 
        return Math.max(positiveMax,negativeMax);
     }
}