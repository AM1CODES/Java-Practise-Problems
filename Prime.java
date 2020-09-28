import java.util.Scanner;
public class Prime{
    int a;
    int count = 0;
public void prime()
{ 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    a = sc.nextInt();
    if(a%2==0)
    {
        System.out.println("Its not a Prime number");
    }
    else
    {
        System.out.println("Its a Prime Number");
}
}
public void main()
{
    Prime obj = new Prime();
    obj.prime();
}
}