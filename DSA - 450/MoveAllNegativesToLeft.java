
/*
In this we are using 2 pointer approach. We take i which starts from the firts index position and we take j that starts from 
last index position. We check for some cases - 
1) When i is negative and j is negative - i++
2) when i is positive and j is negative - swap elements at i and j and i++ and j--
3) when i and j are positive - j--
4) when i is negative and j is positive and this is waht we want - i++ and j--

this puts all the negative elements to the left and positive to the right in the array
*/ 
public class MoveAllNegativesToLeft {
    static void shift(int[] arr,int i,int j)
    {
        while(i<=j)
        {
            if(arr[i]<0 && arr[j]<0)
            {
                i++;
            }
            else if(arr[i]>0 && arr[j]<0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(arr[i]>0 && arr[j]>0)
            {
                j--;
            }
            else{
                i++;
                j--;
            }
        }
    }
    static void display(int[] arr, int right)
    {
        for(int i = 0; i <= right; ++i)
        {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args)
{
    int[] arr = { -12, 11, -13, -5,
                   6, -7, 5, -3, 11 };
                    
    int arr_size = arr.length;
 
    // Function Call
    shift(arr, 0, arr_size - 1);
    display(arr, arr_size - 1);
}

}
