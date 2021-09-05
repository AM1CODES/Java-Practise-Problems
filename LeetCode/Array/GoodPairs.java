//Brute force
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }
}

/* Optimal
class Solution {
public int numIdenticalPairs(int[] nums) {

    int count=0, n = nums.length;
    HashMap<Integer, Integer> map = new HashMap<>();
	
    for(int i=n-1;i>=0;i--){
        if(map.containsKey(nums[i])){
            count += map.get(nums[i]);
            map.put(nums[i], map.get(nums[i])+1);
        }else{
            map.put(nums[i], 1);
        }
    }
	
    return count;
}
}
*/