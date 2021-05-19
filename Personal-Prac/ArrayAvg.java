import java.util.Scanner;
public class ArrayAvg
{
    double arr[] = {13.0, 23.5,67.9,45.6,84.67,33.4};
    double total = 0;
    public void average()
    {
        for(int i =0;i<arr.length;i++)
        {
            total = total+arr[i];
        }
        double average = total/arr.length;
        System.out.println("The average of elements of array is: " + average);
    }

    public void main()
    {
        ArrayAvg obj = new ArrayAvg();
        obj.average();
    }
}