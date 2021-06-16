/*
We need to sort the elements of the array in ascending order. The array only consists of 0,1 and 2. This is a variation of dutch national flag problem. 
The approach is simple - We will use 3 pointers - low,mid and high. low and mid start at the first index and high starts at the last index. 3 cases - 
1) On 0 - We swap the elements at low and mid and low++ and mid++
2) On 1 - mid++
3) On 2 - We swap the elements at mid and high and high--

We do all these steps untill mid does not cross high.
*/


class Solution { 
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        int temp; //for swapping
        while(mid<=high)
        {
            switch(nums[mid])
            {
                case 0:{ //swapping low and mid
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{ //swapping midd and high
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}