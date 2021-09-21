class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums); //1 2 3 4 -> (1,2) & (3,4) -> Sum = 1+3 = 4
        
        for(int i=0;i<nums.length;i = i+2){
            sum += nums[i];
        }
        return sum;
        
    }
}

// 1 2 2 5 6 6 -> (1,2)(2,5)(6,6) -> 1 + 2 + 6 -> 9