class Solution {
    public int[] sumZero(int n) {
        int[] res= new int[n]; //our resulting array
        int left=0; //we add positive elements from the right hand side and negative integers from left side starting with 1 which will give us exact number of elements that are required to give sum 0
        int right = n-1;
        int start  =1;
        
        while(left<right){
            res[left] = start;
            left++;
            res[right] = -start;
            right--;
            start++;
        }
        return res;
        }
    }