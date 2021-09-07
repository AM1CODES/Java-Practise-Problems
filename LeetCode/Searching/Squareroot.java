class Solution {
    public int mySqrt(int x) {
    
    int low=1;
    int high=x;
    int ans=0;
        
        while(high>=low)
        {
        int mid=(high+low)/2;
            if(mid<=x/mid)
            {
            ans=mid;
            low=mid+1;
            }
        
            else
            {
            high=mid-1;
            }
        }
        return ans;
    }
    }