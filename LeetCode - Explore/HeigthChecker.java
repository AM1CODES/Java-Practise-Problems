class Solution {
    public int heightChecker(int[] heights) {
        int[] checker = heights.clone(); //cloning the original array that we have
        Arrays.sort(checker); //sorting the cloned array
        
        int count = 0; 
        for(int i =0;i<heights.length;i++) //loop to check if the elements of original array and sorted array match or not if not then we increment our counter and that will be our final answer
        {
         if(heights[i]!=checker[i])
        {
            count++;
        }
            
        }

        return count;
        
    }
}