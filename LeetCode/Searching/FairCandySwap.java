/*
2 people have different number of candies, we need to make them swap in such a way that both swap just 1 candy and the total sum in the end becomes equal. 
[1,2,5] & [2,4] => here alice has 8 candies and bob has 6. If we swap 5 and 4, we will be able to maintain equal number of candies and we return the candies that are swapped as an array result. If alice gives 5 she expects whatever number of candies bob has + change and that is how we will get our result.
*/
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int totalA = 0;
        int totalB = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int a:aliceSizes){ //alice = 8
            totalA += a;
        }
        for(int b:bobSizes){//bob  = 6
            totalB += b;
            set.add(b);
        }
        
        int change = (totalB-totalA)/2; //change = -1
        int[] res = new int[2];
        for(int i:aliceSizes){
            if(set.contains(totalB+change)){ //5==5
                res[0] = i;
                res[1] = i+change;
                return res;
            }
        }
       return null;
    }
}