/*
In this we create a hashset and traverse the array. When we see an element we check for it in the set, if it is there we remove it, else we add it. So this is how we can eliinate duplicate elements and find which occurs only once.
*/ 
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet();
        int counter = 0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }}
        
            
            for(int i:set){
                return i;
            }
        return 0;
            
        }
    }