class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) //if the given array has length less than 3 then we can immediately return false
        {
            return false;
        }
        int i =0;
        
        while(i<arr.length && i + 1 < arr.length && arr[i]<arr[i+1]) //checking for strictly increasing sequence, if the previous element is smaller than the next one then we can increment our pointer and if this trend continues then we will haver a stricty increasing sequence if the loop doesn't break
        {
            i++;
        }
        
        if(i==0 || i+1>=arr.length) //checking for cases where the i never increases or increments or we have reached the end of our array
        {
            return false;
        }
        
        while(i<arr.length && i+1<arr.length) //checking if the sequence is strictly decreasing as from the above case our i is at the location from where the decrease starts to happen
        {

            if(arr[i]<=arr[i++ + 1])  //if this condition happens then we can say we dont have a strictly decreasing sequence
            {
                return false;
            }
        }
        
        return true;
        
        
    }
}