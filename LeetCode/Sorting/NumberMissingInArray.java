/*class Solution {
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
}*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }  
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(j+1);
            }
        }
     return ans;   
    }
    public void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}