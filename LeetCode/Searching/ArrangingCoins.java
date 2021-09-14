/* 
Brute force - In this approach we first take k=0; We keep incrementing k untill n becomes 0 and after everytime we increment k, we subtract that value from n to show that we are using up the coins to fill up the rows. This question is a normal arithmetic progression tpe question.
class Solution {
    public int arrangeCoins(int n) {
        int k=0;
        while(n>0){
            k++;
            n = n-k;
        }
        if(n==0){
            return k;
        }
        else{
            return (k-1);
        }
    }
}
*/

/*
Optimal  - Binary Search - Sum of first n natural number is n(n+1)/2. So if this is equal to n then we have all the k rows as complete otherwise we will have k-1.
*/
class Solution {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        long form;
        long mid;
        while(start<=end){
            mid = start + (end - start)/2;
            form = mid*(mid+1)/2;
            if(form == n){
                return (int)mid;
            }
            else if(n<form){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return (int)end;
    }
}