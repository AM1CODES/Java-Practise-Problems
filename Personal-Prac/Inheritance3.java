import java.util.*;
class Dimensions
{
    int a,b;
    double c;
    Scanner sc= new Scanner(System.in);
}
class Rectangle extends Dimensions
{
    public void recarea()
    {
    System.out.println("Enter the height");
    a = sc.nextInt();
    System.out.println("Enter the width");
    b = sc.nextInt();
    int area = a*b;
    System.out.println("The area of the rectangle is: "+ area);
    }

}
class Circle extends Dimensions
{
    public void cirarea()
    {
    System.out.println("Enter the radius");
    c = sc.nextDouble();
    double area = 3.14*c*c;
    System.out.println("The area of the circle is: "+ area);
    }

}
public class Inheritance3 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        Rectangle obj1 = new Rectangle();
        obj.cirarea();
        obj1.recarea();

    }
}

