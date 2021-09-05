class Solution {
    public int[] plusOne(int[] digits) { //for the last digit we just add 1 to it and return the same array, if its 9 in the end then in that case we will create a new aray with size 1 more than original array and just replace the first element with  1
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}