import java.util.*;
class cars
{
    String Name;
    int chasis_no;
    String owner_name;
    cars(String Name,int chasis_no,String owner_name)
    {
        this.Name = Name;
        this.chasis_no = chasis_no;
        this.owner_name = owner_name;
    }
}
public class LinkedListExample2 {
    public static void main(String args[])
    {
        cars c1 = new cars("BMW", 19564556, "Neel");
        cars c2 = new cars("Merc", 19564557, "Bhumil");
        cars c3 = new cars("Ferrari", 19564656, "Aman");
        cars c4 = new cars("Lambo", 195645569, "Aadarsh");
        cars c5 = new cars("Alfa", 19564534, "Smit");


        LinkedList<cars> list = new LinkedList<cars>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);


        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
        cars c = (cars)itr.next();
        System.out.println("Car Name = " + c.Name);
        System.out.println("Chasis No = " + c.chasis_no);
        System.out.println("Owner Name = " + c.owner_name);
        }
    }
}
