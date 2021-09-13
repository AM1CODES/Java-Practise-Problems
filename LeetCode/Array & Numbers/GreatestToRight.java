class Solution {
    public int[] replaceElements(int[] arr) {
        int l = -1;
        int temp = 0;
        
        for(int i =arr.length-1;i>=0;i--)
        {
            temp = arr[i];
            arr[i] = l;
            l = l>temp?l:temp;
        }
        return arr;
    }
}