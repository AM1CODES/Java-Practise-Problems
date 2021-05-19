import java.util.*; //multi-level inheritance
class A
{
    Scanner sc = new Scanner(System.in);
    int a,b,diff;
    public void sub()
    {
    System.out.println("Enter the number: ");
    a = sc.nextInt();
    System.out.println("Enter the number: ");
    b = sc.nextInt();
    diff = a-b;
    System.out.println("The difference is:" + diff);
    }

}
class B extends A
{
    Scanner sc = new Scanner(System.in);
    int mul;
    public void mul()
    {
    System.out.println("Enter the number: ");
    a = sc.nextInt();
    System.out.println("Enter the number: ");
    b = sc.nextInt();
    mul = a*b;
    System.out.println("The Multiplication is:" + mul);
    }

}
public class Inheritance2 extends B
{
    public static void main(String[] args) {
        Inheritance2 obj = new Inheritance2();
        obj.mul();
        obj.sub();
    }   
}
