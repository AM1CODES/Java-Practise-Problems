class Solution {
    public int search(int[] nums, int target) {
        int last = nums.length -1;
        int first = 0;
        while(first<=last)
        {
            int mid = first + (last-first)/2; //here we are doing (last-first)/2 to prevent any sort of overflow when we encouter any large numbers
            if(nums[mid] == target){
                return mid;
            }
            if(target>nums[mid]){
                first = mid+1;    
            }
            else{
                last = mid-1;
            }
        }
        return -1;
    }
}