import java.util.Scanner;
public class Arraysort
{
    int temp; int count;
    int num[] = new int[100];

    public void sort()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you need in the array?");
        count = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        for(int i =0;i<count;i++)
        {
            num[i] = sc.nextInt();
        }
        for(int i =0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(num[i]>num[j])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array elements are:");
        for(int i = 0;i<count -1;i++)
        {
            System.out.print(num[i] + ",");
        }
        System.out.print(num[count-1]);
    }

    public void main()
    {
        Arraysort obj = new Arraysort();
        obj.sort();
    }
}
 