class Solution {
    public int findKthPositive(int[] arr, int k) {
        int index =0;
        int max = arr[arr.length-1];
        
        for(int i=1;i<=max;i++){
            if(i!=arr[index]){
                k--;
                if(k==0){
                    return i;
                }
            }
            else{
                index++;
            }
            }
        while(k!=0){
            max++;
            k--;
        }
        return max;
        }
    }