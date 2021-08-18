import java.io.*;
// Java program to print largest contiguous array sum
import java.util.*;
 
class KadaneAlgorithm
{
    public static void main (String[] args)
    {
        int[] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
    }
 
    static int maxSubArraySum(int a[]) //Kadane's algorithm
    {
        int maxSum = 0;
        int currSum = 0;
        for(int i=0;i<a.length;i++)
        {
            currSum = currSum+a[i];
            if(currSum>maxSum)
            {
                maxSum = currSum;
            }
            if(currSum<0)
            {
                currSum = 0;
            }
        }
        return maxSum;
    }
}