class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        for(int i =0;i<nums.length;i++) //checks if the element in the  array is even or not, if  it is even then we store the value at the index into a temp variable and update the value at index and then assign the value at ith position to temp. We then increment index and we basically are swapping the evven number with the positions of odd numbers and vice versa
        {
            if(nums[i] %2==0)
            {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }
        return nums;
    }
}