class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> number = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i:nums)
        {
            set.add(i); //this will go through the entire array and add only the unique elements to the set as the set cannot have duplicate values
        }
        
        for(int i =1;i<=nums.length;i++)
        {
            if(!set.contains(i))
            {
                number.add(i);
            }
        }
        return number;
    }
}