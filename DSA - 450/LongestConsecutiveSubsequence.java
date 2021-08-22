import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = {2,6,1,9,4,5,3};

        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for(int element:arr) //added array elements to the set
        {
            set.add(arr[element]);
        }

        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i-1])){
                int j = arr[i]; //becomes first element of the array
                while(set.contains(j)){
                    j++;
                }
                if(ans<j-arr[i])
                {
                    ans = j-arr[i];
                }
            }
        }
        System.out.println(ans);


    }
}
