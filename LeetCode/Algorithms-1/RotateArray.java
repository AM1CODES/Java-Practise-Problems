class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(k<0)
        {
            k = k+nums.length;
        }
        reverse(nums,0,nums.length-k-1); //reversing array elements upto k
        reverse(nums,nums.length-k,nums.length-1); //reversing array elements from k to end of the array
        reverse(nums,0,nums.length-1); //reversing the whole array
        
        
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}