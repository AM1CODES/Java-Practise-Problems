import java.security.Principal;
import java.util.*;
public class ArraySubsetOfAnother {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3};
        
        HashSet<Integer> set = new HashSet<>();
        int m = arr1.length;
        int n = arr2.length;

        for(int i=0;i<m;i++)
        {
            if(!set.contains(arr1[i]))
            set.add(arr1[i]);
        }

        for(int j=0;j<n;j++)
        {
            if(!set.contains(arr2[j]))
            {
                System.out.println("False");
            }
            else{
                System.out.println("True");
            }
            
        }

    }
}
