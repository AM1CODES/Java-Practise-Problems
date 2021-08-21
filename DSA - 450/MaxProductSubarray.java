public class MaxProductSubarray {
    public static void main (String[] args)
    {
        int[] a = {6, -3, -10, 0, 2};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArrayProd(a));
    }
 
    static int maxSubArrayProd(int a[]) //Kadane's algorithm
    {
        int maxProd = 0;
        int currProd = 0;
        for(int i=0;i<a.length;i++)
        {
            currProd = currProd*a[i];
            if(currProd>maxProd)
            {
                maxProd = currProd;
            }
            if(currProd<0)
            {
                currProd = 0;
            }
        }
        return maxProd;
    }
}
