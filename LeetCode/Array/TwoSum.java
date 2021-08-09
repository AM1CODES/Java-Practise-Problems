class Solution {
    public int[] twoSum(int[] nums, int target) {
       /* Brute Force
       int[] result = new int[2];
        for(int i =0;i<nums.length;i++)
        {
            for(int i1 = i+1;i1<nums.length;i1++)
            {
                if(nums[i]+nums[i1] == target)
                {
                    result[0] = i;
                    result[1] = i1;
                    break;
                }
            }
        }
        return result;*/
        
        /*Optimal Solution - Using HashMap*/
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                result[1] = i;
                result[0] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
        
    }
}