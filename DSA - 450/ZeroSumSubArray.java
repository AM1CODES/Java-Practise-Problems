/*
In this we are using sets, we basicallyhave an int sum which stores the sum that we calculate in the set
if this sum is ever equal to zero, we print that boolean value as our result
*/

import java.util.*;
public class ZeroSumSubArray {
    public static void main(String[] args) {
        int[] a = {4 ,2 ,0 ,1 ,6};
        boolean found = false;
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i: a)
        {
            set.add(sum);
            sum+= i;
            if(set.contains(sum)){
                found = true;
                break;
            }
        }
        System.out.println(found);
    }
}
