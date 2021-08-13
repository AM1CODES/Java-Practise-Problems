import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        int store = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                store = nums[i];
            }
        }
        return store;
    }
}