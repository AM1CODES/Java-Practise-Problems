import java.util.Scanner;
public class Largest
{
    int num1,num2,num3;
    public void checker()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        num1 = sc.nextInt();
        System.out.println("Enter the 2nd number:");
        num2 = sc.nextInt();
        System.out.println("Enter the 3rd number:");
        num3 = sc.nextInt();

        if(num1>=num2 && num1>=num3)
        {
            System.out.println("1st is the largest of the three");
        }
        else if(num2>=num1 && num2>=num3)
        {
            System.out.println("2nd is the largest of the three");
        }
        else
        {
            System.out.println("3rd is the largest of the three");
        }
    }

    public void main()
    {
        Largest obj = new Largest();
        obj.checker();
    }
}