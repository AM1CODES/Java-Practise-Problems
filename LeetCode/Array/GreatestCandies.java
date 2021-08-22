class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = candies[0]; //make first as max
        int len = candies.length; //length of array
        for(int i=0;i<len;i++)
        {
            if(max<candies[i])
            {
                max = candies[i]; //finding maximum of the given array
            }
        }
        
        for(int j=0;j<len;j++)
        {
            if(candies[j]+extraCandies>=max) //checks after adding extracandies, if greater or equal to max - add true to the list else false
            {
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        
        return arr;
        
    }
}