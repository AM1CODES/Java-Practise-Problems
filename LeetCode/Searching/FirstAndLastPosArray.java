class Solution {
    public int[] searchRange(int[] nums, int target) {
         int[] ans = {-1, -1};
         
         ans[0] = findFirstPosition(nums, target);
         ans[1] = findLastPosition(nums, target);
         
         return ans;
     }
     
     private int findFirstPosition(int[] arr, int target) {
         int index = -1;
         
         int start = 0, end = arr.length - 1;
         while (start <= end) {
             int mid = start + (end - start) / 2;
             
             if (arr[mid] == target) {
                 index = mid;
                 end = mid - 1;
             }
             else if (target > arr[mid]) {
                 start = mid + 1;
             }
             else
                 end = mid - 1;
         }
         
         return index;
     }
     
     private int findLastPosition(int[] arr, int target) {
         int index = -1;
         
         int start = 0, end = arr.length - 1;
         while (start <= end) {
             int mid = start + (end - start) / 2;
             
             if (arr[mid] == target) {
                 index = mid;
                 start = mid + 1;
             }
             else if (target < arr[mid]) {
                 end = mid - 1;
             }
             else
                 start = mid + 1;
         }
         
         return index;
     }
     
     
 }