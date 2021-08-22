import java.util.*;
public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int sum = 13;
        int n = arr.length;

        for(int i=0;i<n-2;i++)
        {
            HashSet<Integer> set = new HashSet<>();
            int curr_sum = sum-arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(set.contains(curr_sum - arr[j])){
                  System.out.printf("Triplet is: %d %d %d",arr[i],arr[j],curr_sum-arr[j]);
                }
                set.add(arr[j]);
            }
        }
    }
}
