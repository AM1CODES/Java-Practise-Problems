public class ReverseArray {
    public static void main(String[] args) { //approach - 1 [New array to store reversed array]
        int arr[] = {1,2,3,4,5}; //original array
        int newarr[] = new int[arr.length]; //new array in which we will be storing our reversed array
        int n =arr.length; //storing the length of the array
        int  j= n; //variable to use for in outing elements in the new array

        for(int i =0;i<n;i++) //loop to iterate over the original array and take element at the first position and place it at the last position in the new array
        {
            newarr[j-1] = arr[i];
            j--;
        }

        for(int i =0;i<arr.length;i++)
        {
            System.out.print(newarr[i]); //printing the elements of the new array
        }
    }
}


/* Approach - 2 [Replace elements inplace] - Take first element and replace it with the last element and so on
public class ReverseArray {
    public static void main(String[] args) { 
        int arr[] = {1,2,3,4,5}; 
        int n =arr.length; 
        int temp = 0;

        for(int i=0;i<n;i++)
        {
            temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]); 
        }
    }
}

*/