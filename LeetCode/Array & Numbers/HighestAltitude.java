class Solution {
    public int largestAltitude(int[] gain) {
            int maxGain = 0;
            int currGain = 0;
            for(int i = 0; i<gain.length; i++){
                currGain  = currGain + gain[i];
                if(maxGain < currGain)
                    maxGain = currGain;
            }
            return maxGain;
        }
    }
    
    