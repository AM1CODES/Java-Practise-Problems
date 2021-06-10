class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; //count variable to count the 1s
        int maxStreak = 0; //variable to store the maximum streak of 1s
        for(int i:nums) //itearting over nums to look for consecutive 1s
        {
            /*condition if element at ith position is 1, if it's 1 then we will increment count and if the value of max is less than the value of count then we will assign it the value of count. 
            If the encountered element is not 1 then we reset count back to 0 but the maxStreak still holds maximum number of consecutive 1s*/
            if(i==1) 
            { 
                count++;
                if(maxStreak<count)
                {
                    maxStreak = count;
                }
            }
            else
            {
                count = 0;
            }
        }
        return maxStreak;
    }
}