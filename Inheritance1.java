import java.util.*; //single inheritance
class Vehicles
{
    int a,b;
    public void add()
        {   
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value: ");
            a = sc.nextInt();
            System.out.println("Enter b value: ");
            b = sc.nextInt();
            int sum = a+b;
            System.out.println("The sum is: " + sum);
        }
}
public class Inheritance1 extends Vehicles
{
    public static void main(String[] args) 
    {
        Inheritance1 obj = new Inheritance1();
        obj.add();
    }
    
}
