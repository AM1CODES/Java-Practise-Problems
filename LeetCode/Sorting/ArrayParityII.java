class Solution { //check if odd or even - if odd place at oddIndex and increment it by 2 so that next index that we land on is odd
    public int[] sortArrayByParityII(int[] nums) {
        int[] out = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;
        for(int i:nums){
            if(i%2==1){
                out[oddIndex]=i;
                oddIndex+=2;
            }
            else{
                out[evenIndex]=i;
                evenIndex+=2;
            }
        }
        return out;
    }
}
