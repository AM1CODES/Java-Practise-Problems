class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = currSum;
        for(int i =1;i<nums.length;i++)
        {
            int continuousSum = nums[i] + currSum;
            int currentNum = nums[i];
            if(currentNum > continuousSum)
            {
                maxSum = Math.max(maxSum,currentNum);
                currSum = currentNum;
            }
            else
            {
                currSum = continuousSum;
                maxSum = Math.max(maxSum,currSum);
            }
        }
        return maxSum;
    }
}