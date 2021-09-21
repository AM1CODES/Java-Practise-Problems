class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A); // 2,3,3,4
        int big=0;
        for(int i=0;i<A.length-2;i++)
        {
            int sum=Check(A[i],A[i+1],A[i+2]); 
                if(sum>big)
                    big=sum;
        }
        return big;
    }
    public static int Check(int a,int b,int c)
    {
        if(a+b>c && b+c>a && a+c>b) 
        {
            return a+b+c;
        }
        else
            return 0;
    }
}