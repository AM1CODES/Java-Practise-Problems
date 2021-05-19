import java.util.Scanner;
public class PerfectSquare
{
    double x;
    public boolean findperfect(double x)
    {
        double square = Math.sqrt(x);
        return(square - Math.floor(square) ==0);

    }

    public void main()
    {
        System.out.println("Enter the Number");
        Scanner sc  = new Scanner(System.in);
        double num = sc.nextDouble();
        if(findperfect(num))
        {
            System.out.println(num + " is a Perfect Square");
        }
        else
        {
            System.out.println(num + " is not a Perfect Square");
        }
    }
}