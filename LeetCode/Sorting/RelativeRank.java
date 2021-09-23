class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] scoreClone = score.clone();
        Arrays.sort(scoreClone);
        String[] relativeRanks = new String[score.length];
        
        int goldIndex = scoreClone.length - 1;
        int silverIndex = scoreClone.length - 2;
        int bronzeIndex = scoreClone.length - 3;
        
        for (int i = 0; i < score.length; i++) { // for positions 1,2 & 3
            if (score[i] == scoreClone[goldIndex]) {
                relativeRanks[i] = "Gold Medal";
            } else if (score[i] == scoreClone[silverIndex]) {
                relativeRanks[i] = "Silver Medal";
            } else if (score[i] == scoreClone[bronzeIndex]) {
                relativeRanks[i] = "Bronze Medal";
            } else {
                relativeRanks[i] = findIndex(scoreClone, score[i]);
            }
        }
        return relativeRanks;
    }
    
    private String findIndex(int[] scoreClone, int val) { //for positions after 1,2 &3
        for (int i = 0; i < scoreClone.length; i++) {
            if (scoreClone[i] == val)
                return String.valueOf(scoreClone.length - i);
        }
        return "";
    }
}