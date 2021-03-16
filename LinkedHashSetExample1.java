import java.util.*;
class cubes
{
    int num;
    String name;
    String brand;
    cubes(int n,String name,String b)
    {
        this.num = n;
        this.name = name;
        this.brand = b;
    }
}
public class LinkedHashSetExample1 {
    public static void main(String[] args)
    {
        LinkedHashSet<cubes> hash = new LinkedHashSet<cubes>();
        cubes c1 = new cubes(1, "Valk", "Qiyi");
        cubes c2 = new cubes(2, "356-x", "GAN");
        cubes c3 = new cubes(3, "Weilong", "Moyu");
        cubes c4 = new cubes(4, "Shuangren", "Fangshi");

        hash.add(c1);
        hash.add(c2);
        hash.add(c3);
        hash.add(c4);

        Iterator itr = hash.iterator();
        while(itr.hasNext())
        {
            cubes cb = (cubes)itr.next();
            System.out.println("Cube number is:" + cb.num);
            System.out.println("Cube name is:" + cb.name);
            System.out.println("Cube brand is:" + cb.brand);
        }


    }
}
