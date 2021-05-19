import java.util.Scanner;
public class digits
{
    int num;
    int digit;
    int count = 0;
    int temp;
    public void digits()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        temp = num;
        while(num>0)
        {
            num = num/10; //removes digits from the right one by one
            count++; //updates the counnt of the digits
        }
        while(temp>0)
        {
            digit = temp%10; //gives the last digit of the input number
            System.out.println("digit" + digit);
            System.out.println("Digit at place "+count+" is: "+digit);
            temp = temp / 10;
            count--;
        }

    }

    public void main()
    {
        digits obj = new digits();
        obj.digits();
    }
}