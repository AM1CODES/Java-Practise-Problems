import java.util.Scanner;
public class ArraySum
{
    int arr[] = new int[10];
    int sum = 0;
    public void sum()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<arr.length;i++)
        {
            sum = sum +arr[i];
        }
        System.out.println("The Sum is: "+ sum);
    }

    public void main()
    {
        ArraySum obj = new ArraySum();
        obj.sum();
    }
}
