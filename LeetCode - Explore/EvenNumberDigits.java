class Solution {
    public int findNumbers(int[] nums) {
        int evenCount = 0; 
        
        /*In this approach, we are defining a variable evenCount to store the numbers with even number of digits.
        After this we are running a loop in which we are defining a variable count to keep count of digits of a number.
        We declare count inside the loop so that with every new number the count would get reset.
        After this we are assigning the numbers at ith index to n which we are using to count the digits and then
        checking the divisibility of count with 2 in order to check if it's even or not.*/
        
        for(int i=0;i<nums.length;i++) 
        {
            int n = nums[i];
            int count = 0;
            while(n!=0)
            {
                n = n/10;
                count++;      
            }
            if(count%2==0)
            {
                evenCount++;
            }
        }
        return evenCount;
    }
}