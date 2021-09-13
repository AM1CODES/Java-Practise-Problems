class Solution {
    // #Boyer Mooyer Majority Algorithm
    public int majorityElement(int[] nums) {
        int candidate=0,votes=0;
        for(int val:nums){
            if(votes==0){
                candidate=val;
                votes++;
            }else{
                if(val==candidate){
                    votes++;
                }else{
                    votes--;
                }
            }
        }
        return candidate;
    }
}