import java.util.Scanner;
public class ReverseArray
{
    int counter = 0;
    int i,j,temp;
    int arr[] = new int[100];
    public void reversearray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        counter = sc.nextInt();
        for(i =0;i<counter;i++)
        {
            System.out.println("Enter the elements of the Array:");
            arr[i] = sc.nextInt();
        }
        // we will replace the first element of the array with the last element, seconf with the second last and so on
        j = i-1; //last element of the array
        i = 0; //first element of the array
        while(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("The Reversed Array is: ");
        for(int i =0;i<counter;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public void main()
    {
        ReverseArray obj = new ReverseArray();
        obj.reversearray();
    }
}
 