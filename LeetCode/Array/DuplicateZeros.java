class Solution {
    public void duplicateZeros(int[] arr) {
 int zeroes = 0; //counting the number of zeroes in the given array
        for(int i:arr)
        {
            if(i==0)
            {
                zeroes++;
            }
        }
        
        int i =  arr.length - 1; //first pointer that starts at the last index of the array
        int j  = arr.length+zeroes -1; //second pointer that starts at the last index of increased array
        
        while(i!=j) 
        {
            insert(arr,i,j--);
            if(arr[i] == 0)
            {
                insert(arr,i,j--);
            }
            i--;
        }
    }
        
    private void insert(int[] arr,int i,int j) //method to insert element at the ith position into jth position provided that j falls in the original array length
        {
            if(j < arr.length)
            {
                arr[j] = arr[i];
            }
        }
    }
