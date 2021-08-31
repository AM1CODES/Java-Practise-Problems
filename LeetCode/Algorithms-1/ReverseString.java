class Solution {
    public void reverseString(char[] s) {
        int i =0;
        int j = s.length-1; //we will go on swapping the characters in the array
        while(i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}