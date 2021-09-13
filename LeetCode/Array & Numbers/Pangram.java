class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26){
            return false;
        }
        
        HashSet<Character> set = new HashSet();
        for(char i:sentence.toCharArray()){
            set.add(i);
        }
        
        for(char i = 'a';i<='z';i++){
            if(!set.contains(i)){
                return false;
            }
        }
        
        return true;
        
        
    }
}